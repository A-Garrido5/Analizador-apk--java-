import com.twitter.library.api.ad;
import android.os.Bundle;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.commerce.model.Email;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class qx extends c
{
    private Email a;
    
    public qx(final Context context, final Session session, final Email a) {
        super(context, qx.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "commerce", "contact_emails" }).a("contact_email", this.a.a());
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final qw qw) {
        if (httpOperation.j()) {
            aa.c.putBundle("create_contact_email_bundle", (Bundle)qw.a());
        }
        else {
            rl.a(aa, qw);
        }
        aa.a(httpOperation);
    }
    
    protected qw b() {
        return new qw();
    }
}
