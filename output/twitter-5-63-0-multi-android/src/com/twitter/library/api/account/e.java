// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.d;
import android.os.Parcelable;
import com.twitter.library.api.ClientConfiguration;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.service.f;
import com.twitter.library.service.ab;
import android.text.TextUtils;
import com.twitter.library.client.App;
import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ar;

public class e extends ar
{
    private final String a;
    
    public e(final Context context, final Session session, final String a) {
        super(context, e.class.getName(), session);
        this.a = a;
        this.j("Client config fetch is never triggered by a user action.");
    }
    
    @Override
    protected com.twitter.library.service.e a() {
        final ab p = this.P();
        final f a = this.M().b("mobile.twitter.com").a((String)null);
        OAuthToken d = null;
        if (p != null) {
            d = p.d;
        }
        final f a2 = a.a(new t(d)).b(new Object[] { "i", "config" }).a("client", "android");
        if (App.f() && !TextUtils.isEmpty((CharSequence)this.a)) {
            a2.a("carrier", this.a);
        }
        return a2.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.l().a == 200) {
            aa.c.putParcelable("extra_settings", (Parcelable)bg.a());
        }
    }
    
    @Override
    public String b() {
        return null;
    }
    
    protected bg e() {
        return bg.a(18);
    }
}
