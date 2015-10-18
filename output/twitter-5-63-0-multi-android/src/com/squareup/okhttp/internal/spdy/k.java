// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;

final class k implements c
{
    private final bi a;
    private final boolean b;
    private final bq c;
    private final g d;
    private boolean e;
    
    k(final bi a, final boolean b) {
        this.a = a;
        this.b = b;
        this.c = new bq();
        this.d = new g(this.c);
    }
    
    private void a(final boolean b, final int n, final int n2, final List list) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (this.c.l() != 0L) {
            throw new IllegalStateException();
        }
        this.d.a(list);
        int n3 = (int)this.c.l();
        byte b2 = 4;
        if (b) {
            b2 = 5;
        }
        if (n2 != -1) {
            b2 |= 0x8;
        }
        if (n2 != -1) {
            n3 += 4;
        }
        this.a(n3, (byte)1, b2, n);
        if (n2 != -1) {
            this.a.b(Integer.MAX_VALUE & n2);
        }
        this.a.a(this.c, this.c.l());
    }
    
    @Override
    public void a() {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        if (this.b) {
            this.a.a(h.a.f());
            this.a.a();
        }
    }
    // monitorexit(this)
    
    void a(final int n, final byte b, final byte b2, final int n2) {
        if (n > 16383) {
            throw c("FRAME_SIZE_ERROR length > 16383: %s", new Object[] { n });
        }
        if ((Integer.MIN_VALUE & n2) != 0x0) {
            throw c("reserved bit set: %s", new Object[] { n2 });
        }
        this.a.b((n & 0x3FFF) << 16 | (b & 0xFF) << 8 | (b2 & 0xFF));
        this.a.b(Integer.MAX_VALUE & n2);
    }
    
    void a(final int n, final byte b, final bq bq, final int n2) {
        this.a(n2, (byte)0, b, n);
        if (n2 > 0) {
            this.a.a(bq, n2);
        }
    }
    
    @Override
    public void a(final int n, final int n2, final List list) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        if (this.c.l() != 0L) {
            throw new IllegalStateException();
        }
        this.d.a(list);
        this.a((int)(4L + this.c.l()), (byte)5, (byte)4, n);
        this.a.b(Integer.MAX_VALUE & n2);
        this.a.a(this.c, this.c.l());
    }
    // monitorexit(this)
    
    @Override
    public void a(final int n, final long n2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        if (n2 == 0L || n2 > 2147483647L) {
            throw c("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] { n2 });
        }
        this.a(4, (byte)9, (byte)0, n);
        this.a.b((int)n2);
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final int n, final ErrorCode errorCode) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        if (errorCode.spdyRstCode == -1) {
            throw new IllegalArgumentException();
        }
        this.a(4, (byte)3, (byte)0, n);
        this.a.b(errorCode.httpCode);
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final int n, final ErrorCode errorCode, final byte[] array) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        if (errorCode.httpCode == -1) {
            throw c("errorCode.httpCode == -1", new Object[0]);
        }
        this.a(8 + array.length, (byte)7, (byte)0, 0);
        this.a.b(n);
        this.a.b(errorCode.httpCode);
        if (array.length > 0) {
            this.a.a(array);
        }
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final u u) {
        int i = 0;
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        this.a(8 * u.b(), (byte)4, (byte)0, 0);
        while (i < 10) {
            if (u.a(i)) {
                this.a.b(0xFFFFFF & i);
                this.a.b(u.b(i));
            }
            ++i;
        }
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final boolean b, final int n, final int n2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        byte b2 = 0;
        if (b) {
            b2 = 1;
        }
        this.a(8, (byte)6, b2, 0);
        this.a.b(n);
        this.a.b(n2);
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final boolean b, final int n, final bq bq, final int n2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        byte b2 = 0;
        if (b) {
            b2 = 1;
        }
        this.a(n, b2, bq, n2);
    }
    // monitorexit(this)
    
    @Override
    public void a(final boolean b, final boolean b2, final int n, final int n2, final int n3, final int n4, final List list) {
        // monitorenter(this)
        if (b2) {
            try {
                throw new UnsupportedOperationException();
            }
            finally {
            }
            // monitorexit(this)
        }
        if (this.e) {
            throw new IOException("closed");
        }
        this.a(b, n, n3, list);
    }
    // monitorexit(this)
    
    @Override
    public void b() {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        this.a(0, (byte)4, (byte)1, 0);
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void c() {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void close() {
        synchronized (this) {
            this.e = true;
            this.a.close();
        }
    }
}
