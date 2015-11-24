// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gdrive;

import de.greenrobot.event.m;
import java.util.concurrent.atomic.AtomicLong;
import java.io.FileOutputStream;
import org.apache.http.client.methods.HttpGet;
import java.io.OutputStream;

class c0 extends OutputStream
{
    final HttpGet a;
    final q b;
    final v c;
    final FileOutputStream d;
    private final Object e;
    final AtomicLong f;
    
    c0(final q b, final HttpGet a, final FileOutputStream d, final v c, final AtomicLong f) {
        this.b = b;
        this.a = a;
        this.d = d;
        this.c = c;
        this.f = f;
        this.e = new b(this);
    }
    
    @Override
    public void close() {
        this.d.close();
        m.b().e(this.e);
    }
    
    @Override
    public void flush() {
        this.d.flush();
    }
    
    @Override
    public void write(final int n) {
        if (this.c != null && !this.c.a()) {
            this.a.abort();
            return;
        }
        if (this.c != null) {
            this.c.a(1L);
        }
        this.f.addAndGet(1L);
        this.d.write(n);
    }
    
    @Override
    public void write(final byte[] array) {
        if (this.c != null && !this.c.a()) {
            this.a.abort();
            return;
        }
        if (this.c != null) {
            this.c.a(array.length);
        }
        this.f.addAndGet(array.length);
        this.d.write(array);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        if (this.c != null && !this.c.a()) {
            this.a.abort();
            return;
        }
        if (this.c != null) {
            this.c.a(n2);
        }
        this.f.addAndGet(n2);
        this.d.write(array, n, n2);
    }
}
