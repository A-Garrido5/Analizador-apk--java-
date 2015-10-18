// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public enum dk
{
    public static final dk DEFAULT;
    public static final dk STRING;
    private static final dk[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[2];
        final char[] charArray = "va\u001c*\u0003~p".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'V';
                    break;
                }
                case 0: {
                    c2 = '2';
                    break;
                }
                case 1: {
                    c2 = '$';
                    break;
                }
                case 2: {
                    c2 = 'Z';
                    break;
                }
                case 3: {
                    c2 = 'k';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "ap\b\"\u0018u".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'V';
                    break;
                }
                case 0: {
                    c4 = '2';
                    break;
                }
                case 1: {
                    c4 = '$';
                    break;
                }
                case 2: {
                    c4 = 'Z';
                    break;
                }
                case 3: {
                    c4 = 'k';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        z = z2;
        DEFAULT = new dk(dk.z[0], 0)
        {
            d5(final String s, final int n) {
            }
            
            @Override
            public fL serialize(final Long n) {
                return new f5(n);
            }
        };
        STRING = new dk(dk.z[1], 1)
        {
            dY(final String s, final int n) {
            }
            
            @Override
            public fL serialize(final Long n) {
                return new f5(String.valueOf(n));
            }
        };
        a = new dk[] { dk.DEFAULT, dk.STRING };
    }
    
    private dk(final String s, final int n) {
    }
    
    dk(final String s, final int n, final d5 dk) {
        this(s, n);
    }
    
    public abstract fL serialize(final Long p0);
}
