// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Iterator;
import java.util.Map;
import java.util.Collections;
import java.util.List;

final class gD extends gh
{
    gD(final int n) {
        super(n, null);
    }
    
    @Override
    public void a() {
        final boolean b = dt.b;
        if (!this.c()) {
            int n;
            for (int i = 0; i < this.f(); i = n) {
                final Entry c = this.c(i);
                if (c.getKey().b()) {
                    c.setValue(Collections.unmodifiableList((List<?>)c.getValue()));
                }
                n = i + 1;
                if (b) {
                    break;
                }
            }
            for (final Map.Entry<aK, V> entry : this.d()) {
                if (entry.getKey().b()) {
                    entry.setValue((V)Collections.unmodifiableList((List<?>)entry.getValue()));
                }
                if (b) {
                    break;
                }
            }
        }
        super.a();
    }
    
    @Override
    public Object put(final Object o, final Object o2) {
        return super.a((Comparable)o, o2);
    }
}
