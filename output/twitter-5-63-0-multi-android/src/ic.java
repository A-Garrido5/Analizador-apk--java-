import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.content.Context;
import java.util.concurrent.atomic.AtomicLong;

// 
// Decompiled by Procyon v0.5.30
// 

public class ic extends iv
{
    private AtomicLong a;
    
    public ic(final Context context, final String s, final im im, final String s2, final in in, final int n) {
        super(context, s, im, s2, in, true, n);
        if (this.a == null) {
            this.a = new AtomicLong(0L);
        }
    }
    
    public static ic a(final String s, final ir ir, final long n, final im im, final int n2) {
        return a(s, ir, n, im, n2, ig.a("CounterMetric", s));
    }
    
    public static ic a(final String s, final ir ir, final long n, final im im, final int n2, final String s2) {
        ig ig = ir.a(s2);
        if (ig == null) {
            ig = ir.d(new ic(ir.f(), s, im, s2, ir, n2));
            ig.b(n);
        }
        return (ic)ig;
    }
    
    private void d(final long n) {
        if (!this.l()) {
            return;
        }
        this.a.addAndGet(n);
        this.q();
    }
    
    public void a(final long n) {
        this.d(n);
    }
    
    @Override
    protected void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.a(sharedPreferences$Editor);
        sharedPreferences$Editor.putLong(this.a("usage"), this.a.get());
    }
    
    @Override
    protected void a(final SharedPreferences sharedPreferences) {
        if (this.a == null) {
            this.a = new AtomicLong(sharedPreferences.getLong(this.a("usage"), 0L));
        }
        else {
            this.a.set(sharedPreferences.getLong(this.a("usage"), 0L));
        }
        super.a(sharedPreferences);
    }
    
    public void b() {
        this.b(true);
    }
    
    @Override
    protected void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.b(sharedPreferences$Editor);
        sharedPreferences$Editor.remove(this.a("usage"));
    }
    
    @Override
    public Long d() {
        return this.a.get();
    }
    
    @Override
    protected void e() {
        this.a.set(0L);
        if (this.l()) {
            this.b(true);
        }
        this.q();
    }
    
    public void f() {
        this.d(1L);
    }
}
