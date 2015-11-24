// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.View$MeasureSpec;
import com.twitter.library.av.control.f;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup$LayoutParams;
import com.twitter.library.av.playback.bf;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Point;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

public class ExpandableVideoPlayerView extends VideoPlayerView implements ViewTreeObserver$OnGlobalLayoutListener
{
    private final x g;
    private ak h;
    private Point i;
    private Rect j;
    
    public ExpandableVideoPlayerView(final Context context, final AVPlayer avPlayer) {
        this(context, avPlayer, new VideoViewContainer(context, avPlayer), new ap());
    }
    
    ExpandableVideoPlayerView(final Context context, final AVPlayer avPlayer, final VideoViewContainer videoViewContainer, final ap ap) {
        super(context, avPlayer, videoViewContainer, ap, VideoPlayerView$Mode.c);
        this.h = ak.a;
        this.i = new Point();
        this.j = new Rect();
        this.g = new x(this);
        this.f.setImageSpec(bf.f(avPlayer.q()));
        final ViewGroup$LayoutParams layoutParams = this.f.getView().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = -1;
            layoutParams.width = -1;
            this.f.getView().setLayoutParams(layoutParams);
        }
    }
    
    private void n() {
        int visibility = 4;
        final View videoViewContainer = this.getVideoViewContainer();
        int visibility2;
        if (this.h == ak.c) {
            visibility2 = visibility;
        }
        else {
            visibility2 = 0;
        }
        videoViewContainer.setVisibility(visibility2);
        final View view = this.f.getView();
        if (this.h == ak.c) {
            visibility = 0;
        }
        view.setVisibility(visibility);
    }
    
    @Override
    public void a(final int n, final int n2) {
        super.a(n, n2);
        if (this.g != null) {
            this.g.a(this.h, false);
        }
    }
    
    public void a(final ak h, final boolean b) {
        this.h = h;
        this.n();
        this.g.a(h, b);
    }
    
    @Override
    protected boolean a() {
        return true;
    }
    
    public ao getVideoThumbView() {
        return this.f;
    }
    
    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    protected void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
    }
    
    public void onGlobalLayout() {
        if (this.getWidth() != 0 && this.getHeight() != 0) {
            this.i.set(this.getWidth(), this.getHeight());
            this.g.a(this.h, this.i, false);
            this.getViewTreeObserver().removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final View videoViewContainer = this.getVideoViewContainer();
        videoViewContainer.layout(videoViewContainer.getLeft(), videoViewContainer.getTop(), videoViewContainer.getRight(), videoViewContainer.getBottom());
        final f chromeView = this.getChromeView();
        if (chromeView != null) {
            final View view = chromeView.getView();
            if (view != null) {
                chromeView.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        final int measuredWidth = this.f.getView().getMeasuredWidth();
        final int measuredHeight = this.f.getView().getMeasuredHeight();
        this.j.left = (this.i.x - measuredWidth) / 2;
        this.j.right = measuredWidth + this.j.left;
        this.j.top = (this.i.y - measuredHeight) / 2;
        this.j.bottom = measuredHeight + this.j.top;
        this.f.getView().layout(this.j.left, this.j.top, this.j.right, this.j.bottom);
        this.f.getView().setPivotY((float)(this.j.height() / 2));
        this.f.getView().setPivotX((float)(this.j.width() / 2));
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        super.onMeasure(n, n2);
        this.i.set(View$MeasureSpec.getSize(n), View$MeasureSpec.getSize(n2));
        final Point a = ak.b.a(this.i, this.i);
        if (a.x > 0 && a.y > 0) {
            this.f.getView().measure(View$MeasureSpec.makeMeasureSpec(a.x, 1073741824), View$MeasureSpec.makeMeasureSpec(a.y, 1073741824));
        }
    }
}
