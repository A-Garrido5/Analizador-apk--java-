// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.d;
import java.util.List;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.client.App;
import com.twitter.library.platform.PushService;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class g extends c
{
    private final r a;
    
    public g(final Context context, final Session session, final r a) {
        super(context, "EnrollLoginVerification", session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "account", "login_verification_enrollment" }).a(HttpOperation$RequestMethod.b).a("public_key", this.a.b).a("offline_code", this.a.c).a("iteration_count", Integer.toString(this.a.a)).a("udid", PushService.b(this.p)).a("token", PushService.d(this.p)).a("update_push_destination", "true");
        if (App.b()) {
            a.a("environment", String.valueOf(2));
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (!httpOperation.j()) {
            aa.c.putIntArray("custom_errors", ae.a((List)bg.a()));
        }
    }
    
    protected bg b() {
        return bg.a(43);
    }
}
