// 
// Decompiled by Procyon v0.5.30
// 

package org;

public enum k
{
    public static final k MESSAGES;
    public static final k RECENT;
    public static final k UIDNEXT;
    public static final k UIDVALIDITY;
    public static final k UNSEEN;
    private static final k[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "\u0011w=4\u0002\u001bw=".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'C';
                    break;
                }
                case 0: {
                    c2 = '\\';
                    break;
                }
                case 1: {
                    c2 = '2';
                    break;
                }
                case 2: {
                    c2 = 'n';
                    break;
                }
                case 3: {
                    c2 = 'g';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\t{*)\u0006\u0004f".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'C';
                    break;
                }
                case 0: {
                    c4 = '\\';
                    break;
                }
                case 1: {
                    c4 = '2';
                    break;
                }
                case 2: {
                    c4 = 'n';
                    break;
                }
                case 3: {
                    c4 = 'g';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u000ew-\"\r\b".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'C';
                    break;
                }
                case 0: {
                    c6 = '\\';
                    break;
                }
                case 1: {
                    c6 = '2';
                    break;
                }
                case 2: {
                    c6 = 'n';
                    break;
                }
                case 3: {
                    c6 = 'g';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\t{*1\u0002\u0010{*.\u0017\u0005".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'C';
                    break;
                }
                case 0: {
                    c8 = '\\';
                    break;
                }
                case 1: {
                    c8 = '2';
                    break;
                }
                case 2: {
                    c8 = 'n';
                    break;
                }
                case 3: {
                    c8 = 'g';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\t|=\"\u0006\u0012".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'C';
                    break;
                }
                case 0: {
                    c10 = '\\';
                    break;
                }
                case 1: {
                    c10 = '2';
                    break;
                }
                case 2: {
                    c10 = 'n';
                    break;
                }
                case 3: {
                    c10 = 'g';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
        MESSAGES = new k(k.z[0], 0);
        RECENT = new k(k.z[2], 1);
        UIDNEXT = new k(k.z[1], 2);
        UIDVALIDITY = new k(k.z[3], 3);
        UNSEEN = new k(k.z[4], 4);
        a = new k[] { k.MESSAGES, k.RECENT, k.UIDNEXT, k.UIDVALIDITY, k.UNSEEN };
    }
    
    private k(final String s, final int n) {
    }
}
