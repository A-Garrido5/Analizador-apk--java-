// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class ao
{
    private static final String z;
    private final byte[] a;
    private final B b;
    
    static {
        final char[] charArray = "r\u0011nAk@\u000bUSoF\u0011bF".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u001b';
                    break;
                }
                case 0: {
                    c2 = '%';
                    break;
                }
                case 1: {
                    c2 = 'y';
                    break;
                }
                case 2: {
                    c2 = '\u0007';
                    break;
                }
                case 3: {
                    c2 = '2';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public ao(final B b, final byte[] a) {
        this.b = b;
        this.a = a;
    }
    
    public g a(final ak ak, final w w) {
        final r r = new r(this.b.a(s.a(ak, w.a()), this.a, ao.z.getBytes(), 64));
        return new g(new ao(this.b, r.b()), new J(this.b, r.a(), 0));
    }
    
    public byte[] a() {
        return this.a;
    }
}
