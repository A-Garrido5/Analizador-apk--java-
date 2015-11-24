// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import android.content.Context;

public class p extends com.twitter.library.service.p
{
    private final int a;
    private final long e;
    
    public p(final Context context, final Session session, final Tweet tweet) {
        super(context, p.class.getName(), session);
        this.a = tweet.aa;
        this.e = tweet.Z;
    }
    
    @Override
    protected void a() {
        final b u = this.u();
        this.t().a(this.a, new long[] { this.e }, u);
        u.a();
    }
}
