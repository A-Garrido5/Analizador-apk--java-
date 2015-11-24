// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class O implements h9
{
    private static final String[] z;
    final Class a;
    final Class b;
    final e_ c;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "pLH\u0019\u0017DTp\u0019\u0001FH\u0016".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'x';
                    break;
                }
                case 0: {
                    c2 = '6';
                    break;
                }
                case 1: {
                    c2 = '-';
                    break;
                }
                case 2: {
                    c2 = '+';
                    break;
                }
                case 3: {
                    c2 = 'm';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u001aLO\f\bBHYP".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'x';
                    break;
                }
                case 0: {
                    c4 = '6';
                    break;
                }
                case 1: {
                    c4 = '-';
                    break;
                }
                case 2: {
                    c4 = '+';
                    break;
                }
                case 3: {
                    c4 = 'm';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    O(final Class a, final Class b, final e_ c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public String toString() {
        final boolean l = cK.l;
        final String string = O.z[0] + this.a.getName() + "+" + this.b.getName() + O.z[1] + this.c + "]";
        if (l) {
            final boolean a = e_.a;
            boolean a2 = false;
            if (!a) {
                a2 = true;
            }
            e_.a = a2;
        }
        return string;
    }
}
