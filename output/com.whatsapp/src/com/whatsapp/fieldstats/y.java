// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum y
{
    public static final y MISSING_HEADER;
    public static final y NO_TIMESTAMP;
    public static final y PARSE;
    public static final y TIME_SHIFT;
    public static final y TOO_OLD;
    private static final y[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[5];
        String s = "]\u0013%U3Z\u0012!V8";
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
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = '\t';
                        break;
                    }
                    case 1: {
                        c2 = 'Z';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = '\u0010';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "G\u00157D%D\u001f;D-D\n";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Y\u001b:C)";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "D\u0013;C%G\u001d7X)H\u001e-B";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "]\u0015'O#E\u001e";
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
        NO_TIMESTAMP = new y(y.z[1], 0, 1);
        TIME_SHIFT = new y(y.z[0], 1, 2);
        TOO_OLD = new y(y.z[4], 2, 4);
        PARSE = new y(y.z[2], 3, 3);
        MISSING_HEADER = new y(y.z[3], 4, 5);
        b = new y[] { y.NO_TIMESTAMP, y.TIME_SHIFT, y.TOO_OLD, y.PARSE, y.MISSING_HEADER };
    }
    
    private y(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
