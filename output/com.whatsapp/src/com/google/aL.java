// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

public final class aL
{
    private int a;
    private int b;
    private final byte[] c;
    
    public aL(final byte[] c) {
        this.c = c;
    }
    
    public int a() {
        return this.b;
    }
    
    public int a(final int n) {
        final int b = hN.b;
        Label_0023: {
            if (n < 1 || n > 32) {
                break Label_0023;
            }
            try {
                if (n > this.c()) {
                    throw new IllegalArgumentException(String.valueOf(n));
                }
            }
            catch (IllegalArgumentException ex) {
                throw ex;
            }
        }
    Label_0146:
        while (true) {
            if (this.b <= 0) {
                final int i = n;
                final int n2 = 0;
                break Label_0146;
            }
            final int n3 = 8 - this.b;
            Label_0256: {
                if (n >= n3) {
                    break Label_0256;
                }
                int n4 = n;
                while (true) {
                    final int n5 = n3 - n4;
                    final int n6 = (255 >> 8 - n4 << n5 & this.c[this.a]) >> n5;
                    final int n7 = n - n4;
                    Label_0268: {
                        try {
                            this.b += n4;
                            if (this.b == 8) {
                                this.b = 0;
                                ++this.a;
                                int n2 = n6;
                                int i = n7;
                                if (i > 0) {
                                    while (i >= 8) {
                                        n2 = (n2 << 8 | (0xFF & this.c[this.a]));
                                        ++this.a;
                                        i -= 8;
                                        if (b != 0) {
                                            break;
                                        }
                                    }
                                    if (i > 0) {
                                        final int n8 = 8 - i;
                                        n2 = (n2 << i | (255 >> n8 << n8 & this.c[this.a]) >> n8);
                                        this.b += i;
                                    }
                                }
                                return n2;
                            }
                            break Label_0268;
                            n4 = n3;
                            continue;
                        }
                        catch (IllegalArgumentException ex2) {
                            throw ex2;
                        }
                    }
                    int n2 = n6;
                    int i = n7;
                    continue Label_0146;
                }
            }
            break;
        }
    }
    
    public int b() {
        return this.a;
    }
    
    public int c() {
        return 8 * (this.c.length - this.a) - this.b;
    }
}
