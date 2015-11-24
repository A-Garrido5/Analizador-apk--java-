import com.twitter.library.api.ad;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import java.math.BigDecimal;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class qn extends c
{
    private String a;
    private String e;
    private String f;
    private String g;
    private String h;
    private long i;
    private long j;
    private BigDecimal k;
    private BigDecimal l;
    private BigDecimal m;
    private String r;
    private String s;
    private long t;
    private long u;
    
    public qn(final Context context, final Session session, final String a, final String e, final String f, final String g, final String h, final long j, final long i, BigDecimal k, BigDecimal l, BigDecimal m, final String r, final String s, final long t, final long u) {
        super(context, qn.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
        this.i = i;
        if (k == null) {
            k = new BigDecimal(0);
        }
        this.k = k;
        if (l == null) {
            l = new BigDecimal(0);
        }
        this.l = l;
        if (m == null) {
            m = new BigDecimal(0);
        }
        this.m = m;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).b(new Object[] { "commerce", "purchases" }).a("card_url", this.a).a("product_id", this.e).a("variant_id", this.f).a("payment_method_id", this.h).a("merchant_id", this.j).a("marketplace_id", this.i).a("amount_price", this.k.longValue()).a("amount_tax", this.l.longValue()).a("amount_shipping", this.m.longValue()).a("currency", this.r).a("nonce", this.s).a("tweet_id", this.t).a("viewed_at", this.u);
        if (!TextUtils.isEmpty((CharSequence)this.g)) {
            a.a("shipping_address_id", this.g);
        }
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final ql ql) {
        if (httpOperation.j()) {
            final String s = (String)ql.a();
            aa.c.putBoolean("output_success", true);
            aa.c.putString("auth_cart_id", s);
        }
        else {
            aa.c.putBoolean("output_success", false);
            rl.a(aa, ql);
        }
        aa.a(httpOperation);
    }
    
    protected ql b() {
        return new ql();
    }
}
