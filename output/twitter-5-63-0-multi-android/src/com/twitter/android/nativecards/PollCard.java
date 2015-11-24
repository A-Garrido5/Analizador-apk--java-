// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.api.TwitterUser;
import com.twitter.library.media.widget.BaseMediaImageView$ScaleType;
import com.twitter.library.client.Session;
import com.twitter.android.composer.au;
import com.twitter.android.card.w;
import com.twitter.library.client.az;
import android.text.TextUtils;
import android.os.Bundle;
import com.twitter.android.card.h;
import com.twitter.android.card.v;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;
import android.view.animation.Animation;
import com.twitter.ui.widget.TwitterButton;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import android.view.View$OnClickListener;

public class PollCard extends j implements View$OnClickListener, uz, wi
{
    private static final int[] a;
    private static final Integer[] b;
    private static final Integer[] c;
    private static final int[] d;
    private static final int[] e;
    private static final int[] f;
    private MediaImageView[] H;
    private TextView[] I;
    private TextView J;
    private TextView K;
    private MediaImageView L;
    private View M;
    private long N;
    private Long O;
    private int P;
    private final PollCard$Configuration g;
    private LinearLayout h;
    private MediaImageView i;
    private TextView j;
    private View k;
    private TextView l;
    private TextView m;
    private TwitterButton n;
    private View o;
    private View p;
    private View q;
    private Animation r;
    private Animation s;
    private MediaImageView[] t;
    private TwitterButton[] u;
    private MediaImageView[] v;
    private String[] w;
    private MediaImageView[] x;
    
    static {
        a = new int[] { 2131887014, 2131887016, 2131887030, 2131887032 };
        b = new Integer[] { 2131887015, 2131886989, null, null };
        c = new Integer[] { 2131887028, 2131887029, 2131887031, 2131887033 };
        d = new int[] { 2131887022, 2131887025, 2131887035, 2131887038 };
        e = new int[] { 2131887023, 2131887026, 2131887036, 2131887039 };
        f = new int[] { 2131887024, 2131887027, 2131887037, 2131887040 };
    }
    
    public PollCard(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g, final PollCard$Configuration g2) {
        int i = 0;
        super(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        if (g2.choiceCount < 1 || g2.choiceCount > 4) {
            throw new IllegalArgumentException();
        }
        this.g = g2;
        this.h = (LinearLayout)LayoutInflater.from(this.y).inflate(g2.layoutId, (ViewGroup)new FrameLayout(this.y), false);
        this.i = (MediaImageView)this.h.findViewById(2131886993);
        this.j = (TextView)this.h.findViewById(2131886994);
        this.k = this.h.findViewById(2131887013);
        this.l = (TextView)this.h.findViewById(2131886291);
        this.m = (TextView)this.h.findViewById(2131886391);
        this.n = (TwitterButton)this.h.findViewById(2131887034);
        this.t = new MediaImageView[this.g.choiceCount];
        this.u = new TwitterButton[this.g.choiceCount];
        this.v = new MediaImageView[this.g.choiceCount];
        this.w = new String[this.g.choiceCount];
        this.x = new MediaImageView[this.g.choiceCount];
        this.H = new MediaImageView[this.g.choiceCount];
        this.I = new TextView[this.g.choiceCount];
        while (i < this.g.choiceCount) {
            this.t[i] = (MediaImageView)this.h.findViewById(PollCard.a[i]);
            if (PollCard.b[i] != null) {
                this.u[i] = (TwitterButton)this.h.findViewById((int)PollCard.b[i]);
            }
            if (PollCard.c[i] != null) {
                this.v[i] = (MediaImageView)this.h.findViewById((int)PollCard.c[i]);
            }
            this.x[i] = (MediaImageView)this.h.findViewById(PollCard.d[i]);
            this.H[i] = (MediaImageView)this.h.findViewById(PollCard.e[i]);
            this.I[i] = (TextView)this.h.findViewById(PollCard.f[i]);
            ++i;
        }
        this.J = (TextView)this.h.findViewById(2131887019);
        this.K = (TextView)this.h.findViewById(2131887020);
        this.L = (MediaImageView)this.h.findViewById(2131887018);
        this.o = this.h.findViewById(2131887012);
        this.p = this.h.findViewById(2131887017);
        this.q = this.h.findViewById(2131887021);
        this.r = AnimationUtils.loadAnimation((Context)activity, 2131034141);
        this.s = AnimationUtils.loadAnimation((Context)activity, 2131034143);
        this.M = this.h.findViewById(2131886992);
        if (this.M != null) {
            this.M.setVisibility(8);
        }
        this.P = -1;
    }
    
    public PollCard(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final PollCard$Configuration pollCard$Configuration) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity), pollCard$Configuration);
    }
    
    static int a(final PollCard$Configuration pollCard$Configuration, final Bundle bundle, final Integer n) {
        if (n != null && n == -1) {
            return pollCard$Configuration.postVoteState;
        }
        if (bundle != null) {
            return bundle.getInt("vote_state", pollCard$Configuration.initialState);
        }
        return pollCard$Configuration.initialState;
    }
    
    private void a(final int n) {
        if (this.w != null && this.w.length > n && !TextUtils.isEmpty((CharSequence)this.w[n])) {
            final Activity k = this.k();
            if (k != null) {
                final Session b = az.a(this.y).b();
                com.twitter.android.card.w.a().a(this.N);
                au.a((Context)k).a(this.w[n], null).a(b.e()).c(this.N).b((Context)k);
            }
        }
    }
    
    private void a(final int n, final vc vc) {
        int n2 = 8;
        final vj a = vj.a("choice" + n + "_image", vc);
        final vj a2 = vj.a("choice_button", vc);
        final MediaImageView mediaImageView = this.t[n];
        if (mediaImageView != null) {
            if (a != null && a.a != null) {
                mediaImageView.a(com.twitter.library.media.manager.j.a(a.a));
                mediaImageView.setFromMemoryOnly(true);
                mediaImageView.setScaleType(BaseMediaImageView$ScaleType.b);
                mediaImageView.setVisibility(0);
                mediaImageView.setOnClickListener((View$OnClickListener)this);
            }
            else {
                mediaImageView.setVisibility(n2);
            }
        }
        final TwitterButton twitterButton = this.u[n];
        Label_0198: {
            if (twitterButton != null) {
                while (true) {
                    Label_0291: {
                        if (TextUtils.isEmpty((CharSequence)this.w[n])) {
                            break Label_0291;
                        }
                        twitterButton.setOnClickListener((View$OnClickListener)this);
                        final String a3 = wb.a("choice" + n + "_text", vc);
                        if (TextUtils.isEmpty((CharSequence)a3)) {
                            break Label_0291;
                        }
                        twitterButton.setText((CharSequence)a3);
                        final int visibility = 0;
                        twitterButton.setVisibility(visibility);
                        break Label_0198;
                    }
                    final int visibility = n2;
                    continue;
                }
            }
        }
        final MediaImageView mediaImageView2 = this.v[n];
        if (mediaImageView2 != null) {
            if (a2 != null && !TextUtils.isEmpty((CharSequence)a2.a) && !TextUtils.isEmpty((CharSequence)this.w[n])) {
                mediaImageView2.a(com.twitter.library.media.manager.j.a(a2.a));
                mediaImageView2.setFromMemoryOnly(true);
                mediaImageView2.setScaleType(BaseMediaImageView$ScaleType.a);
                mediaImageView2.setOnClickListener((View$OnClickListener)this);
                n2 = 0;
            }
            mediaImageView2.setVisibility(n2);
        }
    }
    
    private void a(final int p2, final boolean b) {
        if (p2 != this.P) {
            final int p3 = this.P;
            switch (this.P = p2) {
                case 0: {
                    this.o.setVisibility(0);
                    this.p.setVisibility(4);
                    this.q.setVisibility(4);
                }
                case 1: {
                    this.o.setVisibility(4);
                    this.p.setVisibility(0);
                    this.q.setVisibility(4);
                    if (b) {
                        this.o.startAnimation(this.s);
                        this.p.startAnimation(this.r);
                        return;
                    }
                    break;
                }
                case 2: {
                    this.o.setVisibility(4);
                    this.p.setVisibility(4);
                    this.q.setVisibility(0);
                    if (b) {
                        this.o.startAnimation(this.s);
                        this.q.startAnimation(this.r);
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    private void a(final Bundle bundle, final boolean b) {
        this.a(a(this.g, bundle, com.twitter.android.card.w.a().b(this.N)), b);
    }
    
    private void a(final vc vc) {
        if (this.l != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.l.setText((CharSequence)a);
            }
        }
    }
    
    private void b(final int n, final vc vc) {
        final vj a = vj.a("choice_fade", vc);
        final MediaImageView mediaImageView = this.x[n];
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
        final MediaImageView mediaImageView2 = this.H[n];
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
        final TextView textView = this.I[n];
        if (textView != null) {
            final String a3 = wb.a("result" + n + "_percent", vc);
            if (TextUtils.isEmpty((CharSequence)a3)) {
                textView.setVisibility(8);
                return;
            }
            textView.setText((CharSequence)a3);
        }
    }
    
    private void b(final vc vc) {
        if (this.m != null) {
            final String a = wb.a("subtitle", vc);
            if (a != null) {
                this.m.setText((CharSequence)a);
            }
        }
    }
    
    private void c(final vc vc) {
        if (this.n != null) {
            int visibility = 8;
            if (this.F == DisplayMode.a) {
                final String a = wb.a("forward_cta_text", vc);
                if (!TextUtils.isEmpty((CharSequence)a)) {
                    this.n.setText((CharSequence)a);
                    this.n.setOnClickListener((View$OnClickListener)this);
                    visibility = 0;
                }
            }
            this.n.setVisibility(visibility);
        }
    }
    
    private void d(final vc vc) {
        if (this.J != null) {
            final String a = wb.a("title_post", vc);
            if (!TextUtils.isEmpty((CharSequence)a)) {
                this.J.setText((CharSequence)a);
            }
        }
    }
    
    private void e() {
        if (this.k != null) {
            int n;
            if (this.F == DisplayMode.b || this.g.isForwardTitleBarVisible) {
                n = 1;
            }
            else {
                n = 0;
            }
            final View k = this.k;
            int visibility = 0;
            if (n == 0) {
                visibility = 8;
            }
            k.setVisibility(visibility);
        }
    }
    
    private void e(final vc vc) {
        if (this.K != null) {
            final String a = wb.a("subtitle_post", vc);
            if (!TextUtils.isEmpty((CharSequence)a)) {
                this.K.setText((CharSequence)a);
            }
        }
    }
    
    private void f(final vc vc) {
        if (this.L != null) {
            final vj a = vj.a("image_post", vc);
            if (a == null || a.a == null) {
                this.L.setVisibility(8);
                return;
            }
            this.L.setScaleType(BaseMediaImageView$ScaleType.b);
            this.L.setVisibility(0);
            this.L.a(com.twitter.library.media.manager.j.a(a.a));
            this.L.setFromMemoryOnly(true);
        }
    }
    
    public void a() {
        for (int i = 0; i < this.g.choiceCount; ++i) {
            if (this.t[i] != null) {
                this.t[i].setFromMemoryOnly(false);
            }
            if (this.v[i] != null) {
                this.v[i].setFromMemoryOnly(false);
            }
            if (this.x[i] != null) {
                this.x[i].setFromMemoryOnly(false);
            }
            if (this.H[i] != null) {
                this.H[i].setFromMemoryOnly(false);
            }
        }
        if (this.L != null) {
            this.L.setFromMemoryOnly(false);
        }
        if (this.i != null) {
            this.i.setFromMemoryOnly(false);
        }
    }
    
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.j != null) {
            this.j.setText((CharSequence)twitterUser.name);
        }
        if (this.i != null) {
            this.i.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
            this.i.setFromMemoryOnly(true);
        }
        if (this.M != null) {
            this.M.setVisibility(0);
            this.M.setOnClickListener((View$OnClickListener)this);
            final DisplayMode f = this.F;
            final DisplayMode b = DisplayMode.b;
            int visibility = 0;
            if (f != b) {
                visibility = 8;
            }
            this.M.setVisibility(visibility);
        }
    }
    
    public void a(final long n, final vc vc) {
        this.e();
        this.a(vc);
        this.b(vc);
        for (int i = 0; i < this.g.choiceCount; ++i) {
            this.w[i] = wb.a("choice" + i + "_tweet", vc);
            this.a(i, vc);
            this.b(i, vc);
        }
        this.c(vc);
        this.d(vc);
        this.e(vc);
        this.f(vc);
        if (up.a("completed", vc) != null) {
            this.a(this.g.completedState, false);
        }
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        final wh a = wh.a();
        if (this.O != null) {
            a.b(this.O, this);
        }
        uy.a().b(this.N, this);
        for (int i = 0; i < this.g.choiceCount; ++i) {
            if (this.t[i] != null) {
                this.t[i].b();
            }
            if (this.x[i] != null) {
                this.x[i].b();
            }
            if (this.H[i] != null) {
                this.H[i].b();
            }
        }
        if (this.L != null) {
            this.L.b();
        }
        if (this.i != null) {
            this.i.b();
        }
        bundle.putInt("vote_state", this.P);
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.N = vq.b;
        uy.a().a(this.N, this);
        this.O = vn.a("site", vq.c);
        if (this.O != null) {
            wh.a().a(this.O, this);
        }
        this.a(bundle, false);
    }
    
    public void b() {
        super.b();
        this.a(null, true);
    }
    
    public View d() {
        return (View)this.h;
    }
    
    public void onClick(final View view) {
        if (view == this.M) {
            this.a(this.O);
        }
        else {
            if (view == this.n) {
                this.C.a(this.E, this.z);
                return;
            }
            for (int i = 0; i < this.g.choiceCount; ++i) {
                if (view == this.u[i] || view == this.t[i] || view == this.v[i]) {
                    this.a(i);
                    return;
                }
                if (view == this.x[i]) {
                    this.C.a(this.E, this.z);
                    return;
                }
            }
        }
    }
}
