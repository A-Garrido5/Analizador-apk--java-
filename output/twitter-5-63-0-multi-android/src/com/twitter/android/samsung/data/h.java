// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import com.twitter.library.api.RateLimit;
import java.util.Iterator;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.bd;
import java.util.List;
import com.twitter.android.samsung.single.i;
import com.twitter.internal.network.j;
import com.twitter.library.api.bg;
import com.twitter.library.network.ae;
import android.content.Context;
import android.os.AsyncTask;

@Deprecated
public class h extends AsyncTask
{
    private Context a;
    private String b;
    private g c;
    private long d;
    
    h(final Context a, final f f, final long d, final String b, final g c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    protected Long a(final Void... array) {
        final String b = this.b;
        final StringBuilder append = ae.a(ae.a(this.a).d, "1.1", "search", "tweets").append(".json");
        ae.a(append, "q", b);
        ae.a(append, "count", 20);
        ae.a(append, "include_entities", true);
        final bg a = bg.a(59);
        final com.twitter.library.network.g a2 = new com.twitter.library.network.g(this.a, append).a(a);
        a2.b("Investigation required. ANDFRAME-407");
        final HttpOperation a3 = a2.a();
        a3.a("Authorization", "Bearer " + i.e(this.a));
        a3.a("X-Guest-Token", i.d(this.a));
        a3.c();
        if (a3.j()) {
            com.twitter.android.samsung.data.j.a(this.a, (List)a.a());
            return this.d;
        }
        final List list = (List)a.a();
        if (list != null) {
            for (final bd bd : list) {
                if (bd.a == 88) {
                    final RateLimit a4 = ae.a(a3);
                    if (a4 == null) {
                        continue;
                    }
                    this.c.a(a4.b);
                }
                else {
                    this.c.a(bd.a, bd.b, null);
                }
            }
        }
        return null;
    }
    
    protected void a(final Long n) {
        if (n != null) {
            this.c.a(n);
        }
    }
}
