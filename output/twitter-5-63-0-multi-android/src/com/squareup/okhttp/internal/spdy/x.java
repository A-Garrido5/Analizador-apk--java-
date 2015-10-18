// 
// Decompiled by Procyon v0.5.30
// 

package com.squareup.okhttp.internal.spdy;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

final class x implements c
{
    private final bi a;
    private final bq b;
    private final bi c;
    private final boolean d;
    private boolean e;
    
    x(final bi a, final boolean d) {
        this.a = a;
        this.d = d;
        final Deflater deflater = new Deflater();
        deflater.setDictionary(v.a);
        this.b = new bq();
        this.c = bt.a(new bn(this.b, deflater));
    }
    
    private void a(final List list) {
        if (this.b.l() != 0L) {
            throw new IllegalStateException();
        }
        this.c.b(list.size());
        for (int size = list.size(), i = 0; i < size; ++i) {
            final bk h = list.get(i).h;
            this.c.b(h.e());
            this.c.a(h);
            final bk j = list.get(i).i;
            this.c.b(j.e());
            this.c.a(j);
        }
        this.c.a();
    }
    
    @Override
    public void a() {
    }
    // monitorenter(this)
    // monitorexit(this)
    
    void a(final int n, final int n2, final bq bq, final int n3) {
        if (this.e) {
            throw new IOException("closed");
        }
        if (n3 > 16777215L) {
            throw new IllegalArgumentException("FRAME_TOO_LARGE max size is 16Mib: " + n3);
        }
        this.a.b(Integer.MAX_VALUE & n);
        this.a.b((n2 & 0xFF) << 24 | (0xFFFFFF & n3));
        if (n3 > 0) {
            this.a.a(bq, n3);
        }
    }
    
    @Override
    public void a(final int n, final int n2, final List list) {
    }
    
    @Override
    public void a(final int n, final long n2) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        if (n2 == 0L || n2 > 2147483647L) {
            throw new IllegalArgumentException("windowSizeIncrement must be between 1 and 0x7fffffff: " + n2);
        }
        this.a.b(-2147287031);
        this.a.b(8);
        this.a.b(n);
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
        this.a.b(-2147287037);
        this.a.b(8);
        this.a.b(Integer.MAX_VALUE & n);
        this.a.b(errorCode.spdyRstCode);
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
        if (errorCode.spdyGoAwayCode == -1) {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        }
        this.a.b(-2147287033);
        this.a.b(8);
        this.a.b(n);
        this.a.b(errorCode.spdyGoAwayCode);
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final u u) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        final int b = u.b();
        final int n = 4 + b * 8;
        this.a.b(-2147287036);
        this.a.b(0x0 | (n & 0xFFFFFF));
        this.a.b(b);
        for (int i = 0; i <= 10; ++i) {
            if (u.a(i)) {
                this.a.b((u.c(i) & 0xFF) << 24 | (i & 0xFFFFFF));
                this.a.b(u.b(i));
            }
        }
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final boolean b, final int n, final int n2) {
        boolean b2 = true;
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        if (this.d == ((n & 0x1) == (b2 ? 1 : 0) && b2)) {
            b2 = false;
        }
        if (b != b2) {
            throw new IllegalArgumentException("payload != reply");
        }
        this.a.b(-2147287034);
        this.a.b(4);
        this.a.b(n);
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void a(final boolean b, final int n, final bq bq, final int n2) {
        // monitorenter(this)
        Label_0022: {
            if (!b) {
                break Label_0022;
            }
            int n3 = 1;
            try {
                while (true) {
                    this.a(n, n3, bq, n2);
                    return;
                    n3 = 0;
                    continue;
                }
            }
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @Override
    public void a(final boolean b, final boolean b2, final int n, final int n2, final int n3, final int n4, final List list) {
        synchronized (this) {
            if (this.e) {
                throw new IOException("closed");
            }
        }
        this.a(list);
        final int n5 = (int)(10L + this.b.l());
        boolean b3;
        if (b) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        int n6 = 0;
        if (b2) {
            n6 = 2;
        }
        final boolean b4 = (n6 | (b3 ? 1 : 0)) != 0x0;
        this.a.b(-2147287039);
        this.a.b(((b4 ? 1 : 0) & 0xFF) << 24 | (n5 & 0xFFFFFF));
        this.a.b(n & Integer.MAX_VALUE);
        this.a.b(n2 & Integer.MAX_VALUE);
        this.a.a(0x0 | (n3 & 0x7) << 13 | (n4 & 0xFF));
        this.a.a(this.b, this.b.l());
        this.a.a();
    }
    // monitorexit(this)
    
    @Override
    public void b() {
    }
    
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
            bf.a(this.a, this.c);
        }
    }
}
