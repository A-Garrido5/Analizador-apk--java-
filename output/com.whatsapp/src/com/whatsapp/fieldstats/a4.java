// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum a4
{
    public static final a4 DIFFERENT_COUNTRY;
    public static final a4 SAME_COUNTRY;
    private static final a4[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[2];
        String s = "=`%\u000f+-n=\u0004 <x";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 't';
                        break;
                    }
                    case 0: {
                        c2 = 'n';
                        break;
                    }
                    case 1: {
                        c2 = '!';
                        break;
                    }
                    case 2: {
                        c2 = 'h';
                        break;
                    }
                    case 3: {
                        c2 = 'J';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "*h.\f1<d&\u001e+-n=\u0004 <x";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        SAME_COUNTRY = new a4(a4.z[0], 0, 1);
        DIFFERENT_COUNTRY = new a4(a4.z[1], 1, 2);
        b = new a4[] { a4.SAME_COUNTRY, a4.DIFFERENT_COUNTRY };
    }
    
    private a4(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
