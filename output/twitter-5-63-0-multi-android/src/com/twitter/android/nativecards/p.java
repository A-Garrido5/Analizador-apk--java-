// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

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

public class p extends j implements View$OnClickListener, View$OnLongClickListener, uz, wi
{
    private ag a;
    private LinearLayout b;
    private MediaImageView c;
    private TextView d;
    private TextView e;
    private MediaImageView f;
    private CallToAction g;
    private View h;
    private TextView i;
    private long j;
    private Long k;
    private Long l;
    private String m;
    private Resources n;
    private vj o;
    
    public p(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity));
    }
    
    public p(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.a = ag.a((Context)activity);
        this.n = activity.getResources();
        this.b = (LinearLayout)LayoutInflater.from(this.y).inflate(2130968919, (ViewGroup)new FrameLayout(this.y), false);
        this.c = (MediaImageView)this.b.findViewById(2131886993);
        this.d = (TextView)this.b.findViewById(2131886994);
        this.e = (TextView)this.b.findViewById(2131886291);
        if (this.e != null) {
            this.e.setVisibility(8);
        }
        this.f = (MediaImageView)this.b.findViewById(2131886973);
        this.g = (CallToAction)this.b.findViewById(2131886999);
        this.h = this.b.findViewById(2131886992);
        if (this.h != null) {
            this.h.setVisibility(8);
        }
        this.i = (TextView)this.b.findViewById(2131886647);
        if (this.i != null) {
            this.i.setVisibility(8);
        }
    }
    
    public void a() {
        if (this.f != null) {
            this.f.setFromMemoryOnly(false);
        }
        if (this.c != null) {
            this.c.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.k != null && this.k.equals(n)) {
            if (this.d != null) {
                this.d.setText((CharSequence)twitterUser.name);
                this.d.setTypeface(this.a.c);
            }
            if (this.c != null) {
                this.c.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
                this.c.setFromMemoryOnly(true);
            }
            if (this.h != null) {
                this.h.setVisibility(0);
                this.h.setOnClickListener((View$OnClickListener)this);
            }
        }
        if (this.l != null && this.l.equals(n) && this.i != null) {
            this.i.setText((CharSequence)this.n.getString(2131296434, new Object[] { twitterUser.name, twitterUser.username }));
            this.i.setVisibility(0);
            this.i.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    @Override
    public void a(final long n, final Tweet tweet) {
        super.a(n, tweet);
        if (this.g != null) {
            this.g.setTweet(tweet);
        }
    }
    
    public void a(final long n, final vc vc) {
        this.m = wb.a("card_url", vc);
        if (this.e != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.e.setVisibility(0);
                this.e.setText((CharSequence)a);
                this.e.setTypeface(this.a.a);
                this.e.setOnClickListener((View$OnClickListener)this);
                this.e.setOnLongClickListener((View$OnLongClickListener)this);
            }
        }
        if (this.f != null) {
            final vj a2 = vj.a("photo_image", vc);
            if (a2 != null && a2.a != null) {
                this.f.setAspectRatio(a2.a(1.3333334f));
                this.f.a(com.twitter.library.media.manager.j.a(a2.a));
                this.f.setFromMemoryOnly(true);
                this.f.setVisibility(0);
                this.f.setOnClickListener((View$OnClickListener)this);
                this.f.setOnLongClickListener((View$OnLongClickListener)this);
            }
            else {
                this.f.setVisibility(8);
            }
        }
        this.o = vj.a("photo_image_full_size", vc);
        if (this.g != null) {
            this.a(this.g, vc);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        final wh a = wh.a();
        if (this.k != null) {
            a.b(this.k, this);
        }
        if (this.l != null && !this.l.equals(this.k)) {
            a.b(this.l, this);
        }
        uy.a().b(this.j, this);
        if (this.f != null) {
            this.f.b();
        }
        if (this.c != null) {
            this.c.b();
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.j = vq.b;
        uy.a().a(this.j, this);
        this.k = vn.a("site", vq.c);
        this.l = vn.a("creator", vq.c);
        final wh a = wh.a();
        if (this.k != null) {
            a.a(this.k, this);
        }
        if (this.l != null && !this.l.equals(this.k)) {
            a.a(this.l, this);
        }
    }
    
    public View d() {
        return (View)this.b;
    }
    
    public void onClick(final View view) {
        if (view == this.i) {
            this.a(this.l);
            return;
        }
        if (view == this.h) {
            this.a(this.k);
            return;
        }
        if (view == this.f) {
            this.a(this.o);
            return;
        }
        this.D.b(this.m);
    }
    
    public boolean onLongClick(final View view) {
        this.a(this.m, this.m);
        return false;
    }
}
