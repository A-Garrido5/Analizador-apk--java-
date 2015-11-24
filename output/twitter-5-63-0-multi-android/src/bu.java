import java.io.OutputStream;

// 
// Decompiled by Procyon v0.5.30
// 

final class bu implements cc
{
    final /* synthetic */ OutputStream a;
    private bl b;
    
    bu(final OutputStream a) {
        this.a = a;
        this.b = bl.a;
    }
    
    @Override
    public void a() {
        this.a.flush();
    }
    
    @Override
    public void a(final bq bq, long n) {
        ce.a(bq.b, 0L, n);
        while (n > 0L) {
            this.b.b();
            final ca a = bq.a;
            final int n2 = (int)Math.min(n, a.c - a.b);
            this.a.write(a.a, a.b, n2);
            a.b += n2;
            n -= n2;
            bq.b -= n2;
            if (a.b == a.c) {
                bq.a = a.a();
                cb.a.a(a);
            }
        }
    }
    
    @Override
    public void close() {
        this.a.close();
    }
    
    @Override
    public String toString() {
        return "sink(" + this.a + ")";
    }
}
