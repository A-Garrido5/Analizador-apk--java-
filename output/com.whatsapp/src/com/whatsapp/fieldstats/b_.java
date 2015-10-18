// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.fieldstats;

public enum b_
{
    public static final b_ FACEBOOK;
    public static final b_ FOURSQUARE;
    public static final b_ GOOGLE;
    private static final b_[] b;
    private static final String[] z;
    private final int a;
    
    static {
        final String[] z2 = new String[3];
        String s = "\\!%?8U/-";
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
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = '`';
                        break;
                    }
                    case 2: {
                        c2 = 'f';
                        break;
                    }
                    case 3: {
                        c2 = 'z';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "\\/3()K5'(?";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "]/)=6_";
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
        GOOGLE = new b_(b_.z[2], 0, 1);
        FOURSQUARE = new b_(b_.z[1], 1, 2);
        FACEBOOK = new b_(b_.z[0], 2, 3);
        b = new b_[] { b_.GOOGLE, b_.FOURSQUARE, b_.FACEBOOK };
    }
    
    private b_(final String s, final int n, final int a) {
        this.a = a;
    }
    
    public int getCode() {
        return this.a;
    }
}
