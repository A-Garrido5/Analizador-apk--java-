import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.c;
import com.twitter.library.service.d;
import com.twitter.library.api.bp;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.provider.b;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import com.twitter.library.service.aa;
import com.twitter.library.api.bg;
import android.content.Context;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class ol extends ar
{
    private final Context a;
    private final long e;
    private final bg f;
    private final com.twitter.library.provider.bg g;
    private final boolean h;
    private aa i;
    private long j;
    private String k;
    
    public ol(final Context context, final Session session, final long n, final long n2, final boolean b) {
        this(context, new ab(session), n, n2, b, com.twitter.library.provider.bg.a(context, session.g()), bg.a(2));
    }
    
    protected ol(final Context a, final ab ab, final long e, final long j, final boolean h, final com.twitter.library.provider.bg g, final bg f) {
        super(a, ol.class.getName(), ab);
        this.a = a;
        this.e = e;
        this.j = j;
        this.h = h;
        this.g = g;
        this.f = f;
        this.k = oq.a(e, ab);
        this.a(new om(this));
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("statuses", "destroy", this.j).a();
    }
    
    @Override
    public Runnable a(final a a) {
        if (a != null) {
            a.cancel(true);
        }
        return new on(this);
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        final b w = this.W();
        final aa aa = (aa)x.b();
        int c;
        if (x != null && x.b() != null) {
            c = ((aa)x.b()).c();
        }
        else {
            c = 0;
        }
        final long c2 = this.P().c;
        if (aa.a()) {
            final bp bp = (bp)this.f.a();
            if (bp != null) {
                this.g.a(c2, bp, this.h, w);
            }
            this.g.a(c2, this.e, w);
        }
        else if (c == 404) {
            this.g.a(c2, this.e, w);
            aa.a(true);
        }
        else {
            this.g.a(c2, this.e, true, w);
        }
        w.a();
    }
    
    @Override
    public String b() {
        return "app:twitter_service:retweet:delete";
    }
    
    @Override
    protected boolean c(final aa aa) {
        final boolean c = super.c(aa);
        if (this.j <= 0L) {
            final oo oo = new oo(this.a, this.P(), this.e);
            this.i = oo.S();
            final bp a = oo.e;
            if (a != null) {
                this.j = a.k;
                if (this.j > 0L) {
                    return true;
                }
                if (!a.z) {
                    aa.a(true);
                    return false;
                }
            }
            else if (this.i.c() == 404) {
                aa.a(true);
            }
            return false;
        }
        return c;
    }
    
    protected bg e() {
        return this.f;
    }
    
    public long f() {
        return this.e;
    }
    
    @Override
    protected String p() {
        return this.k;
    }
}
