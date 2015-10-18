// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum az
{
    public static final az BUILTIN;
    public static final az NONE;
    public static final az SOFTWARE;
    private static final az[] a;
    private static final String[] z;
    private final int b;
    
    static {
        final String[] z2 = new String[3];
        String s = "\u0019y(\u0018(\u000bd+";
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
                        c2 = '\u007f';
                        break;
                    }
                    case 0: {
                        c2 = 'J';
                        break;
                    }
                    case 1: {
                        c2 = '6';
                        break;
                    }
                    case 2: {
                        c2 = 'n';
                        break;
                    }
                    case 3: {
                        c2 = 'L';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\bc'\u0000+\u0003x";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0004y \t";
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
        NONE = new az(az.z[2], 0, 1);
        SOFTWARE = new az(az.z[0], 1, 2);
        BUILTIN = new az(az.z[1], 2, 3);
        a = new az[] { az.NONE, az.SOFTWARE, az.BUILTIN };
    }
    
    private az(final String s, final int n, final int b) {
        this.b = b;
    }
    
    public int getCode() {
        return this.b;
    }
}
