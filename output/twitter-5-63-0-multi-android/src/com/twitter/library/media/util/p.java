// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

public class p
{
    private long a;
    private long b;
    private int c;
    private long d;
    private long e;
    private String f;
    
    public void a(final int c) {
        this.c = c;
        if (this.d != 0L) {
            this.e = System.currentTimeMillis() - this.d;
            if (this.e != 0L) {
                this.b = 1000L * (this.a / this.e);
            }
        }
    }
    
    public void a(final String f, final long a) {
        this.f = f;
        this.a = a;
        this.d = System.currentTimeMillis();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("operation=");
        sb.append(this.f);
        sb.append(",status=");
        sb.append(this.c);
        if (this.a != 0L) {
            sb.append(",size=");
            sb.append(this.a);
            sb.append(",timeMs=");
            sb.append(this.e);
            sb.append(",rateBps=");
            sb.append(this.b);
        }
        return sb.toString();
    }
}
