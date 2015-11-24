import android.os.SystemClock;

// 
// Decompiled by Procyon v0.5.30
// 

public class ih
{
    public static final im l;
    public static final im m;
    public static final im n;
    protected String o;
    protected String p;
    protected String q;
    protected im r;
    protected long s;
    protected long t;
    protected long u;
    protected Long v;
    
    static {
        l = new ii();
        m = new ij();
        n = new ik();
    }
    
    public ih(final String s, final im im) {
        this(s, im, 0L);
    }
    
    public ih(final String o, final im r, final long t) {
        this.o = o;
        this.r = r;
        this.t = t;
        this.u = 0L;
        this.p = "PerfMetric";
    }
    
    public String a() {
        return this.o;
    }
    
    public void b(final long s) {
        this.s = s;
    }
    
    public void b(final String p) {
        this.p = p;
    }
    
    public Long d() {
        return this.v;
    }
    
    public void i() {
        synchronized (this) {
            this.u = SystemClock.elapsedRealtime();
        }
    }
    
    public void j() {
        synchronized (this) {
            this.t = SystemClock.elapsedRealtime() - this.u;
        }
    }
    
    public String t() {
        return this.q;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.o + " duration=" + this.t);
        final String string = this.o + " duration=" + this.t;
        if (this.v != null) {
            sb.append(" value=" + this.v);
        }
        if (this.q != null) {
            sb.append(" metadata=" + this.q);
        }
        return string;
    }
    
    public long u() {
        return this.t;
    }
    
    public String v() {
        return this.p;
    }
    
    public im w() {
        return this.r;
    }
    
    public long x() {
        return this.s;
    }
}
