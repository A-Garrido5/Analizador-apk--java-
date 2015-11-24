import com.twitter.library.provider.b;
import com.twitter.library.service.aa;
import com.twitter.library.util.bk;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.service.y;

// 
// Decompiled by Procyon v0.5.30
// 

public class oc extends y
{
    public int a;
    private final oi e;
    private final long f;
    
    public oc(final Context context, final ab ab, final oi e) {
        super(context, oc.class.getName(), ab);
        this.e = e;
        this.f = this.e.a();
        this.e.a(bk.a());
    }
    
    @Override
    protected void a_(final aa aa) {
        final oy oy = new oy(this.p, this.P(), 2);
        oy.c(400).a(this);
        final aa s = oy.S();
        aa.a(s);
        if (s.a()) {
            this.a = oy.a().size();
            this.e.a(this.a);
            if (this.a > 0) {
                final b b = new b(this.p.getContentResolver());
                this.V().d(this.P().c, b);
                b.a();
            }
            return;
        }
        this.e.a(this.f);
    }
}
