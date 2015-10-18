import com.twitter.library.service.d;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.network.ae;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.aj;

// 
// Decompiled by Procyon v0.5.30
// 

public class mp extends mm
{
    private aj e;
    private boolean f;
    
    protected mp(final Context context, final Session session, final String s) {
        super(context, mp.class.getName(), session, s);
        this.f = true;
    }
    
    public static mp a(final Context context, final Session session, final String s) {
        return new mp(context, session, s);
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "device", "register" });
        this.b(a);
        a.a("send_numeric_pin", true);
        a.a("notifications_disabled", this.f);
        return a.a();
    }
    
    @Override
    protected final void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        String s;
        if (httpOperation.k()) {
            this.e = (aj)bg.a();
            s = "success";
        }
        else if (this.e() != ae.a) {
            if (CollectionUtils.a(this.e(), 285)) {
                s = "unavailable";
            }
            else {
                s = "failure";
            }
        }
        else {
            s = "error";
        }
        ScribeService.a(this.p, ((TwitterScribeLog)new TwitterScribeLog(this.P().c).b(new String[] { "app:twitter_service:phone_number:begin_mobile_verification", s })).c(2));
    }
    
    public mp f() {
        this.f = false;
        return this;
    }
    
    protected bg g() {
        return bg.a(51);
    }
    
    public aj t() {
        return this.e;
    }
}
