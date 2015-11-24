// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Map;
import java.util.Iterator;

final class MapCollections$MapIterator implements Iterator, Entry
{
    private static final String[] z;
    int mEnd;
    boolean mEntryValid;
    int mIndex;
    final MapCollections this$0;
    
    static {
        final String[] z2 = new String[5];
        String s = "JmT\u001c\u001c}jS\u001b]wkX\u001d\u001czjX\u001c\u001cpjIOOkuM\u0000Nj%O\nH\u007flS\u0006Ry%p\u000eL0@S\u001bNg%R\rV{fI\u001c";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = '\u001e';
                        break;
                    }
                    case 1: {
                        c2 = '\u0005';
                        break;
                    }
                    case 2: {
                        c2 = '=';
                        break;
                    }
                    case 3: {
                        c2 = 'o';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "JmT\u001c\u001c}jS\u001b]wkX\u001d\u001czjX\u001c\u001cpjIOOkuM\u0000Nj%O\nH\u007flS\u0006Ry%p\u000eL0@S\u001bNg%R\rV{fI\u001c";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "JmT\u001c\u001c}jS\u001b]wkX\u001d\u001czjX\u001c\u001cpjIOOkuM\u0000Nj%O\nH\u007flS\u0006Ry%p\u000eL0@S\u001bNg%R\rV{fI\u001c";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "JmT\u001c\u001c}jS\u001b]wkX\u001d\u001czjX\u001c\u001cpjIOOkuM\u0000Nj%O\nH\u007flS\u0006Ry%p\u000eL0@S\u001bNg%R\rV{fI\u001c";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "JmT\u001c\u001c}jS\u001b]wkX\u001d\u001czjX\u001c\u001cpjIOOkuM\u0000Nj%O\nH\u007flS\u0006Ry%p\u000eL0@S\u001bNg%R\rV{fI\u001c";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    MapCollections$MapIterator(final MapCollections this$0) {
        this.this$0 = this$0;
        this.mEntryValid = false;
        this.mEnd = -1 + this$0.colGetSize();
        this.mIndex = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        boolean b = true;
        try {
            if (!this.mEntryValid) {
                throw new IllegalStateException(MapCollections$MapIterator.z[1]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        try {
            if (!(o instanceof Entry)) {
                return false;
            }
        }
        catch (IllegalStateException ex2) {
            throw ex2;
        }
        final Entry entry = (Entry)o;
        try {
            if (!ContainerHelpers.equal(entry.getKey(), this.this$0.colGetEntry(this.mIndex, 0))) {
                return false;
            }
            final Entry entry2 = entry;
            final Object o2 = entry2.getValue();
            final MapCollections$MapIterator mapCollections$MapIterator = this;
            final MapCollections mapCollections = mapCollections$MapIterator.this$0;
            final MapCollections$MapIterator mapCollections$MapIterator2 = this;
            final int n = mapCollections$MapIterator2.mIndex;
            final int n2 = 1;
            final Object o3 = mapCollections.colGetEntry(n, n2);
            final boolean b2 = ContainerHelpers.equal(o2, o3);
            if (b2) {
                return b;
            }
            return false;
        }
        catch (IllegalStateException ex3) {
            throw ex3;
        }
        try {
            final Entry entry2 = entry;
            final Object o2 = entry2.getValue();
            final MapCollections$MapIterator mapCollections$MapIterator = this;
            final MapCollections mapCollections = mapCollections$MapIterator.this$0;
            final MapCollections$MapIterator mapCollections$MapIterator2 = this;
            final int n = mapCollections$MapIterator2.mIndex;
            final int n2 = 1;
            final Object o3 = mapCollections.colGetEntry(n, n2);
            final boolean b2 = ContainerHelpers.equal(o2, o3);
            if (b2) {
                return b;
            }
        }
        catch (IllegalStateException ex4) {
            throw ex4;
        }
        b = false;
        return b;
    }
    
    @Override
    public Object getKey() {
        try {
            if (!this.mEntryValid) {
                throw new IllegalStateException(MapCollections$MapIterator.z[4]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return this.this$0.colGetEntry(this.mIndex, 0);
    }
    
    @Override
    public Object getValue() {
        try {
            if (!this.mEntryValid) {
                throw new IllegalStateException(MapCollections$MapIterator.z[2]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return this.this$0.colGetEntry(this.mIndex, 1);
    }
    
    @Override
    public boolean hasNext() {
        try {
            if (this.mIndex < this.mEnd) {
                return true;
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        try {
            if (!this.mEntryValid) {
                throw new IllegalStateException(MapCollections$MapIterator.z[0]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        final Object colGetEntry = this.this$0.colGetEntry(this.mIndex, 0);
        final Object colGetEntry2 = this.this$0.colGetEntry(this.mIndex, 1);
        int hashCode;
        if (colGetEntry == null) {
            hashCode = 0;
        }
        else {
            hashCode = colGetEntry.hashCode();
        }
        int hashCode2 = 0;
        if (colGetEntry2 != null) {
            hashCode2 = colGetEntry2.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public Object next() {
        return this.next();
    }
    
    @Override
    public Entry next() {
        ++this.mIndex;
        this.mEntryValid = true;
        return this;
    }
    
    @Override
    public void remove() {
        try {
            if (!this.mEntryValid) {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        this.this$0.colRemoveAt(this.mIndex);
        --this.mIndex;
        --this.mEnd;
        this.mEntryValid = false;
    }
    
    @Override
    public Object setValue(final Object o) {
        try {
            if (!this.mEntryValid) {
                throw new IllegalStateException(MapCollections$MapIterator.z[3]);
            }
        }
        catch (IllegalStateException ex) {
            throw ex;
        }
        return this.this$0.colSetValue(this.mIndex, o);
    }
    
    @Override
    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}
