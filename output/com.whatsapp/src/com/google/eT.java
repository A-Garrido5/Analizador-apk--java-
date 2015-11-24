// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.io.InputStream;
import java.io.FilterInputStream;

final class eT extends FilterInputStream
{
    private int a;
    
    eT(final InputStream inputStream, final int a) {
        super(inputStream);
        this.a = a;
    }
    
    @Override
    public int available() {
        return Math.min(super.available(), this.a);
    }
    
    @Override
    public int read() {
        int read;
        if (this.a <= 0) {
            read = -1;
        }
        else {
            read = super.read();
            if (read >= 0) {
                --this.a;
                return read;
            }
        }
        return read;
    }
    
    @Override
    public int read(final byte[] array, final int n, final int n2) {
        int read;
        if (this.a <= 0) {
            read = -1;
        }
        else {
            read = super.read(array, n, Math.min(n2, this.a));
            if (read >= 0) {
                this.a -= read;
                return read;
            }
        }
        return read;
    }
    
    @Override
    public long skip(final long n) {
        final long skip = super.skip(Math.min(n, this.a));
        if (skip >= 0L) {
            this.a -= (int)skip;
        }
        return skip;
    }
}
