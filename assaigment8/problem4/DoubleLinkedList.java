public class MyDoubleLinkedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode prev;

        ListNode(int x) {
            val = x;
        }
    }

    int numOfNodes;
    ListNode head, tail;

    public MyDoubleLinkedList() {
        numOfNodes = 0;
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public void addAtHead(int val) {
        ListNode pred = head;
        ListNode succ = head.next;
        ++numOfNodes;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;

    }

    public void addAtTail(int val) {
        ListNode succ = tail;
        ListNode pred = tail.prev;
        ++numOfNodes;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
    }

    public void addAtIndex(int index, int val) {
        if (index > numOfNodes) return;
        if (index < 0) index = 0;
        ListNode pred, succ;
        if (index < numOfNodes - index) {
            pred = head;
            for (int i = 0; i < index; ++i) {
                pred = pred.next;
            }
            succ = pred.next;
        } else {
            succ = tail;
            for (int i = 0; i < numOfNodes - index; ++i) {
                succ = succ.prev;
            }
            pred = succ.prev;
        }
        ++numOfNodes;
        ListNode toAdd = new ListNode(val);
        toAdd.prev = pred;
        toAdd.next = succ;
        pred.next = toAdd;
        succ.prev = toAdd;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= numOfNodes) return;
        ListNode pred = head;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode succ = pred.next.next;
        pred.next = succ;
        succ.prev = pred;
        --numOfNodes;
    }

    public int get(int index) {
        if (index < 0 || index >= numOfNodes)
            return -1;
        ListNode curr = head;
        if (index + 1 < numOfNodes - index)
            for (int i = 0; i < index + 1; ++i) {
                curr = curr.next;
            }
        else {
            curr = tail;
            for (int i = 0; i < numOfNodes - index; i++) {
                curr = curr.prev;
            }

        }
        return curr.val;
    }

    public static void main(String[] args) {
        MyDoubleLinkedList list = new MyDoubleLinkedList();
        list.addAtHead(10);
        for (int i = 0; i < list.numOfNodes; i++) {
            System.out.println("  -  " + list.get(i) +"  -  ");
        }
    }

}
