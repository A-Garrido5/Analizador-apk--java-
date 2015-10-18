// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Iterator;
import com.twitter.library.provider.b;
import com.twitter.library.provider.ag;
import android.net.Uri;
import java.util.Collection;
import com.twitter.library.api.search.TwitterSearchQuery;
import java.util.ArrayList;
import com.twitter.library.client.Session;
import android.content.Context;

public class i extends k
{
    private final long a;
    
    public i(final Context context, final Session session, final long a) {
        super(context, session, i.class.getName());
        this.a = a;
    }
    
    private void a(final bg bg) {
        final ArrayList list = (ArrayList)bg.a();
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        v.a(list, 7, w);
        final ArrayList list2 = new ArrayList();
        for (final TwitterSearchQuery twitterSearchQuery : list) {
            if (twitterSearchQuery.i != null) {
                list2.addAll(twitterSearchQuery.i);
            }
        }
        long a;
        if (this.a > 0L) {
            a = this.a;
        }
        else {
            a = 0L;
        }
        v.a(list2, a, -1, -1L, null, null, true, w);
        for (int i = 0; i < list.size(); ++i) {
            final TwitterSearchQuery twitterSearchQuery2 = list.get(i);
            if (twitterSearchQuery2.i != null) {
                v.a(twitterSearchQuery2.i, a, 6, i, twitterSearchQuery2.b.hashCode(), null, w);
            }
        }
        w.a(ag.a);
        w.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.a(bg);
        }
    }
    
    @Override
    protected f b() {
        final f b = super.b();
        b.a("show_members", true).a("max_members", 6L);
        return b;
    }
    
    protected bg e() {
        return bg.a(5);
    }
}
