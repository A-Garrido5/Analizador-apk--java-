// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.util.bk;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class f extends c
{
    private long a;
    
    public f(final Context context, final Session session, final long a) {
        super(context, f.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.a).a(new Object[] { "saved_searches", "list" }).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final ArrayList list = (ArrayList)bg.a();
            final b w = this.W();
            final com.twitter.library.provider.bg v = this.V();
            if (v.a(list, 6, w) > 0) {
                v.a(3, bk.a());
            }
            w.a();
        }
    }
    
    protected bg b() {
        return bg.a(4);
    }
    
    @Override
    protected boolean c(final aa aa) {
        return bk.a() > this.V().d(3) + this.a;
    }
}
