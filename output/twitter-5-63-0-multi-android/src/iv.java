import android.content.Context;
import android.os.Handler;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class iv extends ig implements ip
{
    private int a;
    private Handler b;
    private Runnable c;
    
    public iv(final Context context, final String s, final im im, final String s2, final in in, final boolean b, final int a) {
        super(s, im, s2, in, b);
        this.c = new iw(this);
        this.b = new Handler(context.getMainLooper());
        this.a = a;
        if (this.a < 1 || this.a > 3) {
            throw new IllegalStateException("Invalid reporting interval, please see PeriodicMetric for valid intervals.");
        }
        io.a(this);
        this.y();
    }
    
    @Override
    public void au_() {
        this.y();
    }
    
    protected void c(final long n) {
        this.b.postDelayed(this.c, n);
    }
    
    protected int g() {
        switch (this.a) {
            default: {
                return io.a().f;
            }
            case 1: {
                return io.a().d;
            }
            case 2: {
                return io.a().e;
            }
        }
    }
    
    @Override
    protected boolean h() {
        return false;
    }
    
    @Override
    protected void s() {
        super.s();
        this.z();
    }
    
    @Override
    public long u() {
        if (!this.l()) {
            return this.t;
        }
        return this.t + System.currentTimeMillis() - this.u;
    }
    
    protected void y() {
        this.z();
        if (this.i) {
            return;
        }
        final long t = this.g();
        final long currentTimeMillis = System.currentTimeMillis();
        long h;
        if (this.h == 0L) {
            h = currentTimeMillis;
        }
        else {
            h = this.h;
        }
        final long n = h + t;
        if (this.h > currentTimeMillis || currentTimeMillis - n >= 7L * t) {
            this.h = 0L;
            this.p();
            this.c(t);
            return;
        }
        if (this.h == 0L) {
            this.h = currentTimeMillis - 1L;
        }
        long n2;
        if (n > currentTimeMillis) {
            n2 = n - currentTimeMillis;
        }
        else {
            if (this.r()) {
                final boolean l = this.l();
                if (l) {
                    this.j();
                }
                this.t = t;
                this.o();
                if (l) {
                    this.i();
                }
            }
            n2 = t - (currentTimeMillis - n) % t;
        }
        this.u = currentTimeMillis - (t - n2);
        this.c(n2);
    }
    
    protected void z() {
        this.b.removeCallbacks(this.c);
    }
}
