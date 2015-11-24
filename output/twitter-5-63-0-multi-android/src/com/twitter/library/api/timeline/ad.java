// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.p;

public class ad extends p
{
    private final long a;
    private final long e;
    
    public ad(final Context context, final Session session, final long e, final long a) {
        super(context, ad.class.getName(), session);
        this.e = e;
        this.a = a;
    }
    
    @Override
    protected void a() {
        final b u = this.u();
        this.t().e(this.e, this.a, u);
        u.a();
    }
}
