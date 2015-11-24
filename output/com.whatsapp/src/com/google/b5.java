// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public abstract class b5
{
    private static final String z;
    private final int a;
    private final int b;
    
    static {
        final char[] charArray = ":~'Mf\u0002c#W(\u000fx-[f\u001dy;L%\u000b6*Q#\u001d6 Q2Ne;N6\u0001d:\u001e4\u0001b/J/\u0001xn\\?N/~\u001e\"\u000bq<[#\u001d8".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'F';
                    break;
                }
                case 0: {
                    c2 = 'n';
                    break;
                }
                case 1: {
                    c2 = '\u0016';
                    break;
                }
                case 2: {
                    c2 = 'N';
                    break;
                }
                case 3: {
                    c2 = '>';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    protected b5(final int a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean a() {
        return false;
    }
    
    public abstract byte[] a(final int p0, final byte[] p1);
    
    public abstract byte[] b();
    
    public final int c() {
        return this.a;
    }
    
    public b5 d() {
        throw new UnsupportedOperationException(b5.z);
    }
    
    public final int e() {
        return this.b;
    }
    
    @Override
    public final String toString() {
        final int c = cs.c;
        final byte[] array = new byte[this.a];
        final StringBuilder sb = new StringBuilder(this.b * (1 + this.a));
        byte[] a = array;
        int i = 0;
        while (i < this.b) {
            a = this.a(i, a);
            int j = 0;
            while (j < this.a) {
                final int n = 0xFF & a[j];
                char c2 = '\0';
                Label_0129: {
                    if (n < 64) {
                        c2 = '#';
                        if (c == 0) {
                            break Label_0129;
                        }
                    }
                    if (n < 128) {
                        c2 = '+';
                        if (c == 0) {
                            break Label_0129;
                        }
                    }
                    if (n < 192) {
                        c2 = '.';
                        if (c == 0) {
                            break Label_0129;
                        }
                    }
                    c2 = ' ';
                }
                sb.append(c2);
                ++j;
                if (c != 0) {
                    break;
                }
            }
            sb.append('\n');
            ++i;
            if (c != 0) {
                break;
            }
        }
        return sb.toString();
    }
}
