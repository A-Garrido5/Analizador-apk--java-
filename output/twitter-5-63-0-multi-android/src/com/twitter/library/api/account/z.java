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
import android.text.TextUtils;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class z extends c
{
    private final String a;
    
    public z(final Context context, final Session session, final String a) {
        super(context, "UnenrollLoginVerification", session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "account", "login_verification_enrollment" }).a(HttpOperation$RequestMethod.d);
        if (!TextUtils.isEmpty((CharSequence)this.a)) {
            a.a("public_key", this.a);
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
