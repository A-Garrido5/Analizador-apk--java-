// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import org.whispersystems.curve25519.Z;
import org.whispersystems.curve25519.Y;

public class s
{
    public static int a;
    private static final String[] z;
    
    static {
        final String[] z2 = new String[9];
        String s = "aA30SCAx*EDJb~";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0257:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '<';
                        break;
                    }
                    case 0: {
                        c2 = '4';
                        break;
                    }
                    case 1: {
                        c2 = '/';
                        break;
                    }
                    case 2: {
                        c2 = 'X';
                        break;
                    }
                    case 3: {
                        c2 = '^';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "dZ:2UW\u000f90X\u0014_*7JU[=~WQV+~QA\\,~^Q\u000f78\u001c@G=~OUB=~HM_=\u007f";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "VJ+*";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "vN<~WQVx*EDJb~";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "VJ+*";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "VJ+*";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "aA30SCAx*EDJb~";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "VJ+*";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "aA30SCAx*EDJb~";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    break Label_0257;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public static P a(final byte[] array) {
        return new t(array);
    }
    
    public static ak a(final byte[] array, final int n) {
        final int a = s.a;
        final int n2 = 0xFF & array[n];
        switch (n2) {
            default: {
                throw new aA(s.z[3] + n2);
            }
            case 5: {
                final byte[] array2 = new byte[32];
                System.arraycopy(array, n + 1, array2, 0, array2.length);
                final l l = new l(array2);
                if (a != 0) {
                    ++bO.s;
                }
                return l;
            }
        }
    }
    
    public static w a() {
        final Z a = Y.a(s.z[4]).a();
        return new w(new l(a.b()), new t(a.a()));
    }
    
    public static boolean a(final ak ak, final byte[] array, final byte[] array2) {
        if (ak.b() == 5) {
            return Y.a(s.z[5]).a(((l)ak).b(), array, array2);
        }
        throw new aA(s.z[6] + ak.b());
    }
    
    public static byte[] a(final P p2, final byte[] array) {
        if (p2.b() == 5) {
            return Y.a(s.z[7]).b(((t)p2).b(), array);
        }
        throw new aA(s.z[8] + p2.b());
    }
    
    public static byte[] a(final ak ak, final P p2) {
        final int a = s.a;
        if (ak.b() != p2.b()) {
            throw new aA(s.z[1]);
        }
        if (ak.b() == 5) {
            final byte[] a2 = Y.a(s.z[2]).a(((l)ak).b(), ((t)p2).b());
            if (bO.s != 0) {
                s.a = a + 1;
            }
            return a2;
        }
        throw new aA(s.z[0] + ak.b());
    }
}
