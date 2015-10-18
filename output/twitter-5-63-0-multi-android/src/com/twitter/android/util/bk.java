// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.provider.bg;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.p;

class bk extends p
{
    public bk(final Context context, final Session session) {
        super(context, bk.class.getName(), session);
    }
    
    @Override
    protected void a() {
        final bg t = this.t();
        final long c = this.h().c;
        t.g(c, 1);
        t.g(c, 0);
        t.g(c, 2);
        t.g(c, 3);
        t.g(c, 4);
        t.a(c, 1, -1L);
    }
}
