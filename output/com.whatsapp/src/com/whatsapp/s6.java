// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Arrays;

public class s6
{
    private static final String[] z;
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public String e;
    
    static {
        final String[] z2 = new String[5];
        String s = "X`nw\u0018\u0002%oA\u000b\u00184 ";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'j';
                        break;
                    }
                    case 0: {
                        c2 = 't';
                        break;
                    }
                    case 1: {
                        c2 = '@';
                        break;
                    }
                    case 2: {
                        c2 = '\u001d';
                        break;
                    }
                    case 3: {
                        c2 = '\u0012';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "T+xk<\u00112n{\u0005\u001a}";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "X`x|\t\u00069mf\u0003\u001b.TdW";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "X`z}\u0005\u0013,x[\u000e'!qfW";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "6!~y\u001f\u0004\u0003tb\u0002\u00112=I\t\u001d0uw\u0018\"%oa\u0003\u001b. ";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public s6(final byte[] b, final String e, final byte[] a, final byte[] c, final byte[] d) {
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public String toString() {
        return s6.z[4] + Arrays.toString(this.b) + s6.z[1] + this.e + s6.z[0] + Arrays.toString(this.a) + s6.z[3] + Arrays.toString(this.c) + s6.z[2] + Arrays.toString(this.d) + "]";
    }
}
