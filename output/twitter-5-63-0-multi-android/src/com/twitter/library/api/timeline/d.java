// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.api.bb;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

public class d extends i
{
    private final String a;
    private final int e;
    
    public d(final Context context, final Session session, final String a, final int e) {
        super(context, d.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final bb bb = (bb)bg.a();
            if (bb != null) {
                String s = null;
                String s2 = null;
                switch (this.e) {
                    default: {
                        s = bb.d;
                        s2 = bb.e;
                        break;
                    }
                    case 1: {
                        s2 = bb.e;
                        s = null;
                        break;
                    }
                    case 2: {
                        s = bb.d;
                        s2 = null;
                        break;
                    }
                }
                final b w = this.W();
                this.V().a(bb.a, bb.b, bb.c, this.P().c, 5, this.a, s, s2, this.e == 2 && bb.c.isEmpty(), w);
                w.a();
            }
        }
        aa.a(httpOperation);
    }
    
    @Override
    protected f b() {
        final long c = this.P().c;
        final f a = this.M().a("beta", "timelines", "timeline").a("pc", "true").a("id", this.a);
        switch (this.e) {
            case 1: {
                final String b = this.V().b(10, 5, c, this.a);
                if (b != null) {
                    a.a("min_position", b);
                    break;
                }
                break;
            }
            case 2: {
                final String b2 = this.V().b(9, 5, c, this.a);
                if (b2 != null) {
                    a.a("max_position", b2);
                    break;
                }
                break;
            }
        }
        return a.a("include_cards", true).b();
    }
    
    protected bg e() {
        return bg.a(57);
    }
}
