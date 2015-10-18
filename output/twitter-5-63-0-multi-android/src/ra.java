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

public class ra extends c
{
    private String a;
    private String e;
    private boolean f;
    
    public ra(final Context context, final Session session, final boolean f) {
        super(context, ra.class.getName(), session);
        this.f = f;
        this.a = "CONSUMER";
        this.e = "USD";
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "commerce", "payment_signatures" }).a("userId", this.P().c);
        a.a("accountType", this.a).a("currency", this.e);
        if (this.f) {
            a.a("commerceType", "offers");
        }
        else {
            a.a("commerceType", "buy_now");
        }
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final qy qy) {
        if (httpOperation.j()) {
            aa.c.putBundle("address_signature_bundle", (Bundle)qy.a());
        }
        else {
            rl.a(aa, qy);
        }
        aa.a(httpOperation);
    }
    
    protected qy b() {
        return new qy();
    }
}
