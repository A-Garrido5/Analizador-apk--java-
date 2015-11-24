// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class v extends c
{
    private static final String[] a;
    private final String e;
    
    static {
        a = new String[] { "follow", "unfollow" };
    }
    
    public v(final Context context, final Session session, final String e) {
        super(context, v.class.getName(), session);
        this.e = e;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("timelines", "custom", v.a[this.O()]).a("id", this.e).a();
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        if (httpOperation.k()) {
            final long c = this.P().c;
            int n;
            if (this.O() == 0) {
                n = 1;
            }
            else {
                n = 2;
            }
            final bg v = this.V();
            final b w = this.W();
            v.a(this.e, c, n, w);
            if (n == 2) {
                v.b(c, this.e, w);
            }
            w.a();
        }
    }
    
    @Override
    protected d h() {
        return null;
    }
}
