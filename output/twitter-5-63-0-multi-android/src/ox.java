import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.library.service.e;
import java.util.Locale;
import com.twitter.library.service.g;
import com.twitter.library.service.t;
import com.twitter.library.featureswitch.d;
import com.twitter.util.i;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class ox extends ar
{
    public String a;
    public String e;
    private String f;
    
    public ox(final Context context, final Session session) {
        super(context, ox.class.getName(), session);
        final Locale locale = context.getResources().getConfiguration().locale;
        if (locale != null) {
            this.f = com.twitter.util.i.b(locale);
        }
        if (com.twitter.library.featureswitch.d.a("retry_nux_and_login_verification_get_requests_2753", new String[] { "network_retry_active" })) {
            this.a(new t());
        }
    }
    
    @Override
    protected e a() {
        final f b = this.M().a("i").b(new Object[] { "users" });
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            b.a("lang", this.f);
        }
        switch (this.O()) {
            default: {
                throw new UnsupportedOperationException("No action for code: " + this.O());
            }
            case 1: {
                return b.a(new Object[] { "email_available" }).a("email", this.a).a();
            }
            case 2: {
                return b.a(new Object[] { "username_available" }).a("custom", 1L).a("context", "signup").a("username", this.e).a();
            }
        }
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final com.twitter.library.api.d d = (com.twitter.library.api.d)bg.a();
            if (!d.a) {
                aa.a(400, d.b);
            }
        }
    }
    
    @Override
    public String b() {
        return "app:twitter_service:account:availability_check";
    }
    
    protected bg e() {
        return bg.a(13);
    }
}
