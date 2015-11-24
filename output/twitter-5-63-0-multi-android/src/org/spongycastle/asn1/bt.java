// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.EOFException;
import java.io.InputStream;

class bt extends by
{
    private static final byte[] b;
    private final int c;
    private int d;
    
    static {
        b = new byte[0];
    }
    
    bt(final InputStream inputStream, final int n) {
        super(inputStream, n);
        if (n < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.c = n;
        if ((this.d = n) == 0) {
            this.b(true);
        }
    }
    
    @Override
    int a() {
        return this.d;
    }
    
    byte[] b() {
        if (this.d == 0) {
            return bt.b;
        }
        final byte[] array = new byte[this.d];
        if ((this.d -= aam.a(this.a, array)) != 0) {
            throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
        }
        this.b(true);
        return array;
    }
    
    @Override
    public int read() {
        int read;
        if (this.d == 0) {
            read = -1;
        }
        else {
            read = this.a.read();
            if (read < 0) {
                throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
            }
            if (--this.d == 0) {
                this.b(true);
                return read;
            }
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        int read;
        if (this.d == 0) {
            read = -1;
        }
        else {
            read = this.a.read(array, n, Math.min(n2, this.d));
            if (read < 0) {
                throw new EOFException("DEF length " + this.c + " object truncated by " + this.d);
            }
            if ((this.d -= read) == 0) {
                this.b(true);
                return read;
            }
        }
        return read;
    }
}
