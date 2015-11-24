// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import android.text.TextUtils;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;

public class ai extends d
{
    private static final String a;
    
    static {
        a = ai.class.getName();
    }
    
    public ai(final Context context, final Session session) {
        super(context, ai.a, session);
    }
    
    public ai(final Context context, final ab ab) {
        super(context, ai.a, ab);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final q q = (q)bg.a();
            if (q != null) {
                final com.twitter.library.provider.bg v = this.V();
                final b w = this.W();
                switch (aj.a[q.d().ordinal()]) {
                    case 1: {
                        v.a(q, true, w);
                        break;
                    }
                    case 2: {
                        v.a(q, w);
                        v.a(13, 0, this.P().c, 0L, String.valueOf(q.e()));
                        break;
                    }
                }
                w.a();
                v.a(12, 0, this.P().c, 0L, q.a);
            }
        }
    }
    
    @Override
    protected f b() {
        final com.twitter.library.provider.bg v = this.V();
        final long c = this.P().c;
        final f a = this.M().a(new Object[] { "dm", "user_updates" }).b().a("include_cards", true).a("dm_users", true).a("include_groups", true);
        if (!ak.a(this.p)) {
            v.a((q)null);
            ak.b(this.p);
        }
        if (v.f() < 2000) {
            final String a2 = v.a(12, 0, c);
            if (!TextUtils.isEmpty((CharSequence)a2)) {
                a.a("inbox_min_id", v.a(13, 0, c)).a("cursor", a2);
            }
        }
        return a;
    }
    
    protected bg e() {
        return bg.a(75);
    }
}
