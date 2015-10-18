// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a8
{
    public static final a8 BUILTIN;
    public static final a8 NONE;
    public static final a8 SOFTWARE;
    private static final a8[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = "l\u0012\u0015<6~\u000f\u0016";
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
                        c2 = 'a';
                        break;
                    }
                    case 0: {
                        c2 = '?';
                        break;
                    }
                    case 1: {
                        c2 = ']';
                        break;
                    }
                    case 2: {
                        c2 = 'S';
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
                    s = "q\u0012\u001d-";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "}\b\u001a$5v\u0013";
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
        NONE = new a8(a8.z[1], 0, 1);
        SOFTWARE = new a8(a8.z[0], 1, 2);
        BUILTIN = new a8(a8.z[2], 2, 3);
        b = new a8[] { a8.NONE, a8.SOFTWARE, a8.BUILTIN };
    }
    
    private a8(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
