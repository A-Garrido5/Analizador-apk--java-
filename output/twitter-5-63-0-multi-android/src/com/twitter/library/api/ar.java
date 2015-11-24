// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.library.service.g;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.scribe.ScribeLog;
import com.twitter.library.scribe.ScribeService;
import com.twitter.library.service.aa;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.m;
import com.twitter.library.service.r;
import com.twitter.internal.android.service.y;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.l;
import com.twitter.library.service.c;

public abstract class ar extends c
{
    private final l a;
    
    protected ar(final Context context, final String s, final Session session) {
        this(context, s, new ab(session));
    }
    
    protected ar(final Context context, final String s, final Session session, final com.twitter.internal.android.service.y y) {
        super(context, s, new ab(session));
        this.a(this.a = new l().a(y));
    }
    
    protected ar(final Context context, final String s, final ab ab) {
        super(context, s, ab);
        this.a(this.a = new l().a(new r(1)).a(new m(context)));
    }
    
    public static void a(final Context context, final String s, final long n, final boolean b, final x x, final boolean b2) {
        if (s == null || x == null || x.b() == null) {
            return;
        }
        final int n2 = -1 + x.a().size();
        String s2;
        if (b) {
            s2 = "success";
        }
        else if (b2) {
            s2 = "retry";
        }
        else {
            s2 = "failure";
        }
        final TwitterScribeLog twitterScribeLog = (TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(n).b(new String[] { s, s2 })).a((long)n2);
        final com.twitter.internal.network.l f = ((aa)x.b()).f();
        final HttpOperation e = ((aa)x.b()).e();
        if (f != null) {
            TwitterScribeLog.a(context, twitterScribeLog, f);
            twitterScribeLog.a(e.i().toString(), f);
        }
        ScribeService.a(context, twitterScribeLog);
    }
    
    @Override
    public void a(final x x) {
        if (!this.isCancelled()) {
            this.a(x, false);
        }
    }
    
    protected void a(final x x, final boolean b) {
        a(this.p, this.b(), this.P().c, this.d(x), x, b);
    }
    
    protected void a(final g g) {
        if (g != null) {
            this.a.a(g);
        }
    }
    
    public abstract String b();
    
    @Override
    public void b(final x x) {
        this.a(x, true);
    }
    
    protected boolean d(final x x) {
        return ((aa)x.b()).a();
    }
}
