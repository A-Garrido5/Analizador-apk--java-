// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.text.TextUtils;
import com.twitter.android.revenue.a;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.os.Bundle;
import com.twitter.library.api.TwitterUser;
import android.view.View$OnTouchListener;
import android.widget.RelativeLayout$LayoutParams;
import android.view.LayoutInflater;
import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.android.card.h;
import com.twitter.android.card.v;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.app.Activity;
import com.twitter.library.util.ao;
import com.twitter.ui.widget.TwitterButton;
import android.widget.LinearLayout;
import android.view.View;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.view.ViewGroup;
import android.content.Context;
import com.twitter.android.nativecards.j;

public class ac extends j implements uz, wi
{
    protected Context a;
    protected final int b;
    protected ViewGroup c;
    protected DisplayMode d;
    protected MediaImageView e;
    protected TextView f;
    protected MediaImageView g;
    protected View h;
    protected View i;
    protected TextView j;
    protected LinearLayout k;
    protected TextView l;
    protected TwitterButton m;
    protected Long n;
    protected um o;
    protected String p;
    protected String q;
    protected final ao r;
    protected String s;
    protected String t;
    private long u;
    
    ac(final Activity activity, final DisplayMode displayMode, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        this(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, new v((Context)activity), new h(activity));
    }
    
    ac(final Activity a, final DisplayMode d, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final t t, final g g) {
        super(a, d, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        this.b = 2130968929;
        this.r = new ad(this);
        this.d = d;
        this.a = (Context)a;
        this.c = (ViewGroup)LayoutInflater.from(this.a).inflate(this.b, (ViewGroup)null);
        this.e = (MediaImageView)this.c.findViewById(2131886982);
        this.f = (TextView)this.c.findViewById(2131886983);
        this.h = this.c.findViewById(2131886980);
        this.i = this.c.findViewById(2131886452);
        this.j = (TextView)this.c.findViewById(2131886461);
        this.k = (LinearLayout)this.c.findViewById(2131887049);
        this.l = (TextView)this.c.findViewById(2131886984);
        (this.g = (MediaImageView)this.c.findViewById(2131887048)).setAspectRatio(2.5f);
        this.m = (TwitterButton)this.c.findViewById(2131886978);
        this.a(this.a);
    }
    
    private void a(final Context context) {
        final int screenWidthDp = context.getResources().getConfiguration().screenWidthDp;
        final boolean b = (screenWidthDp >= 540 && screenWidthDp < 900) || screenWidthDp >= 1024;
        if (this.d == DisplayMode.b) {
            this.g.getLayoutParams().width = -1;
        }
        else if (b) {
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams = (RelativeLayout$LayoutParams)this.g.getLayoutParams();
            final int bottomMargin = relativeLayout$LayoutParams.bottomMargin;
            relativeLayout$LayoutParams.bottomMargin = 0;
            ((RelativeLayout$LayoutParams)this.g.getLayoutParams()).width = context.getResources().getDimensionPixelSize(2131558432);
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams2 = (RelativeLayout$LayoutParams)this.i.getLayoutParams();
            relativeLayout$LayoutParams2.addRule(1, this.g.getId());
            relativeLayout$LayoutParams2.addRule(6, this.g.getId());
            relativeLayout$LayoutParams2.addRule(8, this.g.getId());
            relativeLayout$LayoutParams2.addRule(5, 0);
            relativeLayout$LayoutParams2.addRule(7, 0);
            relativeLayout$LayoutParams2.addRule(3, 0);
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams3 = (RelativeLayout$LayoutParams)this.h.getLayoutParams();
            relativeLayout$LayoutParams3.addRule(0, 0);
            relativeLayout$LayoutParams3.leftMargin = bottomMargin;
            relativeLayout$LayoutParams3.bottomMargin = bottomMargin;
            final RelativeLayout$LayoutParams relativeLayout$LayoutParams4 = (RelativeLayout$LayoutParams)this.m.getLayoutParams();
            relativeLayout$LayoutParams4.addRule(3, this.h.getId());
            relativeLayout$LayoutParams4.addRule(11, 0);
        }
    }
    
    private void e(final vc vc) {
        this.a(vc);
        this.b(vc);
        if (this.h != null) {
            this.h.setOnTouchListener((View$OnTouchListener)this.r);
            this.h.setTag((Object)"stats_container");
        }
    }
    
    @Override
    public void a() {
        if (this.g != null) {
            this.g.setFromMemoryOnly(false);
        }
        if (this.e != null) {
            this.e.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final TwitterUser twitterUser) {
        if (this.d == DisplayMode.b) {
            if (this.f != null) {
                this.f.setVisibility(0);
                this.f.setText((CharSequence)twitterUser.name);
                this.f.setTag((Object)"author_name");
                this.f.setOnTouchListener((View$OnTouchListener)new ae(this, n));
            }
            if (this.e != null) {
                this.e.setVisibility(0);
                this.e.a(com.twitter.library.media.manager.j.a(twitterUser.profileImageUrl));
                this.e.setFromMemoryOnly(true);
                this.e.setTag((Object)"author_image");
                this.e.setOnTouchListener((View$OnTouchListener)new af(this, n));
            }
        }
    }
    
    @Override
    public void a(final long n, final vc vc) {
        this.o = um.a("app_url", "app_url_resolved", vc);
        this.p = wb.a("app_id", vc);
        this.q = wb.a("card_url", vc);
        this.B.a(wb.a("_card_data", vc));
        this.e(vc);
        this.c(vc);
        this.d(vc);
        this.f();
    }
    
    @Override
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.n != null) {
            wh.a().b(this.n, this);
        }
        uy.a().b(this.u, this);
        if (this.g != null) {
            this.g.b();
        }
        if (this.e != null) {
            this.e.b();
        }
    }
    
    protected void a(final View view, final MotionEvent motionEvent) {
        this.D.a(this.o, this.p, this.q, NativeCardUserAction.a(this.d(), view, motionEvent, 0));
    }
    
    void a(final vc vc) {
        if (this.j != null) {
            this.s = (String)vc.a("title", String.class);
            this.j.setText((CharSequence)this.s);
            this.j.setTypeface(com.twitter.android.revenue.card.j.a);
        }
    }
    
    @Override
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.u = vq.b;
        uy.a().a(this.u, this);
        this.n = vn.a("site", vq.c);
        if (this.n != null) {
            wh.a().a(this.n, this);
        }
    }
    
    void b(final vc vc) {
        final Double a = vf.a("app_star_rating", vc);
        if (this.k != null && a != null) {
            com.twitter.android.revenue.a.a(this.a, this.k, 2130839287, 2130839291, 2130839289, this.a.getResources().getDimensionPixelOffset(2131558935), (float)(Object)a, 5.0f);
        }
        if (this.l != null) {
            final String s = (String)vc.a("app_num_ratings", String.class);
            if (!TextUtils.isEmpty((CharSequence)s)) {
                this.l.setTypeface(com.twitter.android.revenue.card.j.a);
                this.l.setText((CharSequence)this.a.getResources().getString(this.c(), new Object[] { s }));
            }
        }
    }
    
    protected int c() {
        return 2131296450;
    }
    
    void c(final vc vc) {
        final vj a = vj.a(this.e(), vc);
        if (a != null) {
            this.t = a.a;
            this.g.a(com.twitter.library.media.manager.j.a(a.a));
            this.g.setFromMemoryOnly(true);
            this.g.setTag((Object)this.e());
            this.g.setAspectRatio(a.a(2.5f));
            this.g.setOnTouchListener((View$OnTouchListener)this.r);
        }
    }
    
    @Override
    public View d() {
        return (View)this.c;
    }
    
    void d(final vc vc) {
        int intValue = 0;
        switch (ah.a[this.D.a(this.p).ordinal()]) {
            default: {
                intValue = 2131296449;
                break;
            }
            case 1: {
                final Integer n = aj.l.get(vc.a("cta_key", String.class));
                if (n != null) {
                    intValue = n;
                    break;
                }
                intValue = 2131296322;
                break;
            }
            case 2: {
                intValue = 2131296320;
                break;
            }
        }
        this.m.setText(intValue);
        this.m.setTag((Object)"button");
        this.m.setOnTouchListener((View$OnTouchListener)new ag(this, this.m));
    }
    
    protected String e() {
        return "promo_image";
    }
    
    void f() {
        this.i.setTag((Object)"container");
        this.i.setOnTouchListener((View$OnTouchListener)this.r);
    }
}
