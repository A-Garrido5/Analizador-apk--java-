// 
// Decompiled by Procyon v0.5.30
// 

package com.google.i18n.phonenumbers;

import java.util.LinkedHashMap;

class g
{
    private LinkedHashMap a;
    private int b;
    
    public g(final int b) {
        this.b = b;
        this.a = new RegexCache$LRUCache$1(this, 1 + b * 4 / 3, 0.75f, true);
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
