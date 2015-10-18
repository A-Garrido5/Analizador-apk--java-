import com.twitter.library.api.ad;
import android.os.Bundle;
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

public class sg extends c
{
    private String a;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private long j;
    private long k;
    private BigDecimal l;
    private BigDecimal m;
    private BigDecimal r;
    private String s;
    private String t;
    private long u;
    private long v;
    
    public sg(final Context context, final Session session, final String a, final String e, final String f, final String g, final String h, final String i, final long k, final long j, BigDecimal l, BigDecimal m, BigDecimal r, final String s, final String t, final long u, final long v) {
        super(context, qn.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.k = k;
        this.j = j;
        if (l == null) {
            l = new BigDecimal(0);
        }
        this.l = l;
        if (m == null) {
            m = new BigDecimal(0);
        }
        this.m = m;
        if (r == null) {
            r = new BigDecimal(0);
        }
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.c).b(new Object[] { "commerce", "carts" }).b(new Object[] { this.a }).a("card_url", this.e).a("product_id", this.f).a("variant_id", this.g).a("payment_method_id", this.i).a("merchant_id", this.k).a("marketplace_id", this.j).a("amount_price", this.l.longValue()).a("amount_tax", this.m.longValue()).a("amount_shipping", this.r.longValue()).a("currency", this.s).a("nonce", this.t).a("tweet_id", this.u).a("viewed_at", this.v);
        if (!TextUtils.isEmpty((CharSequence)this.h)) {
            a.a("shipping_address_id", this.h);
        }
        rl.a(a, this.p);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final se se) {
        if (httpOperation.j()) {
            aa.c.putAll((Bundle)se.a());
            aa.c.putBoolean("output_success", true);
        }
        else {
            aa.c.putBoolean("output_success", false);
            rl.a(aa, se);
        }
        aa.a(httpOperation);
    }
    
    protected se b() {
        return new se();
    }
}
