// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum awa
{
    public static final awa BLOCKED;
    public static final awa ERROR_BAD_TOKEN;
    public static final awa FORMAT_WRONG;
    public static final awa INCORRECT;
    public static final awa LENGTH_LONG;
    public static final awa LENGTH_SHORT;
    public static final awa OLD_VERSION;
    public static final awa TEMPORARILY_UNAVAILABLE;
    private static final awa[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0015<;[1\u00124";
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
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = 'W';
                        break;
                    }
                    case 1: {
                        c2 = 'p';
                        break;
                    }
                    case 2: {
                        c2 = 't';
                        break;
                    }
                    case 3: {
                        c2 = '\u0018';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u001b5:_.\u001f/'P5\u0005$";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0018<0G,\u0012\"'Q5\u0019";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u001e>7W(\u000557L";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u000359H5\u00051&Q6\u000e/!V;\u00011=T;\u0015<1";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001b5:_.\u001f/8W4\u0010";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0012\"&W(\b25\\%\u0003??]4";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0011?&U;\u0003/#J5\u00197";
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
        INCORRECT = new awa(awa.z[3], 0);
        BLOCKED = new awa(awa.z[0], 1);
        LENGTH_LONG = new awa(awa.z[5], 2);
        LENGTH_SHORT = new awa(awa.z[1], 3);
        FORMAT_WRONG = new awa(awa.z[7], 4);
        TEMPORARILY_UNAVAILABLE = new awa(awa.z[4], 5);
        OLD_VERSION = new awa(awa.z[2], 6);
        ERROR_BAD_TOKEN = new awa(awa.z[6], 7);
        a = new awa[] { awa.INCORRECT, awa.BLOCKED, awa.LENGTH_LONG, awa.LENGTH_SHORT, awa.FORMAT_WRONG, awa.TEMPORARILY_UNAVAILABLE, awa.OLD_VERSION, awa.ERROR_BAD_TOKEN };
    }
    
    private awa(final String s, final int n) {
    }
}
