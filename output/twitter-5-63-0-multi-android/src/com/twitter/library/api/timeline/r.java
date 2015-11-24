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

public class r extends ak
{
    private final long a;
    private final int e;
    
    public r(final Context context, final Session session, final long a, final int e) {
        super(context, r.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final ArrayList list = (ArrayList)bg.a();
            String string;
            if (this.e > 0 && list.size() > 0) {
                string = Long.toString(list.get(-1 + list.size()).a);
            }
            else {
                string = null;
            }
            final b w = this.W();
            this.V().a(list, this.a, 2, -1L, false, this.e > 0, string == null, string, true, w, true);
            w.a();
        }
    }
    
    protected bg e() {
        return bg.a(1);
    }
    
    @Override
    protected f g() {
        final f a = this.M().a(new Object[] { "favorites", "list" }).a("id", this.a);
        if (this.e > 0) {
            a.a("page", this.e);
        }
        return a;
    }
}
