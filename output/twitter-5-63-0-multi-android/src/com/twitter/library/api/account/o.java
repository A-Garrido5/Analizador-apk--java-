// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

public class o extends b
{
    public final String a;
    public final String e;
    
    public o(final Context context, final Session session, final String a, final String e) {
        super(context, o.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    @Override
    protected e a() {
        return this.b().a("x_auth_password", this.e).a("x_auth_username", this.a).a();
    }
}
