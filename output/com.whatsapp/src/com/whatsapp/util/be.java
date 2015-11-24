// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.OutputStream;

final class be extends OutputStream
{
    final OutputStream b;
    final OutputStream c;
    
    public be(final OutputStream b, final OutputStream c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void close() {
        this.b.close();
        this.c.close();
    }
    
    @Override
    public void flush() {
        this.b.flush();
        this.c.flush();
    }
    
    @Override
    public void write(final int n) {
        this.b.write(n);
        this.c.write(n);
    }
    
    @Override
    public void write(final byte[] array) {
        this.b.write(array);
        this.c.write(array);
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        this.b.write(array, n, n2);
        this.c.write(array, n, n2);
    }
}
