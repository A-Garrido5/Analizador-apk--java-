// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.audio;

import android.graphics.PointF;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.android.widget.m;
import com.twitter.android.av.af;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import android.view.ViewGroup;
import com.twitter.library.card.Card;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.av.model.factory.b;
import com.twitter.library.av.playback.av;
import com.twitter.android.widget.bg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import android.content.Intent;
import com.twitter.library.av.playback.au;
import android.content.res.Configuration;
import com.twitter.android.widget.ExpandableViewHost;
import java.util.Collections;
import android.os.Handler;
import com.twitter.library.av.model.Partner;
import java.util.Map;
import com.twitter.library.card.element.l;
import com.twitter.android.av.AVCardCanvasActivity;

public class AudioCardViewerActivity extends AVCardCanvasActivity
{
    private com.twitter.library.card.element.l q;
    private boolean r;
    private Map s;
    private Partner t;
    private final Runnable u;
    private final Handler v;
    
    public AudioCardViewerActivity() {
        this.q = new com.twitter.library.card.element.l();
        this.s = Collections.emptyMap();
        this.t = Partner.a;
        this.u = new d(this);
        this.v = new Handler();
    }
    
    private void n() {
        final Intent intent = this.getIntent();
        if (intent != null) {
            final Partner t = (Partner)intent.getSerializableExtra("extra_partner");
            final Map s = (Map)intent.getSerializableExtra("extra_metadata");
            if (t != null) {
                this.t = t;
            }
            if (s != null) {
                this.s = s;
            }
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        super.a(bundle, bn);
        bn.c(bg.d());
        bn.c(2130968598);
        return bn;
    }
    
    @Override
    protected com.twitter.library.av.playback.au a(final Bundle bundle) {
        this.n();
        return new av().a(this.f, "audio", this.n, new b(), this.s, this.t, this.h, null);
    }
    
    @Override
    public void a(final Bundle bundle, final com.twitter.library.client.d d) {
        super.a(bundle, d);
        if (bg.d() && this.f != null) {
            bg.a().b(String.valueOf(this.f.D), 2);
        }
    }
    
    @Override
    public void d_() {
        this.q.a((ViewGroup)this.d);
        super.d_();
    }
    
    @Override
    protected void h() {
        this.o.a("click");
    }
    
    @Override
    protected void i() {
        this.v.postDelayed(this.u, 499L);
        this.e.setVisibility(4);
        ((AudioCardPlayerView)this.a).getContentView().setVisibility(8);
        super.i();
    }
    
    @Override
    protected void j() {
        this.v.removeCallbacks(this.u);
        if (!this.r) {
            this.d.setVisibility(4);
            this.d.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
        this.r = false;
        ((AudioCardPlayerView)this.a).setCallToActionListener(this);
        super.j();
    }
    
    @Override
    protected Runnable k() {
        return new e(this);
    }
    
    @Override
    protected void m() {
        PointF pointF;
        if (this.l != null) {
            pointF = this.l;
        }
        else {
            pointF = this.j;
        }
        PointF pointF2;
        if (this.k != null) {
            pointF2 = this.k;
        }
        else {
            pointF2 = this.i;
        }
        final m m = new m(this.getApplicationContext());
        this.o.b(PlaybackMode.c);
        m.a(this.o);
        this.o.a("dock");
        this.d.a(pointF, pointF2, new f(this, m));
    }
    
    @Override
    public void onDestroy() {
        this.v.removeCallbacks(this.u);
        super.onDestroy();
    }
}
