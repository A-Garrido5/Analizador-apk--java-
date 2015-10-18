// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.LinkedHashMap;

class aw
{
    private LinkedHashMap a;
    private int b;
    
    public aw(final int b) {
        this.b = b;
        this.a = new g0(this, 1 + b * 4 / 3, 0.75f, true);
    }
    
    static int a(final aw aw) {
        return aw.b;
    }
    
    public Object a(final Object o) {
        synchronized (this) {
            return this.a.get(o);
        }
    }
    
    public void a(final Object o, final Object o2) {
        synchronized (this) {
            this.a.put(o, o2);
        }
    }
}
