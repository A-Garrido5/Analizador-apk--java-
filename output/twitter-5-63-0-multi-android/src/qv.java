import com.twitter.library.api.ad;
import android.os.Bundle;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Iterator;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.List;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class qv extends c
{
    private String a;
    private long e;
    private long f;
    private String g;
    private List h;
    private String i;
    
    public qv(final Context context, final Session session, final String a, final long e, final long f, final String g, final List h, final String i) {
        super(context, rk.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "commerce", "carts" }).a("product_id", this.a).a("marketplace_id", this.e).a("merchant_id", this.f).a("card_url", this.g);
        if (!TextUtils.isEmpty((CharSequence)this.i)) {
            a.a("shipping_address_id", this.i);
        }
        final Iterator<String> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            a.a("variant_id", iterator.next());
        }
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final qr qr) {
        if (httpOperation.j()) {
            aa.c.putBundle("product_info_bundle", (Bundle)qr.a());
        }
        else {
            rl.a(aa, qr);
        }
        aa.a(httpOperation);
    }
    
    protected qr b() {
        return new qr();
    }
}
