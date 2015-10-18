// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.network.ae;
import com.twitter.library.service.d;
import java.util.ArrayList;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;

public class l extends f
{
    private long h;
    private int i;
    private int j;
    private String k;
    private String l;
    
    public l(final Context context, final Session session, final long n, final String s, final int n2) {
        this(context, new ab(session), n, s, n2);
    }
    
    public l(final Context context, final ab ab, final long h, final String s, final int i) {
        super(context, l.class.getName(), ab, s);
        this.k = "-1";
        this.l = "0";
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            if (this.f == null) {
                httpOperation.l().a = 0;
            }
            else if (this.P() != null) {
                final b w = this.W();
                final com.twitter.library.provider.bg v = this.V();
                final ArrayList f = this.f;
                long n;
                if (this.h > 0L) {
                    n = this.h;
                }
                else {
                    n = this.P().c;
                }
                final int a = v.a(f, n, 6, this.a.hashCode(), this.k, this.l, true, w);
                w.a();
                this.j = a;
            }
        }
    }
    
    public void a(final String k) {
        this.k = k;
    }
    
    @Override
    protected com.twitter.library.service.f b() {
        final com.twitter.library.service.f a = super.b().a("include_user_entities", true);
        if (this.i >= 0) {
            a.a("max_members", this.i);
        }
        ae.a(this.p).a(a);
        return a;
    }
    
    public void b(final String l) {
        this.l = l;
    }
    
    public int f() {
        return this.j;
    }
    
    public String g() {
        return this.e;
    }
}
