// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.j;
import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.library.network.g;
import com.twitter.library.featureswitch.d;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.List;
import com.twitter.library.service.y;

public class e extends y
{
    private List a;
    
    public e(final Context context, final Session session) {
        super(context, e.class.getName(), session);
    }
    
    public List a() {
        return this.a;
    }
    
    @Override
    protected void a_(final aa aa) {
        final String g = com.twitter.library.featureswitch.d.g("avatar_set_href");
        final bg a = bg.a(58);
        final HttpOperation c = new g(this.p, g).a(new t(this.P().d)).a(a).a().c();
        if (c.j()) {
            this.a = (List)a.a();
        }
        aa.a(c);
    }
}
