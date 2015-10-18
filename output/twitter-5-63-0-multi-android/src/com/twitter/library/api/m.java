// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.d;
import com.twitter.library.util.ar;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class m extends c
{
    private boolean a;
    
    public m(final Context context, final Session session) {
        super(context, m.class.getName(), session);
        if (session == null) {
            throw new IllegalArgumentException("Session cannot be null");
        }
        this.j("Not triggered by a user action.");
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "account", "verify_credentials" }).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            this.a = (boolean)bg.a();
        }
        ar.a(this.p).a(this.a, false);
    }
    
    protected bg b() {
        return bg.a(80);
    }
    
    public boolean e() {
        return this.a;
    }
}
