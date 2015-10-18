// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.database.Cursor;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class w extends d
{
    private final String a;
    private long e;
    private boolean f;
    
    public w(final Context context, final Session session, final String a) {
        super(context, w.class.getName(), session);
        this.e = -1L;
        this.f = true;
        this.a = a;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final q q = (q)bg.a();
            final b w = this.W();
            final com.twitter.library.provider.bg v = this.V();
            v.a(q, false, w);
            this.f = (DMPaginationStatus.b == q.b);
            v.c(this.a, this.f, w);
            w.a();
            return;
        }
        this.f = false;
    }
    
    @Override
    protected f b() {
        final f a = this.M().a("dm", "conversation", this.a).b().a("include_cards", true).a("dm_users", true);
        if (this.e != -1L) {
            a.a("max_id", this.e);
        }
        return a;
    }
    
    @Override
    protected boolean c(final aa aa) {
        int f = 1;
        final Cursor e = this.V().e(this.a);
        if (e != null) {
            if (e.moveToFirst()) {
                this.e = e.getLong(0);
                if (e.getInt(f) == 0) {
                    f = 0;
                }
                this.f = (f != 0);
            }
            e.close();
        }
        return f != 0;
    }
    
    public boolean e() {
        return this.f;
    }
    
    protected bg f() {
        return bg.a(72);
    }
}
