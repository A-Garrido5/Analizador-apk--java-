// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

import java.io.OutputStream;
import java.io.FilterOutputStream;

public class a extends FilterOutputStream
{
    private final q a;
    private final long b;
    private final long c;
    private long d;
    private long e;
    
    public a(final OutputStream outputStream, final long n, final q a) {
        super(outputStream);
        this.a = a;
        this.b = 2L * n;
        this.d = 0L;
        this.c = this.b / 5L;
        this.e = this.c;
    }
    
    @Override
    public void write(final int n) {
        super.write(n);
        ++this.d;
        if (this.d >= this.e) {
            super.flush();
            if (this.a != null) {
                this.a.a(this.d, this.b);
            }
            this.e += this.c;
        }
    }
    
    @Override
    public void write(final byte[] array, final int n, final int n2) {
        super.write(array, n, n2);
        this.d += n2;
        if (this.d >= this.e) {
            super.flush();
            if (this.a != null) {
                this.a.a(this.d, this.b);
            }
            this.e += this.c;
        }
    }
}
