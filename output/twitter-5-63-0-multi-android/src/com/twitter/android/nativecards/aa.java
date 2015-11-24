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
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

public class aa extends j implements View$OnClickListener, View$OnLongClickListener, uz, wi
{
    private LinearLayout a;
    private MediaImageView b;
    private TextView c;
    private TextView d;
    private MediaImageView e;
    private TextView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private TextView k;
    private CallToAction l;
    private View m;
    private View n;
    private long o;
    private Long p;
    private Long q;
    private String r;
    private Resources s;
    
    public aa(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity));
    }
    
    public aa(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.s = activity.getResources();
        this.a = (LinearLayout)LayoutInflater.from(this.y).inflate(2130968926, (ViewGroup)new FrameLayout(this.y), false);
        this.b = (MediaImageView)this.a.findViewById(2131886993);
        this.c = (TextView)this.a.findViewById(2131886994);
        this.d = (TextView)this.a.findViewById(2131886291);
        if (this.d != null) {
            this.d.setVisibility(8);
        }
        this.e = (MediaImageView)this.a.findViewById(2131887041);
        this.f = (TextView)this.a.findViewById(2131887042);
        this.g = (TextView)this.a.findViewById(2131887043);
        this.h = (TextView)this.a.findViewById(2131887044);
        this.i = (TextView)this.a.findViewById(2131887045);
        this.j = (TextView)this.a.findViewById(2131886396);
        this.k = (TextView)this.a.findViewById(2131886647);
        if (this.k != null) {
            this.k.setVisibility(8);
        }
        this.l = (CallToAction)this.a.findViewById(2131886999);
        this.m = this.a.findViewById(2131886992);
        if (this.m != null) {
            this.m.setVisibility(8);
        }
        this.n = this.a.findViewById(2131886972);
    }
    
    public void a() {
        if (this.e != null) {
            this.e.setFromMemoryOnly(false);
        }
        if (this.b != null) {
            this.b.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.c != null) {
            this.c.setText((CharSequence)twitterUser.name);
        }
        if (this.b != null) {
            this.b.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
            this.b.setFromMemoryOnly(true);
        }
        if (this.m != null) {
            this.m.setVisibility(0);
            this.m.setOnClickListener((View$OnClickListener)this);
        }
        if (this.q != null && this.q.equals(n) && this.k != null) {
            this.k.setText((CharSequence)this.s.getString(2131296434, new Object[] { twitterUser.name, twitterUser.username }));
            this.k.setVisibility(0);
            this.k.setOnClickListener((View$OnClickListener)this);
        }
    }
    
    @Override
    public void a(final long n, final Tweet tweet) {
        super.a(n, tweet);
        if (this.l != null) {
            this.l.setTweet(tweet);
        }
    }
    
    public void a(final long n, final vc vc) {
        this.r = wb.a("card_url", vc);
        if (this.d != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.d.setVisibility(0);
                this.d.setText((CharSequence)a);
                this.d.setOnClickListener((View$OnClickListener)this);
                this.d.setOnLongClickListener((View$OnLongClickListener)this);
            }
        }
        if (this.e != null) {
            final vj a2 = vj.a("product_image", vc);
            if (a2 != null && a2.a != null) {
                this.e.a(com.twitter.library.media.manager.j.a(a2.a));
                this.e.setFromMemoryOnly(true);
                this.e.setVisibility(0);
            }
            else {
                this.e.setVisibility(8);
            }
        }
        if (this.f != null) {
            final String a3 = wb.a("product_data1", vc);
            if (a3 != null) {
                this.f.setText((CharSequence)a3);
            }
        }
        if (this.g != null) {
            final String a4 = wb.a("product_label1", vc);
            if (a4 != null) {
                this.g.setText((CharSequence)a4);
            }
        }
        if (this.h != null) {
            final String a5 = wb.a("product_data2", vc);
            if (a5 != null) {
                this.h.setText((CharSequence)a5);
            }
        }
        if (this.i != null) {
            final String a6 = wb.a("product_label2", vc);
            if (a6 != null) {
                this.i.setText((CharSequence)a6);
            }
        }
        if (this.j != null) {
            final String a7 = wb.a("description", vc);
            if (a7 != null) {
                this.j.setText((CharSequence)a7);
            }
            this.j.setOnClickListener((View$OnClickListener)this);
            this.j.setOnLongClickListener((View$OnLongClickListener)this);
        }
        wb.a("card_url", vc);
        if (this.n != null) {
            this.n.setOnClickListener((View$OnClickListener)this);
            this.n.setOnLongClickListener((View$OnLongClickListener)this);
        }
        if (this.l != null) {
            this.a(this.l, vc);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        final wh a = wh.a();
        if (this.p != null) {
            a.b(this.p, this);
        }
        if (this.q != null && !this.q.equals(this.p)) {
            a.b(this.q, this);
        }
        uy.a().b(this.o, this);
        if (this.e != null) {
            this.e.b();
        }
        if (this.b != null) {
            this.b.b();
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.o = vq.b;
        uy.a().a(this.o, this);
        this.p = vn.a("site", vq.c);
        this.q = vn.a("creator", vq.c);
        final wh a = wh.a();
        if (this.p != null) {
            a.a(this.p, this);
        }
        if (this.q != null && !this.q.equals(this.p)) {
            a.a(this.q, this);
        }
    }
    
    public View d() {
        return (View)this.a;
    }
    
    public void onClick(final View view) {
        if (view == this.k) {
            this.a(this.q);
            return;
        }
        if (view == this.m) {
            this.a(this.p);
            return;
        }
        this.D.b(this.r);
    }
    
    public boolean onLongClick(final View view) {
        this.a(this.r, this.r);
        return false;
    }
}
