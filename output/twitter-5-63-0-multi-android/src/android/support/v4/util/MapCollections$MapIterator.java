// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Map;
import java.util.Iterator;

final class MapCollections$MapIterator implements Iterator, Entry
{
    int mEnd;
    boolean mEntryValid;
    int mIndex;
    final /* synthetic */ MapCollections this$0;
    
    MapCollections$MapIterator(final MapCollections this$0) {
        this.this$0 = this$0;
        this.mEntryValid = false;
        this.mEnd = -1 + this$0.colGetSize();
        this.mIndex = -1;
    }
    
    @Override
    public final boolean equals(final Object o) {
        int n = 1;
        if (!this.mEntryValid) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(o instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)o;
        if (!ContainerHelpers.equal(entry.getKey(), this.this$0.colGetEntry(this.mIndex, 0)) || !ContainerHelpers.equal(entry.getValue(), this.this$0.colGetEntry(this.mIndex, n))) {
            n = 0;
        }
        return n != 0;
    }
    
    @Override
    public Object getKey() {
        if (!this.mEntryValid) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.this$0.colGetEntry(this.mIndex, 0);
    }
    
    @Override
    public Object getValue() {
        if (!this.mEntryValid) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.this$0.colGetEntry(this.mIndex, 1);
    }
    
    @Override
    public boolean hasNext() {
        return this.mIndex < this.mEnd;
    }
    
    @Override
    public final int hashCode() {
        if (!this.mEntryValid) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
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
    public Entry next() {
        ++this.mIndex;
        this.mEntryValid = true;
        return this;
    }
    
    @Override
    public void remove() {
        if (!this.mEntryValid) {
            throw new IllegalStateException();
        }
        this.this$0.colRemoveAt(this.mIndex);
        --this.mIndex;
        --this.mEnd;
        this.mEntryValid = false;
    }
    
    @Override
    public Object setValue(final Object o) {
        if (!this.mEntryValid) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        return this.this$0.colSetValue(this.mIndex, o);
    }
    
    @Override
    public final String toString() {
        return this.getKey() + "=" + this.getValue();
    }
}
