// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import com.whatsapp.atd;
import java.io.InputStream;

class bx extends InputStream
{
    final InputStream a;
    final ao b;
    
    bx(final ao b, final InputStream a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public int available() {
        return this.a.available();
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public void mark(final int n) {
        this.a.mark(n);
    }
    
    @Override
    public boolean markSupported() {
        return this.a.markSupported();
    }
    
    @Override
    public int read() {
        final int read = this.a.read();
        if (read >= 0) {
            atd.a(1L, an.a(this.b.a));
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array) {
        final int read = this.a.read(array);
        if (read > 0) {
            atd.a(read, an.a(this.b.a));
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        final int read = this.a.read(array, n, n2);
        if (read > 0) {
            atd.a(read, an.a(this.b.a));
        }
        return read;
    }
    
    @Override
    public void reset() {
        synchronized (this) {
            this.a.reset();
        }
    }
    
    @Override
    public long skip(final long n) {
        final long skip = this.a.skip(n);
        atd.a(skip, an.a(this.b.a));
        return skip;
    }
}
