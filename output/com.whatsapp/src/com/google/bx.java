// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Type;
import java.io.Serializable;
import java.lang.reflect.GenericArrayType;

final class bx implements GenericArrayType, Serializable
{
    private static final long serialVersionUID;
    private static final String z;
    private final Type a;
    
    static {
        final char[] charArray = ">\u0014".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0015';
                    break;
                }
                case 0: {
                    c2 = 'e';
                    break;
                }
                case 1: {
                    c2 = 'I';
                    break;
                }
                case 2: {
                    c2 = 'e';
                    break;
                }
                case 3: {
                    c2 = '2';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public bx(final Type type) {
        this.a = aI.a(type);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof GenericArrayType && aI.a(this, (Type)o);
    }
    
    @Override
    public Type getGenericComponentType() {
        return this.a;
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public String toString() {
        return aI.b(this.a) + bx.z;
    }
}
