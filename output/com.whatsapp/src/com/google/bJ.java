// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Method;

final class bJ extends b3
{
    private static final String z;
    private final Method k;
    
    static {
        final char[] charArray = "%rd\u0013I\"{w4N".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '<';
                    break;
                }
                case 0: {
                    c2 = 'K';
                    break;
                }
                case 1: {
                    c2 = '\u0017';
                    break;
                }
                case 2: {
                    c2 = '\u0013';
                    break;
                }
                case 3: {
                    c2 = 'Q';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    bJ(final hg hg, final String s, final Class clazz, final Class clazz2) {
        super(hg, s, clazz, clazz2);
        this.k = dS.b(this.h, bJ.z, new Class[0]);
    }
    
    private Object a(final Object o) {
        if (this.h.isInstance(o)) {
            return o;
        }
        return ((a8)dS.a(this.k, null, new Object[0])).mergeFrom((fm)o).build();
    }
    
    @Override
    public a8 a() {
        return (a8)dS.a(this.k, null, new Object[0]);
    }
    
    @Override
    public void b(final fp fp, final Object o) {
        super.b(fp, this.a(o));
    }
}
