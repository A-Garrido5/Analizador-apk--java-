import com.twitter.library.service.d;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class mq extends mm
{
    private String e;
    private boolean f;
    private boolean g;
    
    protected mq(final Context context, final Session session, final String s, final String e, final boolean f) {
        super(context, mp.class.getName(), session, s);
        this.g = true;
        this.e = e;
        this.f = f;
    }
    
    public static mq a(final Context context, final Session session, final String s, final String s2, final boolean b) {
        return new mq(context, session, s, s2, b);
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "device", "register_complete" });
        this.a(a);
        a.a("numeric_pin", this.e);
        a.a("is_verizon", this.f);
        a.a("notifications_disabled", this.g);
        return a.a();
    }
    
    @Override
    protected final void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        String s;
        if (httpOperation.k()) {
            s = "success";
        }
        else if (httpOperation.l().a == 0) {
            s = "error";
        }
        else {
            s = "failure";
        }
        ScribeService.a(this.p, ((TwitterScribeLog)new TwitterScribeLog(this.P().c).b(new String[] { "app:twitter_service:phone_number:complete_mobile_verification", s })).c(2));
    }
    
    public mq f() {
        this.g = false;
        return this;
    }
    
    protected bg g() {
        return null;
    }
}
