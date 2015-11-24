// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class eN extends e_
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "OC\u0019\n\u001c\u0006\f+E\u001a\u000eC-\u0000\t\b\u0010+\u0000\u001cA\u0002\u007f\u0011\u0017\u0011\u0006\u007f\u0004\n\u0000\u0013+\u0000\u001c^".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'n';
                    break;
                }
                case 0: {
                    c2 = 'a';
                    break;
                }
                case 1: {
                    c2 = 'c';
                    break;
                }
                case 2: {
                    c2 = '_';
                    break;
                }
                case 3: {
                    c2 = 'e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = " \u0017+\u0000\u0003\u0011\u0017:\u0001N\u0015\f\u007f\u0016\u000b\u0013\n>\t\u0007\u001b\u0006\u007f\u000f\u000f\u0017\u0002q\t\u000f\u000f\u0004q&\u0002\u0000\u0010,_N".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'n';
                    break;
                }
                case 0: {
                    c4 = 'a';
                    break;
                }
                case 1: {
                    c4 = 'c';
                    break;
                }
                case 2: {
                    c4 = '_';
                    break;
                }
                case 3: {
                    c4 = 'e';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    public void a(final c3 c3, final Class clazz) {
        while (true) {
            if (clazz == null) {
                try {
                    c3.i();
                    if (cK.l) {
                        throw new UnsupportedOperationException(eN.z[1] + clazz.getName() + eN.z[0]);
                    }
                }
                catch (UnsupportedOperationException ex) {
                    throw ex;
                }
                return;
            }
            continue;
        }
    }
    
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (Class)o);
    }
}
