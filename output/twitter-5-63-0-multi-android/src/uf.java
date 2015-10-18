import com.twitter.internal.android.util.Size;
import android.app.ActivityManager;
import com.twitter.util.t;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class uf extends ic
{
    private uf(final Context context, final String s, final im im, final String s2, final in in, final int n) {
        super(context, s, im, s2, in, n);
    }
    
    public static uf a(final ir ir, final String s, final im im, final int n) {
        final String a = ig.a("OutOfMemoryMetric", s);
        ig ig = ir.a(a);
        if (ig == null) {
            ig = ir.d(new uf(ir.f(), s, im, a, ir, n));
        }
        return (uf)ig;
    }
    
    @Override
    public String t() {
        final Context f = ir.b().f();
        final Size a = com.twitter.util.t.a(f);
        final StringBuilder sb = new StringBuilder();
        sb.append("screen_width=").append(a.a());
        sb.append(",").append("screen_height=").append(a.b());
        sb.append(",").append("memory_class=").append(((ActivityManager)f.getSystemService("activity")).getMemoryClass());
        sb.append(",").append("dalvik_heap_max=").append(Runtime.getRuntime().maxMemory());
        return sb.toString();
    }
}
