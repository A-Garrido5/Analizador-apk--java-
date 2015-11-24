// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum t
{
    public static final t CHAT_DB_ERROR;
    public static final t DOWNLOAD_ERROR;
    public static final t NOT_ENOUGH_SPACE;
    public static final t NOT_SIGNED_IN;
    public static final t NO_BACKUP;
    public static final t QUIT;
    public static final t SKIPPED;
    public static final t SUCCESS;
    public static final t TAR_ERROR;
    private static final t[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[9];
        String s = "I\u001fI-'O\fT ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'b';
                        break;
                    }
                    case 0: {
                        c2 = '\u001d';
                        break;
                    }
                    case 1: {
                        c2 = '^';
                        break;
                    }
                    case 2: {
                        c2 = '\u001b';
                        break;
                    }
                    case 3: {
                        c2 = 'r';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "L\u000bR&";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "S\u0011O-1T\u0019U7&B\u0017U";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "^\u0016Z&=Y\u001cD70O\u0011I";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "S\u0011D0#^\u0015N\"";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "N\u000bX1'N\r";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "Y\u0011L<.R\u001f_-'O\fT ";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "N\u0015R\"2X\u001a";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "S\u0011O-'S\u0011N5*B\rK3!X";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NOT_SIGNED_IN = new t(t.z[2], 0, 1);
        NO_BACKUP = new t(t.z[4], 1, 2);
        SKIPPED = new t(t.z[7], 2, 3);
        SUCCESS = new t(t.z[5], 3, 4);
        CHAT_DB_ERROR = new t(t.z[3], 4, 5);
        TAR_ERROR = new t(t.z[0], 5, 6);
        DOWNLOAD_ERROR = new t(t.z[6], 6, 7);
        NOT_ENOUGH_SPACE = new t(t.z[8], 7, 8);
        QUIT = new t(t.z[1], 8, 9);
        a = new t[] { t.NOT_SIGNED_IN, t.NO_BACKUP, t.SKIPPED, t.SUCCESS, t.CHAT_DB_ERROR, t.TAR_ERROR, t.DOWNLOAD_ERROR, t.NOT_ENOUGH_SPACE, t.QUIT };
    }
    
    private t(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
