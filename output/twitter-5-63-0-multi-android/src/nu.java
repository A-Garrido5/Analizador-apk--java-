import com.twitter.library.provider.bg;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class nu extends c
{
    private final PromotedEvent a;
    private long e;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String r;
    private String s;
    private String t;
    
    public nu(final Context context, final Session session, final PromotedEvent promotedEvent) {
        this(context, new ab(session), promotedEvent);
    }
    
    public nu(final Context context, final ab ab, final PromotedEvent a) {
        super(context, nu.class.getName(), ab);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "promoted_content", "log" });
        if (this.g != null) {
            a.a("impression_id", this.g);
        }
        if (this.e > 0L) {
            a.a("promoted_trend_id", this.e);
        }
        if (this.h) {
            a.a("earned", true);
        }
        a.a("event", this.a.toString());
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            a.a("url", this.f);
        }
        if (!TextUtils.isEmpty((CharSequence)this.j)) {
            a.a("playlist_url", this.j);
        }
        if (!TextUtils.isEmpty((CharSequence)this.k)) {
            a.a("video_uuid", this.k);
        }
        if (!TextUtils.isEmpty((CharSequence)this.l)) {
            a.a("video_type", this.l);
        }
        if (!TextUtils.isEmpty((CharSequence)this.m)) {
            a.a("cta_url", this.m);
        }
        if (!TextUtils.isEmpty((CharSequence)this.r)) {
            a.a("play_store_id", this.r);
        }
        if (!TextUtils.isEmpty((CharSequence)this.s)) {
            a.a("play_store_name", this.s);
        }
        if (!TextUtils.isEmpty((CharSequence)this.t)) {
            a.a("card_event", this.t);
        }
        return a.a();
    }
    
    public nu a(final long e) {
        this.e = e;
        return this;
    }
    
    public nu a(final String f) {
        this.f = f;
        return this;
    }
    
    public nu a(final boolean h) {
        this.h = h;
        return this;
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        final bg v = this.V();
        final int ordinal = this.a.ordinal();
        if (!httpOperation.j()) {
            v.a(ordinal, this.g, this.e, this.f, this.h, this.j, this.k, this.l, this.m, this.r, this.s, this.t);
        }
        else if (this.i) {
            v.b(ordinal, this.g, this.e, this.f, this.h, this.j, this.k, this.l, this.m, this.r, this.s, this.t);
        }
    }
    
    public nu b(final String g) {
        this.g = g;
        return this;
    }
    
    public nu b(final boolean i) {
        this.i = i;
        return this;
    }
    
    public nu c(final String j) {
        this.j = j;
        return this;
    }
    
    public nu d(final String k) {
        this.k = k;
        return this;
    }
    
    public nu e(final String l) {
        this.l = l;
        return this;
    }
    
    public nu f(final String m) {
        this.m = m;
        return this;
    }
    
    public nu g(final String r) {
        this.r = r;
        return this;
    }
    
    @Override
    protected d h() {
        return null;
    }
    
    public nu h(final String s) {
        this.s = s;
        return this;
    }
    
    public nu i(final String t) {
        this.t = t;
        return this;
    }
}
