import java.util.ArrayList;
import com.twitter.library.api.ad;
import android.os.Bundle;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.twitter.library.commerce.model.PartialClientCreditCard;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import android.preference.PreferenceManager;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.commerce.model.ClientCreditCard;
import com.twitter.library.commerce.model.Address;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class sd extends c
{
    private Address a;
    private ClientCreditCard e;
    private String f;
    private String g;
    private String h;
    private boolean i;
    
    public sd(final Context context, final Session session, final Address a, final ClientCreditCard e, final String f, final String g, final boolean i) {
        super(context, sd.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = "CONSUMER";
        this.i = i;
    }
    
    @Override
    protected e a() {
        final SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this.p);
        final f a = this.M().a(HttpOperation$RequestMethod.b).b("pay.twitter.com").a("1");
        boolean b;
        if (this.e != null && this.e instanceof PartialClientCreditCard) {
            b = true;
        }
        else {
            b = false;
        }
        if (b) {
            a.b(new Object[] { "payments", "updateProfile" });
        }
        else {
            a.b(new Object[] { "payments", "storeProfile" });
        }
        a.a("signature", this.f).a("timestamp", this.g).a("userId", this.P().c);
        if (!b) {
            a.a("currency", "USD").a("accountType", this.h);
            if (this.i) {
                a.a("commerceType", "offers");
            }
            else {
                a.a("commerceType", "buy_now");
            }
        }
        if (this.e != null) {
            if (!TextUtils.isEmpty((CharSequence)this.e.h())) {
                a.a("ccNumber", this.e.h());
            }
            if (this.e.g() != null) {
                a.a("ccCvv", this.e.g());
            }
            if (this.e.j() != null) {
                a.a("ccExpirationMonth", this.e.j());
            }
            if (this.e.k() != null) {
                a.a("ccExpirationYear", this.e.k());
            }
            if (this.e.f() != null) {
                a.a("postalCode", this.e.f());
            }
            if (b) {
                a.a("profileId", this.e.i());
            }
        }
        if (this.a != null && this.a.h() != null) {
            a.a("externalAddressId", this.a.h());
        }
        final String string = defaultSharedPreferences.getString("debug_card_tpay_host_v2", (String)null);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            a.b(string);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final sb sb) {
        if (httpOperation.j()) {
            final Bundle bundle = (Bundle)sb.a();
            aa.c.putBundle("store_profile_bundle", bundle);
            final ArrayList parcelableArrayList = bundle.getParcelableArrayList("commerce_bundle_errors");
            if (parcelableArrayList != null) {
                final Bundle bundle2 = new Bundle();
                bundle2.putParcelableArrayList("commerce_bundle_errors", parcelableArrayList);
                aa.c.putBundle("commerce_error_list_bundle", bundle2);
            }
        }
        else {
            rl.a(aa, sb);
        }
        aa.a(httpOperation);
    }
    
    protected sb b() {
        return new sb();
    }
}
