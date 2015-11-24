// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a6
{
    public static final a6 ECHOSUPPRESSOR;
    public static final a6 MWEBRTC;
    public static final a6 NONE;
    public static final a6 SPEEX;
    public static final a6 WEBRTC;
    private static final a6[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[5];
        String s = "~&/8^";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0006';
                        break;
                    }
                    case 0: {
                        c2 = '-';
                        break;
                    }
                    case 1: {
                        c2 = 'v';
                        break;
                    }
                    case 2: {
                        c2 = 'j';
                        break;
                    }
                    case 3: {
                        c2 = '}';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "c9$8";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "h5\"2Ux&:/C~%%/";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "`!/?Ty5";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "z3(/Rn";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NONE = new a6(a6.z[1], 0, 1);
        SPEEX = new a6(a6.z[0], 1, 2);
        WEBRTC = new a6(a6.z[4], 2, 3);
        MWEBRTC = new a6(a6.z[3], 3, 4);
        ECHOSUPPRESSOR = new a6(a6.z[2], 4, 5);
        b = new a6[] { a6.NONE, a6.SPEEX, a6.WEBRTC, a6.MWEBRTC, a6.ECHOSUPPRESSOR };
    }
    
    private a6(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
