// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public final class arb
{
    private final int a;
    private final boolean b;
    private final boolean c;
    
    private arb(final int a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    arb(final int n, final boolean b, final boolean b2, final oz oz) {
        this(n, b, b2);
    }
    
    public int a() {
        return this.a;
    }
    
    public boolean b() {
        return this.b;
    }
    
    public boolean c() {
        return this.c;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final arb arb = (arb)o;
            if (this.a != arb.a || this.b != arb.b || this.c != arb.c) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * this.a;
        int n3;
        if (this.b) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final int n4 = 31 * (n3 + n2);
        if (!this.c) {
            n = 0;
        }
        return n4 + n;
    }
}
