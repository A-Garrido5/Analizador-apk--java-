// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.EOFException;
import java.io.InputStream;

public class cn extends InputStream
{
    InputStream a;
    
    public cn(final InputStream a) {
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
        synchronized (this) {
            this.a.mark(n);
        }
    }
    
    @Override
    public boolean markSupported() {
        return this.a.markSupported();
    }
    
    @Override
    public int read() {
        final int read = this.a.read();
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array) {
        final int read = this.a.read(array);
        if (read == -1) {
            throw new EOFException();
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        final int read = this.a.read(array, n, n2);
        if (read == -1) {
            throw new EOFException();
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
        return this.a.skip(n);
    }
}
