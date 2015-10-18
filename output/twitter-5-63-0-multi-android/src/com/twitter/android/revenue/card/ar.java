// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.library.media.manager.j;
import android.view.View$OnTouchListener;
import com.twitter.android.browser.a;
import android.view.MotionEvent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import com.twitter.android.revenue.c;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.util.ao;
import android.view.View;
import com.twitter.ui.widget.TwitterButton;
import android.widget.TextView;
import com.twitter.library.media.widget.MediaImageView;

public class ar extends aj implements uz
{
    protected int d;
    protected String e;
    protected String f;
    protected MediaImageView g;
    protected TextView h;
    protected TwitterButton i;
    protected View j;
    protected final ao k;
    protected DisplayMode q;
    
    ar(final l l) {
        this(l, 2130968935);
    }
    
    ar(final l l, final int d) {
        super(l, null);
        this.k = new as(this);
        this.d = d;
    }
    
    protected float a(final vj vj) {
        return 2.5f;
    }
    
    public void a() {
        if (this.g != null) {
            this.g.setFromMemoryOnly(false);
        }
    }
    
    @Override
    public void a(final long n, final vc vc) {
        this.e = wb.a(this.c(), vc);
        this.f = wb.a("website_dest_url", vc);
        final Boolean a = up.a("prefetch_markup", vc);
        final boolean b = a == null || a;
        final Context e = this.p.e();
        final Tweet c = this.p.c();
        if (com.twitter.android.revenue.c.a(e, this.e, this.f, c != null && c.m(), b)) {
            com.twitter.android.client.c.a(e).b().a(this.f);
        }
        this.p.f().a((String)vc.a("_card_data", String.class));
        this.c(vc);
        this.b(vc);
        this.d(vc);
        this.d();
    }
    
    @Override
    protected void a(final Context context, final DisplayMode q) {
        this.m = LayoutInflater.from(context).inflate(this.d, (ViewGroup)null);
        this.g = (MediaImageView)this.m.findViewById(2131886977);
        if (this.g != null) {
            this.g.setAspectRatio(2.5f);
        }
        this.i = (TwitterButton)this.m.findViewById(2131886978);
        this.h = (TextView)this.m.findViewById(2131886985);
        this.j = this.m.findViewById(2131886460);
        this.q = q;
    }
    
    public void a(final Bundle bundle) {
        super.a(bundle);
        if (this.g != null) {
            this.g.b();
        }
        uy.a().b(this.n, this);
    }
    
    protected void a(final View view, final MotionEvent motionEvent) {
        if (c.a(view.getContext(), this.e, this.f)) {
            new a().execute((Object[])new String[] { this.e, this.f });
            this.a(view, motionEvent, this.f);
            return;
        }
        this.a(view, motionEvent, this.e);
    }
    
    public void a(final vq vq, final Bundle bundle) {
        super.a(vq, bundle);
        uy.a().a(this.n, this);
    }
    
    protected String b() {
        return "promo_image";
    }
    
    void b(final vc vc) {
        if (this.h != null) {
            final String a = wb.a("title", vc);
            if (a != null) {
                this.h.setText((CharSequence)a);
                this.h.setTag((Object)"title");
                this.h.setOnTouchListener((View$OnTouchListener)this.k);
            }
        }
    }
    
    protected String c() {
        return "website_url";
    }
    
    void c(final vc vc) {
        if (this.g != null) {
            final vj a = vj.a(this.b(), vc);
            if (a != null) {
                this.g.setAspectRatio(this.a(a));
                this.g.a(com.twitter.library.media.manager.j.a(a.a));
                this.g.setFromMemoryOnly(true);
                this.g.setTag((Object)"promo_image");
                this.g.setOnTouchListener((View$OnTouchListener)this.k);
            }
        }
    }
    
    void d() {
        if (this.j != null) {
            this.j.setOnTouchListener((View$OnTouchListener)this.k);
        }
    }
    
    void d(final vc vc) {
        if (this.i != null) {
            this.i.setText(aj.a(vc, 2131296769));
            this.i.setTag((Object)"button");
            this.i.setOnTouchListener((View$OnTouchListener)new at(this, this.i));
        }
    }
}
