// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.io;

import java.io.IOException;
import java.io.CharConversionException;
import java.io.InputStream;
import java.io.Reader;

public class g extends Reader
{
    protected final b a;
    protected InputStream b;
    protected byte[] c;
    protected int d;
    protected int e;
    protected final boolean f;
    protected char g;
    protected int h;
    protected int i;
    protected final boolean j;
    protected char[] k;
    
    public g(final b a, final InputStream b, final byte[] c, final int d, final int e, final boolean f) {
        this.g = '\0';
        this.h = 0;
        this.i = 0;
        this.k = null;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        boolean j = false;
        if (b != null) {
            j = true;
        }
        this.j = j;
    }
    
    private void a() {
        final byte[] c = this.c;
        if (c != null) {
            this.c = null;
            this.a.a(c);
        }
    }
    
    private void a(final int n, final int n2) {
        throw new CharConversionException("Unexpected EOF in the middle of a 4-byte UTF-32 char: got " + n + ", needed " + n2 + ", at char #" + this.h + ", byte #" + (n + this.i) + ")");
    }
    
    private void a(final int n, final int n2, final String s) {
        throw new CharConversionException("Invalid UTF-32 character 0x" + Integer.toHexString(n) + s + " at char #" + (n2 + this.h) + ", byte #" + (-1 + (this.i + this.d)) + ")");
    }
    
    private void a(final char[] array, final int n, final int n2) {
        throw new ArrayIndexOutOfBoundsException("read(buf," + n + "," + n2 + "), cbuf[" + array.length + "]");
    }
    
    private boolean a(final int e) {
        this.i += this.e - e;
        if (e > 0) {
            if (this.d > 0) {
                System.arraycopy(this.c, this.d, this.c, 0, e);
                this.d = 0;
            }
            this.e = e;
        }
        else {
            this.d = 0;
            int read;
            if (this.b == null) {
                read = -1;
            }
            else {
                read = this.b.read(this.c);
            }
            if (read < 1) {
                this.e = 0;
                if (read < 0) {
                    if (this.j) {
                        this.a();
                    }
                    return false;
                }
                this.b();
            }
            this.e = read;
        }
        while (this.e < 4) {
            int read2;
            if (this.b == null) {
                read2 = -1;
            }
            else {
                read2 = this.b.read(this.c, this.e, this.c.length - this.e);
            }
            if (read2 < 1) {
                if (read2 < 0) {
                    if (this.j) {
                        this.a();
                    }
                    this.a(this.e, 4);
                }
                this.b();
            }
            this.e += read2;
        }
        return true;
    }
    
    private void b() {
        throw new IOException("Strange I/O stream, returned 0 bytes on read");
    }
    
    @Override
    public void close() {
        final InputStream b = this.b;
        if (b != null) {
            this.b = null;
            this.a();
            b.close();
        }
    }
    
    @Override
    public int read() {
        if (this.k == null) {
            this.k = new char[1];
        }
        if (this.read(this.k, 0, 1) < 1) {
            return -1;
        }
        return this.k[0];
    }
    
    @Override
    public int read(final char[] array, final int n, int n2) {
        if (this.c == null) {
            n2 = -1;
        }
        else if (n2 >= 1) {
            if (n < 0 || n + n2 > array.length) {
                this.a(array, n, n2);
            }
            final int n3 = n2 + n;
            int i;
            if (this.g != '\0') {
                i = n + 1;
                array[n] = this.g;
                this.g = '\0';
            }
            else {
                final int n4 = this.e - this.d;
                if (n4 < 4 && !this.a(n4)) {
                    return -1;
                }
                i = n;
            }
        Label_0257:
            while (true) {
                while (i < n3) {
                    final int d = this.d;
                    int n5;
                    if (this.f) {
                        n5 = (this.c[d] << 24 | (0xFF & this.c[d + 1]) << 16 | (0xFF & this.c[d + 2]) << 8 | (0xFF & this.c[d + 3]));
                    }
                    else {
                        n5 = ((0xFF & this.c[d]) | (0xFF & this.c[d + 1]) << 8 | (0xFF & this.c[d + 2]) << 16 | this.c[d + 3] << 24);
                    }
                    this.d += 4;
                    int n7;
                    if (n5 > 65535) {
                        if (n5 > 1114111) {
                            this.a(n5, i - n, "(above " + Integer.toHexString(1114111) + ") ");
                        }
                        final int n6 = n5 - 65536;
                        n7 = i + 1;
                        array[i] = (char)(55296 + (n6 >> 10));
                        n5 = (0xDC00 | (n6 & 0x3FF));
                        if (n7 >= n3) {
                            this.g = (char)n5;
                            break Label_0257;
                        }
                    }
                    else {
                        n7 = i;
                    }
                    i = n7 + 1;
                    array[n7] = (char)n5;
                    if (this.d < this.e) {
                        continue;
                    }
                    n7 = i;
                    final int n8 = n7 - n;
                    this.h += n8;
                    return n8;
                }
                int n7 = i;
                continue Label_0257;
            }
        }
        return n2;
    }
}
