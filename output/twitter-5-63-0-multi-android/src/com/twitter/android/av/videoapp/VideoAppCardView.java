// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av.videoapp;

import android.view.View$MeasureSpec;
import com.twitter.library.av.l;
import android.view.View$OnClickListener;
import com.twitter.library.av.VideoPlayerView$Mode;
import android.view.View;
import com.twitter.library.av.playback.AVPlayer;
import com.twitter.library.av.playback.AVPlayer$PlayerStartType;
import com.twitter.library.av.playback.PlaybackMode;
import android.content.res.Configuration;
import com.twitter.util.c;
import android.graphics.PorterDuff$Mode;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.android.card.CardActionHelper;
import android.view.ViewGroup;
import com.twitter.library.media.widget.MediaImageView;
import com.twitter.android.av.AVBaseCardCanvasView;

public class VideoAppCardView extends AVBaseCardCanvasView
{
    private VideoPlayerCanvasView g;
    private final MediaImageView h;
    private final ViewGroup i;
    private final ViewGroup j;
    private boolean k;
    private CardActionHelper l;
    private VideoCardData m;
    
    public VideoAppCardView(final Context context) {
        this(context, null, 0);
    }
    
    public VideoAppCardView(final Context context, final AttributeSet set) {
        this(context, set, 0);
    }
    
    public VideoAppCardView(final Context context, final AttributeSet set, final int n) {
        super(context, set);
        this.i = (ViewGroup)this.findViewById(2131886452);
        this.h = (MediaImageView)this.findViewById(2131886363);
        this.j = (ViewGroup)this.findViewById(2131887346);
        this.e.setColorFilter(context.getResources().getColor(2131689520), PorterDuff$Mode.SRC_ATOP);
        this.a();
    }
    
    private void q() {
        if (com.twitter.util.c.g(this.getContext())) {
            this.i.setVisibility(8);
            this.j.setBackgroundColor(0);
            return;
        }
        this.i.setVisibility(0);
        this.j.setBackgroundColor(-16777216);
    }
    
    @Override
    protected PlaybackMode a(final Configuration configuration) {
        if (2 == configuration.orientation) {
            return PlaybackMode.b;
        }
        return super.a(configuration);
    }
    
    @Override
    public void a(final AVPlayer$PlayerStartType avPlayer$PlayerStartType) {
        super.a(avPlayer$PlayerStartType);
        this.g.setBackgroundColor(-16777216);
    }
    
    @Override
    public void a(final AVPlayer avPlayer, final Configuration configuration) {
        super.a(avPlayer, configuration);
        if (this.g != null) {
            this.removeView((View)this.g);
        }
        if (2 == configuration.orientation) {
            this.g = new VideoPlayerCanvasView(this.getContext(), avPlayer, VideoPlayerView$Mode.e);
            if (this.m != null && this.l != null) {
                this.g.a(this.m, this.l);
            }
        }
        else {
            (this.g = new VideoPlayerCanvasView(this.getContext(), avPlayer, VideoPlayerView$Mode.d)).setOnClickListener((View$OnClickListener)this);
        }
        this.g.setAVPlayerEventListener(this);
        this.addView((View)this.g);
    }
    
    @Override
    protected int getLayoutId() {
        return 2130969196;
    }
    
    @Override
    public void onClick(final View view) {
        if (view.equals(this.g)) {
            this.m();
            return;
        }
        super.onClick(view);
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.k) {
            this.q();
        }
        int n;
        if (2 == configuration.orientation) {
            n = 8;
        }
        else {
            n = 0;
        }
        if (this.h != null) {
            this.h.setVisibility(n);
        }
        if (this.i != null) {
            this.i.setVisibility(n);
        }
    }
    
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        final int measuredWidth = this.h.getMeasuredWidth();
        final int measuredHeight = this.h.getMeasuredHeight();
        this.h.layout(0, 0, measuredWidth, measuredHeight);
        if (this.g != null) {
            this.g.layout(0, 0, this.g.getMeasuredWidth(), this.g.getMeasuredHeight());
        }
        if (com.twitter.util.c.g(this.getContext())) {
            this.j.layout(n, n2, n3, n4);
            return;
        }
        this.i.layout(0, measuredHeight, this.i.getMeasuredWidth(), measuredHeight + this.i.getMeasuredHeight());
        this.j.layout(0, 0, measuredWidth, measuredHeight);
    }
    
    protected void onMeasure(final int n, final int n2) {
        if (com.twitter.util.c.g(this.getContext())) {
            this.setMeasuredDimension(n, n2);
            this.j.measure(n, n2);
            if (this.g != null) {
                this.g.measure(n, n2);
            }
            this.h.measure(n, n2);
            return;
        }
        final int size = View$MeasureSpec.getSize(n2);
        final int measureSpec = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n), 0);
        final int measureSpec2 = View$MeasureSpec.makeMeasureSpec(View$MeasureSpec.getSize(n2), 0);
        this.i.measure(measureSpec, measureSpec2);
        final int measuredHeight = this.i.getMeasuredHeight();
        int n3 = size - measuredHeight;
        int size2 = View$MeasureSpec.getSize(n);
        final float n4 = size2 / n3;
        if (1.7777778f != n4) {
            if (1.7777778f > n4) {
                n3 = (int)(size2 / 1.7777778f);
            }
            else {
                size2 = (int)(1.7777778f * n3);
            }
        }
        final int measureSpec3 = View$MeasureSpec.makeMeasureSpec(size2, 1073741824);
        final int measureSpec4 = View$MeasureSpec.makeMeasureSpec(n3, 1073741824);
        this.setMeasuredDimension(size2, n3 + measuredHeight);
        if (this.g != null) {
            this.g.measure(measureSpec3, measureSpec4);
        }
        this.h.measure(measureSpec3, measureSpec4);
        this.i.measure(measureSpec3, measureSpec2);
        this.j.measure(measureSpec, measureSpec2);
    }
    
    public void p() {
        this.k = true;
        this.h.setVisibility(8);
        this.j.setVisibility(0);
        this.e.setImageResource(2130839440);
        this.e.setColorFilter(this.getResources().getColor(2131689557), PorterDuff$Mode.SRC_ATOP);
        this.b();
        this.q();
    }
    
    public void setActionHelper(final CardActionHelper l) {
        this.l = l;
    }
    
    public void setVideoCardData(final VideoCardData m) {
        this.m = m;
    }
}
