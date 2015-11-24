// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class bI implements h9
{
    private static final String[] z;
    final e_ a;
    final Class b;
    final Class c;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "} \u0010S2%$\u0006\u000f".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'B';
                    break;
                }
                case 0: {
                    c2 = 'Q';
                    break;
                }
                case 1: {
                    c2 = 'A';
                    break;
                }
                case 2: {
                    c2 = 't';
                    break;
                }
                case 3: {
                    c2 = '2';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0017 \u0017F-#8/F;!$I".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'B';
                    break;
                }
                case 0: {
                    c4 = 'Q';
                    break;
                }
                case 1: {
                    c4 = 'A';
                    break;
                }
                case 2: {
                    c4 = 't';
                    break;
                }
                case 3: {
                    c4 = '2';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    bI(final Class c, final Class b, final e_ a) {
        this.c = c;
        this.b = b;
        this.a = a;
    }
    
    @Override
    public String toString() {
        final boolean l = cK.l;
        final String string = bI.z[1] + this.b.getName() + "+" + this.c.getName() + bI.z[0] + this.a + "]";
        if (e_.a) {
            boolean i = false;
            if (!l) {
                i = true;
            }
            cK.l = i;
        }
        return string;
    }
}
