// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

public enum c6
{
    public static final c6 CRYPT1;
    public static final c6 CRYPT2;
    public static final c6 CRYPT3;
    public static final c6 CRYPT4;
    public static final c6 CRYPT5;
    public static final c6 CRYPT6;
    public static final c6 CRYPT7;
    public static final c6 CRYPT8;
    private static final c6[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = ";\u001cZ#sN";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\'';
                        break;
                    }
                    case 0: {
                        c2 = 'x';
                        break;
                    }
                    case 1: {
                        c2 = 'N';
                        break;
                    }
                    case 2: {
                        c2 = '\u0003';
                        break;
                    }
                    case 3: {
                        c2 = 's';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = ";\u001cZ#sI";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ";\u001cZ#sL";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = ";\u001cZ#sM";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = ";\u001cZ#sJ";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = ";\u001cZ#sK";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = ";\u001cZ#sO";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = ";\u001cZ#s@";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        CRYPT1 = new c6(c6.z[1], 0);
        CRYPT2 = new c6(c6.z[4], 1);
        CRYPT3 = new c6(c6.z[5], 2);
        CRYPT4 = new c6(c6.z[2], 3);
        CRYPT5 = new c6(c6.z[3], 4);
        CRYPT6 = new c6(c6.z[0], 5);
        CRYPT7 = new c6(c6.z[6], 6);
        CRYPT8 = new c6(c6.z[7], 7);
        a = new c6[] { c6.CRYPT1, c6.CRYPT2, c6.CRYPT3, c6.CRYPT4, c6.CRYPT5, c6.CRYPT6, c6.CRYPT7, c6.CRYPT8 };
    }
    
    private c6(final String s, final int n) {
    }
}
