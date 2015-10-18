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
import com.twitter.library.commerce.model.Address;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class qq extends c
{
    private Address a;
    private Email e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    private String j;
    private boolean k;
    private boolean l;
    
    public qq(final Context context, final Session session, final Address a, final Email e, final String f, final String h, final boolean i, final boolean l, final boolean k) {
        super(context, qq.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.h = h;
        this.i = i;
        this.l = l;
        this.k = k;
        this.g = "CONSUMER";
        this.j = "USD";
    }
    
    @Override
    protected e a() {
        String s;
        if (this.a != null) {
            s = "addresses";
        }
        else {
            s = "payment_signatures";
        }
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "commerce", s }).a("is_default", this.i).a("with_signature", true).a("userId", this.P().c);
        if (!this.k) {
            a.a("accountType", this.g).a("currency", this.j);
            if (this.l) {
                a.a("commerceType", "offers");
            }
            else {
                a.a("commerceType", "buy_now");
            }
        }
        if (this.h != null) {
            a.a("profileId", this.h);
        }
        if (this.f != null) {
            a.a("postalCode", this.f);
        }
        if (this.a != null) {
            a.a("display_name", this.a.i()).a("full_name", this.a.k()).a("street1", this.a.b()).a("street2", this.a.c()).a("city", this.a.e()).a("subdivision", this.a.f()).a("postal_code", this.a.g()).a("country", this.a.d());
        }
        if (this.e != null) {
            a.a("contact_email", this.e.a());
        }
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final qo qo) {
        if (httpOperation.j()) {
            aa.c.putBundle("address_signature_bundle", (Bundle)qo.a());
        }
        else {
            rl.a(aa, qo);
        }
        aa.a(httpOperation);
    }
    
    protected qo b() {
        return new qo();
    }
}
