import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.service.ab;
import com.twitter.library.provider.k;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.p;

// 
// Decompiled by Procyon v0.5.30
// 

public class lx extends p
{
    private final long a;
    private final int e;
    private final boolean f;
    
    public lx(final Context context, final Session session, final long a, final boolean f, final int e) {
        super(context, lx.class.getName(), session);
        this.a = a;
        this.f = f;
        this.e = e;
    }
    
    @Override
    protected void a() {
        final ab h = this.h();
        final bg t = this.t();
        final b u = this.u();
        if (this.f) {
            t.b(this.e, null, u);
        }
        else {
            t.a(this.e, this.a, u);
        }
        com.twitter.library.provider.k.a(this.i).a(h.e, "unread_interactions", t.e(this.e), u);
        u.a();
    }
}
