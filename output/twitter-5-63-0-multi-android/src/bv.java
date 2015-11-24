import java.io.InputStream;

// 
// Decompiled by Procyon v0.5.30
// 

final class bv implements cd
{
    final /* synthetic */ InputStream a;
    private bl b;
    
    bv(final InputStream a) {
        this.a = a;
        this.b = bl.a;
    }
    
    @Override
    public long b(final bq bq, final long n) {
        if (n < 0L) {
            throw new IllegalArgumentException("byteCount < 0: " + n);
        }
        this.b.b();
        final ca f = bq.f(1);
        final int read = this.a.read(f.a, f.c, (int)Math.min(n, 2048 - f.c));
        if (read == -1) {
            return -1L;
        }
        f.c += read;
        bq.b += read;
        return read;
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public String toString() {
        return "source(" + this.a + ")";
    }
}
