// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import java.util.concurrent.atomic.AtomicLong;
import java.io.FileInputStream;
import org.apache.http.client.methods.HttpPut;
import java.io.InputStream;

class i extends InputStream
{
    final HttpPut a;
    final FileInputStream b;
    final AtomicLong c;
    private final Object d;
    final bn e;
    final q f;
    
    i(final q f, final HttpPut a, final FileInputStream b, final bn e, final AtomicLong c) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.e = e;
        this.c = c;
        this.d = new m(this);
    }
    
    @Override
    public int available() {
        return this.b.available();
    }
    
    @Override
    public void close() {
        this.b.close();
        de.greenrobot.event.m.b().e(this.d);
    }
    
    @Override
    public void mark(final int n) {
        this.b.mark(n);
    }
    
    @Override
    public boolean markSupported() {
        return this.b.markSupported();
    }
    
    @Override
    public int read() {
        int read;
        if (this.e != null && !this.e.a()) {
            this.a.abort();
            read = -1;
        }
        else {
            read = this.b.read();
            if (read >= 0) {
                this.c.addAndGet(1L);
                if (this.e != null) {
                    this.e.a(1L);
                    return read;
                }
            }
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array) {
        int read;
        if (this.e != null && !this.e.a()) {
            this.a.abort();
            read = -1;
        }
        else {
            read = this.b.read(array);
            if (read >= 0) {
                this.c.addAndGet(read);
                if (this.e != null) {
                    this.e.a(read);
                    return read;
                }
            }
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        int read;
        if (this.e != null && !this.e.a()) {
            this.a.abort();
            read = -1;
        }
        else {
            read = this.b.read(array, n, n2);
            if (read >= 0) {
                this.c.addAndGet(read);
                if (this.e != null) {
                    this.e.a(read);
                    return read;
                }
            }
        }
        return read;
    }
    
    @Override
    public void reset() {
        synchronized (this) {
            this.b.reset();
        }
    }
    
    @Override
    public long skip(final long n) {
        return this.b.skip(n);
    }
}
