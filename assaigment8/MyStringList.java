public class MyStringList {

    private final int INITIAL_LENGTH = 4;
    private Person[] currentArray;
    private int size;

    public MyStringList() {
        currentArray = new Person[INITIAL_LENGTH];
        size = 0;
    }

    public void add(Person s) {
        if (s == null) return;

        if (size == currentArray.length) resize();
        currentArray[size++] = s;
    }

    public Person get(int i) {
        if (i < 0 || i >= size) {
            return null;
        }
        return currentArray[i];
    }

    private void resize() {
        System.out.println("resizing");
        int len = currentArray.length;
        int newLen = 2 * len;
        Person newArray[] = new Person[newLen];
        System.arraycopy(currentArray, 0, newArray, 0, len);
        currentArray = newArray;

    }

    public boolean find(Person s) {
        if (s == null) return false;
        for (Person test : currentArray) {
            if (test.getLastName().equals(s.getName())
                return true;
        }
        return false;
    }

    public void insert(Person s, int pos) {
        if (pos > size || pos < 0) return;
        if (pos == currentArray.length || size + 1 > currentArray.length) {
            resize();
        }
        Person[] temp = new Person[currentArray.length + 1];
        System.arraycopy(currentArray, 0, temp, 0, pos);
        temp[pos] = s;

        System.arraycopy(currentArray, pos, temp, pos + 1, currentArray.length - pos);
        currentArray = temp;
        ++size;
    }

    public boolean remove(Person s) {
        if (size == 0) return false;
        if (s == null) return false;
        int index = -1;
        for (int i = 0; i < size; ++i) {
            if (currentArray[i].equals(s)) {
                index = i;
                break;
            }
        }
        if (index == -1) return false;
        Person[] temp = new Person[currentArray.length];
        System.arraycopy(currentArray, 0, temp, 0, index);
        System.arraycopy(currentArray, index + 1, temp, index, currentArray.length - (index + 1));
        currentArray = temp;
        --size;
        return true;
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
   public String get(String lastName) {
        if (lastName.isBlank())
            return "";
        for (int i = 0; i < currentArray.length; i++) {
            if (currentArray[i].getLastName().equals(lastName))
                return currentArray[i];
        }
        return "";
    }

    public Object clone() {
        String[] temp = Arrays.copyOf(currentArray, size);
        return temp;
    }
}
