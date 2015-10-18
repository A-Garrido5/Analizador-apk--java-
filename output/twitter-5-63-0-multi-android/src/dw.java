import com.twitter.library.av.model.b;
import java.util.List;
import android.content.Context;
import com.twitter.library.av.d;

// 
// Decompiled by Procyon v0.5.30
// 

public class dw implements dz
{
    private final d a;
    
    public dw() {
        this(d.a());
    }
    
    dw(final d a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        this.a.d();
    }
    
    @Override
    public void a(final Context context, final List list, final String s, final b b) {
        new dx(b, list, s, this.a).a((Object[])new Context[] { context });
    }
}
