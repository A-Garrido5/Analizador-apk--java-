// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.model.b;
import com.twitter.library.client.az;
import com.twitter.library.client.d;
import android.content.res.Configuration;
import com.twitter.android.widget.bd;
import com.twitter.android.widget.bc;
import android.view.View;
import com.twitter.android.widget.bg;
import android.content.Context;
import com.twitter.android.kg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.library.av.playback.p;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.playback.au;
import android.graphics.PointF;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.android.widget.ExpandableViewHost;
import com.twitter.library.av.playback.w;
import com.twitter.android.widget.by;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.android.client.TwitterFragmentActivity;

public abstract class AVCardCanvasActivity extends TwitterFragmentActivity implements ViewTreeObserver$OnGlobalLayoutListener, ab, af, as, l, by, w
{
    protected k a;
    protected boolean b;
    protected boolean c;
    protected ExpandableViewHost d;
    protected TweetEngagementView e;
    protected Tweet f;
    protected ap g;
    protected TwitterScribeAssociation h;
    protected PointF i;
    protected PointF j;
    protected PointF k;
    protected PointF l;
    protected com.twitter.library.av.playback.au m;
    protected String n;
    protected AVPlayer o;
    protected final p p;
    
    public AVCardCanvasActivity() {
        this.p = com.twitter.library.av.playback.p.a();
    }
    
    public static TwitterScribeAssociation b(final Bundle bundle) {
        TwitterScribeAssociation twitterScribeAssociation = (TwitterScribeAssociation)bundle.getParcelable("association");
        if (twitterScribeAssociation == null) {
            twitterScribeAssociation = (TwitterScribeAssociation)new TwitterScribeAssociation().b("tweet");
        }
        return twitterScribeAssociation;
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        this.overridePendingTransition(0, 0);
        if (kg.a((Context)this)) {
            bn.d(false);
        }
        return bn;
    }
    
    @Override
    public bc a(final Context context, final bg bg, final View view) {
        final bd bd = new bd();
        bd.a(bg.h());
        return bd;
    }
    
    protected abstract com.twitter.library.av.playback.au a(final Bundle p0);
    
    protected void a(final Configuration configuration) {
        switch (configuration.orientation) {
            default: {
                this.e.setVisibility(0);
            }
            case 2: {
                this.e.setVisibility(8);
            }
        }
    }
    
    @Override
    public void a(final Bundle bundle, final d d) {
        super.a(bundle, d);
        final Bundle extras = this.getIntent().getExtras();
        this.f = (Tweet)extras.getParcelable("tweet");
        this.g = new ap(this.f, (Context)this, this);
        this.i = (PointF)extras.getParcelable("initial_top_left_coords");
        this.j = (PointF)extras.getParcelable("initial_size");
        this.k = (PointF)extras.getParcelable("return_top_left_coords");
        this.l = (PointF)extras.getParcelable("return_size");
        this.n = extras.getString("media_source_url");
        this.e = (TweetEngagementView)this.findViewById(2131886284);
        this.a(this.getResources().getConfiguration());
        this.e.setContext((Context)this);
        this.e.setFragmentActivity(this);
        this.e.setTweet(this.f);
        this.e.setScriber(this);
        this.h = b(extras);
        this.m = this.a(extras);
        if (this.m != null) {
            this.o = this.p.a(this.m, this.getApplicationContext());
            this.p.a(this.m.a());
            final boolean j = this.o.J();
            this.o.a(az.a((Context)this));
            (this.a = (k)this.findViewById(2131886283)).setOnDockListener(this);
            (this.d = (ExpandableViewHost)this.findViewById(2131886282)).setListener(this);
            final b k = this.o.K();
            if (k != null && k.a()) {
                this.j();
            }
            else {
                this.i();
            }
            this.g.a(this.f);
            if (!j) {
                this.h();
            }
        }
    }
    
    public void a(final ExpandableViewHost expandableViewHost) {
        this.finish();
    }
    
    public void a(final Tweet tweet) {
        if (this.m != null) {
            this.m.a(tweet);
        }
        if (this.e != null) {
            this.e.setTweet(tweet);
        }
    }
    
    public void a(final String s) {
        if (this.o != null) {
            this.o.a(s);
        }
    }
    
    public void a(final boolean b) {
        if (this.o != null) {
            final Bundle h = this.o.h();
            final boolean boolean1 = h.getBoolean("impression_scribed", false);
            final boolean boolean2 = h.getBoolean("cta_availability", false);
            if (!boolean1 || boolean2 != b) {
                h.putBoolean("impression_scribed", true);
                h.putBoolean("cta_availability", b);
                final AVPlayer o = this.o;
                String s;
                if (b) {
                    s = "cta_impression_open";
                }
                else {
                    s = "cta_impression_signup";
                }
                o.a(s);
            }
        }
    }
    
    public void aj_() {
        this.finish();
    }
    
    public void b(final ExpandableViewHost expandableViewHost) {
        this.m();
    }
    
    public void b(final boolean b) {
        if (this.o != null) {
            final AVPlayer o = this.o;
            String s;
            if (b) {
                s = "cta_click_signup";
            }
            else {
                s = "cta_click_open";
            }
            o.a(s);
        }
    }
    
    public void d_() {
        this.j();
    }
    
    public void e_() {
    }
    
    @Override
    public void finish() {
        if (this.o != null && !this.o.J() && !this.b) {
            final h h = new h(this);
            if (this.d != null) {
                this.d.a(h);
            }
            return;
        }
        super.finish();
    }
    
    protected void h() {
    }
    
    protected void i() {
        if (this.o != null) {
            this.o.a((w)this);
        }
    }
    
    protected void j() {
        this.o.k();
        final Configuration configuration = this.getResources().getConfiguration();
        this.a.a(this.o, configuration);
        this.a.setPartner(this.m.g());
        this.a.getContentView().setVisibility(0);
        this.a(configuration);
        this.o.c(true);
    }
    
    protected Runnable k() {
        return null;
    }
    
    public void l() {
        this.m();
    }
    
    protected abstract void m();
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.a(configuration);
    }
    
    public void onDestroy() {
        super.onDestroy();
        if (this.o != null && this.m != null) {
            this.p.a(this.m);
            this.p.c(this.m.a());
        }
        if (this.g != null) {
            this.g.a();
        }
        if (this.e != null) {
            this.e.setScriber(null);
        }
    }
    
    public void onGlobalLayout() {
        this.d.setVisibility(0);
        final Runnable k = this.k();
        if (this.j != null && this.i != null) {
            this.d.c(this.i, this.j, k);
        }
        else {
            this.d.b(k);
        }
        this.d.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    public void onStart() {
        super.onStart();
        if (this.o != null) {
            this.o.H();
        }
    }
    
    public void onStop() {
        super.onStop();
        if (this.o != null && !this.o.J() && !this.c) {
            this.o.d(false);
        }
    }
}
