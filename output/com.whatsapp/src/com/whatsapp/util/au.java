// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.util;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FilterOutputStream;

class au extends FilterOutputStream
{
    final bj a;
    
    private au(final bj a, final OutputStream outputStream) {
        this.a = a;
        super(outputStream);
    }
    
    au(final bj bj, final OutputStream outputStream, final y y) {
        this(bj, outputStream);
    }
    
    @Override
    public void close() {
        try {
            this.out.close();
        }
        catch (IOException ex) {
            bj.a(this.a, true);
        }
    }
    
    @Override
    public void flush() {
        try {
            this.out.flush();
        }
        catch (IOException ex) {
            bj.a(this.a, true);
        }
    }
    
    @Override
    public void write(final int n) {
        try {
            this.out.write(n);
        }
        catch (IOException ex) {
            bj.a(this.a, true);
        }
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        try {
            this.out.write(array, n, n2);
        }
        catch (IOException ex) {
            bj.a(this.a, true);
        }
    }
}
