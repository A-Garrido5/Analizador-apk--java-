// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.os.Bundle;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
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

public class ah extends j implements View$OnClickListener, View$OnLongClickListener, uz, wi
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
    private TextView j;
    private long k;
    private Long l;
    private Long m;
    private String n;
    private Resources o;
    
    public ah(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        final Context applicationContext = activity.getApplicationContext();
        this.a = ag.a(applicationContext);
        this.o = applicationContext.getResources();
        this.b = (LinearLayout)LayoutInflater.from(applicationContext).inflate(2130968932, (ViewGroup)new FrameLayout(applicationContext), false);
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
        this.j = (TextView)this.b.findViewById(2131886647);
        if (this.j != null) {
            this.j.setVisibility(8);
        }
    }
    
    public void a() {
        if (this.g != null) {
            this.g.setFromMemoryOnly(false);
        }
        if (this.c != null) {
            this.c.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.l != null && this.l.equals(n)) {
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
                this.i.setOnClickListener((View$OnClickListener)this);
            }
        }
        if (this.m != null && this.m.equals(n) && this.j != null) {
            this.j.setText((CharSequence)this.o.getString(2131296434, new Object[] { twitterUser.name, twitterUser.username }));
            this.j.setVisibility(0);
            this.j.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    @Override
    public void a(final long n, final Tweet tweet) {
        super.a(n, tweet);
        if (this.h != null) {
            this.h.setTweet(tweet);
        }
    }
    
    public void a(final long n, final vc vc) {
        this.m = vn.a("creator", vc);
        this.n = wb.a("card_url", vc);
        if (this.e != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.e.setText((CharSequence)a);
                this.e.setTypeface(this.a.a);
                this.e.setOnClickListener((View$OnClickListener)this);
                this.e.setOnLongClickListener((View$OnLongClickListener)this);
            }
        }
        if (this.f != null) {
            final String a2 = wb.a("description", vc);
            if (a2 != null) {
                this.f.setText((CharSequence)a2);
                this.f.setTypeface(this.a.a);
                this.f.setOnClickListener((View$OnClickListener)this);
                this.f.setOnLongClickListener((View$OnLongClickListener)this);
            }
        }
        if (this.g != null) {
            final vj a3 = vj.a("summary_photo_image", vc);
            if (a3 != null && a3.a != null) {
                this.g.setAspectRatio(a3.a(1.3333334f));
                this.g.a(com.twitter.library.media.manager.j.a(a3.a));
                this.g.setFromMemoryOnly(true);
                this.g.setVisibility(0);
                this.g.setOnClickListener((View$OnClickListener)this);
                this.g.setOnLongClickListener((View$OnLongClickListener)this);
            }
            else {
                this.g.setVisibility(8);
            }
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
        if (this.m != null && !this.m.equals(this.l)) {
            a.b(this.m, this);
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
        this.m = vn.a("creator", vq.c);
        final wh a = wh.a();
        if (this.l != null) {
            a.a(this.l, this);
        }
        if (this.m != null && !this.m.equals(this.l)) {
            a.a(this.m, this);
        }
    }
    
    public View d() {
        return (View)this.b;
    }
    
    public void onClick(final View view) {
        if (view == this.j) {
            this.a(this.m);
            return;
        }
        if (view == this.i) {
            this.a(this.l);
            return;
        }
        this.D.b(this.n);
    }
    
    public boolean onLongClick(final View view) {
        this.a(this.n, this.n);
        return false;
    }
}
