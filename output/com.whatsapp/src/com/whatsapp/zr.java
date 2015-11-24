// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum zr
{
    public static final zr CENTER_CROP;
    public static final zr FIT_CENTER;
    public static final zr FIT_HEIGHT;
    public static final zr FIT_WIDTH;
    private static final zr[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "Vx0g_Gb=aUE";
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
                        c2 = '\u001a';
                        break;
                    }
                    case 0: {
                        c2 = '\u0015';
                        break;
                    }
                    case 1: {
                        c2 = '=';
                        break;
                    }
                    case 2: {
                        c2 = '~';
                        break;
                    }
                    case 3: {
                        c2 = '3';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "St*lRPt9{N";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "St*lYPs*vH";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "St*lM\\y*{";
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
        FIT_CENTER = new zr(zr.z[2], 0);
        FIT_WIDTH = new zr(zr.z[3], 1);
        FIT_HEIGHT = new zr(zr.z[1], 2);
        CENTER_CROP = new zr(zr.z[0], 3);
        a = new zr[] { zr.FIT_CENTER, zr.FIT_WIDTH, zr.FIT_HEIGHT, zr.CENTER_CROP };
    }
    
    private zr(final String s, final int n) {
    }
}
