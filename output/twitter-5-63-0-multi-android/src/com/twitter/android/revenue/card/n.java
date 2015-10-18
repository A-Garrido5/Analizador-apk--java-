// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.library.client.av;
import com.twitter.library.client.as;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.android.service.x;
import com.twitter.library.service.aa;
import com.twitter.library.service.y;
import android.os.Bundle;
import java.util.Locale;
import com.twitter.library.service.f;
import android.net.Uri;
import com.twitter.library.network.a;
import com.twitter.library.network.t;
import com.twitter.util.i;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.az;
import com.twitter.library.provider.Tweet;
import com.twitter.library.service.z;
import android.content.Context;
import java.util.Map;
import com.twitter.library.client.au;
import com.twitter.library.service.c;

class n extends c implements au
{
    private static final Map a;
    private Context e;
    private o f;
    private z g;
    private String h;
    private long i;
    private String j;
    private String k;
    
    static {
        a = new LeadSubmissionTask$1(5, 0.75f, true);
    }
    
    n(final Context e, final String j, final Tweet tweet, final o f) {
        super(e, n.class.getName(), az.a(e).b());
        this.e = e;
        this.j = j;
        this.i = tweet.Q;
        String impressionId;
        if (tweet.j != null) {
            impressionId = tweet.j.impressionId;
        }
        else {
            impressionId = null;
        }
        this.h = impressionId;
        this.f = f;
    }
    
    static boolean a(final long n) {
        return n.a.containsKey(n);
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a((String)null);
        if (this.h != null) {
            a.a("impression_id", this.h);
        }
        a.a("tweet_id", this.i);
        final Locale locale = this.e.getResources().getConfiguration().locale;
        if (locale != null) {
            a.a("lang", com.twitter.util.i.b(locale));
        }
        a.a(new t(az.a(this.e).b().h()));
        final Uri parse = Uri.parse(this.j);
        a.c(parse.getScheme()).b(parse.getAuthority()).b(new Object[] { parse.getPath() });
        return a.a();
    }
    
    @Override
    public void a(final int n, final Bundle bundle, final y y) {
    }
    
    @Override
    public void a(final int n, final y y) {
        final x l = y.l();
        aa aa;
        if (l != null) {
            aa = (aa)l.b();
        }
        else {
            aa = null;
        }
        final boolean b = aa != null && aa.a();
        if (b) {
            n.a.put(this.i, this.i);
        }
        final o f = this.f;
        if (f != null) {
            f.a(b, this.k);
        }
        this.g();
        this.f = null;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.k = (String)bg.a();
        }
    }
    
    protected bg b() {
        return bg.a(95);
    }
    
    @Override
    public void b(final int n, final y y) {
    }
    
    void e() {
        as.a(this.e).a(this, this.g = new av(0, this));
    }
    
    void f() {
        this.g();
        this.f = null;
    }
    
    void g() {
        as.a(this.e).b(this.g);
    }
}
