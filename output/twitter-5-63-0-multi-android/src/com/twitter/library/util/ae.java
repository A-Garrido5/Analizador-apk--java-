// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.IOException;
import java.io.RandomAccessFile;

class ae extends bd
{
    private long a;
    private long b;
    private long c;
    private RandomAccessFile d;
    
    private ae(final RandomAccessFile d, final long n, final long n2) {
        this.d = d;
        this.a = n;
        this.c = n;
        this.b = n + n2;
        this.d.seek(this.c);
    }
    
    private void b() {
        if (this.d == null) {
            throw new IOException("File closed");
        }
    }
    
    private boolean c() {
        return this.c >= this.b;
    }
    
    @Override
    public void a() {
        this.b();
        if (this.c != this.a) {
            this.c = this.a;
            this.d.seek(this.c);
        }
    }
    
    @Override
    public int available() {
        if (this.c()) {
            return 0;
        }
        return (int)(this.b - this.c);
    }
    
    @Override
    public void close() {
        this.d = null;
    }
    
    @Override
    public int read() {
        this.b();
        if (this.c()) {
            return -1;
        }
        ++this.c;
        return 0xFF & this.d.read();
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        this.b();
        int read;
        if (this.c()) {
            read = -1;
        }
        else {
            read = this.d.read(array, n, Math.min(n2, this.available()));
            if (read > 0) {
                this.c += read;
                return read;
            }
        }
        return read;
    }
}
