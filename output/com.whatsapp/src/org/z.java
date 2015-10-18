// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.util.EventObject;

public class z extends EventObject
{
    public static final long a = -1L;
    private static final long serialVersionUID = -964927635655051867L;
    private static final String[] z;
    private final long b;
    private final long c;
    private final int d;
    
    static {
        final String[] z2 = new String[4];
        final char[] charArray = "\\Mx\u0000`\u0015\u001e'".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0014';
                    break;
                }
                case 0: {
                    c2 = 'p';
                    break;
                }
                case 1: {
                    c2 = 'm';
                    break;
                }
                case 2: {
                    c2 = '\u001a';
                    break;
                }
                case 3: {
                    c2 = 'y';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z2[0] = new String(charArray).intern();
        final char[] charArray2 = "\\Mi\u0010n\u0015P".toCharArray();
        for (int j = charArray2.length, n2 = 0; j > n2; ++n2) {
            final char c3 = charArray2[n2];
            char c4 = '\0';
            switch (n2 % 5) {
                default: {
                    c4 = '\u0014';
                    break;
                }
                case 0: {
                    c4 = 'p';
                    break;
                }
                case 1: {
                    c4 = 'm';
                    break;
                }
                case 2: {
                    c4 = '\u001a';
                    break;
                }
                case 3: {
                    c4 = 'y';
                    break;
                }
            }
            charArray2[n2] = (char)(c4 ^ c3);
        }
        z2[1] = new String(charArray2).intern();
        final char[] charArray3 = "\\Mn\u0016`\u0011\u0001'".toCharArray();
        for (int k = charArray3.length, n3 = 0; k > n3; ++n3) {
            final char c5 = charArray3[n3];
            char c6 = '\0';
            switch (n3 % 5) {
                default: {
                    c6 = '\u0014';
                    break;
                }
                case 0: {
                    c6 = 'p';
                    break;
                }
                case 1: {
                    c6 = 'm';
                    break;
                }
                case 2: {
                    c6 = '\u001a';
                    break;
                }
                case 3: {
                    c6 = 'y';
                    break;
                }
            }
            charArray3[n3] = (char)(c6 ^ c5);
        }
        z2[2] = new String(charArray3).intern();
        final char[] charArray4 = "+\u001eu\ff\u0013\b'".toCharArray();
        for (int l = charArray4.length, n4 = 0; l > n4; ++n4) {
            final char c7 = charArray4[n4];
            char c8 = '\0';
            switch (n4 % 5) {
                default: {
                    c8 = '\u0014';
                    break;
                }
                case 0: {
                    c8 = 'p';
                    break;
                }
                case 1: {
                    c8 = 'm';
                    break;
                }
                case 2: {
                    c8 = '\u001a';
                    break;
                }
                case 3: {
                    c8 = 'y';
                    break;
                }
            }
            charArray4[n4] = (char)(c8 ^ c7);
        }
        z2[3] = new String(charArray4).intern();
        z = z2;
    }
    
    public z(final Object o, final long b, final int d, final long c) {
        final int b2 = K.b;
        super(o);
        this.d = d;
        this.b = b;
        this.c = c;
        if (l.a != 0) {
            K.b = b2 + 1;
        }
    }
    
    public int a() {
        return this.d;
    }
    
    public long b() {
        return this.b;
    }
    
    public long c() {
        return this.c;
    }
    
    @Override
    public String toString() {
        final int b = K.b;
        final String string = this.getClass().getName() + org.z.z[3] + this.source + org.z.z[2] + this.b + org.z.z[0] + this.d + org.z.z[1] + this.c + "]";
        if (b != 0) {
            ++l.a;
        }
        return string;
    }
}
