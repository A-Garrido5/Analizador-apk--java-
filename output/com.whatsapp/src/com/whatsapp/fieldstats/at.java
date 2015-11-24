// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum at
{
    public static final at CANCEL;
    public static final at DID_NOT_REQUEST;
    public static final at FAILED;
    public static final at OK;
    private static final at[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[4];
        String s = "65";
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
                        c2 = 'G';
                        break;
                    }
                    case 0: {
                        c2 = 'y';
                        break;
                    }
                    case 1: {
                        c2 = '~';
                        break;
                    }
                    case 2: {
                        c2 = '|';
                        break;
                    }
                    case 3: {
                        c2 = 'B';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "??5\u000e\u0002=";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = ":?2\u0001\u00025";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "=78\u001d\t6*#\u0010\u0002(+9\u0011\u0013";
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
        OK = new at(at.z[0], 0, 1);
        CANCEL = new at(at.z[2], 1, 2);
        DID_NOT_REQUEST = new at(at.z[3], 2, 3);
        FAILED = new at(at.z[1], 3, 4);
        a = new at[] { at.OK, at.CANCEL, at.DID_NOT_REQUEST, at.FAILED };
    }
    
    private at(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
