// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.data;

import com.twitter.library.api.RateLimit;
import java.util.Iterator;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.api.bd;
import java.util.List;
import com.twitter.library.network.a;
import android.accounts.AccountManager;
import com.twitter.library.api.bg;
import com.twitter.library.network.t;
import com.twitter.library.network.ae;
import com.twitter.library.api.search.j;
import android.content.Context;
import com.twitter.library.network.OAuthToken;
import android.os.AsyncTask;

@Deprecated
class b extends AsyncTask
{
    private f a;
    private OAuthToken b;
    private g c;
    private Context d;
    private WidgetDataUpdateService$FetchType e;
    
    public b(final Context d, final f a, final OAuthToken b, final WidgetDataUpdateService$FetchType e, final g c) {
        this.d = d;
        this.a = a;
        this.c = c;
        this.b = b;
        this.e = e;
    }
    
    protected j a(final Void... array) {
        final ae a = ae.a(this.d);
        final t t = new t(this.b);
        final StringBuilder append = new StringBuilder(ae.a(a.d, "1.1", "discover", "universal")).append(".json");
        ae.a(append, "include_user_entities", true);
        final bg a2 = bg.a(28);
        final long userId = com.twitter.android.samsung.model.g.a(AccountManager.get(this.d), com.twitter.android.samsung.model.g.a(this.d, this.a.a)).userId;
        final com.twitter.library.provider.bg a3 = com.twitter.library.provider.bg.a(this.d, userId);
        final long d = a3.d(userId, 19);
        switch (com.twitter.android.samsung.data.c.a[this.e.ordinal()]) {
            case 1: {
                final String a4 = a3.a(6, 19, userId, d);
                if (a4 != null) {
                    ae.a(append, "next_cursor", a4);
                    break;
                }
                break;
            }
            case 2:
            case 3: {
                final String a5 = a3.a(5, 19, userId);
                if (a5 != null) {
                    ae.a(append, "prev_cursor", a5);
                    break;
                }
                break;
            }
        }
        final HttpOperation c = new com.twitter.library.network.g(this.d, append).a(t).a("Investigation required. ANDFRAME-407").a(a2).a().c();
        if (c.j()) {
            final j j = (j)a2.a();
            a3.a(j, userId, false, false, true, 0L, 0L, true, null);
            return j;
        }
        final List list = (List)a2.a();
        if (list != null) {
            for (final bd bd : list) {
                if (bd.a == 88) {
                    final RateLimit a6 = ae.a(c);
                    if (a6 == null) {
                        continue;
                    }
                    this.c.a(a6.b);
                }
                else {
                    this.c.a(bd.a, bd.b, null);
                }
            }
        }
        return null;
    }
    
    protected void a(final j j) {
        // monitorenter(this)
        if (j == null) {
            return;
        }
        try {
            this.c.a(j);
        }
        finally {
        }
        // monitorexit(this)
    }
}
