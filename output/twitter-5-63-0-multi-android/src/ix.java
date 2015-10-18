import android.os.SystemClock;

// 
// Decompiled by Procyon v0.5.30
// 

public class ix extends ig
{
    public ix(final String s, final im im, final String s2, final in in) {
        super(s, im, s2, in);
    }
    
    public static ix a(final String s, final ir ir, final long n, final im im) {
        return a(s, ir, n, im, ig.a("TimingMetric", s));
    }
    
    public static ix a(final String s, final ir ir, final long n, final im im, final String s2) {
        ig ig = ir.a(s2);
        if (ig == null) {
            ig = ir.d(new ix(s, im, s2, ir));
            ig.b(n);
        }
        return (ix)ig;
    }
    
    public static ix a(final String s, final ir ir, final im im) {
        return a(s, ir, 0L, im, ig.a("TimingMetric", s));
    }
    
    @Override
    protected void b() {
        this.u = SystemClock.elapsedRealtime();
        this.b(false);
    }
    
    @Override
    protected void c() {
        this.t = SystemClock.elapsedRealtime() - this.u;
        this.b(true);
        this.o();
        this.n();
    }
    
    @Override
    protected void e() {
        this.n();
    }
}
