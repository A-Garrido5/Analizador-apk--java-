// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.provider.b;
import android.text.TextUtils;
import com.twitter.library.api.search.j;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.provider.bg;
import com.twitter.library.service.c;

public class p extends c
{
    private String a;
    private int e;
    private final bg f;
    private boolean g;
    private long h;
    private final long i;
    private final long j;
    private final int k;
    private boolean l;
    
    public p(final Context context, final Session session, final int k, final long i, final long h) {
        super(context, p.class.getName(), session);
        this.h = h;
        this.i = i;
        this.k = k;
        this.j = session.g();
        this.f = this.V();
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "discover", "universal" });
        switch (this.k) {
            default: {
                this.e = -1;
                this.a = null;
                break;
            }
            case 2: {
                this.e = 6;
                this.a = this.f.a(this.e, 19, this.j, this.i);
                if (this.a != null) {
                    a.a("next_cursor", this.a);
                    final long n = lcmp(this.i, 0L);
                    boolean g = false;
                    if (n > 0) {
                        g = true;
                    }
                    this.g = g;
                    break;
                }
                break;
            }
            case 0:
            case 1: {
                this.e = 5;
                this.a = this.f.a(this.e, 19, this.j);
                if (this.a != null) {
                    a.a("prev_cursor", this.a);
                    final int k = this.k;
                    boolean l = false;
                    if (k == 1) {
                        l = true;
                    }
                    this.l = l;
                    break;
                }
                break;
            }
        }
        a.a("include_media_features", true);
        a.a("include_user_entities", true);
        a.b();
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final com.twitter.library.api.bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            final j j = (j)bg.a();
            final boolean b = this.k == 2;
            final boolean b2 = b && ("".equals(j.c) || j.a.isEmpty());
            final boolean b3 = (this.g || this.l) && !TextUtils.isEmpty((CharSequence)j.c);
            final b w = this.W();
            final int a = this.f.a(j, this.j, b, b2, b3, this.h, this.i, true, w);
            w.a();
            this.o.putInt("count", a);
            aa.c.putInt("scribe_item_count", a);
        }
        else {
            switch (httpOperation.l().a) {
                default: {}
                case 400:
                case 413:
                case 414: {
                    if (this.e != -1 && this.a != null) {
                        this.f.a(this.j, 19, this.e, this.i);
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    protected com.twitter.library.api.bg b() {
        return com.twitter.library.api.bg.a(28);
    }
}
