// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Arrays;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

final class hP implements ParameterizedType, Serializable
{
    private static final long serialVersionUID;
    private static final String z;
    private final Type[] a;
    private final Type b;
    private final Type c;
    
    static {
        final char[] charArray = "*Q".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\n';
                    break;
                }
                case 0: {
                    c2 = '\u0006';
                    break;
                }
                case 1: {
                    c2 = 'q';
                    break;
                }
                case 2: {
                    c2 = 'a';
                    break;
                }
                case 3: {
                    c2 = 'S';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public hP(final Type type, final Type type2, final Type[] array) {
        int i = 0;
        final int e = n.e;
        if (type2 instanceof Class) {
            final Class clazz = (Class)type2;
            boolean b;
            if (Modifier.isStatic(clazz.getModifiers()) || clazz.getEnclosingClass() == null) {
                b = true;
            }
            else {
                b = false;
            }
            J.a(type != null || b);
        }
        Type a;
        if (type == null) {
            a = null;
        }
        else {
            a = aI.a(type);
        }
        this.c = a;
        this.b = aI.a(type2);
        this.a = array.clone();
        while (i < this.a.length) {
            J.a(this.a[i]);
            aI.d(this.a[i]);
            this.a[i] = aI.a(this.a[i]);
            ++i;
            if (e != 0) {
                break;
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof ParameterizedType && aI.a(this, (Type)o);
    }
    
    @Override
    public Type[] getActualTypeArguments() {
        return this.a.clone();
    }
    
    @Override
    public Type getOwnerType() {
        return this.c;
    }
    
    @Override
    public Type getRawType() {
        return this.b;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a) ^ this.b.hashCode() ^ aI.a((Object)this.c);
    }
    
    @Override
    public String toString() {
        final int e = n.e;
        final StringBuilder sb = new StringBuilder(30 * (1 + this.a.length));
        sb.append(aI.b(this.b));
        if (this.a.length == 0) {
            return sb.toString();
        }
        sb.append("<").append(aI.b(this.a[0]));
        int i = 1;
        while (i < this.a.length) {
            sb.append(hP.z).append(aI.b(this.a[i]));
            ++i;
            if (e != 0) {
                break;
            }
        }
        return sb.append(">").toString();
    }
}
