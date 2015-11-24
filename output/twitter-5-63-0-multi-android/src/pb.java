import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import java.util.List;
import com.twitter.library.network.ae;
import com.twitter.library.api.timeline.w;
import java.util.Collection;
import java.util.Collections;
import com.twitter.library.api.z;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import java.util.Iterator;
import com.twitter.library.api.bd;
import java.util.ArrayList;
import java.util.Locale;
import com.twitter.library.provider.b;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class pb extends ar
{
    private final long a;
    private final PromotedContent e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int[] j;
    private long k;
    private int l;
    private Integer m;
    private TwitterUser r;
    private final String s;
    private final bg t;
    private final com.twitter.library.api.bg u;
    
    public pb(final Context context, final Session session, final long n, final PromotedContent promotedContent) {
        this(context, new ab(session), n, promotedContent);
    }
    
    public pb(final Context context, final ab ab, final long n, final PromotedContent promotedContent) {
        this(context, ab, n, promotedContent, bg.a(context, ab.c), com.twitter.library.api.bg.a(17));
    }
    
    protected pb(final Context context, final ab ab, final long a, final PromotedContent e, final bg t, final com.twitter.library.api.bg u) {
        super(context, pb.class.getName(), ab);
        this.l = -1;
        this.a = a;
        this.e = e;
        this.t = t;
        this.u = u;
        this.a(new u());
        this.s = a(a, ab);
    }
    
    protected static String a(final long n, final ab ab) {
        return String.format(Locale.ENGLISH, "follow_%d_%d", ab.c, n);
    }
    
    private void a(final ArrayList list) {
        if (list != null) {
            for (final bd bd : list) {
                if (bd.a == 250) {
                    this.k = bd.c;
                    break;
                }
            }
        }
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "friendships", "create" }).a("send_error_codes", true).a("user_id", String.valueOf(this.a));
        if (this.f) {
            a.a("follow", "true");
        }
        if (this.g) {
            a.a("lifeline", "true");
        }
        if (this.e != null) {
            if (this.e.impressionId != null) {
                a.a("impression_id", this.e.impressionId);
            }
            if (this.e.b()) {
                a.a("earned", true);
            }
        }
        if (this.h) {
            a.a("challenges_passed", true);
        }
        a.a("handles_challenges", "1");
        return a.a();
    }
    
    @Override
    public Runnable a(final a a) {
        if (a != null) {
            a.cancel(false);
        }
        return new pc(this);
    }
    
    public pb a(final Integer m) {
        this.m = m;
        return this;
    }
    
    public pb a(final boolean f) {
        this.f = f;
        return this;
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        final b w = this.W();
        if (this.X()) {
            this.r = (TwitterUser)this.u.a();
            if (this.r != null) {
                final int e = this.t.e(this.a);
                int friendship;
                if (this.r.isProtected) {
                    friendship = z.a(z.b(e, 1), 16384);
                }
                else {
                    int n;
                    if (this.g) {
                        n = 256;
                    }
                    else {
                        n = 1;
                    }
                    friendship = z.a(e, n);
                }
                this.r.friendship = friendship;
                final TwitterUser a = this.t.a(this.a);
                if (a != null) {
                    this.r.c(a.followersCount);
                }
                final ab p = this.P();
                this.t.a(Collections.singletonList(this.r), p.c, 0, -1L, null, null, true, w);
                this.t.a(2, p.c, this.a, w);
                this.b(new com.twitter.library.api.search.a(this.p, p, this.r));
                final TwitterUser a2 = this.t.a(p.c);
                if (a2 != null) {
                    this.b(new w(this.p, p, a2).j("Request being made to fill timeline with new followed user tweets. User did not trigger this request."));
                }
            }
        }
        else {
            final ArrayList list = (ArrayList)this.u.a();
            this.j = ae.a(list);
            this.a(list);
            this.t.b(this.a, 1, w, true, this.P().c);
        }
        w.a();
    }
    
    @Override
    public String b() {
        return "app:twitter_service:follow:create";
    }
    
    public pb b(final boolean g) {
        this.g = g;
        return this;
    }
    
    public pb c(final int l) {
        this.l = l;
        return this;
    }
    
    public pb c(final boolean h) {
        this.h = h;
        return this;
    }
    
    public pb d(final boolean i) {
        this.i = i;
        return this;
    }
    
    @Override
    protected boolean d(final x x) {
        return super.d(x) || ((aa)x.b()).c() == 403;
    }
    
    protected com.twitter.library.api.bg e() {
        return this.u;
    }
    
    public final int[] f() {
        return this.j;
    }
    
    public final long g() {
        return this.k;
    }
    
    @Override
    protected String p() {
        return this.s;
    }
    
    public final TwitterUser t() {
        return this.r;
    }
    
    public final long u() {
        return this.a;
    }
    
    public final PromotedContent v() {
        return this.e;
    }
    
    public final int w() {
        return this.l;
    }
    
    public final boolean x() {
        return this.i;
    }
}
