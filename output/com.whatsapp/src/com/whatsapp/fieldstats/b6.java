// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum b6
{
    public static final b6 BUILTIN;
    public static final b6 NONE;
    public static final b6 SOFTWARE;
    private static final b6[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = "{9#o";
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
                        c2 = 'l';
                        break;
                    }
                    case 0: {
                        c2 = '5';
                        break;
                    }
                    case 1: {
                        c2 = 'v';
                        break;
                    }
                    case 2: {
                        c2 = 'm';
                        break;
                    }
                    case 3: {
                        c2 = '*';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "w#$f8|8";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "f9+~;t$(";
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
        NONE = new b6(b6.z[0], 0, 1);
        SOFTWARE = new b6(b6.z[2], 1, 2);
        BUILTIN = new b6(b6.z[1], 2, 3);
        b = new b6[] { b6.NONE, b6.SOFTWARE, b6.BUILTIN };
    }
    
    private b6(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
