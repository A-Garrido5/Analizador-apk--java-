// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.util.bq;
import android.os.Bundle;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.LinearLayout;
import com.twitter.ui.widget.ag;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

public class r extends j implements View$OnClickListener, View$OnLongClickListener, uz, wi
{
    al a;
    private ag b;
    private LinearLayout c;
    private VideoPlayerView d;
    private MediaImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private CallToAction i;
    private View j;
    private long k;
    private Long l;
    private String m;
    private Resources n;
    private String o;
    private String p;
    private String q;
    private vj r;
    
    public r(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity));
    }
    
    public r(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g, (LinearLayout)LayoutInflater.from(activity.getApplicationContext()).inflate(2130968920, (ViewGroup)new FrameLayout(activity.getApplicationContext()), false));
    }
    
    public r(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final LinearLayout c) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.b = ag.a((Context)activity);
        this.n = activity.getResources();
        this.c = c;
        this.d = (VideoPlayerView)this.c.findViewById(2131886212);
        this.e = (MediaImageView)this.c.findViewById(2131886993);
        this.f = (TextView)this.c.findViewById(2131886994);
        this.g = (TextView)this.c.findViewById(2131886396);
        this.h = (TextView)this.c.findViewById(2131886291);
        if (this.h != null) {
            this.h.setVisibility(8);
        }
        this.i = (CallToAction)this.c.findViewById(2131886999);
        this.j = this.c.findViewById(2131886992);
        if (this.j != null) {
            this.j.setVisibility(8);
        }
    }
    
    public void a() {
        if (this.e != null) {
            this.e.setFromMemoryOnly(false);
        }
        if (this.d != null) {
            this.d.a();
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.l != null && this.l.equals(n)) {
            if (this.f != null) {
                this.f.setText((CharSequence)twitterUser.name);
                this.f.setTypeface(this.b.c);
            }
            if (this.e != null) {
                this.e.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
                this.e.setFromMemoryOnly(true);
            }
            if (this.j != null) {
                this.j.setVisibility(0);
                this.j.setOnClickListener((View$OnClickListener)this);
            }
        }
    }
    
    @Override
    public void a(final long n, final Tweet tweet) {
        super.a(n, tweet);
        if (this.i != null) {
            this.i.setTweet(tweet);
        }
    }
    
    public void a(final long n, final vc vc) {
        this.m = wb.a("card_url", vc);
        if (this.g != null) {
            final String a = wb.a("description", vc);
            if (a != null) {
                this.g.setText((CharSequence)a);
            }
            this.g.setOnClickListener((View$OnClickListener)this);
            this.g.setOnLongClickListener((View$OnLongClickListener)this);
        }
        if (this.h != null) {
            final String a2 = wb.a("title", vc);
            if (a2 != null) {
                this.h.setVisibility(0);
                this.h.setText((CharSequence)a2);
                this.h.setTypeface(this.b.a);
                this.h.setOnClickListener((View$OnClickListener)this);
                this.h.setOnLongClickListener((View$OnLongClickListener)this);
            }
        }
        if (this.i != null) {
            this.a(this.i, vc);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.a != null) {
            this.a.a();
            this.a = null;
        }
        final wh a = wh.a();
        if (this.l != null) {
            a.b(this.l, this);
        }
        uy.a().b(this.k, this);
        if (this.e != null) {
            this.e.b();
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.o = wb.a("player_url", vq.c);
        this.p = wb.a("player_stream_url", vq.c);
        this.q = wb.a("player_stream_content_type", vq.c);
        this.r = vj.a("player_image", vq.c);
        final Activity k = this.k();
        if (k != null) {
            if (bq.f(this.o)) {
                this.a = new ao((Context)k, this.o);
            }
            if (this.d != null) {
                final Integer a = vm.a("player_width", vq.c);
                final Integer a2 = vm.a("player_height", vq.c);
                if (this.r != null && this.r.a != null && a != null && a2 != null) {
                    this.d.setAspectRatio(bq.a(a, a2, 1.0f));
                    this.d.a((Context)k, this.r.a);
                }
                else {
                    this.d.c();
                }
                if (this.a != null) {
                    this.a.a((Context)k, this.d);
                    this.a.a((Context)k, this.p);
                }
                else {
                    this.d.b((Context)k);
                    this.d.setOnClickListener((View$OnClickListener)this);
                }
            }
        }
        this.k = vq.b;
        uy.a().a(this.k, this);
        this.l = vn.a("site", vq.c);
        final wh a3 = wh.a();
        if (this.l != null) {
            a3.a(this.l, this);
        }
    }
    
    public View d() {
        return (View)this.c;
    }
    
    public void onClick(final View view) {
        if (view == this.j) {
            this.a(this.l);
            return;
        }
        if (view == this.d) {
            String a;
            if (this.r != null) {
                a = this.r.a;
            }
            else {
                a = null;
            }
            this.a(this.o, this.p, this.q, a, false, false);
            return;
        }
        this.D.b(this.m);
    }
    
    public boolean onLongClick(final View view) {
        this.a(this.m, this.m);
        return false;
    }
}
