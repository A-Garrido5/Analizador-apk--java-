// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.text.TextUtils;
import com.twitter.library.service.f;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.ar;
import com.twitter.library.service.aa;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.l;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.t;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.List;

public class w extends i
{
    private final String a;
    private final String e;
    private List f;
    
    public w(final Context context, final Session session, final String a, final String e) {
        super(context, w.class.getName(), session);
        this.a = a;
        this.e = e;
        if (com.twitter.library.featureswitch.d.a("retry_nux_and_login_verification_get_requests_2753", new String[] { "network_retry_active" })) {
            final l w = super.w();
            if (w != null) {
                w.a(new t());
                this.a(w);
            }
        }
    }
    
    private void a(final x x, final boolean b) {
        ar.a(this.p, "app:twitter_service:account:suggest_screen_names", this.P().c, ((aa)x.b()).a(), x, b);
    }
    
    @Override
    public void a(final x x) {
        this.a(x, false);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            this.f = (List)bg.a();
        }
    }
    
    @Override
    protected f b() {
        final f a = this.M().a("i").a(new Object[] { "users", "suggest_screen_names" });
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            a.a("email", this.a);
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            a.a("full_name", this.e);
        }
        return a;
    }
    
    @Override
    public void b(final x x) {
        this.a(x, true);
    }
    
    protected bg e() {
        return bg.a(29);
    }
    
    public List f() {
        return this.f;
    }
}
