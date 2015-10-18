// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.library.api.search.n;
import com.twitter.library.api.search.p;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import java.util.Locale;
import com.twitter.library.service.f;
import com.twitter.util.i;
import java.util.TimeZone;
import com.twitter.library.service.e;
import com.twitter.library.api.UserSettings;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class am extends c
{
    private final String a;
    private final long e;
    private boolean f;
    
    public am(final Context context, final Session session, final String a) {
        super(context, am.class.getName(), session);
        this.a = a;
        final UserSettings j = session.j();
        if (j != null) {
            this.e = j.a;
            return;
        }
        this.e = 1L;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "trends", "timeline" }).a("woeid", this.e).a("timezone", TimeZone.getDefault().getID());
        final Locale locale = this.p.getResources().getConfiguration().locale;
        if (locale != null) {
            a.a("lang", com.twitter.util.i.b(locale));
        }
        if (this.a != null && !this.a.equals("TREND")) {
            a.a("trend_types", this.a);
        }
        return a.a("pc", "true").a("include_media_features", true).a("include_cards", true).b().a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final p p3) {
        if (httpOperation.k()) {
            final n n = (n)p3.a();
            if (n.b != null) {
                final b w = this.W();
                this.V().a(this.P().c, n.b, this.a, w);
                w.a();
            }
            if (n.a != null) {
                this.f = n.a.c;
            }
        }
    }
    
    public boolean b() {
        return this.f;
    }
    
    protected p e() {
        return new p();
    }
}
