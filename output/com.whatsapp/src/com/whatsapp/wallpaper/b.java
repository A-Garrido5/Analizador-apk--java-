// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.wallpaper;

enum b
{
    public static final b Grow;
    public static final b Move;
    public static final b None;
    private static final b[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u001b\u000f\u0013@";
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
                        c2 = 'f';
                        break;
                    }
                    case 0: {
                        c2 = 'V';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'e';
                        break;
                    }
                    case 3: {
                        c2 = '%';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\u0011\u0012\nR";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0018\u000f\u000b@";
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
        None = new b(b.z[2], 0);
        Move = new b(b.z[0], 1);
        Grow = new b(b.z[1], 2);
        a = new b[] { b.None, b.Move, b.Grow };
    }
    
    private b(final String s, final int n) {
    }
}
