// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.library.provider.bg;
import java.util.Iterator;
import com.twitter.library.provider.b;
import java.util.List;
import com.twitter.library.util.bm;
import java.util.Collection;
import com.twitter.library.api.search.r;
import com.twitter.library.api.TwitterTopic;
import com.twitter.library.api.search.s;
import com.twitter.library.api.search.u;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.service.c;

public class al extends c
{
    private final boolean a;
    private final String e;
    private final int f;
    private final String g;
    private final String h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private int l;
    private boolean m;
    private boolean r;
    private boolean s;
    private boolean t;
    private ArrayList u;
    private ArrayList v;
    
    public al(final Context context, final Session session) {
        this(context, session, false);
    }
    
    public al(final Context context, final Session session, final boolean b) {
        this(context, session, true, "", 0, "", "top", true, true, true, b, true);
    }
    
    public al(final Context context, final Session session, final boolean a, final String e, final int f, final String g, final String h, final boolean i, final boolean j, final boolean k, final boolean r, final boolean t) {
        super(context, al.class.getName(), session);
        this.u = new ArrayList();
        this.v = new ArrayList();
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.r = r;
        this.t = t;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "trends", "plus" });
        if (this.a) {
            a.a("pc", this.a);
        }
        if (!TextUtils.isEmpty((CharSequence)this.e)) {
            a.a("debug_str", this.e);
        }
        if (this.f > 0) {
            a.a("debug_lvl", this.f);
        }
        if (!TextUtils.isEmpty((CharSequence)this.g)) {
            a.a("experiments", this.g);
        }
        if (this.l > 0) {
            a.a("max_trends", this.l);
        }
        if (!TextUtils.isEmpty((CharSequence)this.h)) {
            a.a("tr_img", this.h);
        }
        if (this.i) {
            a.a("tr_desc", this.i);
        }
        if (this.j) {
            a.a("tr_ctx_rel", this.j);
        }
        if (this.k) {
            a.a("tr_ctx_cnt", this.k);
        }
        if (this.t) {
            a.a("tr_empty_ok", this.t);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final u u) {
        if (httpOperation.k()) {
            final s s = (s)u.a();
            if (s != null && s.b != null) {
                this.s = s.a.c;
                final ArrayList<TwitterTopic> list = new ArrayList<TwitterTopic>();
                for (final r r : s.b) {
                    if (r.a == 0 || r.a == 4) {
                        list.add(r.b);
                    }
                }
                this.u.clear();
                this.u.addAll(this.V().a(false));
                this.m = bm.b(this.u, list);
                if (this.m) {
                    bm.a(this.u, list);
                    final boolean q = this.Q();
                    final bg v = this.V();
                    final long c = this.P().c;
                    if (q) {
                        v.a(c, list, q, null, this.f());
                        this.v.clear();
                        this.v.addAll(list);
                        return;
                    }
                    final b w = this.W();
                    v.a(c, list, q, w, this.f());
                    w.a();
                    if (this.r) {
                        this.u.clear();
                        this.u.addAll(list);
                    }
                }
            }
        }
    }
    
    protected u b() {
        return new u();
    }
    
    public boolean e() {
        return this.m;
    }
    
    public boolean f() {
        return this.s;
    }
}
