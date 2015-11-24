// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum ai
{
    public static final ai FAILED_GENERIC;
    public static final ai FAILED_INVALID;
    public static final ai FAILED_OUT_OF_SPACE;
    public static final ai SUCCESS;
    private static final ai[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "\u0016\u001aOW)\u0014\u0004IN8\u000f\u0014@D?\u0000\u001aE^";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = 'P';
                        break;
                    }
                    case 1: {
                        c2 = '[';
                        break;
                    }
                    case 2: {
                        c2 = '\u0006';
                        break;
                    }
                    case 3: {
                        c2 = '\u001b';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0016\u001aOW)\u0014\u0004A^\"\u0015\tOX";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0016\u001aOW)\u0014\u0004OU:\u0011\u0017O_";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0003\u000eEX)\u0003\b";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        SUCCESS = new ai(ai.z[3], 0);
        FAILED_GENERIC = new ai(ai.z[1], 1);
        FAILED_OUT_OF_SPACE = new ai(ai.z[0], 2);
        FAILED_INVALID = new ai(ai.z[2], 3);
        a = new ai[] { ai.SUCCESS, ai.FAILED_GENERIC, ai.FAILED_OUT_OF_SPACE, ai.FAILED_INVALID };
    }
    
    private ai(final String s, final int n) {
    }
}
