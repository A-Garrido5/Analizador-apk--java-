import com.twitter.library.service.d;
import com.twitter.library.api.bp;
import com.twitter.library.network.ae;
import java.util.List;
import com.twitter.library.api.bq;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.internal.android.service.a;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import java.util.Locale;
import com.twitter.library.provider.b;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.bg;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class oq extends ar
{
    private final long a;
    private final long e;
    private final PromotedContent f;
    private final bg g;
    private final com.twitter.library.provider.bg h;
    private long i;
    private int[] j;
    private String k;
    
    public oq(final Context context, final Session session, final long n, final long n2, final PromotedContent promotedContent) {
        this(context, new ab(session), n, n2, promotedContent, bg.a(38), com.twitter.library.provider.bg.a(context, session.g()));
    }
    
    protected oq(final Context context, final ab ab, final long a, long e, final PromotedContent f, final bg g, final com.twitter.library.provider.bg h) {
        super(context, oq.class.getName(), ab);
        this.a = a;
        if (e <= 0L) {
            e = a;
        }
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.a(new u());
        this.k = a(a, ab);
    }
    
    protected static String a(final long n, final ab ab) {
        return String.format(Locale.ENGLISH, "retweet_%d_%d", ab.c, n);
    }
    
    @Override
    protected e a() {
        final f b = this.M().a(HttpOperation$RequestMethod.b).a("statuses", "retweet", this.e).a("send_error_codes", "true").a("include_entities", "true").a("include_media_features", "true").a("include_cards", "true").a("earned_read", "true").b();
        if (this.f != null && this.f.impressionId != null) {
            b.a("impression_id", this.f.impressionId);
            if (this.f.b()) {
                b.a("earned", "true");
            }
        }
        return b.a();
    }
    
    @Override
    public Runnable a(final a a) {
        if (a != null) {
            a.cancel(true);
        }
        return new or(this);
    }
    
    @Override
    public void a(final x x) {
        super.a(x);
        final long c = this.P().c;
        final aa aa = (aa)x.b();
        if (aa != null && aa.a()) {
            final b w = this.W();
            final bq bq = (bq)this.g.a();
            if (bq != null) {
                if (bq.c() == null) {
                    bq.a(this.f);
                }
                final bp f = bq.f();
                this.i = f.a;
                this.h.a(f, c, w);
                w.a();
            }
        }
        else {
            this.j = ae.a((List)this.g.a());
            final int[] j = this.j;
            final int length = j.length;
            int i = 0;
            boolean b = false;
            boolean b2 = false;
            while (i < length) {
                switch (j[i]) {
                    case 187:
                    case 327: {
                        b2 = true;
                        break;
                    }
                    case 144: {
                        b = true;
                        break;
                    }
                }
                ++i;
            }
            if (!b2 && !b) {
                final b w2 = this.W();
                this.h.a(c, this.a, false, w2);
                w2.a();
                return;
            }
            if (aa != null) {
                aa.a(true);
            }
            if (b && this.a != this.e && !this.isCancelled()) {
                this.b(new oq(this.p, this.P(), this.a, this.a, this.f, this.g, this.h));
            }
        }
    }
    
    @Override
    public String b() {
        return "app:twitter_service:retweet:create";
    }
    
    @Override
    protected boolean d(final x x) {
        if (super.d(x)) {
            return true;
        }
        final aa aa = (aa)x.b();
        return aa.c() == 403 || aa.c() == 404;
    }
    
    protected bg e() {
        return this.g;
    }
    
    public final int[] f() {
        return this.j;
    }
    
    public long g() {
        return this.a;
    }
    
    @Override
    protected String p() {
        return this.k;
    }
    
    public long t() {
        return this.i;
    }
}
