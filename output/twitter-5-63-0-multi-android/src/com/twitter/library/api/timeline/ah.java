// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import android.os.Bundle;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.bp;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class ah extends ak
{
    private final long a;
    
    public ah(final Context context, final Session session, final long a) {
        super(context, ah.class.getName(), session);
        this.a = a;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final Bundle c = aa.c;
            final bp bp = (bp)bg.a();
            final ArrayList<bp> list = new ArrayList<bp>(1);
            list.add(bp);
            c.putLong("status_id", bp.a);
            final b w = this.W();
            final int size = this.V().a(list, this.P().c, 10, -1L, false, false, true, null, true, w, true).size();
            w.a();
            c.putInt("scribe_item_count", size);
        }
    }
    
    protected bg e() {
        return bg.a(2);
    }
    
    @Override
    protected f g() {
        return this.M().a(new Object[] { "statuses", "show" }).a("id", this.a);
    }
}
