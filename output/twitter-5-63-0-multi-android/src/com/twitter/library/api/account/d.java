// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import java.util.List;
import com.twitter.library.network.ae;
import java.util.ArrayList;
import android.os.Parcelable;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.client.App;
import com.twitter.library.platform.PushService;
import android.text.TextUtils;
import com.twitter.library.service.e;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class d extends c
{
    private final String a;
    
    public d(final Context context, final Session session, final String a) {
        super(context, "CheckLoginVerificationEligibility", session);
        this.a = a;
    }
    
    public static LvEligibilityResponse b(final aa aa) {
        return (LvEligibilityResponse)aa.c.getParcelable("login_verification_enrolled");
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "account", "login_verification_enrollment" });
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            a.a("public_key", this.a);
        }
        if (com.twitter.library.featureswitch.d.f("login_verification_push_destination_enabled")) {
            a.a("udid", PushService.b(this.p)).a("token", PushService.d(this.p));
            if (App.b()) {
                a.a("environment", String.valueOf(2));
            }
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            aa.c.putParcelable("login_verification_enrolled", (Parcelable)bg.a());
            return;
        }
        aa.c.putIntArray("custom_errors", ae.a((List)bg.a()));
        aa.c.putParcelable("login_verification_enrolled", (Parcelable)null);
    }
    
    protected bg b() {
        return bg.a(46);
    }
}
