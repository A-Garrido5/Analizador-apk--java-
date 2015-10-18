// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.logging.Level;
import java.util.NoSuchElementException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import java.io.Closeable;
import java.io.InputStream;

final class bs extends InputStream
{
    private int a;
    private int b;
    private /* synthetic */ bp c;
    
    private bs(final bp c, final br br) {
        this.c = c;
        this.a = c.b(4 + br.b);
        this.b = br.c;
    }
    
    @Override
    public final int read() {
        if (this.b == 0) {
            return -1;
        }
        this.c.b.seek(this.a);
        final int read = this.c.b.read();
        this.a = this.c.b(1 + this.a);
        --this.b;
        return read;
    }
    
    @Override
    public final int read(final byte[] array, final int n, int b) {
        b(array, "buffer");
        if ((n | b) < 0 || b > array.length - n) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.b > 0) {
            if (b > this.b) {
                b = this.b;
            }
            this.c.b(this.a, array, n, b);
            this.a = this.c.b(b + this.a);
            this.b -= b;
            return b;
        }
        return -1;
    }
}
