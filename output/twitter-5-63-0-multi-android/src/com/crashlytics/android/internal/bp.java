// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.logging.Level;
import java.util.NoSuchElementException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.logging.Logger;
import java.io.Closeable;

public class bp implements Closeable
{
    private static final Logger a;
    private final RandomAccessFile b;
    private int c;
    private int d;
    private br e;
    private br f;
    private final byte[] g;
    
    static {
        a = Logger.getLogger(bp.class.getName());
    }
    
    public bp(final File file) {
        this.g = new byte[16];
        if (!file.exists()) {
            final File file2 = new File(file.getPath() + ".tmp");
            final RandomAccessFile a = a(file2);
            try {
                a.setLength(4096L);
                a.seek(0L);
                final byte[] array = new byte[16];
                a(array, 4096, 0, 0, 0);
                a.write(array);
                a.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            }
            finally {
                a.close();
            }
        }
        (this.b = a(file)).seek(0L);
        this.b.readFully(this.g);
        this.c = a(this.g, 0);
        if (this.c > this.b.length()) {
            throw new IOException("File is truncated. Expected length: " + this.c + ", Actual length: " + this.b.length());
        }
        this.d = a(this.g, 4);
        final int a2 = a(this.g, 8);
        final int a3 = a(this.g, 12);
        this.e = this.a(a2);
        this.f = this.a(a3);
    }
    
    private static int a(final byte[] array, final int n) {
        return ((0xFF & array[n]) << 24) + ((0xFF & array[n + 1]) << 16) + ((0xFF & array[n + 2]) << 8) + (0xFF & array[n + 3]);
    }
    
    private br a(final int n) {
        if (n == 0) {
            return br.a;
        }
        this.b.seek(n);
        return new br(n, this.b.readInt());
    }
    
    private static RandomAccessFile a(final File file) {
        return new RandomAccessFile(file, "rwd");
    }
    
    private void a(final int n, final int n2, final int n3, final int n4) {
        a(this.g, n, n2, n3, n4);
        this.b.seek(0L);
        this.b.write(this.g);
    }
    
    private void a(final int n, final byte[] array, final int n2, final int n3) {
        final int b = this.b(n);
        if (b + n3 <= this.c) {
            this.b.seek(b);
            this.b.write(array, n2, n3);
            return;
        }
        final int n4 = this.c - b;
        this.b.seek(b);
        this.b.write(array, n2, n4);
        this.b.seek(16L);
        this.b.write(array, n2 + n4, n3 - n4);
    }
    
    private static void a(final byte[] array, final int n, final int n2) {
        array[n] = (byte)(n2 >> 24);
        array[n + 1] = (byte)(n2 >> 16);
        array[n + 2] = (byte)(n2 >> 8);
        array[n + 3] = (byte)n2;
    }
    
    private static void a(final byte[] array, final int... array2) {
        int i = 0;
        final int length = array2.length;
        int n = 0;
        while (i < length) {
            a(array, n, array2[i]);
            n += 4;
            ++i;
        }
    }
    
    private int b(final int n) {
        if (n < this.c) {
            return n;
        }
        return n + 16 - this.c;
    }
    
    private static Object b(final Object o, final String s) {
        if (o == null) {
            throw new NullPointerException(s);
        }
        return o;
    }
    
    private void b(final int n, final byte[] array, final int n2, final int n3) {
        final int b = this.b(n);
        if (b + n3 <= this.c) {
            this.b.seek(b);
            this.b.readFully(array, n2, n3);
            return;
        }
        final int n4 = this.c - b;
        this.b.seek(b);
        this.b.readFully(array, n2, n4);
        this.b.seek(16L);
        this.b.readFully(array, n2 + n4, n3 - n4);
    }
    
    private void b(final byte[] array, final int n, final int n2) {
        synchronized (this) {
            b(array, "buffer");
            if ((n2 | 0x0) < 0 || n2 > array.length) {
                throw new IndexOutOfBoundsException();
            }
        }
        this.c(n2);
        final boolean b = this.b();
        int b2;
        if (b) {
            b2 = 16;
        }
        else {
            b2 = this.b(4 + this.f.b + this.f.c);
        }
        final br f = new br(b2, n2);
        a(this.g, 0, n2);
        this.a(f.b, this.g, 0, 4);
        this.a(4 + f.b, array, 0, n2);
        int n3;
        if (b) {
            n3 = f.b;
        }
        else {
            n3 = this.e.b;
        }
        this.a(this.c, 1 + this.d, n3, f.b);
        this.f = f;
        ++this.d;
        if (b) {
            this.e = this.f;
        }
    }
    // monitorexit(this)
    
    private void c(final int n) {
        final int n2 = n + 4;
        int i = this.c - this.a();
        if (i >= n2) {
            return;
        }
        int c = this.c;
        do {
            i += c;
            c <<= 1;
        } while (i < n2);
        this.d(c);
        final int b = this.b(4 + this.f.b + this.f.c);
        if (b < this.e.b) {
            final FileChannel channel = this.b.getChannel();
            channel.position(this.c);
            final int n3 = b - 4;
            if (channel.transferTo(16L, n3, channel) != n3) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        if (this.f.b < this.e.b) {
            final int n4 = -16 + (this.c + this.f.b);
            this.a(c, this.d, this.e.b, n4);
            this.f = new br(n4, this.f.c);
        }
        else {
            this.a(c, this.d, this.e.b, this.f.b);
        }
        this.c = c;
    }
    
    private void d() {
        synchronized (this) {
            this.a(4096, 0, 0, 0);
            this.d = 0;
            this.e = br.a;
            this.f = br.a;
            if (this.c > 4096) {
                this.d(4096);
            }
            this.c = 4096;
        }
    }
    
    private void d(final int n) {
        this.b.setLength(n);
        this.b.getChannel().force(true);
    }
    
    public final int a() {
        if (this.d == 0) {
            return 16;
        }
        if (this.f.b >= this.e.b) {
            return 16 + (4 + (this.f.b - this.e.b) + this.f.c);
        }
        return 4 + this.f.b + this.f.c + this.c - this.e.b;
    }
    
    public final void a(final bt bt) {
        int i = 0;
        synchronized (this) {
            int n = this.e.b;
            while (i < this.d) {
                final br a = this.a(n);
                bt.a(new bs(this, a, (byte)0), a.c);
                n = this.b(4 + a.b + a.c);
                ++i;
            }
        }
    }
    
    public final void a(final byte[] array) {
        this.b(array, 0, array.length);
    }
    
    public final boolean a(final int n, final int n2) {
        return n + (4 + this.a()) <= n2;
    }
    
    public final boolean b() {
        synchronized (this) {
            return this.d == 0;
        }
    }
    
    public final void c() {
        synchronized (this) {
            if (this.b()) {
                throw new NoSuchElementException();
            }
        }
        if (this.d == 1) {
            this.d();
        }
        else {
            final int b = this.b(4 + this.e.b + this.e.c);
            this.b(b, this.g, 0, 4);
            final int a = a(this.g, 0);
            this.a(this.c, -1 + this.d, b, this.f.b);
            --this.d;
            this.e = new br(b, a);
        }
    }
    // monitorexit(this)
    
    @Override
    public void close() {
        synchronized (this) {
            this.b.close();
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append('[');
        sb.append("fileLength=").append(this.c);
        sb.append(", size=").append(this.d);
        sb.append(", first=").append(this.e);
        sb.append(", last=").append(this.f);
        sb.append(", element lengths=[");
        while (true) {
            try {
                this.a(new bq(this, sb));
                sb.append("]]");
                return sb.toString();
            }
            catch (IOException ex) {
                bp.a.log(Level.WARNING, "read error", ex);
                continue;
            }
            break;
        }
    }
}
