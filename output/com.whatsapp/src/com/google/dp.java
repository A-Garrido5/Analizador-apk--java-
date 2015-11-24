// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;

final class dp implements Serializable
{
    private static final long serialVersionUID;
    private static final String[] z;
    private byte[] a;
    private String b;
    
    static {
        final String[] z2 = new String[6];
        final char[] charArray = "\u0000\u0004d`&e\u0015wc8,\u0018q/: \u0001Tz=)\u0012s}".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'T';
                    break;
                }
                case 0: {
                    c2 = 'E';
                    break;
                }
                case 1: {
                    c2 = 'v';
                    break;
                }
                case 2: {
                    c2 = '\u0016';
                    break;
                }
                case 3: {
                    c2 = '\u000f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "+\u0013aM!,\u001arj&".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = 'T';
                    break;
                }
                case 0: {
                    c4 = 'E';
                    break;
                }
                case 1: {
                    c4 = 'v';
                    break;
                }
                case 2: {
                    c4 = '\u0016';
                    break;
                }
                case 3: {
                    c4 = '\u000f';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\u0010\u0018wm8 Vb`t#\u001fxkt+\u0013aM!,\u001arj&e\u001bs{<*\u0012".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = 'T';
                    break;
                }
                case 0: {
                    c6 = 'E';
                    break;
                }
                case 1: {
                    c6 = 'v';
                    break;
                }
                case 2: {
                    c6 = '\u0016';
                    break;
                }
                case 3: {
                    c6 = '\u000f';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "\u0010\u0018wm8 Vb`t0\u0018rj&6\u0002wa0e\u0006d` *Vtz2#\u0013d".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = 'T';
                    break;
                }
                case 0: {
                    c8 = 'E';
                    break;
                }
                case 1: {
                    c8 = 'v';
                    break;
                }
                case 2: {
                    c8 = '\u0016';
                    break;
                }
                case 3: {
                    c8 = '\u000f';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        final char[] charArray5 = "\u0010\u0018wm8 Vb`t#\u001fxkt5\u0004y{;e\u0014ci2 \u00046l8$\u0005e".toCharArray();
        for (int length = charArray5.length, n5 = 0; length > n5; ++n5) {
            final char c9 = charArray5[n5];
            char c10 = '\0';
            switch (n5 % 5) {
                default: {
                    c10 = 'T';
                    break;
                }
                case 0: {
                    c10 = 'E';
                    break;
                }
                case 1: {
                    c10 = 'v';
                    break;
                }
                case 2: {
                    c10 = '\u0016';
                    break;
                }
                case 3: {
                    c10 = '\u000f';
                    break;
                }
            }
            charArray5[n5] = (char)(c10 ^ c9);
        }
        z2[4] = new String(charArray5).intern();
        final char[] charArray6 = "\u0010\u0018wm8 Vb`t&\u0017zct+\u0013aM!,\u001arj&e\u001bs{<*\u0012".toCharArray();
        for (int length2 = charArray6.length, n6 = 0; length2 > n6; ++n6) {
            final char c11 = charArray6[n6];
            char c12 = '\0';
            switch (n6 % 5) {
                default: {
                    c12 = 'T';
                    break;
                }
                case 0: {
                    c12 = 'E';
                    break;
                }
                case 1: {
                    c12 = 'v';
                    break;
                }
                case 2: {
                    c12 = '\u0016';
                    break;
                }
                case 3: {
                    c12 = '\u000f';
                    break;
                }
            }
            charArray6[n6] = (char)(c12 ^ c11);
        }
        z2[5] = new String(charArray6).intern();
        z = z2;
    }
    
    dp(final ci ci) {
        this.b = ci.getClass().getName();
        this.a = ci.a();
    }
    
    protected Object readResolve() {
        try {
            final aJ aj = (aJ)Class.forName(this.b).getMethod(dp.z[1], (Class<?>[])new Class[0]).invoke(null, new Object[0]);
            aj.a(this.a);
            return aj.buildPartial();
        }
        catch (ClassNotFoundException ex) {
            throw new RuntimeException(dp.z[4], ex);
        }
        catch (NoSuchMethodException ex2) {
            throw new RuntimeException(dp.z[2], ex2);
        }
        catch (IllegalAccessException ex3) {
            throw new RuntimeException(dp.z[5], ex3);
        }
        catch (InvocationTargetException ex4) {
            throw new RuntimeException(dp.z[0], ex4.getCause());
        }
        catch (bg bg) {
            throw new RuntimeException(dp.z[3], bg);
        }
    }
}
