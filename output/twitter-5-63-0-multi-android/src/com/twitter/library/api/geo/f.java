// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.geo;

import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import java.util.List;
import java.util.Collection;
import com.twitter.library.api.at;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.bk;
import com.twitter.library.service.c;

public class f extends c
{
    private bk a;
    private final String e;
    private String f;
    private String g;
    private String h;
    private final long i;
    private final boolean j;
    
    private f(final Context context, final Session session, final String e, final long i, final String f, final String g, final String h, final boolean j) {
        super(context, f.class.getName(), session);
        this.e = e;
        this.i = i;
        this.f = f;
        this.g = g;
        this.h = h;
        this.j = j;
    }
    
    @Override
    protected e a() {
        final com.twitter.library.service.f a = this.M().a(new Object[] { "geo", "place_page" }).a("place_id", this.e);
        if (this.g != null) {
            a.a("request_type", this.g);
        }
        if (this.f != null) {
            a.a("cursor", this.f);
        }
        if (this.h != null) {
            a.a("cursor_type", this.h);
        }
        a.a("include_header", this.j);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final o o) {
        if (aa.a()) {
            this.a = (bk)o.a();
            if (this.a != null && this.a.c != null && this.a.c.b != null) {
                final List b = this.a.c.b;
                final bg v = this.V();
                final boolean b2 = this.f != null && b.isEmpty();
                final b w = this.W();
                if (v.a(at.a(b), this.i, 3, this.e, b2, false, 0L, 0L, false, null, true, w) > 0 || b2) {
                    w.a();
                }
            }
        }
    }
    
    protected o b() {
        return new o();
    }
    
    public bk e() {
        return this.a;
    }
}
