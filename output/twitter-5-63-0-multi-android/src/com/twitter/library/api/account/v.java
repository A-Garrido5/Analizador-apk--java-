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
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class v extends c
{
    public final q a;
    private int[] e;
    
    public v(final Context context, final Session session, final q a) {
        super(context, v.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.d).a(new Object[] { "account", "login_verification_request" }).a("lv_id", this.a.a).a("challenge_response", this.a.b).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (!httpOperation.j()) {
            this.e = ae.a((List)bg.a());
        }
    }
    
    public int[] b() {
        return this.e;
    }
    
    protected bg e() {
        return bg.a(43);
    }
}
