// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Arrays;

public class f3
{
    private static final String[] z;
    public byte[] a;
    public byte[] b;
    public s6 c;
    
    static {
        final String[] z2 = new String[3];
        String s = "7Q.ASs\u0014\"gOt\u0016*Ei\u007fL";
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
                        c2 = ' ';
                        break;
                    }
                    case 0: {
                        c2 = '\u001b';
                        break;
                    }
                    case 1: {
                        c2 = 'q';
                        break;
                    }
                    case 2: {
                        c2 = 'F';
                        break;
                    }
                    case 3: {
                        c2 = ' ';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "Y\u0010%KUk:#Y\u0000@";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    n2 = 2;
                    array = z2;
                    s = "7Q%IPs\u00144kEbL";
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
    }
    
    public f3(final byte[] array, final String s, final byte[] array2, final byte[] array3, final byte[] b, final byte[] array4, final byte[] a) {
        this.c = new s6(array, s, array2, array3, array4);
        this.b = b;
        this.a = a;
    }
    
    @Override
    public String toString() {
        return f3.z[1] + this.c.toString() + f3.z[0] + Arrays.toString(this.b) + f3.z[2] + Arrays.toString(this.a) + "]";
    }
}
