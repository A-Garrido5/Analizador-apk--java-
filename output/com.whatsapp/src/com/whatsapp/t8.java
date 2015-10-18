// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

public enum t8
{
    public static final t8 CANCEL;
    public static final t8 FAILED_BAD_MEDIA;
    public static final t8 FAILED_GENERIC;
    public static final t8 FAILED_INSUFFICIENT_SPACE;
    public static final t8 FAILED_IO;
    public static final t8 FAILED_NO_PERMISSIONS;
    public static final t8 FAILED_OOM;
    public static final t8 SUCCESS;
    private static final t8[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0003\r[V(\u0001\u0013[U";
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
                        c2 = 'm';
                        break;
                    }
                    case 0: {
                        c2 = 'E';
                        break;
                    }
                    case 1: {
                        c2 = 'L';
                        break;
                    }
                    case 2: {
                        c2 = '\u0012';
                        break;
                    }
                    case 3: {
                        c2 = '\u001a';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0003\r[V(\u0001\u0013U_#\u0000\u001e[Y";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0003\r[V(\u0001\u0013]U ";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0016\u0019QY(\u0016\u001f";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u0006\r\\Y(\t";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0003\r[V(\u0001\u0013[T>\u0010\nTS.\f\t\\N2\u0016\u001cSY(";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0003\r[V(\u0001\u0013\\U2\u0015\t@W$\u0016\u001f[U#\u0016";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0003\r[V(\u0001\u0013P[)\u001a\u0001W^$\u0004";
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
        SUCCESS = new t8(t8.z[3], 0);
        FAILED_GENERIC = new t8(t8.z[1], 1);
        FAILED_INSUFFICIENT_SPACE = new t8(t8.z[5], 2);
        FAILED_IO = new t8(t8.z[0], 3);
        FAILED_OOM = new t8(t8.z[2], 4);
        FAILED_BAD_MEDIA = new t8(t8.z[7], 5);
        FAILED_NO_PERMISSIONS = new t8(t8.z[6], 6);
        CANCEL = new t8(t8.z[4], 7);
        a = new t8[] { t8.SUCCESS, t8.FAILED_GENERIC, t8.FAILED_INSUFFICIENT_SPACE, t8.FAILED_IO, t8.FAILED_OOM, t8.FAILED_BAD_MEDIA, t8.FAILED_NO_PERMISSIONS, t8.CANCEL };
    }
    
    private t8(final String s, final int n) {
    }
}
