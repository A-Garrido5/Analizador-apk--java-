// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.library.api.bp;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class x extends ak
{
    private final long a;
    private final long e;
    
    public x(final Context context, final Session session, final long a, final long e) {
        super(context, x.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final ArrayList list = (ArrayList)bg.a();
            final long h = this.H();
            String string;
            if (h > 0L && list.size() > 0) {
                string = Long.toString(list.get(-1 + list.size()).a);
            }
            else {
                string = null;
            }
            final boolean b = h > 0L;
            final b w = this.W();
            this.V().a(list, this.a, 9, this.e, h > 0L, b, string == null, string, true, w, true);
            w.a();
        }
    }
    
    protected bg e() {
        return bg.a(1);
    }
    
    @Override
    protected f g() {
        return this.M().a(new Object[] { "lists", "statuses" }).a("list_id", this.e).a("include_rts", true);
    }
}
