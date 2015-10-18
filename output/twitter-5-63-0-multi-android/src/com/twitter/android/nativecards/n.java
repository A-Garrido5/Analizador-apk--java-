// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.os.Bundle;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
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
import java.util.ArrayList;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.LinearLayout;
import com.twitter.ui.widget.ag;
import android.view.View$OnLongClickListener;
import android.view.View$OnClickListener;

public class n extends j implements View$OnClickListener, View$OnLongClickListener, uz, wi
{
    private static final int[] a;
    private ag b;
    private LinearLayout c;
    private MediaImageView d;
    private TextView e;
    private TextView f;
    private TextView g;
    private ArrayList h;
    private CallToAction i;
    private View j;
    private TextView k;
    private long l;
    private Long m;
    private Long n;
    private String o;
    private Resources p;
    private ArrayList q;
    
    static {
        (a = new int[4])[0] = 2131886995;
        n.a[1] = 2131886996;
        n.a[2] = 2131886997;
        n.a[3] = 2131886998;
    }
    
    public n(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity));
    }
    
    public n(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.h = new ArrayList();
        this.q = new ArrayList();
        this.b = ag.a((Context)activity);
        this.p = activity.getResources();
        this.c = (LinearLayout)LayoutInflater.from(this.y).inflate(2130968915, (ViewGroup)new FrameLayout(this.y), false);
        this.d = (MediaImageView)this.c.findViewById(2131886993);
        this.e = (TextView)this.c.findViewById(2131886994);
        this.f = (TextView)this.c.findViewById(2131886291);
        final TextView f = this.f;
        int i = 0;
        if (f != null) {
            this.f.setVisibility(8);
        }
        while (i < 4) {
            this.h.add(this.c.findViewById(com.twitter.android.nativecards.n.a[i]));
            ++i;
        }
        this.g = (TextView)this.c.findViewById(2131886396);
        if (this.g != null) {
            this.g.setVisibility(8);
        }
        this.i = (CallToAction)this.c.findViewById(2131886999);
        this.j = this.c.findViewById(2131886992);
        if (this.j != null) {
            this.j.setVisibility(8);
        }
        this.k = (TextView)this.c.findViewById(2131886647);
        if (this.k != null) {
            this.k.setVisibility(8);
        }
    }
    
    public void a() {
        for (int i = 0; i < 4; ++i) {
            final MediaImageView mediaImageView = this.h.get(i);
            if (mediaImageView != null) {
                mediaImageView.setFromMemoryOnly(false);
            }
        }
        if (this.d != null) {
            this.d.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.m != null && this.m.equals(n)) {
            if (this.e != null) {
                this.e.setText((CharSequence)twitterUser.name);
                this.e.setTypeface(this.b.c);
            }
            if (this.d != null) {
                this.d.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
                this.d.setFromMemoryOnly(true);
            }
            if (this.j != null) {
                this.j.setVisibility(0);
                this.j.setOnClickListener((View$OnClickListener)this);
            }
        }
        if (this.n != null && this.n.equals(n) && this.k != null) {
            this.k.setText((CharSequence)this.p.getString(2131296434, new Object[] { twitterUser.name, twitterUser.username }));
            this.k.setVisibility(0);
            this.k.setOnClickListener((View$OnClickListener)this);
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
        this.o = wb.a("card_url", vc);
        if (this.f != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.f.setVisibility(0);
                this.f.setText((CharSequence)a);
                this.f.setTypeface(this.b.a);
                this.f.setOnClickListener((View$OnClickListener)this);
                this.f.setOnLongClickListener((View$OnLongClickListener)this);
            }
        }
        this.q.clear();
        for (int i = 0; i < 4; ++i) {
            final vj a2 = vj.a(String.format("image%1$d", i), vc);
            this.q.add(vj.a(String.format("image%1$d_full_size", i), vc));
            final MediaImageView mediaImageView = this.h.get(i);
            if (mediaImageView != null) {
                if (a2 != null && a2.a != null) {
                    mediaImageView.setAspectRatio(1.0f);
                    mediaImageView.a(com.twitter.library.media.manager.j.a(a2.a));
                    mediaImageView.setFromMemoryOnly(true);
                    mediaImageView.setScaleType(BaseMediaImageView$ScaleType.b);
                    mediaImageView.setVisibility(0);
                    mediaImageView.setOnClickListener((View$OnClickListener)this);
                }
                else {
                    mediaImageView.setVisibility(8);
                }
            }
        }
        if (this.g != null) {
            final String a3 = wb.a("description", vc);
            if (a3 != null) {
                this.g.setText((CharSequence)a3);
                this.g.setTypeface(this.b.a);
                this.g.setOnClickListener((View$OnClickListener)this);
                this.g.setOnLongClickListener((View$OnLongClickListener)this);
                this.g.setVisibility(0);
            }
            else {
                this.g.setVisibility(8);
            }
        }
        if (this.i != null) {
            this.a(this.i, vc);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        final wh a = wh.a();
        if (this.m != null) {
            a.b(this.m, this);
        }
        if (this.n != null && !this.n.equals(this.m)) {
            a.b(this.n, this);
        }
        uy.a().b(this.l, this);
        for (int i = 0; i < 4; ++i) {
            final MediaImageView mediaImageView = this.h.get(i);
            if (mediaImageView != null) {
                mediaImageView.b();
            }
        }
        if (this.d != null) {
            this.d.b();
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.l = vq.b;
        uy.a().a(this.l, this);
        this.m = vn.a("site", vq.c);
        this.n = vn.a("creator", vq.c);
        final wh a = wh.a();
        if (this.m != null) {
            a.a(this.m, this);
        }
        if (this.n != null && !this.n.equals(this.m)) {
            a.a(this.n, this);
        }
    }
    
    public View d() {
        return (View)this.c;
    }
    
    public void onClick(final View view) {
        if (view == this.k) {
            this.a(this.n);
            return;
        }
        if (view == this.j) {
            this.a(this.m);
            return;
        }
        final int index = this.h.indexOf(view);
        if (index >= 0) {
            this.a(this.q, index);
            return;
        }
        this.D.b(this.o);
    }
    
    public boolean onLongClick(final View view) {
        this.a(this.o, this.o);
        return false;
    }
}
