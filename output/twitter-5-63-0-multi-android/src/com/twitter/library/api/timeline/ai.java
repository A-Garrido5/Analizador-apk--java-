// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.f;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import android.os.Bundle;
import com.twitter.library.provider.k;
import com.twitter.library.provider.ax;
import java.util.Collection;
import com.twitter.library.api.bp;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;

public class ai extends ak
{
    private final long a;
    private final int e;
    private boolean f;
    
    public ai(final Context context, final Session session, final long a, final int e) {
        super(context, ai.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    public ai a(final boolean f) {
        this.f = f;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final Bundle c = aa.c;
            final ArrayList list = (ArrayList)bg.a();
            final long h = this.H();
            String string;
            if (h > 0L && list.size() > 0) {
                string = Long.toString(list.get(-1 + list.size()).a);
            }
            else {
                string = null;
            }
            final boolean b = h > 0L;
            final int e = this.e;
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            final int size = v.a(list, this.a, e, -1L, h > 0L, b, string == null, string, true, w, e != 17).size();
            this.d(size);
            if (list.size() >= 100) {
                v.a(this.a, e, -1L, list.get(-1 + list.size()).a);
            }
            if (ax.a(e)) {
                final int f = v.f(this.a, e);
                if (f > 0) {
                    com.twitter.library.provider.k.a(this.p).a(this.P().e, 1, w);
                }
                this.e(f);
            }
            w.a();
            c.putInt("scribe_item_count", size);
        }
    }
    
    protected bg e() {
        return bg.a(null, this.f, false);
    }
    
    @Override
    protected f g() {
        final int e = this.e;
        final f b = this.M().b(new Object[] { "statuses" });
        switch (e) {
            default: {
                throw new IllegalArgumentException("Invalid type: " + e);
            }
            case 1: {
                b.a(new Object[] { "user_timeline" }).a("user_id", this.a).a("include_rts", true).a("earned", true);
                if (this.f) {
                    b.a("pc", true);
                }
                return b;
            }
            case 3:
            case 5:
            case 23:
            case 24:
            case 25: {
                b.a(new Object[] { "mentions_timeline" });
                switch (e) {
                    default: {
                        return b;
                    }
                    case 23: {
                        b.a("filters", "filtered");
                        return b;
                    }
                    case 24: {
                        b.a("filters", "following");
                        return b;
                    }
                    case 25: {
                        b.a("filters", "verified");
                        return b;
                    }
                }
                break;
            }
            case 17: {
                b.a(new Object[] { "media_timeline" }).a("user_id", this.a);
                return b;
            }
        }
    }
}
