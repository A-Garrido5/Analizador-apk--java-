// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.util.bk;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

public class y extends i
{
    private final int a;
    private final int e;
    private final long f;
    private int h;
    private long i;
    private long j;
    
    public y(final Context context, final Session session, final int a, final int e, final long i) {
        super(context, y.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = new ab(session).c;
        this.i = i;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final ArrayList list = (ArrayList)bg.a();
            final com.twitter.library.provider.bg a = com.twitter.library.provider.bg.a(this.p, this.f);
            final b w = this.W();
            if (a.a(list, this.f, this.h, w) > 0) {
                a.a(this.a, bk.a());
            }
            w.a();
        }
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(new Object[] { "search", "typeahead" });
        a.a("prefetch", true);
        switch (this.a) {
            default: {
                throw new IllegalArgumentException("Invalid type: " + this.a);
            }
            case 1: {
                a.a("result_type", "users");
                a.a("users_cache_age", this.j);
                a.a("media_tagging_in_prefetch", true);
                this.h = 1;
                break;
            }
            case 4: {
                a.a("result_type", "oneclick");
                a.a("oneclick_cache_age", this.j);
                this.h = 5;
                break;
            }
        }
        if (this.e > 0) {
            a.a("count", this.e);
        }
        return a;
    }
    
    @Override
    protected boolean b(final aa aa) {
        final long d = com.twitter.library.provider.bg.a(this.p, this.f).d(this.a);
        if (bk.a() > d + this.i) {
            if (d > 0L) {
                this.j = bk.d(d);
            }
            else {
                this.j = -1L;
            }
            return true;
        }
        return false;
    }
    
    public int e() {
        return this.a;
    }
    
    protected bg f() {
        return bg.a(16);
    }
}
