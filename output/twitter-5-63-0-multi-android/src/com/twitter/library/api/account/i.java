// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.account;

import com.twitter.library.service.aa;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.service.m;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.Arrays;
import com.twitter.library.service.l;
import com.twitter.library.network.a;
import java.util.Collection;
import com.twitter.library.service.c;

public abstract class i extends c
{
    private static final Collection a;
    private boolean e;
    private com.twitter.library.network.a f;
    boolean g;
    private l h;
    
    static {
        a = Arrays.asList(401, 403);
    }
    
    protected i(final Context context, final String s, final Session session) {
        this(context, s, new ab(session), false);
    }
    
    protected i(final Context context, final String s, final ab ab) {
        this(context, s, ab, false);
    }
    
    protected i(final Context context, final String s, final ab ab, final boolean e) {
        super(context, s, ab);
        this.g = false;
        this.e = false;
        this.e = e;
        if (!ab.b || e) {
            this.a(this.h = new l().a(new j(this, context)).a(new m(context)));
        }
    }
    
    @Override
    protected final e a() {
        return this.b().a(this.v()).a();
    }
    
    protected abstract f b();
    
    protected boolean b(final aa aa) {
        return true;
    }
    
    @Override
    protected final boolean c(final aa aa) {
        if (this.v() == null) {
            aa.a(0, "Failed to obtain any auth for this request");
            return false;
        }
        return this.b(aa);
    }
    
    protected final com.twitter.library.network.a v() {
        if (!this.g) {
            if (this.e) {
                this.f = com.twitter.library.network.e.a(this.p);
            }
            else {
                this.f = com.twitter.library.network.e.a(this.p, this.P());
            }
            this.g = true;
        }
        return this.f;
    }
    
    protected l w() {
        return this.h;
    }
}
