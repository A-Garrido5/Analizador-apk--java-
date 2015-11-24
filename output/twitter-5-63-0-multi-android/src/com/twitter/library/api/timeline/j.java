// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.y;

public class j extends y
{
    private final long a;
    
    public j(final Context context, final Session session, final long a) {
        super(context, j.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected void a_(final aa aa) {
        final bg v = this.V();
        final b w = this.W();
        v.f(this.a, w);
        w.a();
    }
}
