// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.library.api.ba;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

public class e extends c
{
    private final long a;
    private final int e;
    private boolean f;
    
    public e(final Context context, final Session session, final long a, final int e) {
        super(context, e.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    @Override
    protected com.twitter.library.service.e a() {
        final f a = this.M().a("beta", "timelines", "custom", "list");
        if (this.O() == 0) {
            a.a("user_id", this.a);
        }
        else if (this.O() == 1) {
            a.a("followings_by_user_id", this.a);
        }
        final String a2 = this.V().a(11, 0, this.a, this.e);
        if (!TextUtils.isEmpty((CharSequence)a2)) {
            a.a("cursor", a2);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final ba ba = (ba)bg.a();
            int n;
            if (this.O() == 0) {
                n = 0;
            }
            else {
                n = 2;
            }
            final boolean b = this.e == 0;
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            if (!TextUtils.isEmpty((CharSequence)ba.c)) {
                v.a(11, 0, this.a, this.e, ba.c);
            }
            v.a(ba.b, this.P().c, -1, 0L, null, null, true, w);
            v.a(ba.a, this.a, n, b, w);
            final Collection a = v.a(ba.a, w);
            w.a();
            if (this.e == 1) {
                this.f = a.isEmpty();
            }
        }
        aa.a(httpOperation);
    }
    
    public boolean b() {
        return this.f;
    }
    
    protected bg e() {
        return bg.a(63);
    }
}
