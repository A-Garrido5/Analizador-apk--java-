// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.content.Intent;
import android.content.res.Configuration;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;
import com.twitter.ui.widget.TwitterButton;
import android.view.View$OnTouchListener;
import android.view.View$OnClickListener;
import com.twitter.android.card.t;
import com.twitter.android.card.v;
import android.app.Activity;
import com.twitter.android.card.h;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.twitter.library.media.manager.j;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.util.g;
import android.content.Context;
import com.twitter.library.card.Card;
import java.util.Map;
import com.twitter.library.av.model.factory.a;
import com.twitter.library.av.model.Partner;
import java.util.Collections;
import com.twitter.library.av.playback.av;
import com.twitter.library.av.model.factory.VideoPlaylistFactory;
import com.twitter.library.av.playback.au;
import com.twitter.android.widget.bg;
import com.twitter.android.client.bn;
import android.os.Bundle;
import com.twitter.util.c;
import android.widget.FrameLayout$LayoutParams;
import com.twitter.library.scribe.NativeCardUserAction;
import android.view.MotionEvent;
import android.view.View;
import com.twitter.android.media.camera.z;
import android.widget.Button;
import com.twitter.android.card.CardActionHelper;
import com.twitter.library.util.ao;
import com.twitter.android.media.camera.ab;
import com.twitter.android.av.AVCardCanvasActivity;

public class VideoCardCanvasActivity extends AVCardCanvasActivity implements ab
{
    private VideoCardData q;
    private com.twitter.library.util.ao r;
    private CardActionHelper s;
    private Button t;
    private String u;
    private z v;
    
    private void a(final View view, final MotionEvent motionEvent) {
        this.s.a(this.q.g, this.u, this.q.i, NativeCardUserAction.a((View)this.a, view, motionEvent, 0));
    }
    
    private void b(final int n) {
        final FrameLayout$LayoutParams frameLayout$LayoutParams = (FrameLayout$LayoutParams)((VideoAppCardView)this.a).getLayoutParams();
        int dimensionPixelSize;
        if (2 == n) {
            dimensionPixelSize = 0;
            com.twitter.util.c.a((View)this.d);
        }
        else {
            dimensionPixelSize = this.getResources().getDimensionPixelSize(2131558928);
            com.twitter.util.c.b((View)this.d);
        }
        frameLayout$LayoutParams.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
    }
    
    private void n() {
        if (this.t != null) {
            switch (com.twitter.android.av.videoapp.d.a[this.s.a(this.q.f).ordinal()]) {
                default: {
                    this.t.setText(2131298116);
                    break;
                }
                case 1: {
                    this.t.setText(2131296759);
                }
                case 2: {
                    this.t.setText(2131297103);
                }
            }
        }
    }
    
    @Override
    public bn a(final Bundle bundle, final bn bn) {
        super.a(bundle, bn);
        bn.c(bg.c());
        bn.c(2130969197);
        return bn;
    }
    
    @Override
    protected com.twitter.library.av.playback.au a(final Bundle bundle) {
        final VideoPlaylistFactory videoPlaylistFactory = new VideoPlaylistFactory();
        videoPlaylistFactory.a(true);
        return new av().a(this.f, "VMAP", this.n, videoPlaylistFactory, Collections.emptyMap(), Partner.a, this.h, null);
    }
    
    @Override
    public void a(final int n) {
        int n2;
        int n3;
        if (1 == z.b((Context)this)) {
            n2 = 90;
            n3 = 270;
        }
        else {
            n3 = 180;
            n2 = 0;
        }
        if (com.twitter.util.g.b(n, n2, 10) || com.twitter.util.g.b(n, n3, 10)) {
            this.setRequestedOrientation(4);
        }
    }
    
    @Override
    public void a(final Bundle bundle, final com.twitter.library.client.d d) {
        super.a(bundle, d);
        this.q = (VideoCardData)this.getIntent().getExtras().getParcelable("video_canvas_data");
        if (this.q == null) {
            this.finish();
            return;
        }
        this.u = this.q.f;
        final MediaImageView mediaImageView = (MediaImageView)this.findViewById(2131886363);
        mediaImageView.a(com.twitter.library.media.manager.j.a(this.q.a));
        mediaImageView.setAspectRatio(1.7777778f);
        final MediaImageView mediaImageView2 = (MediaImageView)this.findViewById(2131887343);
        Label_0578: {
            if (this.q.h == null) {
                break Label_0578;
            }
            mediaImageView2.a(com.twitter.library.media.manager.j.a(this.q.h));
        Label_0208_Outer:
            while (true) {
                this.t = (Button)this.findViewById(2131886272);
                final TextView textView = (TextView)this.findViewById(2131886291);
                final TextView textView2 = (TextView)this.findViewById(2131887344);
                final View viewById = this.findViewById(2131887347);
                final LinearLayout linearLayout = (LinearLayout)this.findViewById(2131887049);
                textView.setText((CharSequence)this.q.b);
                Label_0238: {
                    if (this.q.d == null) {
                        break Label_0238;
                    }
                    while (true) {
                        try {
                            final float float1 = Float.parseFloat(this.q.d);
                            com.twitter.android.revenue.a.a((Context)this, linearLayout, 2130839287, 2130839291, 2130839289, this.getResources().getDimensionPixelOffset(2131558935), float1, 5.0f);
                            ((TextView)this.findViewById(2131886984)).setText((CharSequence)this.getResources().getString(2131298102, new Object[] { this.q.e }));
                            if (this.q.c != null) {
                                textView2.setText((CharSequence)this.q.c);
                            }
                            final h h = new h(this);
                            final v v = new v((Context)this);
                            v.a(this.h);
                            v.a(this.f);
                            this.s = new CardActionHelper((Context)this, h, v, "video_app_card_canvas");
                            final View viewById2 = this.findViewById(2131886300);
                            if (viewById2 != null) {
                                viewById2.setOnClickListener((View$OnClickListener)new com.twitter.android.av.videoapp.a(this));
                            }
                            viewById.setOnTouchListener((View$OnTouchListener)(this.r = new b(this)));
                            com.twitter.library.util.ao r;
                            if (this.t instanceof TwitterButton) {
                                r = new com.twitter.android.av.videoapp.c(this, (TwitterButton)this.t);
                            }
                            else {
                                r = this.r;
                            }
                            this.t.setOnTouchListener((View$OnTouchListener)r);
                            ((VideoAppCardView)this.a).setVideoCardData(this.q);
                            ((VideoAppCardView)this.a).setActionHelper(this.s);
                            final bg a = bg.a();
                            if (bg.b() && this.f != null) {
                                com.twitter.android.widget.a.a(a, this.f);
                                a.a(com.twitter.android.widget.a.a(this.f), 1);
                                a.a(2);
                            }
                            (this.v = new z(this.getApplicationContext())).a(this);
                            this.d.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
                            this.b(this.getResources().getConfiguration().orientation);
                            return;
                            mediaImageView2.setBackgroundResource(2130839018);
                            continue Label_0208_Outer;
                        }
                        catch (NumberFormatException ex) {
                            final float float1 = 0.0f;
                            continue;
                        }
                        break;
                    }
                }
                break;
            }
        }
    }
    
    @Override
    public void aj_() {
        ((VideoAppCardView)this.a).p();
    }
    
    @Override
    protected void m() {
    }
    
    @Override
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.b(configuration.orientation);
        ((VideoAppCardView)this.a).a(this.o, configuration);
    }
    
    @Override
    protected void onNewIntent(final Intent intent) {
        super.onNewIntent(intent);
        this.setIntent(intent);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (2 == this.getResources().getConfiguration().orientation) {
            com.twitter.util.c.a((View)this.d);
            return;
        }
        com.twitter.util.c.b((View)this.d);
    }
    
    public void onWindowFocusChanged(final boolean b) {
        super.onWindowFocusChanged(b);
        if (b) {
            this.n();
        }
    }
}
