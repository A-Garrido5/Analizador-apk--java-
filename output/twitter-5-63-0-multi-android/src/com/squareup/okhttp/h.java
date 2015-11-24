// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp;

public final class h
{
    private final String a;
    private final String b;
    
    public h(final String a, final String b) {
        this.a = a;
        this.b = b;
    }
    
    public String a() {
        return this.a;
    }
    
    public String b() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof h && ((h)o).a.equals(this.a) && ((h)o).b.equals(this.b);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() + 31 * this.b.hashCode();
    }
    
    @Override
    public String toString() {
        return this.a + " realm=\"" + this.b + "\"";
    }
}
