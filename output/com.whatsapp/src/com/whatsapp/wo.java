// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum wo
{
    public static final wo ERROR_CONNECTIVITY;
    public static final wo ERROR_UNSPECIFIED;
    public static final wo EXPIRED;
    public static final wo FAIL_BLOCKED;
    public static final wo FAIL_GUESSED_TOO_FAST;
    public static final wo FAIL_MISMATCH;
    public static final wo FAIL_MISSING;
    public static final wo FAIL_STALE;
    public static final wo FAIL_TEMPORARILY_UNAVAILABLE;
    public static final wo FAIL_TOO_MANY_GUESSES;
    public static final wo YES;
    private static final wo[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[11];
        String s = "sh\u0007$jio\u001b8hsy\u001c-qs~";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0307:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '8';
                        break;
                    }
                    case 0: {
                        c2 = '6';
                        break;
                    }
                    case 1: {
                        c2 = ':';
                        break;
                    }
                    case 2: {
                        c2 = 'U';
                        break;
                    }
                    case 3: {
                        c2 = 'k';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "p{\u001c'gen\u0014'}";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "sh\u0007$jiy\u001a%vsy\u0001\"n\u007fn\f";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "p{\u001c'gb\u007f\u0018;wd{\u0007\"toe\u0000%y`{\u001c'ytv\u0010";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "p{\u001c'g{s\u0006&yby\u001d";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "p{\u001c'g{s\u00068qx}";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "p{\u001c'gtv\u001a(ss~";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "p{\u001c'gbu\u001a4uwt\f4\u007fc\u007f\u00068}e";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "p{\u001c'gqo\u00108ks~\n?wye\u0013*kb";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "o\u007f\u0006";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    array[n2] = intern;
                    n2 = 10;
                    s = "sb\u0005\"js~";
                    n = 9;
                    array = z2;
                    continue;
                }
                case 9: {
                    break Label_0307;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        YES = new wo(wo.z[9], 0);
        EXPIRED = new wo(wo.z[10], 1);
        ERROR_UNSPECIFIED = new wo(wo.z[0], 2);
        ERROR_CONNECTIVITY = new wo(wo.z[2], 3);
        FAIL_MISMATCH = new wo(wo.z[4], 4);
        FAIL_TOO_MANY_GUESSES = new wo(wo.z[7], 5);
        FAIL_GUESSED_TOO_FAST = new wo(wo.z[8], 6);
        FAIL_MISSING = new wo(wo.z[5], 7);
        FAIL_STALE = new wo(wo.z[1], 8);
        FAIL_TEMPORARILY_UNAVAILABLE = new wo(wo.z[3], 9);
        FAIL_BLOCKED = new wo(wo.z[6], 10);
        a = new wo[] { wo.YES, wo.EXPIRED, wo.ERROR_UNSPECIFIED, wo.ERROR_CONNECTIVITY, wo.FAIL_MISMATCH, wo.FAIL_TOO_MANY_GUESSES, wo.FAIL_GUESSED_TOO_FAST, wo.FAIL_MISSING, wo.FAIL_STALE, wo.FAIL_TEMPORARILY_UNAVAILABLE, wo.FAIL_BLOCKED };
    }
    
    private wo(final String s, final int n) {
    }
}
