import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class iu extends iv
{
    protected long a;
    
    public iu(final Context context, final String s, final im im, final String s2, final in in, final boolean b, final int n) {
        super(context, s, im, s2, in, b, n);
    }
    
    public static iu a(final String s, final im im, final ir ir, final boolean b, final int n) {
        ig ig = ir.a(ig.a("PeakValueMetric", s));
        if (ig == null) {
            ig = ir.d(new iu(ir.f(), s, im, ig.a("PeakValueMetric", s), ir, b, n));
        }
        return (iu)ig;
    }
    
    public void a(final long a) {
        synchronized (this) {
            if (this.l() && a > this.a) {
                this.a = a;
                this.b(true);
                this.q();
            }
        }
    }
    
    @Override
    protected void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        synchronized (this) {
            super.a(sharedPreferences$Editor);
            sharedPreferences$Editor.putLong(this.a("peak"), this.a);
        }
    }
    
    @Override
    protected void a(final SharedPreferences sharedPreferences) {
        this.a = sharedPreferences.getLong(this.a("peak"), 0L);
        super.a(sharedPreferences);
    }
    
    @Override
    protected void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.b(sharedPreferences$Editor);
        sharedPreferences$Editor.remove(this.a("peak"));
    }
    
    @Override
    public Long d() {
        synchronized (this) {
            return this.a;
        }
    }
    
    @Override
    protected void e() {
        synchronized (this) {
            super.e();
            this.a = 0L;
            this.q();
        }
    }
}
