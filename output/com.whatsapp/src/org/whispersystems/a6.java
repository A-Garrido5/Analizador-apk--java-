// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.LinkedList;
import java.util.List;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

public class a6
{
    private static final String[] z;
    
    static {
        final String[] z2 = new String[4];
        String s = "0\u000fgV/1\ta";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
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
                        c2 = 'c';
                        break;
                    }
                    case 1: {
                        c2 = 'G';
                        break;
                    }
                    case 2: {
                        c2 = '&';
                        break;
                    }
                    case 3: {
                        c2 = 'g';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "0\u000fgV/1\ta";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "0\u000fgV/1\ta";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "0\u000fgV/1\ta";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static int a(final int n) {
        try {
            return SecureRandom.getInstance(a6.z[0]).nextInt(n);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static int a(final boolean b) {
        try {
            final SecureRandom instance = SecureRandom.getInstance(a6.z[2]);
            if (b) {
                return 1 + instance.nextInt(2147483646);
            }
            return instance.nextInt(16380) + 1;
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static List a(final int n, final int n2) {
        final int a = m.a;
        final LinkedList<z> list = new LinkedList<z>();
        final int n3 = n - 1;
        int i = 0;
        while (i < n2) {
            list.add(new z(1 + (n3 + i) % (-1 + aS.a), s.a()));
            ++i;
            if (a != 0) {
                break;
            }
        }
        return list;
    }
    
    public static aY a() {
        final w a = s.a();
        return new aY(new o(a.b()), a.a());
    }
    
    public static x a(final aY ay, final int n) {
        final w a = s.a();
        return new x(n, System.currentTimeMillis(), a, s.a(ay.b(), a.b().a()));
    }
    
    public static int b() {
        try {
            return SecureRandom.getInstance(a6.z[3]).nextInt(Integer.MAX_VALUE);
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static w c() {
        return s.a();
    }
    
    public static byte[] d() {
        try {
            final byte[] array = new byte[32];
            SecureRandom.getInstance(a6.z[1]).nextBytes(array);
            return array;
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError((Object)ex);
        }
    }
}
