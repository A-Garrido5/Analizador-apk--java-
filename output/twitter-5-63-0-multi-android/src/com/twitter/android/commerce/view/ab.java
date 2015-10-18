// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

public class ab
{
    public final String a;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    
    public ab(final String a, final int b, final boolean c, final boolean d, final boolean e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (!(o instanceof ab)) {
                return false;
            }
            final ab ab = (ab)o;
            if (this.c != ab.c) {
                return false;
            }
            if (this.d != ab.d) {
                return false;
            }
            if (this.e != ab.e) {
                return false;
            }
            if (this.b != ab.b) {
                return false;
            }
            if (!this.a.equals(ab.a)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        final int n2 = 31 * (31 * this.a.hashCode() + this.b);
        int n3;
        if (this.c) {
            n3 = n;
        }
        else {
            n3 = 0;
        }
        final int n4 = 31 * (n3 + n2);
        int n5;
        if (this.d) {
            n5 = n;
        }
        else {
            n5 = 0;
        }
        final int n6 = 31 * (n5 + n4);
        if (!this.e) {
            n = 0;
        }
        return n6 + n;
    }
}
