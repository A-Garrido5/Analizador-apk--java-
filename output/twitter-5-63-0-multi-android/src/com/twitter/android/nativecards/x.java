// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import android.text.TextUtils;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
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
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.widget.LinearLayout;
import android.view.View$OnClickListener;

public class x extends j implements View$OnClickListener, uz, wi
{
    private static final int[] a;
    private static final int[] b;
    private static final int[] c;
    private LinearLayout d;
    private MediaImageView e;
    private TextView f;
    private View g;
    private TextView h;
    private TextView i;
    private MediaImageView[] j;
    private MediaImageView[] k;
    private TextView[] l;
    private View m;
    private long n;
    private Long o;
    
    static {
        a = new int[] { 2131887022, 2131887025, 2131887035, 2131887038 };
        b = new int[] { 2131887023, 2131887026, 2131887036, 2131887039 };
        c = new int[] { 2131887024, 2131887027, 2131887037, 2131887040 };
    }
    
    public x(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity));
    }
    
    public x(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        int i = 0;
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.d = (LinearLayout)LayoutInflater.from(this.y).inflate(2130968923, (ViewGroup)new FrameLayout(this.y), false);
        this.e = (MediaImageView)this.d.findViewById(2131886993);
        this.f = (TextView)this.d.findViewById(2131886994);
        this.g = this.d.findViewById(2131887013);
        this.h = (TextView)this.d.findViewById(2131886291);
        this.i = (TextView)this.d.findViewById(2131886391);
        this.j = new MediaImageView[4];
        this.k = new MediaImageView[4];
        this.l = new TextView[4];
        while (i < 4) {
            this.j[i] = (MediaImageView)this.d.findViewById(x.a[i]);
            this.k[i] = (MediaImageView)this.d.findViewById(x.b[i]);
            this.l[i] = (TextView)this.d.findViewById(x.c[i]);
            ++i;
        }
        this.m = this.d.findViewById(2131886992);
        if (this.m != null) {
            this.m.setVisibility(8);
        }
    }
    
    private void a(final int n, final vc vc) {
        final vj a = vj.a("choice_fade", vc);
        final MediaImageView mediaImageView = this.j[n];
        final vj a2 = vj.a("choice" + n + "_image", vc);
        if (mediaImageView != null) {
            if (a2 != null && a2.a != null) {
                mediaImageView.a(com.twitter.library.media.manager.j.a(a2.a));
                mediaImageView.setFromMemoryOnly(true);
                mediaImageView.setScaleType(BaseMediaImageView$ScaleType.b);
                mediaImageView.setVisibility(0);
                if (this.F == DisplayMode.a) {
                    mediaImageView.setClickable(true);
                    mediaImageView.setOnClickListener((View$OnClickListener)this);
                }
            }
            else {
                mediaImageView.setVisibility(8);
            }
        }
        final MediaImageView mediaImageView2 = this.k[n];
        if (mediaImageView2 != null) {
            if (a != null && !TextUtils.isEmpty((CharSequence)a.a)) {
                mediaImageView2.a(com.twitter.library.media.manager.j.a(a.a));
                mediaImageView2.setFromMemoryOnly(true);
                mediaImageView2.setScaleType(BaseMediaImageView$ScaleType.b);
                mediaImageView2.setVisibility(0);
            }
            else {
                mediaImageView2.setVisibility(8);
            }
        }
        final TextView textView = this.l[n];
        if (textView != null) {
            final String a3 = wb.a("result" + n + "_percent", vc);
            if (TextUtils.isEmpty((CharSequence)a3)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText((CharSequence)a3);
        }
    }
    
    private void a(final vc vc) {
        if (this.h != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.h.setText((CharSequence)a);
            }
        }
    }
    
    private void b(final vc vc) {
        if (this.i != null) {
            final String a = wb.a("subtitle", vc);
            if (a != null) {
                this.i.setText((CharSequence)a);
            }
        }
    }
    
    private void e() {
        if (this.g != null) {
            int n;
            if (this.F == DisplayMode.b) {
                n = 1;
            }
            else {
                n = 0;
            }
            final View g = this.g;
            int visibility = 0;
            if (n == 0) {
                visibility = 8;
            }
            g.setVisibility(visibility);
        }
    }
    
    public void a() {
        for (int i = 0; i < 4; ++i) {
            if (this.j[i] != null) {
                this.j[i].setFromMemoryOnly(false);
            }
            if (this.k[i] != null) {
                this.k[i].setFromMemoryOnly(false);
            }
        }
        if (this.e != null) {
            this.e.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.f != null) {
            this.f.setText((CharSequence)twitterUser.name);
        }
        if (this.e != null) {
            this.e.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
            this.e.setFromMemoryOnly(true);
        }
        if (this.m != null) {
            this.m.setVisibility(0);
            this.m.setOnClickListener((View$OnClickListener)this);
            final DisplayMode f = this.F;
            final DisplayMode b = DisplayMode.b;
            int visibility = 0;
            if (f != b) {
                visibility = 8;
            }
            this.m.setVisibility(visibility);
        }
    }
    
    public void a(final long n, final vc vc) {
        this.e();
        this.a(vc);
        this.b(vc);
        for (int i = 0; i < 4; ++i) {
            this.a(i, vc);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        final wh a = wh.a();
        if (this.o != null) {
            a.b(this.o, this);
        }
        uy.a().b(this.n, this);
        for (int i = 0; i < 4; ++i) {
            if (this.j[i] != null) {
                this.j[i].b();
            }
            if (this.k[i] != null) {
                this.k[i].b();
            }
        }
        if (this.e != null) {
            this.e.b();
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.n = vq.b;
        uy.a().a(this.n, this);
        this.o = vn.a("site", vq.c);
        if (this.o != null) {
            wh.a().a(this.o, this);
        }
    }
    
    public View d() {
        return (View)this.d;
    }
    
    public void onClick(final View view) {
        if (view == this.m) {
            this.a(this.o);
        }
        else {
            for (int i = 0; i < 4; ++i) {
                if (view == this.j[i]) {
                    this.C.a(this.E, this.z);
                    return;
                }
            }
        }
    }
}
