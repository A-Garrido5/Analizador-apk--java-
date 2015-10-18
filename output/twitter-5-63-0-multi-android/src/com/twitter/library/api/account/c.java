// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import android.text.TextUtils;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

public class c extends b
{
    private final String a;
    private final long e;
    private String f;
    
    public c(final Context context, final Session session, final long e, final String a) {
        super(context, c.class.getName(), session);
        this.e = e;
        this.a = a;
    }
    
    public c a(final String f) {
        this.f = f;
        return this;
    }
    
    @Override
    protected e a() {
        final f a = this.b().a("login_verification_user_id", String.valueOf(this.e)).a("login_verification_request_id", this.a);
        if (this.f != null) {
            a.a("login_verification_challenge_response", this.f);
        }
        return a.a();
    }
    
    public boolean u() {
        return !TextUtils.isEmpty((CharSequence)this.f);
    }
}
