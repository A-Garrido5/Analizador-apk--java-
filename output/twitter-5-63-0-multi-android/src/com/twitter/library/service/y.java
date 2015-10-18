// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.service;

import com.twitter.library.client.App;
import android.os.Parcelable;
import com.twitter.internal.android.service.x;
import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import android.text.TextUtils;
import com.twitter.library.client.Session;
import com.twitter.internal.android.service.c;
import com.twitter.library.resilient.g;
import com.twitter.library.client.ad;
import com.twitter.library.featureswitch.d;
import com.twitter.library.network.ae;
import android.content.Context;
import android.os.Bundle;
import com.twitter.library.client.as;
import com.twitter.internal.android.service.a;

public abstract class y extends a
{
    private final as a;
    private int e;
    private boolean f;
    private String g;
    private int h;
    private ab i;
    public final Bundle o;
    protected final Context p;
    protected final ae q;
    
    protected y(final Context context, final String s) {
        super(s);
        this.g = "Proxying app visibility from request.";
        this.o = new Bundle();
        this.p = context.getApplicationContext();
        this.q = ae.a(context);
        this.a = as.a(context);
        this.a(new l().a(new r(1)).a(new m(context)));
        this.a(1);
        if (com.twitter.library.featureswitch.d.f("set_polling_header_using_visibility_enabled")) {
            this.f = !ad.a().b();
        }
        else {
            this.f = false;
        }
        if (this instanceof com.twitter.library.resilient.a && com.twitter.library.featureswitch.d.a("pending_tweet_ui2_3297", new String[] { "enabled" })) {
            this.a(com.twitter.library.resilient.g.a(this.p));
        }
    }
    
    protected y(final Context context, final String s, final Session session) {
        this(context, s);
        if (session != null) {
            this.i = new ab(session);
        }
    }
    
    protected y(final Context context, final String s, final ab i) {
        this(context, s);
        this.i = i;
    }
    
    static void c(final String s, final String s2) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            throw new IllegalArgumentException(s2);
        }
    }
    
    public final int O() {
        return this.e;
    }
    
    public final ab P() {
        return this.i;
    }
    
    public final boolean Q() {
        return this.f;
    }
    
    public final int R() {
        return this.h;
    }
    
    public final aa S() {
        try {
            return this.U();
        }
        catch (InterruptedException ex) {
            final aa aa = new aa();
            aa.a(false);
            return aa;
        }
    }
    
    protected aa T() {
        final aa aa = new aa();
        aa.a(false);
        return aa;
    }
    
    protected final aa U() {
        final aa aa = new aa();
        if (this.c(aa)) {
            this.a_(aa);
        }
        return aa;
    }
    
    public final bg V() {
        if (this.i == null) {
            throw new IllegalStateException("Session is null when accessing DB. Did you forget to pass in a Session to the constructor?");
        }
        return bg.a(this.p, this.i.c);
    }
    
    protected final b W() {
        return new b(this.p.getContentResolver());
    }
    
    public boolean X() {
        final x l = this.l();
        return l != null && l.b() != null && ((aa)l.b()).a();
    }
    
    protected final com.twitter.library.network.g a(final Context context, final CharSequence charSequence) {
        final com.twitter.library.network.g g = new com.twitter.library.network.g(context, charSequence);
        if (this.Q()) {
            return g.a(this.g);
        }
        return g.b(this.g);
    }
    
    public final y a(final Bundle bundle) {
        this.o.putAll(bundle);
        return this;
    }
    
    public final y a(final y y) {
        if (y.Q()) {
            this.j(y.g);
            return this;
        }
        this.k(y.g);
        return this;
    }
    
    public final y a(final String s, final int n) {
        this.o.putInt(s, n);
        return this;
    }
    
    public final y a(final String s, final Parcelable parcelable) {
        this.o.putParcelable(s, parcelable);
        return this;
    }
    
    public final y a(final String s, final boolean b) {
        this.o.putBoolean(s, b);
        return this;
    }
    
    public final y a(final String s, final int[] array) {
        this.o.putIntArray(s, array);
        return this;
    }
    
    protected abstract void a_(final aa p0);
    
    public final y b(final String s, final long n) {
        this.o.putLong(s, n);
        return this;
    }
    
    public final y b(final String s, final String s2) {
        this.o.putString(s, s2);
        return this;
    }
    
    protected final void b(final a a) {
        this.a.a(a);
    }
    
    protected boolean c(final aa aa) {
        return true;
    }
    
    public final y g(final int e) {
        this.e = e;
        return this;
    }
    
    public final y h(final int h) {
        this.h = h;
        return this;
    }
    
    public final y j(final String g) {
        if (App.a()) {
            c(g, "Cannot force polling without a reason");
        }
        this.g = g;
        this.f = true;
        return this;
    }
    
    public final y k(final String g) {
        if (App.a()) {
            c(g, "Cannot force non-polling without a reason");
        }
        this.g = g;
        this.f = false;
        return this;
    }
}
