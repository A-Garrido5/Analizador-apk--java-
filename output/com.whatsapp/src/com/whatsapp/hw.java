// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

enum hw
{
    public static final hw MAX;
    public static final hw MID;
    public static final hw MIN;
    private static final hw[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "z\u000b\n";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0110:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u000f';
                        break;
                    }
                    case 0: {
                        c2 = '7';
                        break;
                    }
                    case 1: {
                        c2 = 'B';
                        break;
                    }
                    case 2: {
                        c2 = 'D';
                        break;
                    }
                    case 3: {
                        c2 = '!';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "z\u000b\u0000";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "z\u0003\u001c";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    break Label_0110;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        MIN = new hw(hw.z[0], 0);
        MAX = new hw(hw.z[2], 1);
        MID = new hw(hw.z[1], 2);
        a = new hw[] { hw.MIN, hw.MAX, hw.MID };
    }
    
    private hw(final String s, final int n) {
    }
}
