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

public class rk extends c
{
    private String a;
    private long e;
    private long f;
    private String g;
    private List h;
    private boolean i;
    private boolean j;
    private String k;
    
    public rk(final Context context, final Session session, final String a, final long e, final long f, final String g, final List h, final boolean i, final boolean j, final String k) {
        super(context, rk.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "commerce", "products" }).a("product_id", this.a).a("marketplace_id", this.e).a("merchant_id", this.f).a("card_url", this.g);
        if (this.i) {
            a.a("calculate_fees", "true");
        }
        else {
            a.a("calculate_fees", "false");
        }
        if (this.j) {
            a.a("allow_unconfirmed_email", "true");
        }
        else {
            a.a("allow_unconfirmed_email", "false");
        }
        if (!TextUtils.isEmpty((CharSequence)this.k)) {
            a.a("shipping_address_id", this.k);
        }
        final Iterator<String> iterator = this.h.iterator();
        while (iterator.hasNext()) {
            a.a("variant_id", iterator.next());
        }
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final ri ri) {
        if (httpOperation.j()) {
            aa.c.putBundle("product_info_bundle", (Bundle)ri.a());
        }
        else {
            rl.a(aa, ri);
        }
        aa.a(httpOperation);
    }
    
    protected ri b() {
        return new ri();
    }
}
