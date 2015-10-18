// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.util;

import java.util.Map;

class ArrayMap$1 extends MapCollections
{
    final ArrayMap this$0;
    
    ArrayMap$1(final ArrayMap this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    protected void colClear() {
        this.this$0.clear();
    }
    
    @Override
    protected Object colGetEntry(final int n, final int n2) {
        return this.this$0.mArray[n2 + (n << 1)];
    }
    
    @Override
    protected Map colGetMap() {
        return this.this$0;
    }
    
    @Override
    protected int colGetSize() {
        return this.this$0.mSize;
    }
    
    @Override
    protected int colIndexOfKey(final Object o) {
        return this.this$0.indexOfKey(o);
    }
    
    @Override
    protected int colIndexOfValue(final Object o) {
        return this.this$0.indexOfValue(o);
    }
    
    @Override
    protected void colPut(final Object o, final Object o2) {
        this.this$0.put(o, o2);
    }
    
    @Override
    protected void colRemoveAt(final int n) {
        this.this$0.removeAt(n);
    }
    
    @Override
    protected Object colSetValue(final int n, final Object o) {
        return this.this$0.setValueAt(n, o);
    }
}
