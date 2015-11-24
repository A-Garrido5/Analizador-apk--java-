import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

// 
// Decompiled by Procyon v0.5.30
// 

public final class bo implements cd
{
    private int a;
    private final bj b;
    private final Inflater c;
    private final bp d;
    private final CRC32 e;
    
    public bo(final cd cd) {
        this.a = 0;
        this.e = new CRC32();
        this.c = new Inflater(true);
        this.b = bt.a(cd);
        this.d = new bp(this.b, this.c);
    }
    
    private void a() {
        this.b.a(10L);
        final byte d = this.b.b().d(3L);
        boolean b;
        if ((0x1 & d >> 1) == 0x1) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            this.a(this.b.b(), 0L, 10L);
        }
        this.a("ID1ID2", 8075, this.b.g());
        this.b.b(8L);
        if ((0x1 & d >> 2) == 0x1) {
            this.b.a(2L);
            if (b) {
                this.a(this.b.b(), 0L, 2L);
            }
            final int n = 0xFFFF & this.b.b().h();
            this.b.a(n);
            if (b) {
                this.a(this.b.b(), 0L, n);
            }
            this.b.b(n);
        }
        if ((0x1 & d >> 3) == 0x1) {
            final long a = this.b.a((byte)0);
            if (b) {
                this.a(this.b.b(), 0L, a + 1L);
            }
            this.b.b(a + 1L);
        }
        if ((0x1 & d >> 4) == 0x1) {
            final long a2 = this.b.a((byte)0);
            if (b) {
                this.a(this.b.b(), 0L, a2 + 1L);
            }
            this.b.b(a2 + 1L);
        }
        if (b) {
            this.a("FHCRC", this.b.h(), (short)this.e.getValue());
            this.e.reset();
        }
    }
    
    private void a(final bq bq, long n, final long n2) {
        ca ca = bq.a;
        long n3 = n2;
        while (n3 > 0L) {
            final int n4 = ca.c - ca.b;
            if (n < n4) {
                final int n5 = (int)Math.min(n3, n4 - n);
                this.e.update(ca.a, (int)(n + ca.b), n5);
                n3 -= n5;
            }
            n -= n4;
            ca = ca.d;
        }
    }
    
    private void a(final String s, final int n, final int n2) {
        if (n2 != n) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", s, n2, n));
        }
    }
    
    private void b() {
        this.a("CRC", this.b.j(), (int)this.e.getValue());
        this.a("ISIZE", this.b.j(), this.c.getTotalOut());
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        if (n == 0L) {
            return 0L;
        }
        if (this.a == 0) {
            this.a();
            this.a = 1;
        }
        if (this.a == 1) {
            final long b = bq.b;
            final long b2 = this.d.b(bq, n);
            if (b2 != -1L) {
                this.a(bq, b, b2);
                return b2;
            }
            this.a = 2;
        }
        if (this.a == 2) {
            this.b();
            this.a = 3;
            if (!this.b.e()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
    
    @Override
    public void close() {
        this.d.close();
    }
}
