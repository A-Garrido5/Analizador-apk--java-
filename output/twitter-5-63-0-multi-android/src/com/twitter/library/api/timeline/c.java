// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

public class c extends i
{
    private final long a;
    private final long e;
    private int f;
    
    public c(final Context context, final Session session, final long a, final long e) {
        super(context, c.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final ArrayList list = (ArrayList)bg.a();
            final b w = this.W();
            this.V().a(list, this.a, 8, this.e, false, true, true, null, true, w, true, true);
            w.a();
        }
    }
    
    @Override
    protected f b() {
        return this.M().a("stations", this.e, "tweets").a("guest", this.a).a("count", this.f).a("page", 0L);
    }
    
    public final c c(final int f) {
        this.f = f;
        return this;
    }
    
    protected bg e() {
        return bg.a(1);
    }
}
