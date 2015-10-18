// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.util.HashMap;

public class bw
{
    private HashMap a;
    private long b;
    
    public bw(final long b) {
        this.b = b;
        this.a = new HashMap();
    }
    
    public void a() {
        synchronized (this) {
            this.a.clear();
        }
    }
    
    public boolean a(final Object o) {
        synchronized (this) {
            final Long n = this.a.get(o);
            boolean b;
            if (n != null && n + this.b > System.currentTimeMillis()) {
                b = false;
            }
            else {
                this.a.put(o, System.currentTimeMillis());
                b = true;
            }
            return b;
        }
    }
    
    public boolean b() {
        synchronized (this) {
            return this.a.isEmpty();
        }
    }
    
    public boolean b(final Object o) {
        synchronized (this) {
            return this.a.remove(o) != null;
        }
    }
}
