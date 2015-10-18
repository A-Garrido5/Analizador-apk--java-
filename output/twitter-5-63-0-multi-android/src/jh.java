import android.os.Debug;
import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;
import java.util.Iterator;
import java.util.HashMap;
import java.util.ArrayList;
import android.content.Context;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class jh extends iv
{
    private iy a;
    private iy b;
    private iy c;
    private iy d;
    private iy e;
    private List w;
    
    public jh(final Context context, final String s, final im im, final String s2, final in in, final boolean b, final int n) {
        super(context, s, im, s2, in, b, n);
        this.b("MemMetric");
        if (this.w == null) {
            this.a = new iy("dalvik_total");
            this.b = new iy("dalvik_alloc");
            this.c = new iy("dalvik_ratio");
            this.d = new iy("native_total");
            this.e = new iy("native_alloc");
            this.B();
        }
    }
    
    private void B() {
        (this.w = new ArrayList(5)).add(this.a);
        this.w.add(this.b);
        this.w.add(this.c);
        this.w.add(this.d);
        this.w.add(this.e);
    }
    
    public static jh a(final im im, final ir ir) {
        ig ig = ir.a(ig.a("MemMetric", "app:mem"));
        if (ig == null) {
            ig = ir.d(new jh(ir.f(), "app:mem", im, ig.a("MemMetric", "app:mem"), ir, true, 3));
        }
        return (jh)ig;
    }
    
    public HashMap A() {
        final HashMap hashMap = new HashMap(2 * this.w.size());
        final Iterator<iy> iterator = this.w.iterator();
        while (iterator.hasNext()) {
            hashMap.putAll(iterator.next().a(20));
        }
        return hashMap;
    }
    
    @Override
    protected void a(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.a(sharedPreferences$Editor);
        final Iterator<iy> iterator = this.w.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(sharedPreferences$Editor);
        }
    }
    
    @Override
    protected void a(final SharedPreferences sharedPreferences) {
        super.a(sharedPreferences);
        this.a = new iy("dalvik_total", sharedPreferences);
        this.b = new iy("dalvik_alloc", sharedPreferences);
        this.c = new iy("dalvik_ratio", sharedPreferences);
        this.d = new iy("native_total", sharedPreferences);
        this.e = new iy("native_alloc", sharedPreferences);
        this.B();
    }
    
    @Override
    protected void b() {
        super.b();
        this.f();
    }
    
    @Override
    protected void b(final SharedPreferences$Editor sharedPreferences$Editor) {
        super.b(sharedPreferences$Editor);
        final Iterator<iy> iterator = this.w.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(sharedPreferences$Editor);
        }
    }
    
    @Override
    protected void e() {
        this.b(false);
        final Iterator<iy> iterator = this.w.iterator();
        while (iterator.hasNext()) {
            iterator.next().a();
        }
        super.e();
    }
    
    public void f() {
        final Runtime runtime = Runtime.getRuntime();
        final long totalMemory = runtime.totalMemory();
        this.a.a(totalMemory);
        this.b.a(runtime.totalMemory() - runtime.freeMemory());
        this.c.a(totalMemory * 100L / runtime.maxMemory());
        this.d.a(Debug.getNativeHeapSize());
        this.e.a(Debug.getNativeHeapAllocatedSize());
        this.b(true);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        final HashMap a = this.A();
        for (final String s : a.keySet()) {
            sb.append(s + "=" + a.get(s) + ",");
        }
        return sb.toString();
    }
}
