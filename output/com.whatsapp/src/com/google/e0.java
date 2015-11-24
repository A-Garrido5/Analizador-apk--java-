// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public class e0
{
    public static int c;
    private final int a;
    private final int b;
    
    public e0(final int b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    public final int a() {
        return this.b;
    }
    
    public final int b() {
        return this.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof e0) {
            final e0 e0 = (e0)o;
            if (this.b == e0.b && this.a == e0.a) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.b ^ this.a;
    }
    
    @Override
    public final String toString() {
        return this.b + "(" + this.a + ')';
    }
}
