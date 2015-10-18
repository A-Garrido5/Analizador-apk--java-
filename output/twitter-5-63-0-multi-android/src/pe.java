import com.twitter.library.service.d;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.provider.b;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class pe extends ar
{
    private final long a;
    private final PromotedContent e;
    private int f;
    private final String g;
    private final bg h;
    private final com.twitter.library.api.bg i;
    
    public pe(final Context context, final Session session, final long n, final PromotedContent promotedContent) {
        this(context, new ab(session), n, promotedContent);
    }
    
    public pe(final Context context, final ab ab, final long n, final PromotedContent promotedContent) {
        this(context, ab, n, promotedContent, bg.a(context, ab.c), com.twitter.library.api.bg.a(17));
    }
    
    public pe(final Context context, final ab ab, final long a, final PromotedContent e, final bg h, final com.twitter.library.api.bg i) {
        super(context, pe.class.getName(), ab);
        this.a = a;
        this.e = e;
        this.g = pb.a(a, ab);
        this.a(new u());
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "friendships", "destroy" }).a("user_id", String.valueOf(this.a));
        if (this.e != null) {
            if (this.e.impressionId != null) {
                a.a("impression_id", this.e.impressionId);
            }
            if (this.e.b()) {
                a.a("earned", true);
            }
        }
        return a.a();
    }
    
    @Override
    public Runnable a(final a a) {
        if (a != null) {
            a.cancel(false);
        }
        return new pf(this);
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        final b w = this.W();
        final boolean x2 = this.X();
        final long c = this.P().c;
        if (x2) {
            this.h.b(this.a, 1, w, true, c);
            if (this.e == null) {
                this.h.a(0, c, this.a, w);
            }
        }
        else {
            this.h.a(this.a, 1, w, true, c);
        }
        w.a();
    }
    
    @Override
    public String b() {
        return "app:twitter_service:follow:delete";
    }
    
    public final pe c(final int f) {
        this.f = f;
        return this;
    }
    
    protected com.twitter.library.api.bg e() {
        return this.i;
    }
    
    public final long f() {
        return this.a;
    }
    
    public final int g() {
        return this.f;
    }
    
    @Override
    protected String p() {
        return this.g;
    }
}
