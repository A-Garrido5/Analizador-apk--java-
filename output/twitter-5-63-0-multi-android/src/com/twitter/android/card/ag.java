// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.card;

import com.twitter.library.card.j;
import com.twitter.library.client.r;
import android.app.Activity;
import com.twitter.library.widget.tweet.content.d;
import android.view.View;
import com.twitter.library.util.bj;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.android.client.TwitterFragmentActivity;
import android.graphics.Rect;
import com.twitter.library.widget.TweetView;

public class ag extends a
{
    protected TweetView a;
    protected e p;
    private Rect q;
    
    public ag(final TwitterFragmentActivity twitterFragmentActivity, final TwitterScribeAssociation twitterScribeAssociation) {
        super(twitterFragmentActivity);
        this.a(twitterScribeAssociation);
        this.p = com.twitter.android.card.f.b();
    }
    
    @Override
    public Rect a(final Context context, final int n, final int n2, final int n3, final int n4) {
        final int a = vs.a(context, this.d);
        final int a2 = this.d.W().a(bj.a);
        final int n5 = n + n3;
        final int n6 = n2 + Math.min(a2, a);
        if (this.q == null) {
            this.q = new Rect(n, n2, n5, n6);
        }
        else {
            this.q.set(n, n2, n5, n6);
        }
        final View z = this.z();
        if (z != null) {
            z.measure(0x40000000 | this.q.width(), 0x40000000 | this.q.height());
        }
        return this.q;
    }
    
    @Override
    public d a() {
        return null;
    }
    
    public void a(final TweetView a) {
        this.a = a;
    }
    
    @Override
    public boolean b() {
        return true;
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
    public void i() {
        if (this.c.get() == null) {
            return;
        }
        this.n.a(this.d, this.g);
        this.o.c();
    }
    
    @Override
    public void w() {
        super.w();
        if (this.d.W() != null) {
            final TwitterFragmentActivity twitterFragmentActivity = (TwitterFragmentActivity)this.c.get();
            if (twitterFragmentActivity != null) {
                twitterFragmentActivity.a(this);
                this.e = w.a().a(this, false, this, new ah(this, this));
            }
        }
    }
    
    @Override
    public void y() {
        super.y();
        if (this.e != null) {
            this.e.a();
            this.e = null;
        }
        w.a().a(this, this.f);
        final TwitterFragmentActivity twitterFragmentActivity = (TwitterFragmentActivity)this.c.get();
        if (twitterFragmentActivity == null) {
            return;
        }
        twitterFragmentActivity.b(this);
    }
}
