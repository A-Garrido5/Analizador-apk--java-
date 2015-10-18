// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

public class o
{
    private OutputStream a;
    
    public o(final OutputStream a) {
        this.a = a;
    }
    
    o a() {
        return new bd(this.a);
    }
    
    void a(final int n) {
        if (n > 127) {
            int n2 = 1;
            int n3 = n;
            while (true) {
                n3 >>>= 8;
                if (n3 == 0) {
                    break;
                }
                ++n2;
            }
            this.b((byte)(n2 | 0x80));
            for (int i = 8 * (n2 - 1); i >= 0; i -= 8) {
                this.b((byte)(n >> i));
            }
        }
        else {
            this.b((byte)n);
        }
    }
    
    void a(final int n, int i) {
        if (i < 31) {
            this.b(n | i);
            return;
        }
        this.b(n | 0x1F);
        if (i < 128) {
            this.b(i);
            return;
        }
        final byte[] array = new byte[5];
        int n2 = -1 + array.length;
        array[n2] = (byte)(i & 0x7F);
        do {
            i >>= 7;
            --n2;
            array[n2] = (byte)(0x80 | (i & 0x7F));
        } while (i > 127);
        this.a(array, n2, array.length - n2);
    }
    
    void a(final int n, final int n2, final byte[] array) {
        this.a(n, n2);
        this.a(array.length);
        this.a(array);
    }
    
    void a(final int n, final byte[] array) {
        this.b(n);
        this.a(array.length);
        this.a(array);
    }
    
    public void a(final d d) {
        if (d != null) {
            d.a().a(this);
            return;
        }
        throw new IOException("null object detected");
    }
    
    void a(final q q) {
        if (q != null) {
            q.a(new p(this, this.a));
            return;
        }
        throw new IOException("null object detected");
    }
    
    void a(final byte[] array) {
        this.a.write(array);
    }
    
    void a(final byte[] array, final int n, final int n2) {
        this.a.write(array, n, n2);
    }
    
    o b() {
        return new bp(this.a);
    }
    
    void b(final int n) {
        this.a.write(n);
    }
}
