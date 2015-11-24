// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class ar
{
    public static int d;
    private static final String z;
    private final byte[] a;
    private final byte[] b;
    private final byte[] c;
    private final int e;
    
    static {
        final char[] charArray = "l\f\u001dmE^\u00163lZN\u0014".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '5';
                    break;
                }
                case 0: {
                    c2 = ';';
                    break;
                }
                case 1: {
                    c2 = 'd';
                    break;
                }
                case 2: {
                    c2 = 't';
                    break;
                }
                case 3: {
                    c2 = '\u001e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ar(final int e, final byte[] c) {
        final int d = ar.d;
        final byte[][] b = m.b(new D().a(c, ar.z.getBytes(), 48), 16, 32);
        this.e = e;
        this.c = c;
        this.a = b[0];
        this.b = b[1];
        if (d != 0) {
            ++bO.s;
        }
    }
    
    public byte[] a() {
        return this.a;
    }
    
    public byte[] b() {
        return this.b;
    }
    
    public int c() {
        return this.e;
    }
    
    public byte[] d() {
        return this.c;
    }
}
