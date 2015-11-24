// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

final class j implements h9
{
    private static final String[] z;
    final Class a;
    final e_ b;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "RLky&\nH}%".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'V';
                    break;
                }
                case 0: {
                    c2 = '~';
                    break;
                }
                case 1: {
                    c2 = '-';
                    break;
                }
                case 2: {
                    c2 = '\u000f';
                    break;
                }
                case 3: {
                    c2 = '\u0018';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "8Lll9\fTTl/\u000eH2".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'V';
                    break;
                }
                case 0: {
                    c4 = '~';
                    break;
                }
                case 1: {
                    c4 = '-';
                    break;
                }
                case 2: {
                    c4 = '\u000f';
                    break;
                }
                case 3: {
                    c4 = '\u0018';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
    }
    
    j(final Class a, final e_ b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public String toString() {
        return j.z[1] + this.a.getName() + j.z[0] + this.b + "]";
    }
}
