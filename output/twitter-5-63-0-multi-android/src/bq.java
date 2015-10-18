import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.EOFException;

// 
// Decompiled by Procyon v0.5.30
// 

public final class bq implements bi, bj, Cloneable
{
    ca a;
    long b;
    
    private byte[] f(final long n) {
        ce.a(this.b, 0L, n);
        if (n > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + n);
        }
        int n2 = 0;
        final byte[] array = new byte[(int)n];
        while (n2 < n) {
            final int n3 = (int)Math.min(n - n2, this.a.c - this.a.b);
            System.arraycopy(this.a.a, this.a.b, array, n2, n3);
            n2 += n3;
            final ca a = this.a;
            a.b += n3;
            if (this.a.b == this.a.c) {
                final ca a2 = this.a;
                this.a = a2.a();
                cb.a.a(a2);
            }
        }
        this.b -= n;
        return array;
    }
    
    @Override
    public long a(final byte b) {
        final long b2 = this.b(b);
        if (b2 == -1L) {
            throw new EOFException();
        }
        return b2;
    }
    
    public long a(final byte b, long n) {
        ca ca = this.a;
        if (ca == null) {
            return -1L;
        }
        long n2 = 0L;
        while (true) {
            final int n3 = ca.c - ca.b;
            if (n > n3) {
                n -= n3;
            }
            else {
                final byte[] a = ca.a;
                for (long n4 = n + ca.b; n4 < ca.c; ++n4) {
                    if (a[(int)n4] == b) {
                        return n2 + n4 - ca.b;
                    }
                }
                n = 0L;
            }
            n2 += n3;
            ca = ca.d;
            if (ca == this.a) {
                return -1L;
            }
        }
    }
    
    @Override
    public String a(final boolean b) {
        final long b2 = this.b((byte)10);
        if (b2 == -1L) {
            if (b) {
                throw new EOFException();
            }
            if (this.b != 0L) {
                return this.e(this.b);
            }
            return null;
        }
        else {
            if (b2 > 0L && this.d(b2 - 1L) == 13) {
                final String e = this.e(b2 - 1L);
                this.b(2L);
                return e;
            }
            final String e2 = this.e(b2);
            this.b(1L);
            return e2;
        }
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final long n) {
        if (this.b < n) {
            throw new EOFException();
        }
    }
    
    @Override
    public void a(final bq bq, long n) {
        if (bq == this) {
            throw new IllegalArgumentException("source == this");
        }
        ce.a(bq.b, 0L, n);
        while (n > 0L) {
            if (n < bq.a.c - bq.a.b) {
                ca e;
                if (this.a != null) {
                    e = this.a.e;
                }
                else {
                    e = null;
                }
                if (e != null && n + (e.c - e.b) <= 2048L) {
                    bq.a.a(e, (int)n);
                    bq.b -= n;
                    this.b += n;
                    break;
                }
                bq.a = bq.a.a((int)n);
            }
            final ca a = bq.a;
            final long n2 = a.c - a.b;
            bq.a = a.a();
            if (this.a == null) {
                this.a = a;
                final ca a2 = this.a;
                final ca a3 = this.a;
                final ca a4 = this.a;
                a3.e = a4;
                a2.d = a4;
            }
            else {
                this.a.e.a(a).b();
            }
            bq.b -= n2;
            this.b += n2;
            n -= n2;
        }
    }
    
    int b(final byte[] array, final int n, final int n2) {
        final ca a = this.a;
        int min;
        if (a == null) {
            min = -1;
        }
        else {
            min = Math.min(n2, a.c - a.b);
            System.arraycopy(a.a, a.b, array, n, min);
            a.b += min;
            this.b -= min;
            if (a.b == a.c) {
                this.a = a.a();
                cb.a.a(a);
                return min;
            }
        }
        return min;
    }
    
    public long b(final byte b) {
        return this.a(b, 0L);
    }
    
    @Override
    public long b(final bq bq, long b) {
        if (this.b == 0L) {
            return -1L;
        }
        if (b > this.b) {
            b = this.b;
        }
        bq.a(this, b);
        return b;
    }
    
    @Override
    public bq b() {
        return this;
    }
    
    public bq b(final bk bk) {
        return this.c(bk.b, 0, bk.b.length);
    }
    
    public bq b(final String s) {
        try {
            final byte[] bytes = s.getBytes("UTF-8");
            return this.c(bytes, 0, bytes.length);
        }
        catch (UnsupportedEncodingException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public bq b(final byte[] array) {
        return this.c(array, 0, array.length);
    }
    
    @Override
    public void b(long n) {
        ce.a(this.b, 0L, n);
        this.b -= n;
        while (n > 0L) {
            final int n2 = (int)Math.min(n, this.a.c - this.a.b);
            n -= n2;
            final ca a = this.a;
            a.b += n2;
            if (this.a.b == this.a.c) {
                final ca a2 = this.a;
                this.a = a2.a();
                cb.a.a(a2);
            }
        }
    }
    
    @Override
    public bk c(final long n) {
        return new bk(this.f(n));
    }
    
    public bq c(final int n) {
        final ca f = this.f(1);
        f.a[f.c++] = (byte)n;
        ++this.b;
        return this;
    }
    
    public bq c(final byte[] array, int i, final int n) {
        ca f;
        int min;
        for (int n2 = i + n; i < n2; i += min, f.c += min) {
            f = this.f(1);
            min = Math.min(n2 - i, 2048 - f.c);
            System.arraycopy(array, i, f.a, f.c, min);
        }
        this.b += n;
        return this;
    }
    
    @Override
    public void close() {
    }
    
    public byte d(long n) {
        ce.a(this.b, n, 1L);
        ca ca = this.a;
        while (true) {
            final int n2 = ca.c - ca.b;
            if (n < n2) {
                break;
            }
            n -= n2;
            ca = ca.d;
        }
        return ca.a[ca.b + (int)n];
    }
    
    public bq d(final int n) {
        final ca f = this.f(2);
        final byte[] a = f.a;
        final int c = f.c;
        final int n2 = c + 1;
        a[c] = (byte)(0xFF & n >> 8);
        final int c2 = n2 + 1;
        a[n2] = (byte)(n & 0xFF);
        f.c = c2;
        this.b += 2L;
        return this;
    }
    
    @Override
    public OutputStream d() {
        return new br(this);
    }
    
    public bq e(final int n) {
        final ca f = this.f(4);
        final byte[] a = f.a;
        final int c = f.c;
        final int n2 = c + 1;
        a[c] = (byte)(0xFF & n >> 24);
        final int n3 = n2 + 1;
        a[n2] = (byte)(0xFF & n >> 16);
        final int n4 = n3 + 1;
        a[n3] = (byte)(0xFF & n >> 8);
        final int c2 = n4 + 1;
        a[n4] = (byte)(n & 0xFF);
        f.c = c2;
        this.b += 4L;
        return this;
    }
    
    public String e(final long n) {
        ce.a(this.b, 0L, n);
        if (n > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + n);
        }
        String s;
        if (n == 0L) {
            s = "";
        }
        else {
            final ca a = this.a;
            if (n + a.b > a.c) {
                try {
                    return new String(this.f(n), "UTF-8");
                }
                catch (UnsupportedEncodingException ex) {
                    throw new AssertionError((Object)ex);
                }
            }
            try {
                s = new String(a.a, a.b, (int)n, "UTF-8");
                a.b += (int)n;
                this.b -= n;
                if (a.b == a.c) {
                    this.a = a.a();
                    cb.a.a(a);
                    return s;
                }
            }
            catch (UnsupportedEncodingException ex2) {
                throw new AssertionError((Object)ex2);
            }
        }
        return s;
    }
    
    @Override
    public boolean e() {
        return this.b == 0L;
    }
    
    @Override
    public boolean equals(final Object o) {
        long n = 0L;
        if (!(o instanceof bq)) {
            return false;
        }
        final bq bq = (bq)o;
        if (this.b != bq.b) {
            return false;
        }
        if (this.b == n) {
            return true;
        }
        ca ca = this.a;
        ca ca2 = bq.a;
        int n2 = ca.b;
        int n3 = ca2.b;
        while (n < this.b) {
            final long n4 = Math.min(ca.c - n2, ca2.c - n3);
            int n6;
            int n7;
            for (int n5 = 0; n5 < n4; ++n5, n3 = n7, n2 = n6) {
                final byte[] a = ca.a;
                n6 = n2 + 1;
                final byte b = a[n2];
                final byte[] a2 = ca2.a;
                n7 = n3 + 1;
                if (b != a2[n3]) {
                    return false;
                }
            }
            if (n2 == ca.c) {
                ca = ca.d;
                n2 = ca.b;
            }
            if (n3 == ca2.c) {
                ca2 = ca2.d;
                n3 = ca2.b;
            }
            n += n4;
        }
        return true;
    }
    
    @Override
    public byte f() {
        if (this.b == 0L) {
            throw new IllegalStateException("size == 0");
        }
        final ca a = this.a;
        final int b = a.b;
        final int c = a.c;
        final byte[] a2 = a.a;
        final int b2 = b + 1;
        final byte b3 = a2[b];
        --this.b;
        if (b2 == c) {
            this.a = a.a();
            cb.a.a(a);
            return b3;
        }
        a.b = b2;
        return b3;
    }
    
    ca f(final int n) {
        if (n < 1 || n > 2048) {
            throw new IllegalArgumentException();
        }
        ca ca;
        if (this.a == null) {
            this.a = cb.a.a();
            final ca a = this.a;
            final ca a2 = this.a;
            ca = this.a;
            a2.e = ca;
            a.d = ca;
        }
        else {
            ca = this.a.e;
            if (n + ca.c > 2048) {
                return ca.a(cb.a.a());
            }
        }
        return ca;
    }
    
    @Override
    public short g() {
        if (this.b < 2L) {
            throw new IllegalArgumentException("size < 2: " + this.b);
        }
        final ca a = this.a;
        final int b = a.b;
        final int c = a.c;
        if (c - b < 2) {
            return (short)((0xFF & this.f()) << 8 | (0xFF & this.f()));
        }
        final byte[] a2 = a.a;
        final int n = b + 1;
        final int n2 = (0xFF & a2[b]) << 8;
        final int b2 = n + 1;
        final int n3 = n2 | (0xFF & a2[n]);
        this.b -= 2L;
        if (b2 == c) {
            this.a = a.a();
            cb.a.a(a);
        }
        else {
            a.b = b2;
        }
        return (short)n3;
    }
    
    @Override
    public int h() {
        return ce.a(this.g());
    }
    
    @Override
    public int hashCode() {
        ca ca = this.a;
        if (ca == null) {
            return 0;
        }
        int n = 1;
        do {
            int n2;
            for (int i = ca.b; i < ca.c; ++i, n = n2) {
                n2 = n * 31 + ca.a[i];
            }
            ca = ca.d;
        } while (ca != this.a);
        return n;
    }
    
    @Override
    public int i() {
        if (this.b < 4L) {
            throw new IllegalArgumentException("size < 4: " + this.b);
        }
        final ca a = this.a;
        final int b = a.b;
        final int c = a.c;
        if (c - b < 4) {
            return (0xFF & this.f()) << 24 | (0xFF & this.f()) << 16 | (0xFF & this.f()) << 8 | (0xFF & this.f());
        }
        final byte[] a2 = a.a;
        final int n = b + 1;
        final int n2 = (0xFF & a2[b]) << 24;
        final int n3 = n + 1;
        final int n4 = n2 | (0xFF & a2[n]) << 16;
        final int n5 = n3 + 1;
        final int n6 = n4 | (0xFF & a2[n3]) << 8;
        final int b2 = n5 + 1;
        final int n7 = n6 | (0xFF & a2[n5]);
        this.b -= 4L;
        if (b2 == c) {
            this.a = a.a();
            cb.a.a(a);
            return n7;
        }
        a.b = b2;
        return n7;
    }
    
    @Override
    public int j() {
        return ce.a(this.i());
    }
    
    @Override
    public InputStream k() {
        return new bs(this);
    }
    
    public long l() {
        return this.b;
    }
    
    public bq m() {
        return this;
    }
    
    public long n() {
        long b = this.b;
        if (b == 0L) {
            b = 0L;
        }
        else {
            final ca e = this.a.e;
            if (e.c < 2048) {
                return b - (e.c - e.b);
            }
        }
        return b;
    }
    
    public void o() {
        this.b(this.b);
    }
    
    public bq p() {
        final bq bq = new bq();
        if (this.l() == 0L) {
            return bq;
        }
        bq.c(this.a.a, this.a.b, this.a.c - this.a.b);
        for (ca ca = this.a.d; ca != this.a; ca = ca.d) {
            bq.c(ca.a, ca.b, ca.c - ca.b);
        }
        return bq;
    }
    
    @Override
    public String toString() {
        if (this.b == 0L) {
            return "OkBuffer[size=0]";
        }
        if (this.b <= 16L) {
            return String.format("OkBuffer[size=%s data=%s]", this.b, this.p().c(this.b).c());
        }
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(this.a.a, this.a.b, this.a.c - this.a.b);
            for (ca ca = this.a.d; ca != this.a; ca = ca.d) {
                instance.update(ca.a, ca.b, ca.c - ca.b);
            }
            return String.format("OkBuffer[size=%s md5=%s]", this.b, bk.a(instance.digest()).c());
        }
        catch (NoSuchAlgorithmException ex) {
            throw new AssertionError();
        }
    }
}
