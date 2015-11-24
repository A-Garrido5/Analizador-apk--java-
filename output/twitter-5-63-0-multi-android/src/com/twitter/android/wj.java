// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.android.card.w;
import android.support.v4.app.Fragment;
import com.twitter.library.api.PromotedEvent;
import android.view.View;
import com.twitter.library.card.j;
import com.twitter.library.card.Card;
import com.twitter.library.widget.tweet.content.d;
import android.graphics.Rect;
import android.content.Context;
import com.twitter.android.card.f;
import com.twitter.android.client.TwitterFragmentActivity;
import com.twitter.android.card.e;
import com.twitter.android.card.a;

class wj extends a
{
    final /* synthetic */ TweetFragment a;
    private final e p;
    
    public wj(final TweetFragment a, final TwitterFragmentActivity twitterFragmentActivity) {
        this.a = a;
        super(twitterFragmentActivity);
        this.p = com.twitter.android.card.f.a();
    }
    
    @Override
    public Rect a(final Context context, final int n, final int n2, final int n3, final int n4) {
        return new Rect(n, n2, n + n3, n2 + n4);
    }
    
    @Override
    public d a() {
        return null;
    }
    
    @Override
    public void a(final long n) {
        super.a(n);
        if (n == this.d.f) {
            this.d.r = 1;
            this.a.f.getActionButton().setChecked(true);
        }
    }
    
    public void a(final Card card, final boolean b) {
        this.a(card);
        card.a(this);
        card.j();
        if (this.a.f != null) {
            this.a.f.g();
            this.a.f.setTweetContentView((View)card.aB_());
            this.s();
            this.a.f.d();
            this.a.f.c();
        }
        if (b) {
            card.v();
        }
    }
    
    @Override
    public void a(final String s, final String s2, final String s3, final boolean b, final boolean b2) {
        this.o.b("click", "platform_card");
        this.a.a(PromotedEvent.p);
        this.a.k.a(this.a, this.d, s, s2, s3, false, b, b2, false);
    }
    
    @Override
    public void a(final boolean b) {
        super.a(b);
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        final Card o = this.o();
        if (o != null) {
            w.a().a(this, o);
            this.a((Card)null);
        }
    }
    
    @Override
    public void b(final long n) {
        super.b(n);
        if (n == this.d.f) {
            this.d.r = 0;
            this.a.f.getActionButton().setChecked(false);
        }
    }
    
    @Override
    public void b(final boolean b) {
        super.b(b);
        final Card o = this.o();
        if (o != null) {
            this.a.f.g();
            o.d(b);
        }
    }
    
    @Override
    public boolean b() {
        return false;
    }
    
    @Override
    public boolean c() {
        return this.p.a();
    }
    
    @Override
    public boolean d() {
        return this.p.b();
    }
    
    @Override
    public boolean e() {
        return this.p.c();
    }
    
    @Override
    public void f() {
        this.a.y();
    }
    
    @Override
    public void g() {
        this.a.z();
    }
    
    @Override
    public void h() {
        this.a.A();
    }
    
    @Override
    public void j() {
        super.j();
        final Card o = this.o();
        if (o != null) {
            this.a.f.setTweetContentView((View)o.aB_());
            this.a.f.d();
            o.f();
        }
    }
    
    @Override
    public void k() {
        final Card o = this.o();
        if (o != null) {
            o.a(this);
            o.g();
        }
    }
}
