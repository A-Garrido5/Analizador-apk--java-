// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.library.util.bj;
import android.content.res.Resources;
import android.view.View$OnTouchListener;
import com.twitter.library.media.manager.j;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.os.Bundle;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.text.TextUtils;
import com.twitter.android.card.CardActionHelper$AppStatus;
import android.content.Context;
import com.twitter.library.util.ao;
import android.view.View;
import com.twitter.ui.widget.TwitterButton;
import android.widget.RatingBar;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.android.card.CardActionHelper;

public class w extends aj implements uz
{
    CardActionHelper a;
    DisplayMode b;
    MediaImageView c;
    TextView d;
    TextView e;
    TextView f;
    RatingBar g;
    TwitterButton h;
    View i;
    private final ao j;
    private final Context k;
    private um q;
    private String r;
    private String s;
    
    w(final l l) {
        super(l, null);
        this.k = l.e();
        this.j = new x(this);
    }
    
    int a(final CardActionHelper$AppStatus cardActionHelper$AppStatus) {
        switch (aa.a[cardActionHelper$AppStatus.ordinal()]) {
            default: {
                return this.g();
            }
            case 1: {
                return this.e();
            }
            case 2: {
                return this.f();
            }
        }
    }
    
    String a(final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return s;
        }
        return Character.toTitleCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
    
    public void a() {
        if (this.c != null) {
            this.c.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final vc vc) {
        this.q = um.a("app_url", "app_url_resolved", vc);
        this.r = (String)vc.a("app_id", String.class);
        this.s = (String)vc.a("card_url", String.class);
        this.p.f().a((String)vc.a("_card_data", String.class));
        this.p.f().a(vc);
        this.a(vc);
        this.b(vc);
        this.d();
    }
    
    @Override
    protected void a(final Context context, final DisplayMode b) {
        this.b = b;
        this.a = new CardActionHelper(context, this.p.g(), this.p.f(), "platform_card");
        this.m = LayoutInflater.from(context).inflate(this.c(), (ViewGroup)null);
        this.c = (MediaImageView)this.m.findViewById(2131886977);
        if (this.c != null) {
            this.c.setAspectRatio(1.0f);
        }
        this.d = (TextView)this.m.findViewById(2131886461);
        this.e = (TextView)this.m.findViewById(2131886981);
        this.i = this.m.findViewById(2131887046);
        this.f = (TextView)this.m.findViewById(2131886984);
        this.g = (RatingBar)this.m.findViewById(2131887047);
        this.h = (TwitterButton)this.m.findViewById(2131886978);
        this.m.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)new y(this));
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.c != null) {
            this.c.b();
        }
        this.b().b(this.n, this);
    }
    
    void a(final View view, final MotionEvent motionEvent) {
        this.a.a(this.q, this.r, this.s, NativeCardUserAction.a(this.h(), view, motionEvent, 0));
    }
    
    void a(final vc vc) {
        final vj a = vj.a("thumbnail", vc);
        if (a != null) {
            this.c.setAspectRatio(a.a(1.0f));
            this.c.a(com.twitter.library.media.manager.j.a(a.a));
            this.c.setFromMemoryOnly(true);
        }
        this.c.setTag((Object)"thumbnail");
        this.c.setOnTouchListener((View$OnTouchListener)this.j);
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        this.b().a(this.n, this);
    }
    
    uy b() {
        return uy.a();
    }
    
    void b(final vc vc) {
        this.c(vc);
        this.g(vc);
        this.d(vc);
    }
    
    int c() {
        return 2130968928;
    }
    
    void c(final vc vc) {
        this.d.setTypeface(com.twitter.android.revenue.card.j.b);
        this.d.setText((CharSequence)vc.a("title", String.class));
    }
    
    void d() {
        this.h.setText(this.a(this.a.a(this.r)));
        this.h.setTag((Object)"button");
        this.h.setOnTouchListener((View$OnTouchListener)new z(this, this.h));
    }
    
    void d(final vc vc) {
        final Double a = vf.a("app_star_rating", vc);
        if (a != null && a >= 3.0) {
            this.e(vc);
            this.f(vc);
            return;
        }
        this.i.setVisibility(8);
    }
    
    int e() {
        return 2131296322;
    }
    
    void e(final vc vc) {
        final Resources resources = this.k.getResources();
        final String s = (String)vc.a("app_num_ratings", String.class);
        this.f.setTypeface(com.twitter.android.revenue.card.j.a);
        if (!TextUtils.isEmpty((CharSequence)s)) {
            this.f.setText((CharSequence)resources.getString(2131296451, new Object[] { s }));
        }
    }
    
    int f() {
        return 2131296320;
    }
    
    void f(final vc vc) {
        final Double a = vf.a("app_star_rating", vc);
        if (a != null) {
            this.g.setRating((float)(Object)a);
        }
    }
    
    int g() {
        return 2131296449;
    }
    
    void g(final vc vc) {
        final Resources resources = this.k.getResources();
        String a = (String)vc.a("app_price", String.class);
        if (TextUtils.isEmpty((CharSequence)a)) {
            a = this.a(resources.getString(2131296316));
        }
        final String string = resources.getString(2131297443);
        String text;
        if (bj.e) {
            text = string + " \u2022 " + a;
        }
        else {
            text = a + " \u2022 " + string;
        }
        this.e.setTypeface(com.twitter.android.revenue.card.j.a);
        this.e.setText((CharSequence)text);
    }
}
