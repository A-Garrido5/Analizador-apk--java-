// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Field;

public enum ft implements fJ
{
    public static final ft IDENTITY;
    public static final ft LOWER_CASE_WITH_DASHES;
    public static final ft LOWER_CASE_WITH_UNDERSCORES;
    public static final ft UPPER_CAMEL_CASE;
    public static final ft UPPER_CAMEL_CASE_WITH_SPACES;
    private static final ft[] a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[5];
        final char[] charArray = "`fX\u000e#juI\u00064yiK\n\"p".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'q';
                    break;
                }
                case 0: {
                    c2 = '5';
                    break;
                }
                case 1: {
                    c2 = '6';
                    break;
                }
                case 2: {
                    c2 = '\b';
                    break;
                }
                case 3: {
                    c2 = 'K';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "|rM\u0005%|bQ".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'q';
                    break;
                }
                case 0: {
                    c4 = '5';
                    break;
                }
                case 1: {
                    c4 = '6';
                    break;
                }
                case 2: {
                    c4 = '\b';
                    break;
                }
                case 3: {
                    c4 = 'K';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "yy_\u000e#juI\u00184jaA\u001f9jcF\u000f4geK\u0004#pe".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'q';
                    break;
                }
                case 0: {
                    c6 = '5';
                    break;
                }
                case 1: {
                    c6 = '6';
                    break;
                }
                case 2: {
                    c6 = '\b';
                    break;
                }
                case 3: {
                    c6 = 'K';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "`fX\u000e#juI\u00064yiK\n\"pi_\u0002%}i[\u001b0vs[".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'q';
                    break;
                }
                case 0: {
                    c8 = '5';
                    break;
                }
                case 1: {
                    c8 = '6';
                    break;
                }
                case 2: {
                    c8 = '\b';
                    break;
                }
                case 3: {
                    c8 = 'K';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "yy_\u000e#juI\u00184jaA\u001f9jrI\u00189pe".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'q';
                    break;
                }
                case 0: {
                    c10 = '5';
                    break;
                }
                case 1: {
                    c10 = '6';
                    break;
                }
                case 2: {
                    c10 = '\b';
                    break;
                }
                case 3: {
                    c10 = 'K';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        z = z2;
        IDENTITY = new ft(ft.z[1], 0)
        {
            f4(final String s, final int n) {
            }
            
            public String translateName(final Field field) {
                return field.getName();
            }
        };
        UPPER_CAMEL_CASE = new ft(ft.z[0], 1)
        {
            fS(final String s, final int n) {
            }
            
            public String translateName(final Field field) {
                return ft.a(field.getName());
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = new ft(ft.z[3], 2)
        {
            fQ(final String s, final int n) {
            }
            
            public String translateName(final Field field) {
                return ft.a(ft.b(field.getName(), " "));
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = new ft(ft.z[2], 3)
        {
            fr(final String s, final int n) {
            }
            
            public String translateName(final Field field) {
                return ft.b(field.getName(), "_").toLowerCase();
            }
        };
        LOWER_CASE_WITH_DASHES = new ft(ft.z[4], 4)
        {
            fq(final String s, final int n) {
            }
            
            public String translateName(final Field field) {
                return ft.b(field.getName(), "-").toLowerCase();
            }
        };
        a = new ft[] { ft.IDENTITY, ft.UPPER_CAMEL_CASE, ft.UPPER_CAMEL_CASE_WITH_SPACES, ft.LOWER_CASE_WITH_UNDERSCORES, ft.LOWER_CASE_WITH_DASHES };
    }
    
    private ft(final String s, final int n) {
    }
    
    ft(final String s, final int n, final f4 ft) {
        this(s, n);
    }
    
    private static String a(final char c, final String s, final int n) {
        if (n < s.length()) {
            return c + s.substring(n);
        }
        return String.valueOf(c);
    }
    
    static String a(final String s) {
        return b(s);
    }
    
    private static String a(final String s, final String s2) {
        final boolean a = fL.a;
        final StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < s.length()) {
            final char char1 = s.charAt(i);
            if (Character.isUpperCase(char1) && sb.length() != 0) {
                sb.append(s2);
            }
            sb.append(char1);
            ++i;
            if (a) {
                break;
            }
        }
        return sb.toString();
    }
    
    private static String b(String string) {
        final boolean a = fL.a;
        final StringBuilder sb = new StringBuilder();
        int n = 0;
        char c = string.charAt(0);
        while (n < -1 + string.length() && (!Character.isLetter(c) || a)) {
            sb.append(c);
            ++n;
            c = string.charAt(n);
            if (a) {
                break;
            }
        }
        if (n == string.length()) {
            string = sb.toString();
        }
        else if (!Character.isUpperCase(c)) {
            return sb.append(a(Character.toUpperCase(c), string, n + 1)).toString();
        }
        return string;
    }
    
    static String b(final String s, final String s2) {
        return a(s, s2);
    }
}
