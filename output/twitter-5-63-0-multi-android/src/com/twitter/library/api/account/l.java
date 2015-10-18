// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.j;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import android.content.Context;
import com.twitter.library.api.bg;
import com.twitter.internal.android.service.d;
import com.twitter.library.service.y;

public class l extends y
{
    protected final d a;
    private final String e;
    private final bg f;
    private String g;
    
    public l(final Context context, final String e) {
        super(context, k.class.getName());
        this.e = e;
        this.f = bg.a(54);
        this.a = new d();
    }
    
    public String a() {
        return this.g;
    }
    
    @Override
    protected void a_(final aa aa) {
        final HttpOperation a = this.a(this.p, ae.a(this.q.d, "1.1", "guest", "activate").append(".json")).a(HttpOperation$RequestMethod.b).a(this.f).a(this.a).a();
        ae.a(a, "Authorization", "Bearer " + this.e);
        if (a.c().k()) {
            this.g = (String)this.f.a();
        }
        aa.a(a);
    }
    
    @Override
    public d m() {
        return this.a;
    }
}
