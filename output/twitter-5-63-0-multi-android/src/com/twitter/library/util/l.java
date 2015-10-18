// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

public class l
{
    private long a;
    private boolean b;
    private long c;
    
    public l(final long c, final long a) {
        this.c = c;
        this.a = a;
    }
    
    public void a(final boolean b) {
        if (b) {
            this.a = System.currentTimeMillis();
        }
        this.b = false;
    }
    
    public boolean a() {
        return System.currentTimeMillis() - this.a > this.c && !this.b;
    }
    
    public void b() {
        this.b = true;
    }
}
