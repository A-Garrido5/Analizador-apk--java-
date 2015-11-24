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
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class rh extends c
{
    private String a;
    
    public rh(final Context context, final Session session, final String a) {
        super(context, rh.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f b = this.M().a(HttpOperation$RequestMethod.a).b(new Object[] { "offers", this.a });
        rl.a(b, this.p);
        return b.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final rf rf) {
        if (httpOperation.j()) {
            aa.c.putBundle("offer_details_bundle", (Bundle)rf.a());
        }
        else {
            rl.a(aa, rf);
        }
        aa.a(httpOperation);
    }
    
    protected rf b() {
        return new rf();
    }
}
