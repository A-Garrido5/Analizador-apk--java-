// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class z extends d
{
    private static final String a;
    private boolean e;
    
    static {
        a = z.class.getName();
    }
    
    public z(final Context context, final Session session) {
        super(context, z.a, session);
        this.e = false;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final q q = (q)bg.a();
            final b w = this.W();
            final com.twitter.library.provider.bg v = this.V();
            v.a(q, false, w);
            w.a();
            v.a(13, 0, this.P().c, 0L, String.valueOf(q.e()));
            final DMPaginationStatus a = DMPaginationStatus.a;
            final DMPaginationStatus b = q.b;
            boolean e = false;
            if (a == b) {
                e = true;
            }
            this.e = e;
            return;
        }
        this.e = true;
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(new Object[] { "dm", "user_inbox" }).b().a("include_cards", true).a("dm_users", true).a("include_groups", true);
        try {
            a.a("max_id", Long.parseLong(this.V().a(13, 0, this.P().c)));
            return a;
        }
        catch (NumberFormatException ex) {
            return a;
        }
    }
    
    @Override
    protected boolean c(final aa aa) {
        boolean b = true;
        if (!this.e()) {
            aa.a(b);
            b = false;
        }
        else if (!ak.a(this.p)) {
            new ai(this.p, this.P()).S();
            return b;
        }
        return b;
    }
    
    public boolean e() {
        return !this.e;
    }
    
    protected bg f() {
        return bg.a(71);
    }
}
