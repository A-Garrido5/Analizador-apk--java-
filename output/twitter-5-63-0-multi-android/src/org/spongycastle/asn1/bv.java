// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

class bv extends by
{
    private int b;
    private int c;
    private boolean d;
    private boolean e;
    
    bv(final InputStream inputStream, final int n) {
        super(inputStream, n);
        this.d = false;
        this.e = true;
        this.b = inputStream.read();
        this.c = inputStream.read();
        if (this.c < 0) {
            throw new EOFException();
        }
        this.b();
    }
    
    private boolean b() {
        if (!this.d && this.e && this.b == 0 && this.c == 0) {
            this.b(this.d = true);
        }
        return this.d;
    }
    
    void a(final boolean e) {
        this.e = e;
        this.b();
    }
    
    @Override
    public int read() {
        if (this.b()) {
            return -1;
        }
        final int read = this.a.read();
        if (read < 0) {
            throw new EOFException();
        }
        final int b = this.b;
        this.b = this.c;
        this.c = read;
        return b;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        if (this.e || n2 < 3) {
            return super.read(array, n, n2);
        }
        if (this.d) {
            return -1;
        }
        final int read = this.a.read(array, n + 2, n2 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        array[n] = (byte)this.b;
        array[n + 1] = (byte)this.c;
        this.b = this.a.read();
        this.c = this.a.read();
        if (this.c < 0) {
            throw new EOFException();
        }
        return read + 2;
    }
}
