// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Method;

final class h5 extends hk
{
    private static final String[] z;
    private Method h;
    private Method i;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "KF:\u001f\u000brA".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'n';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = '\'';
                    break;
                }
                case 2: {
                    c2 = 'V';
                    break;
                }
                case 3: {
                    c2 = 'j';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "ZB\"<\u000fQR3.\u000bND$\u0003\u001eIH$".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'n';
                    break;
                }
                case 0: {
                    c4 = '=';
                    break;
                }
                case 1: {
                    c4 = '\'';
                    break;
                }
                case 2: {
                    c4 = 'V';
                    break;
                }
                case 3: {
                    c4 = 'j';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    h5(final hg hg, final String s, final Class clazz, final Class clazz2) {
        super(hg, s, clazz, clazz2);
        this.i = dS.b(this.g, h5.z[0], new Class[] { dV.class });
        this.h = dS.b(this.g, h5.z[1], new Class[0]);
    }
    
    @Override
    public void a(final fp fp, final Object o) {
        super.a(fp, dS.a(this.i, null, new Object[] { o }));
    }
    
    @Override
    public Object b(final dS ds) {
        return dS.a(this.h, super.b(ds), new Object[0]);
    }
    
    @Override
    public Object b(final fp fp) {
        return dS.a(this.h, super.b(fp), new Object[0]);
    }
}
