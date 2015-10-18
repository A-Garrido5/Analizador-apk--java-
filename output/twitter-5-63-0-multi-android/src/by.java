import java.io.InputStream;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.5.30
// 

final class by implements bj
{
    public final bq a;
    public final cd b;
    private boolean c;
    
    public by(final cd cd) {
        this(cd, new bq());
    }
    
    public by(final cd b, final bq a) {
        if (b == null) {
            throw new IllegalArgumentException("source == null");
        }
        this.a = a;
        this.b = b;
    }
    
    private void a() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
    }
    
    @Override
    public long a(final byte b) {
        this.a();
        long b2 = 0L;
        do {
            final long a = this.a.a(b, b2);
            if (a != -1L) {
                return a;
            }
            b2 = this.a.b;
        } while (this.b.b(this.a, 2048L) != -1L);
        throw new EOFException();
    }
    
    @Override
    public String a(final boolean b) {
        this.a();
        long b2 = 0L;
        do {
            final long a = this.a.a((byte)10, b2);
            if (a == -1L) {
                b2 = this.a.b;
            }
            else {
                if (a > 0L && this.a.d(a - 1L) == 13) {
                    final String d = this.d(a - 1L);
                    this.b(2L);
                    return d;
                }
                final String d2 = this.d(a);
                this.b(1L);
                return d2;
            }
        } while (this.b.b(this.a, 2048L) != -1L);
        if (b) {
            throw new EOFException();
        }
        if (this.a.b != 0L) {
            return this.d(this.a.b);
        }
        return null;
    }
    
    @Override
    public void a(final long n) {
        this.a();
        while (this.a.b < n) {
            if (this.b.b(this.a, 2048L) == -1L) {
                throw new EOFException();
            }
        }
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        this.a();
        if (this.a.b == 0L && this.b.b(this.a, 2048L) == -1L) {
            return -1L;
        }
        return this.a.b(bq, Math.min(n, this.a.b));
    }
    
    @Override
    public bq b() {
        return this.a;
    }
    
    @Override
    public void b(long n) {
        this.a();
        while (n > 0L) {
            if (this.a.b == 0L && this.b.b(this.a, 2048L) == -1L) {
                throw new EOFException();
            }
            final long min = Math.min(n, this.a.l());
            this.a.b(min);
            n -= min;
        }
    }
    
    @Override
    public bk c(final long n) {
        this.a(n);
        return this.a.c(n);
    }
    
    @Override
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.o();
    }
    
    public String d(final long n) {
        this.a(n);
        return this.a.e(n);
    }
    
    @Override
    public boolean e() {
        this.a();
        return this.a.e() && this.b.b(this.a, 2048L) == -1L;
    }
    
    @Override
    public byte f() {
        this.a(1L);
        return this.a.f();
    }
    
    @Override
    public short g() {
        this.a(2L);
        return this.a.g();
    }
    
    @Override
    public int h() {
        this.a(2L);
        return this.a.h();
    }
    
    @Override
    public int i() {
        this.a(4L);
        return this.a.i();
    }
    
    @Override
    public int j() {
        this.a(4L);
        return this.a.j();
    }
    
    @Override
    public InputStream k() {
        return new bz(this);
    }
    
    @Override
    public String toString() {
        return "buffer(" + this.b + ")";
    }
}
