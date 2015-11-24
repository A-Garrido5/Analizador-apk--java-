import android.os.Build$VERSION;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class je extends ia implements jd
{
    protected iz c;
    private long[] d;
    private int e;
    
    public je(final Context context, final String s, final im im, final in in, final boolean b, final int n) {
        this(context, s, im, ig.a("FramerateMetric", s), in, b, n);
    }
    
    public je(final Context context, final String s, final im im, final String s2, final in in, final boolean b, final int n) {
        super(context, s, im, s2, in, b, n);
        iz iz;
        if (f()) {
            iz = new ja();
        }
        else {
            iz = new jg();
        }
        this.a(iz);
        this.d = new long[30];
    }
    
    private void A() {
        synchronized (this) {
            this.e = 0;
        }
    }
    
    private void a(final int n) {
        long n2;
        int n3;
        if (this.e < 30) {
            n2 = this.e;
            n3 = 0;
        }
        else {
            n2 = 30L;
            n3 = this.e % 30;
        }
        this.a(1000000000L * (n2 - 1L) / (this.d[n] - this.d[n3]));
    }
    
    public static je b(final String s, final im im, final ir ir, final boolean b, final int n) {
        ig ig = ir.a(ig.a("FramerateMetric", s));
        if (ig == null) {
            ig = ir.d(new je(ir.f(), s, im, ig.a("FramerateMetric", s), ir, b, n));
        }
        return (je)ig;
    }
    
    public static boolean f() {
        return Build$VERSION.SDK_INT >= 16;
    }
    
    void a(final iz c) {
        if (this.c != null) {
            this.c.b();
            this.c.a(null);
        }
        (this.c = c).a(this);
    }
    
    @Override
    protected void b() {
        super.b();
        if (this.c == null) {
            return;
        }
        this.A();
        this.c.a();
    }
    
    @Override
    protected void c() {
        super.c();
        if (this.c == null) {
            return;
        }
        this.c.b();
    }
    
    @Override
    public void c_(final long n) {
        synchronized (this) {
            final int n2 = this.e % 30;
            this.d[n2] = n;
            ++this.e;
            if (this.e > 1 && this.e % 10 == 0) {
                this.a(n2);
            }
        }
    }
    
    @Override
    public Long d() {
        long longValue = super.d();
        if (longValue == 0L) {
            longValue = -1L;
        }
        return longValue;
    }
    
    @Override
    protected void e() {
        super.e();
        this.A();
    }
}
