// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

public class a
{
    private final String a;
    private as b;
    
    private as c() {
        synchronized (this) {
            return this.b;
        }
    }
    
    public String a() {
        return this.a;
    }
    
    void a(final String s) {
        this.c().a(s);
    }
    
    void b() {
        this.b = null;
    }
}
