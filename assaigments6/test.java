public class MyTable {
    private Entry[] entries;

    public MyTable() {
        entries = new Entry[26];
    }

    
    public String get(char c) {
        int index = getIndex(c);
        if (index >= 0 && index < entries.length && entries[index] != null) {
            return entries[index].toString();
        }
        return null;
    }

   
    public void add(char c, String s) {
        int index = getIndex(c);
        if (index >= 0 && index < entries.length) {
            Entry entry = new Entry(c, s);
            entries[index] = entry;
        }
    }

    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Entry entry : entries) {
            if (entry != null) {
                sb.append(entry.toString()).append("\n");
            }
        }
        return sb.toString();
    }

    private int getIndex(char c) {
        return c - 'a';
    }

    private class Entry {
        private char ch;
        private String str;

        Entry(char ch, String str) {
            this.ch = ch;
            this.str = str;
        }
        public String toString() {
            return ch + "->" + str;
        }
    }
}

