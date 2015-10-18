// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class bk
{
    private final int[] a;
    private final int b;
    private final cs[] c;
    
    public bk(final int b, final int[] a, final int n, final int n2, final int n3) {
        this.b = b;
        this.a = a;
        this.c = new cs[] { new cs(n, n3), new cs(n2, n3) };
    }
    
    public cs[] a() {
        return this.c;
    }
    
    public int b() {
        return this.b;
    }
    
    public int[] c() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof bk && this.b == ((bk)o).b;
    }
    
    @Override
    public int hashCode() {
        return this.b;
    }
}
