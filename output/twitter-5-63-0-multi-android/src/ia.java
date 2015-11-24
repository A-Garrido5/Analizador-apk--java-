import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ia extends iv
{
    protected long a;
    protected int b;
    
    public ia(final Context context, final String s, final im im, final String s2, final in in, final boolean b, final int n) {
        super(context, s, im, s2, in, b, n);
    }
    
    public static ia a(final String s, final im im, final ir ir, final boolean b, final int n) {
        ig ig = ir.a(ig.a("AverageValueMetric", s));
        if (ig == null) {
            ig = ir.d(new ia(ir.f(), s, im, ig.a("AverageValueMetric", s), ir, b, n));
        }
        return (ia)ig;
    }
    
    public void a(final long n) {
        synchronized (this) {
            if (this.l()) {
                this.a += n;
                ++this.b;
                this.b(true);
                this.q();
            }
        }
    }
    
    @Override
    protected void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        synchronized (this) {
            super.a(sharedPreferences$Editor);
            sharedPreferences$Editor.putLong(this.a("total"), this.a);
            sharedPreferences$Editor.putInt(this.a("count"), this.b);
        }
    }
    
    @Override
    protected void a(final SharedPreferences sharedPreferences) {
        this.a = sharedPreferences.getLong(this.a("total"), 0L);
        this.b = sharedPreferences.getInt(this.a("count"), 0);
        super.a(sharedPreferences);
    }
    
    @Override
    protected void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.b(sharedPreferences$Editor);
        sharedPreferences$Editor.remove(this.a("total"));
        sharedPreferences$Editor.remove(this.a("count"));
    }
    
    @Override
    public Long d() {
        if (this.b == 0) {
            return 0L;
        }
        return this.a / this.b;
    }
    
    @Override
    protected void e() {
        synchronized (this) {
            super.e();
            this.a = 0L;
            this.b = 0;
            this.q();
        }
    }
}
