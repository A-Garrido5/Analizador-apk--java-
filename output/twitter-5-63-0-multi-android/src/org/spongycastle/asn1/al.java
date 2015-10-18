// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.InputStream;

class al extends InputStream
{
    private final v a;
    private boolean b;
    private InputStream c;
    
    al(final v a) {
        this.b = true;
        this.a = a;
    }
    
    @Override
    public int read() {
        if (this.c == null) {
            if (!this.b) {
                return -1;
            }
            final n n = (n)this.a.a();
            if (n == null) {
                return -1;
            }
            this.b = false;
            this.c = n.c();
        }
        while (true) {
            final int read = this.c.read();
            if (read >= 0) {
                return read;
            }
            final n n2 = (n)this.a.a();
            if (n2 == null) {
                break;
            }
            this.c = n2.c();
        }
        this.c = null;
        return -1;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        final InputStream c = this.c;
        int n3 = 0;
        Label_0056: {
            if (c == null) {
                if (this.b) {
                    final n n4 = (n)this.a.a();
                    if (n4 != null) {
                        this.b = false;
                        this.c = n4.c();
                        break Label_0056;
                    }
                }
                return -1;
            }
        }
        while (true) {
            final int read = this.c.read(array, n + n3, n2 - n3);
            int n5;
            if (read >= 0) {
                n5 = read + n3;
                if (n5 == n2) {
                    return n5;
                }
            }
            else {
                final n n6 = (n)this.a.a();
                if (n6 == null) {
                    this.c = null;
                    if (n3 < 1) {
                        n3 = -1;
                    }
                    return n3;
                }
                this.c = n6.c();
                n5 = n3;
            }
            n3 = n5;
        }
    }
}
