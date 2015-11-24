import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.errorreporter.ErrorReporter;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.ar;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.t;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.m;
import com.twitter.library.service.l;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ActivitySummary;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class ly extends i
{
    private final long a;
    private ActivitySummary e;
    
    public ly(final Context context, final Session session, final long a) {
        super(context, ly.class.getName(), session);
        this.a = a;
        l l = this.w();
        if (l == null) {
            l = new l().a(new m(context));
            this.a(l);
        }
        l.a(new t());
    }
    
    @Override
    public void a(final x x) {
        ar.a(this.p, "app:twitter_service:tweet_activity:connect", this.P().c, this.d((aa)x.b()), x, false);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (!httpOperation.j()) {
            return;
        }
        this.e = (ActivitySummary)bg.a();
        try {
            final b w = this.W();
            this.V().a(this.a, Integer.parseInt(this.e.a), Integer.parseInt(this.e.b), w);
            w.a();
        }
        catch (NumberFormatException ex) {
            ErrorReporter.a(ex);
        }
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.a).a("statuses", this.a, "activity", "summary").a("include_user_entities", true);
    }
    
    @Override
    public void b(final x x) {
        ar.a(this.p, "app:twitter_service:tweet_activity:connect", this.P().c, this.d((aa)x.b()), x, true);
    }
    
    protected boolean d(final aa aa) {
        return aa.a() || aa.c() == 404;
    }
    
    public ActivitySummary e() {
        return this.e;
    }
    
    protected bg f() {
        return bg.a(14);
    }
}
