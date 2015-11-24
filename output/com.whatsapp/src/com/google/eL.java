// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Calendar;

final class eL extends e_
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[6];
        final char[] charArray = "\u0000pR0\u0017".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u007f';
                    break;
                }
                case 0: {
                    c2 = 'm';
                    break;
                }
                case 1: {
                    c2 = '\u001f';
                    break;
                }
                case 2: {
                    c2 = '<';
                    break;
                }
                case 3: {
                    c2 = 'D';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\u0014z]6".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u007f';
                    break;
                }
                case 0: {
                    c4 = 'm';
                    break;
                }
                case 1: {
                    c4 = '\u001f';
                    break;
                }
                case 2: {
                    c4 = '<';
                    break;
                }
                case 3: {
                    c4 = 'D';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\t~E\u000b\u0019 pR0\u0017".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u007f';
                    break;
                }
                case 0: {
                    c6 = 'm';
                    break;
                }
                case 1: {
                    c6 = '\u001f';
                    break;
                }
                case 2: {
                    c6 = '<';
                    break;
                }
                case 3: {
                    c6 = 'D';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0005pI60\u000b[]=".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u007f';
                    break;
                }
                case 0: {
                    c8 = 'm';
                    break;
                }
                case 1: {
                    c8 = '\u001f';
                    break;
                }
                case 2: {
                    c8 = '<';
                    break;
                }
                case 3: {
                    c8 = 'D';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0000vR1\u000b\b".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = '\u007f';
                    break;
                }
                case 0: {
                    c10 = 'm';
                    break;
                }
                case 1: {
                    c10 = '\u001f';
                    break;
                }
                case 2: {
                    c10 = '<';
                    break;
                }
                case 3: {
                    c10 = 'D';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\u001ez_+\u0011\t".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = '\u007f';
                    break;
                }
                case 0: {
                    c12 = 'm';
                    break;
                }
                case 1: {
                    c12 = '\u001f';
                    break;
                }
                case 2: {
                    c12 = '<';
                    break;
                }
                case 3: {
                    c12 = 'D';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        z = z2;
    }
    
    @Override
    public void a(final c3 c3, final Object o) {
        this.a(c3, (Calendar)o);
    }
    
    public void a(final c3 c3, final Calendar calendar) {
        if (calendar == null) {
            c3.i();
            return;
        }
        c3.b();
        c3.b(eL.z[1]);
        c3.a((long)calendar.get(1));
        c3.b(eL.z[0]);
        c3.a((long)calendar.get(2));
        c3.b(eL.z[2]);
        c3.a((long)calendar.get(5));
        c3.b(eL.z[3]);
        c3.a((long)calendar.get(11));
        c3.b(eL.z[4]);
        c3.a((long)calendar.get(12));
        c3.b(eL.z[5]);
        c3.a((long)calendar.get(13));
        c3.g();
    }
}
