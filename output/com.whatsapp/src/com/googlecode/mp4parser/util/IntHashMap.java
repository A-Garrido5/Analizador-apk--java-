// 
// Decompiled by Procyon v0.5.30
// 

package com.googlecode.mp4parser.util;

public class IntHashMap
{
    private transient int count;
    private float loadFactor;
    private transient Entry[] table;
    private int threshold;
    
    public IntHashMap() {
        this(20, 0.75f);
    }
    
    public IntHashMap(final int n) {
        this(n, 0.75f);
    }
    
    public IntHashMap(int n, final float loadFactor) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + n);
        }
        if (loadFactor <= 0.0f) {
            throw new IllegalArgumentException("Illegal Load: " + loadFactor);
        }
        if (n == 0) {
            n = 1;
        }
        this.loadFactor = loadFactor;
        this.table = new Entry[n];
        this.threshold = (int)(loadFactor * n);
    }
    
    public void clear() {
        synchronized (this) {
            final Entry[] table = this.table;
            int length = table.length;
            while (--length >= 0) {
                table[length] = null;
            }
            this.count = 0;
        }
    }
    
    public boolean contains(final Object o) {
        if (o == null) {
            throw new NullPointerException();
        }
        final Entry[] table = this.table;
        int length = table.length;
        while (true) {
            final int n = length - 1;
            if (length <= 0) {
                return false;
            }
            for (Entry next = table[n]; next != null; next = next.next) {
                if (next.value.equals(o)) {
                    return true;
                }
            }
            length = n;
        }
    }
    
    public boolean containsKey(final int n) {
        final Entry[] table = this.table;
        for (Entry next = table[(Integer.MAX_VALUE & n) % table.length]; next != null; next = next.next) {
            if (next.hash == n) {
                return true;
            }
        }
        return false;
    }
    
    public boolean containsValue(final Object o) {
        return this.contains(o);
    }
    
    public Object get(final int n) {
        final Entry[] table = this.table;
        for (Entry next = table[(Integer.MAX_VALUE & n) % table.length]; next != null; next = next.next) {
            if (next.hash == n) {
                return next.value;
            }
        }
        return null;
    }
    
    public boolean isEmpty() {
        return this.count == 0;
    }
    
    public Object put(final int n, final Object value) {
        Entry[] array = this.table;
        int n2 = (n & Integer.MAX_VALUE) % array.length;
        for (Entry next = array[n2]; next != null; next = next.next) {
            if (next.hash == n) {
                final Object value2 = next.value;
                next.value = value;
                return value2;
            }
        }
        if (this.count >= this.threshold) {
            this.rehash();
            array = this.table;
            n2 = (n & Integer.MAX_VALUE) % array.length;
        }
        array[n2] = new Entry(n, n, value, array[n2]);
        ++this.count;
        return null;
    }
    
    protected void rehash() {
        final int length = this.table.length;
        final Entry[] table = this.table;
        final int n = 1 + length * 2;
        final Entry[] table2 = new Entry[n];
        this.threshold = (int)(n * this.loadFactor);
        this.table = table2;
        int n2 = length;
        while (true) {
            final int n3 = n2 - 1;
            if (n2 <= 0) {
                break;
            }
            Entry entry;
            int n4;
            for (Entry next = table[n3]; next != null; next = next.next, n4 = (Integer.MAX_VALUE & entry.hash) % n, entry.next = table2[n4], table2[n4] = entry) {
                entry = next;
            }
            n2 = n3;
        }
    }
    
    public Object remove(final int n) {
        final Entry[] table = this.table;
        final int n2 = (Integer.MAX_VALUE & n) % table.length;
        Entry next = table[n2];
        Entry entry = null;
        while (next != null) {
            if (next.hash == n) {
                if (entry != null) {
                    entry.next = next.next;
                }
                else {
                    table[n2] = next.next;
                }
                --this.count;
                final Object value = next.value;
                next.value = null;
                return value;
            }
            entry = next;
            next = next.next;
        }
        return null;
    }
    
    public int size() {
        return this.count;
    }
    
    private static class Entry
    {
        int hash;
        int key;
        Entry next;
        Object value;
        
        protected Entry(final int hash, final int key, final Object value, final Entry next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
}
