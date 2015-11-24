// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.protocol;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ca extends OutputStream
{
    OutputStream a;
    cd b;
    b4 c;
    
    public ca(final b4 c) {
        this.b = new c8(this);
        this.c = c;
    }
    
    public int a(final InputStream inputStream, final int n) {
        if (this.a != null) {
            final byte[] array = new byte[n];
            final int read = inputStream.read(array, 0, n);
            if (read > 0) {
                this.a.write(array, 0, read);
            }
            return read;
        }
        return this.b.a(inputStream, n);
    }
    
    public void a(final b4 c) {
        this.c = c;
    }
    
    public byte[] a() {
        return this.b.a();
    }
    
    public void b() {
        if (this.a == null) {
            return;
        }
        this.a.close();
        this.a = null;
    }
    
    public int c() {
        return this.b.b();
    }
    
    @Override
    public void close() {
        if (this.a != null) {
            this.a.close();
            if (bi.O == 0) {
                return;
            }
        }
        this.b.close();
    }
    
    public boolean d() {
        return this.a != null;
    }
    
    public void e() {
        while (true) {
            try {
                this.b();
                this.a = null;
                this.b.reset();
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
    
    public void f() {
        if (this.a != null) {
            return;
        }
        this.a = this.c.a(this.b);
    }
    
    @Override
    public void flush() {
        if (this.a != null) {
            this.a.flush();
            if (bi.O == 0) {
                return;
            }
        }
        this.b.flush();
    }
    
    @Override
    public void write(final int n) {
        if (this.a != null) {
            this.a.write(n);
            if (bi.O == 0) {
                return;
            }
        }
        this.b.write(n);
    }
    
    @Override
    public void write(final byte[] array) {
        if (this.a != null) {
            this.a.write(array);
            if (bi.O == 0) {
                return;
            }
        }
        this.b.write(array);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        if (this.a != null) {
            this.a.write(array, n, n2);
            if (bi.O == 0) {
                return;
            }
        }
        this.b.write(array, n, n2);
    }
}
