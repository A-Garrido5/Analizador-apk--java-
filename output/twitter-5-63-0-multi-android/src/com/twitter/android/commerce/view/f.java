// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.commerce.view;

import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Iterator;
import com.twitter.android.commerce.util.c;
import com.twitter.library.api.at;
import java.util.ArrayList;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.bb;
import com.twitter.library.api.timeline.d;

public class f extends d
{
    bb a;
    private final String e;
    private final int f;
    
    public f(final Context context, final Session session, final String e, final int f) {
        super(context, session, e, f);
        this.e = e;
        this.f = f;
    }
    
    protected ArrayList a(final ArrayList list) {
        final ArrayList<at> list2 = new ArrayList<at>();
        for (final at at : list) {
            if (at.e != null && at.e.v != null && com.twitter.android.commerce.util.c.a.contains(at.e.v.cardInstanceData.name)) {
                list2.add(at);
            }
        }
        return list2;
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final bb a = (bb)bg.a();
            if ((this.a = a) != null) {
                String s = null;
                String s2 = null;
                switch (this.f) {
                    default: {
                        s = a.d;
                        s2 = a.e;
                        break;
                    }
                    case 1: {
                        s2 = a.e;
                        s = null;
                        break;
                    }
                    case 2: {
                        s = a.d;
                        s2 = null;
                        break;
                    }
                }
                final b w = this.W();
                this.V().a(a.a, a.b, this.a(a.c), this.P().c, 5, this.e, s, s2, this.f == 2 && a.c.isEmpty(), w);
                w.a();
            }
        }
        aa.a(httpOperation);
    }
}
