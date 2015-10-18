import android.util.Log;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.os.SystemClock;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class ig extends ih
{
    private boolean a;
    private final in b;
    protected final long f;
    protected final String g;
    protected long h;
    protected boolean i;
    boolean j;
    boolean k;
    
    public ig(final String s, final im im, final String s2, final in in) {
        this(s, im, s2, in, false);
    }
    
    public ig(final String s, final im im, final String g, final in b, final boolean j) {
        super(s, im);
        this.p = this.getClass().getSimpleName();
        this.g = g;
        this.f = SystemClock.elapsedRealtime();
        this.b = b;
        this.j = j;
        this.i = false;
        if (j && b != null) {
            this.a(b.a());
        }
    }
    
    protected static String a(final String s, final String s2) {
        return s + s2;
    }
    
    protected String a(final String s) {
        return this.g + "_" + s;
    }
    
    protected void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        sharedPreferences$Editor.putLong(this.a("starttime"), this.u);
        sharedPreferences$Editor.putBoolean(this.a("measuring"), this.a);
        sharedPreferences$Editor.putLong(this.a("duration"), this.t);
        sharedPreferences$Editor.putBoolean(this.a("ready"), this.k);
        sharedPreferences$Editor.putLong(this.a("last_report"), this.h);
    }
    
    protected void a(final SharedPreferences sharedPreferences) {
        this.u = sharedPreferences.getLong(this.a("starttime"), 0L);
        this.a = sharedPreferences.getBoolean(this.a("measuring"), false);
        this.t = sharedPreferences.getLong(this.a("duration"), 0L);
        this.k = sharedPreferences.getBoolean(this.a("ready"), false);
        this.h = sharedPreferences.getLong(this.a("last_report"), 0L);
    }
    
    protected void b() {
    }
    
    protected void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        sharedPreferences$Editor.remove(this.a("starttime"));
        sharedPreferences$Editor.remove(this.a("measuring"));
        sharedPreferences$Editor.remove(this.a("duration"));
        sharedPreferences$Editor.remove(this.a("ready"));
        sharedPreferences$Editor.remove(this.a("last_report"));
    }
    
    public final void b(final boolean k) {
        this.k = k;
    }
    
    protected void c() {
    }
    
    protected void e() {
    }
    
    protected boolean h() {
        return true;
    }
    
    @Override
    public void i() {
        synchronized (this) {
            if (this.i) {
                Log.e("MetricsManager", "attempting to start a metric which has already been destroyed");
            }
            if (this.i && (!this.a || this.h())) {
                this.a = true;
                this.u = System.currentTimeMillis();
                this.b();
            }
        }
    }
    
    @Override
    public final void j() {
        synchronized (this) {
            if (this.a) {
                this.t += System.currentTimeMillis() - this.u;
                this.c();
                this.a = false;
            }
        }
    }
    
    public final void k() {
        synchronized (this) {
            this.s();
            this.n();
        }
    }
    
    public final boolean l() {
        return this.a;
    }
    
    public final boolean m() {
        return this.i;
    }
    
    protected final void n() {
        this.i = true;
        if (this.b != null) {
            this.b.b(this);
        }
    }
    
    protected final void o() {
        if (this.b != null) {
            this.h = System.currentTimeMillis();
            this.b.a(this);
        }
    }
    
    protected final void p() {
        if (this.a) {
            this.u = System.currentTimeMillis();
        }
        else {
            this.u = 0L;
        }
        this.t = 0L;
        this.k = false;
        this.e();
    }
    
    protected final void q() {
        if (this.b != null) {
            this.b.c(this);
        }
    }
    
    public boolean r() {
        return this.k;
    }
    
    protected void s() {
    }
}
