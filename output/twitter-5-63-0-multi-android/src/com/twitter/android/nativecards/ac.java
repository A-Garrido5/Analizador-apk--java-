// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.os.Bundle;
import android.view.View$OnLongClickListener;
import com.twitter.library.provider.Tweet;
import android.view.View$OnClickListener;
import com.twitter.library.api.TwitterUser;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import android.content.Context;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.LinearLayout;
import com.twitter.ui.widget.ag;

public class ac extends j implements uz, wi
{
    private ag a;
    private LinearLayout b;
    private MediaImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private MediaImageView g;
    private CallToAction h;
    private View i;
    private View j;
    private long k;
    private Long l;
    
    public ac(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        int n;
        if (displayMode == DisplayMode.a) {
            n = 2130968930;
        }
        else {
            n = 2130968931;
        }
        this.a = ag.a((Context)activity);
        this.b = (LinearLayout)LayoutInflater.from(this.y).inflate(n, (ViewGroup)new FrameLayout(this.y), false);
        this.c = (MediaImageView)this.b.findViewById(2131886993);
        this.d = (TextView)this.b.findViewById(2131886994);
        this.e = (TextView)this.b.findViewById(2131886291);
        this.f = (TextView)this.b.findViewById(2131886396);
        this.g = (MediaImageView)this.b.findViewById(2131886973);
        this.h = (CallToAction)this.b.findViewById(2131886999);
        this.i = this.b.findViewById(2131886992);
        if (this.i != null) {
            this.i.setVisibility(8);
        }
        this.j = this.b.findViewById(2131886972);
    }
    
    @Override
    public void a() {
        if (this.g != null) {
            this.g.setFromMemoryOnly(false);
        }
        if (this.c != null) {
            this.c.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.d != null) {
            this.d.setText((CharSequence)twitterUser.name);
            this.d.setTypeface(this.a.c);
        }
        if (this.c != null) {
            this.c.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
            this.c.setFromMemoryOnly(true);
        }
        if (this.i != null) {
            this.i.setVisibility(0);
            this.i.setOnClickListener((View$OnClickListener)new af(this, n));
        }
    }
    
    @Override
    public void a(final long n, final Tweet tweet) {
        super.a(n, tweet);
        if (this.h != null) {
            this.h.setTweet(tweet);
        }
    }
    
    @Override
    public void a(final long n, final vc vc) {
        if (this.e != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.e.setText((CharSequence)a);
                this.e.setTypeface(this.a.a);
            }
        }
        if (this.f != null) {
            final String a2 = wb.a("description", vc);
            if (a2 != null) {
                this.f.setText((CharSequence)a2);
                this.f.setTypeface(this.a.a);
            }
        }
        if (this.g != null) {
            final vj a3 = vj.a("thumbnail_image", vc);
            if (a3 != null && a3.a != null) {
                this.g.a(com.twitter.library.media.manager.j.a(a3.a));
                this.g.setFromMemoryOnly(true);
                this.g.setVisibility(0);
            }
            else {
                this.g.setVisibility(8);
            }
        }
        final String a4 = wb.a("card_url", vc);
        if (this.j != null) {
            this.j.setOnClickListener((View$OnClickListener)new ad(this, a4));
            this.j.setOnLongClickListener((View$OnLongClickListener)new ae(this, a4));
        }
        if (this.h != null) {
            this.a(this.h, vc);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        final wh a = wh.a();
        if (this.l != null) {
            a.b(this.l, this);
        }
        uy.a().b(this.k, this);
        if (this.g != null) {
            this.g.b();
        }
        if (this.c != null) {
            this.c.b();
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.k = vq.b;
        uy.a().a(this.k, this);
        this.l = vn.a("site", vq.c);
        if (this.l != null) {
            wh.a().a(this.l, this);
        }
    }
    
    @Override
    public View d() {
        return (View)this.b;
    }
}
