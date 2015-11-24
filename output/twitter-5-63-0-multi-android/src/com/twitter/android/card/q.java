// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.internal.network.l;
import com.twitter.internal.network.HttpOperation;
import java.net.URI;
import com.twitter.library.card.m;
import com.twitter.library.media.manager.ao;
import com.twitter.library.media.manager.h;
import com.twitter.library.provider.Tweet;
import com.twitter.library.client.Session;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.network.g;
import com.twitter.library.network.t;
import com.twitter.library.util.bn;
import com.twitter.library.client.az;
import android.content.Context;
import com.fasterxml.jackson.core.JsonParser;
import java.io.Closeable;
import com.twitter.library.card.k;
import com.twitter.library.api.bh;
import com.twitter.library.card.Card;
import java.io.InputStream;
import com.twitter.library.card.j;
import android.os.AsyncTask;

public class q extends AsyncTask
{
    private ac a;
    private o b;
    private ab c;
    private a d;
    private j e;
    private String f;
    private s g;
    private boolean h;
    
    public q(final ac a, final o b, final ab c, final a d, final boolean h, final j e, final s g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.h = h;
        this.g = g;
    }
    
    private static Card b(final InputStream inputStream) {
        JsonParser a = null;
        try {
            a = bh.a(inputStream);
            return k.a(a);
        }
        finally {
            yh.a(a);
        }
    }
    
    protected Card a(final Void... array) {
        if (!this.isCancelled()) {
            final Context context = (Context)this.d.c.get();
            final Context applicationContext = context.getApplicationContext();
            final CardInstanceData p = this.d.p();
            String s;
            if (this.d.b()) {
                s = p.forwardCardTypeURL;
            }
            else {
                s = p.cardTypeURL;
            }
            final Session b = az.a(context).b();
            final Tweet m = this.d.m();
            final h q = this.d.q();
            final ao r = this.d.r();
            m a;
            if (this.c != null && this.d.e()) {
                a = this.c.a(this.d.l());
            }
            else {
                a = null;
            }
            Card card;
            if (this.b != null && this.d.c()) {
                card = this.b.a(s);
                if (this.isCancelled()) {
                    return null;
                }
            }
            else {
                card = null;
            }
            Card a4 = null;
            Label_0408: {
                if (card == null) {
                    if (this.a != null && this.d.d()) {
                        card = this.a.a(s);
                        if (this.isCancelled()) {
                            return null;
                        }
                    }
                    final Card card2 = card;
                    if (card2 == null) {
                        while (true) {
                            Label_0602: {
                                if (!this.h) {
                                    break Label_0602;
                                }
                                final URI a2 = bn.a(s);
                                if (a2 == null) {
                                    break Label_0602;
                                }
                                final String host = a2.getHost();
                                if (host == null || !host.toLowerCase().endsWith(".twitter.com")) {
                                    break Label_0602;
                                }
                                final com.twitter.library.network.a a3 = new t(b.h());
                                final r r2 = new r();
                                final HttpOperation c = new g(applicationContext, s).b(a3).a(r2).a().c();
                                if (this.isCancelled()) {
                                    return null;
                                }
                                final String string = c.i().toString();
                                if (!c.k()) {
                                    final l l = c.l();
                                    String s2;
                                    if (l.a != 0) {
                                        s2 = l.a + " " + l.b;
                                    }
                                    else if (l.c != null) {
                                        s2 = "Exception: " + l.c.getMessage();
                                    }
                                    else {
                                        s2 = "Unknown";
                                    }
                                    this.f = string + " " + s2;
                                    a4 = card2;
                                    break Label_0408;
                                }
                                if (r2.a == null) {
                                    this.f = string + " " + r2.b;
                                    a4 = card2;
                                    break Label_0408;
                                }
                                if (this.a != null && this.d.d()) {
                                    this.a.a(s, r2.a);
                                }
                                a4 = r2.a;
                                break Label_0408;
                            }
                            final com.twitter.library.network.a a3 = null;
                            continue;
                        }
                    }
                    a4 = card2;
                }
                else {
                    a4 = card;
                }
            }
            if (!this.isCancelled()) {
                if (a4 != null) {
                    a4.a(context, m, q, r, a, this.e, this.d.b());
                }
                return a4;
            }
        }
        return null;
    }
    
    protected void a(final Card card) {
        if (this.g != null) {
            if (card == null) {
                this.g.a(this.f);
                return;
            }
            this.g.a(card);
        }
    }
    
    protected void b(final Card card) {
        if (this.g != null) {
            this.g.a();
        }
    }
}
