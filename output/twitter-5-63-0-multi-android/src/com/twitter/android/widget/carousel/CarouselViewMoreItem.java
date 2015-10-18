// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget.carousel;

import android.view.View$MeasureSpec;
import com.twitter.library.av.playback.PlaybackMode;
import com.twitter.library.av.playback.ar;
import com.twitter.library.av.playback.w;
import com.twitter.library.av.playback.aa;
import com.twitter.internal.android.util.Size;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.av.playback.au;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.provider.Tweet;
import com.twitter.library.av.ExpandableVideoPlayerView;
import com.twitter.library.av.y;
import com.twitter.library.av.playback.av;
import com.twitter.library.av.ak;
import com.twitter.library.av.playback.p;
import com.twitter.library.av.control.f;
import android.view.ViewGroup;

public class CarouselViewMoreItem extends ViewGroup
{
    private f a;
    private p b;
    private int c;
    private int d;
    private boolean e;
    private ak f;
    private final av g;
    private final y h;
    private ExpandableVideoPlayerView i;
    private Tweet j;
    private AVPlayer k;
    private au l;
    private TwitterScribeAssociation m;
    
    public CarouselViewMoreItem(final Context context, final AttributeSet set, final int n) {
        this(context, set, n, p.a(), new y(), new av());
    }
    
    CarouselViewMoreItem(final Context context, final AttributeSet set, final int n, final p b, final y h, final av g) {
        super(context, set, n);
        this.c = 13;
        this.d = -1;
        this.e = false;
        this.f = ak.c;
        this.a(context);
        this.b = b;
        this.h = h;
        this.g = g;
    }
    
    public CarouselViewMoreItem(final Context context, final p p2) {
        this(context, null, 0, p2, new y(), new av());
    }
    
    private void a(final int n, final AVPlayer avPlayer) {
        if (this.i == null || this.i.getParent() == null) {
            (this.i = this.h.a(this.getContext(), avPlayer)).setIsFullScreenToggleAllowed(false);
            this.i.setId(2131886087);
            this.addView((View)this.i, new ViewGroup$LayoutParams(-1, -1));
        }
        final Size m = avPlayer.M();
        if (m != Size.a) {
            this.i.a(m.a(), m.b());
        }
        if (this.a(n)) {
            avPlayer.a(new aa(this.k));
        }
    }
    
    private void a(final Context context) {
        this.setBackgroundColor(16711680);
    }
    
    private boolean a(final int n) {
        return n == 12 || n == 11;
    }
    
    private AVPlayer b(final int n) {
        final boolean a = this.a(n);
        this.l = this.getAVPlayerConfig();
        if (a) {
            return new ar(this.b).a(this.getContext()).a(this.l).a(PlaybackMode.b).a(false).a();
        }
        return new ar(this.b).a(this.l).a();
    }
    
    public void a(final int n, final boolean b) {
        if (n != this.c || !this.e) {
            if (this.getWidth() == 0 || this.getHeight() == 0) {
                this.d = n;
                return;
            }
            this.e = true;
            this.d = -1;
            switch (this.c = n) {
                default: {
                    this.f = ak.c;
                    break;
                }
                case 11: {
                    this.f = ak.a;
                    break;
                }
                case 12: {
                    this.f = ak.b;
                    break;
                }
            }
            if (this.i != null) {
                this.i.a(this.f, b);
            }
        }
    }
    
    public void a(final f f) {
        if (this.k != null) {
            (this.a = f).a(this.getContext(), this.k);
            if (this.i != null) {
                this.i.setExternalChromeView(f);
            }
        }
    }
    
    public void a(final Tweet j, final int n, final TwitterScribeAssociation m) {
        if (!j.equals(this.j)) {
            if (this.k != null && this.l != null) {
                this.b.a(this.l);
                this.k.j();
            }
            this.l = null;
            this.j = j;
            this.m = m;
            final AVPlayer b = this.b(n);
            this.removeAllViews();
            this.a(n, b);
            this.k = b;
            this.a(n, false);
        }
    }
    
    public AVPlayer getAVPlayer() {
        return this.k;
    }
    
    public au getAVPlayerConfig() {
        if (this.l == null) {
            this.l = this.g.a(this.j, "VMAP", this.m);
        }
        return this.l;
    }
    
    public int getState() {
        if (this.d != -1) {
            return this.d;
        }
        return this.c;
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int n5 = n3 - n;
        final int n6 = n4 - n2;
        if (this.i != null) {
            this.i.layout(0, 0, n5, n6);
        }
        if (this.d != -1) {
            this.a(this.d, false);
        }
    }
    
    protected void onMeasure(final int n, final int n2) {
        this.setMeasuredDimension(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        if (this.i != null) {
            this.i.measure(n, n2);
        }
    }
}
