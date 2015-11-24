// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.ContentProducer;

class cy implements ContentProducer
{
    final alp a;
    final String b;
    final String c;
    
    cy(final alp a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public void writeTo(final OutputStream outputStream) {
        final boolean i = App.I;
        final byte[] array = new byte[this.a.f];
        alp.a(outputStream, this.b);
        final InputStream c = this.a.a.c();
        c.skip(this.a.b);
        int n = 0 + this.a.b;
        int j;
        do {
            j = c.read(array, 0, this.a.f);
            if (j >= 0) {
                n += j;
                outputStream.write(array, 0, j);
                outputStream.flush();
                if (this.a.g != null) {
                    this.a.g.a(n);
                }
            }
            if (Thread.currentThread().isInterrupted()) {
                Thread.currentThread().interrupt();
                c.close();
                outputStream.close();
                if (i) {
                    continue;
                }
                break;
            }
        } while (j >= 0);
        if (!Thread.currentThread().isInterrupted()) {
            c.close();
            alp.a(outputStream, this.c);
        }
    }
}
