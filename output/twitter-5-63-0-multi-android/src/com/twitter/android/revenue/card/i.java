// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import android.view.View$OnTouchListener;
import com.twitter.library.util.bo;
import com.twitter.ui.widget.TwitterButton;
import com.twitter.library.media.widget.MediaImageView;
import android.view.ViewStub;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.view.LayoutInflater;
import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.featureswitch.d;
import android.content.Context;
import com.twitter.library.util.bj;
import com.twitter.util.t;
import com.twitter.util.c;
import android.view.View;
import android.widget.TextView;

public class i extends ar
{
    protected boolean a;
    protected TextView b;
    protected View c;
    
    i(final l l) {
        this(l, 2130968911);
    }
    
    i(final l l, final int n) {
        super(l, n);
        final Context e = l.e();
        if (!(this.a = (!com.twitter.util.c.g(e) || t.a(e).b() >= bj.a(600.0f)))) {
            this.d = 2130968933;
        }
    }
    
    @Override
    protected float a(final vj vj) {
        float n = 2.5f;
        if (!this.a) {
            n = 1.0f;
        }
        else {
            float n2;
            if (vj.a(n) >= n) {
                n2 = n;
            }
            else {
                n2 = 2.0f;
            }
            if (!com.twitter.library.featureswitch.d.a("card_registry_native_summary_to_website_android_2882", new String[] { "interim_summary_and_website" })) {
                return n2;
            }
        }
        return n;
    }
    
    @Override
    public void a(final long n, final vc vc) {
        super.a(n, vc);
        this.a(vc);
    }
    
    @Override
    protected void a(final Context context, final DisplayMode q) {
        this.m = LayoutInflater.from(context).inflate(2130968914, (ViewGroup)new FrameLayout(context), false);
        final ViewStub viewStub = (ViewStub)this.m.findViewById(2131886986);
        viewStub.setLayoutResource(this.d);
        viewStub.inflate();
        this.c = this.m.findViewById(2131886987);
        this.k.a(this.c);
        this.g = (MediaImageView)this.m.findViewById(2131886977);
        if (this.g != null) {
            this.g.setAspectRatio(2.5f);
        }
        this.b = (TextView)this.m.findViewById(2131886972);
        this.i = (TwitterButton)this.m.findViewById(2131886978);
        this.h = (TextView)this.m.findViewById(2131886985);
        this.j = this.m.findViewById(2131886460);
        this.q = q;
    }
    
    void a(final vc vc) {
        if (this.b != null) {
            final String a = wb.a("vanity_url", vc);
            this.b.setTextSize(0, bo.a);
            if (a == null) {
                this.b.setText(2131298142);
            }
            else {
                this.b.setText((CharSequence)a);
            }
            this.b.setTag((Object)"vanity_url");
            this.b.setOnTouchListener((View$OnTouchListener)this.k);
        }
    }
    
    @Override
    void b(final vc vc) {
        super.b(vc);
        if (this.h != null) {
            this.h.setTextSize(0, bo.a);
        }
    }
}
