import com.twitter.library.api.ad;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class sa extends c
{
    private String a;
    private String e;
    private long f;
    private String g;
    private long h;
    private long i;
    
    public sa(final Context context, final Session session, final String a, final String e, final long f, final String g, final long h, final long i) {
        super(context, sa.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "offers" }).a("card_url", this.a).a("offer_id", this.e).a("expiration_date", this.f).a("nonce", this.g).a("tweet_id", this.h).a("viewed_at", this.i);
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final rz rz) {
        if (httpOperation.j()) {
            aa.c.putBoolean("saveoffer_success_boolean", true);
        }
        else {
            aa.c.putBoolean("saveoffer_success_boolean", false);
            rl.a(aa, rz);
        }
        aa.a(httpOperation);
    }
    
    protected rz b() {
        return new rz();
    }
}
