// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum bw
{
    public static final bw DELAYED;
    public static final bw FAILED;
    public static final bw IN_PROGRESS;
    public static final bw NETWORK_UNAVAILABLE;
    public static final bw UP_TO_DATE;
    public static final bw USER_IS_EXPIRED;
    private static final bw[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[6];
        String s = "\u0001d\u0006?`\u001dj\r=a\u000ew\u0013!c\u000ec\u001e-";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '/';
                        break;
                    }
                    case 0: {
                        c2 = 'O';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = 'R';
                        break;
                    }
                    case 3: {
                        c2 = 'h';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\t`\u001b$j\u000b";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u000bd\u001e)v\ne";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0006o\r8}\u0000f\u0000-|\u001c";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "\u001ar\u0017:p\u0006r\r-w\u001fh\u0000-k";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u001aq\r<`\u0010e\u0013<j";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        NETWORK_UNAVAILABLE = new bw(bw.z[0], 0, 1);
        IN_PROGRESS = new bw(bw.z[3], 1, 2);
        UP_TO_DATE = new bw(bw.z[5], 2, 3);
        FAILED = new bw(bw.z[1], 3, 4);
        DELAYED = new bw(bw.z[2], 4, 5);
        USER_IS_EXPIRED = new bw(bw.z[4], 5, 6);
        a = new bw[] { bw.NETWORK_UNAVAILABLE, bw.IN_PROGRESS, bw.UP_TO_DATE, bw.FAILED, bw.DELAYED, bw.USER_IS_EXPIRED };
    }
    
    private bw(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
