// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.Method;

final class hY extends hk
{
    private static final String[] z;
    private final Method h;
    private final Method i;
    
    static {
        final String[] z2 = new String[3];
        final char[] charArray = "f\u001bb\u0016\u0014A\u001c".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'p';
                    break;
                }
                case 0: {
                    c2 = '$';
                    break;
                }
                case 1: {
                    c2 = 'n';
                    break;
                }
                case 2: {
                    c2 = '\u000b';
                    break;
                }
                case 3: {
                    c2 = 'z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "C\u000b\u007f".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'p';
                    break;
                }
                case 0: {
                    c4 = '$';
                    break;
                }
                case 1: {
                    c4 = 'n';
                    break;
                }
                case 2: {
                    c4 = '\u000b';
                    break;
                }
                case 3: {
                    c4 = 'z';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "J\u000b|8\u0005M\u0002o\u001f\u0002".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'p';
                    break;
                }
                case 0: {
                    c6 = '$';
                    break;
                }
                case 1: {
                    c6 = 'n';
                    break;
                }
                case 2: {
                    c6 = '\u000b';
                    break;
                }
                case 3: {
                    c6 = 'z';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        z = z2;
    }
    
    hY(final hg hg, final String s, final Class clazz, final Class clazz2) {
        super(hg, s, clazz, clazz2);
        this.h = dS.b(this.g, hY.z[2], new Class[0]);
        this.i = dS.b(clazz2, hY.z[1] + s + hY.z[0], new Class[0]);
    }
    
    private Object a(final Object o) {
        if (this.g.isInstance(o)) {
            return o;
        }
        return ((a8)dS.a(this.h, null, new Object[0])).mergeFrom((fm)o).buildPartial();
    }
    
    @Override
    public a8 a() {
        return (a8)dS.a(this.h, null, new Object[0]);
    }
    
    @Override
    public void a(final fp fp, final Object o) {
        super.a(fp, this.a(o));
    }
}
