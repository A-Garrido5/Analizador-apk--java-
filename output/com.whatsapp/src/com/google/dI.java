// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Type;
import java.io.Serializable;
import java.lang.reflect.WildcardType;

final class dI implements WildcardType, Serializable
{
    private static final long serialVersionUID;
    private static final String[] z;
    private final Type a;
    private final Type b;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "/oeY~u=6".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000e';
                    break;
                }
                case 0: {
                    c2 = '\u0010';
                    break;
                }
                case 1: {
                    c2 = 'O';
                    break;
                }
                case 2: {
                    c2 = '\u0016';
                    break;
                }
                case 3: {
                    c2 = ',';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "/osTzu!r_.".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u000e';
                    break;
                }
                case 0: {
                    c4 = '\u0010';
                    break;
                }
                case 1: {
                    c4 = 'O';
                    break;
                }
                case 2: {
                    c4 = '\u0016';
                    break;
                }
                case 3: {
                    c4 = ',';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    public dI(final Type[] array, final Type[] array2) {
        int n = 1;
        boolean b;
        if (array2.length <= n) {
            b = (n != 0);
        }
        else {
            b = false;
        }
        J.a(b);
        boolean b2;
        if (array.length == n) {
            b2 = (n != 0);
        }
        else {
            b2 = false;
        }
        J.a(b2);
        if (array2.length == n) {
            J.a(array2[0]);
            aI.d(array2[0]);
            if (array[0] != Object.class) {
                n = 0;
            }
            J.a(n != 0);
            this.b = aI.a(array2[0]);
            this.a = Object.class;
            if (com.google.n.e == 0) {
                return;
            }
        }
        J.a(array[0]);
        aI.d(array[0]);
        this.b = null;
        this.a = aI.a(array[0]);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof WildcardType && aI.a(this, (Type)o);
    }
    
    @Override
    public Type[] getLowerBounds() {
        if (this.b != null) {
            return new Type[] { this.b };
        }
        return aI.a;
    }
    
    @Override
    public Type[] getUpperBounds() {
        return new Type[] { this.a };
    }
    
    @Override
    public int hashCode() {
        int n;
        if (this.b != null) {
            n = 31 + this.b.hashCode();
        }
        else {
            n = 1;
        }
        return n ^ 31 + this.a.hashCode();
    }
    
    @Override
    public String toString() {
        if (this.b != null) {
            return dI.z[0] + aI.b(this.b);
        }
        if (this.a == Object.class) {
            return "?";
        }
        return dI.z[1] + aI.b(this.a);
    }
}
