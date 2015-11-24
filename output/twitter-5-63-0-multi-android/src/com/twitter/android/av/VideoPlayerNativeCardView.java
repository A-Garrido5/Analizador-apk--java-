// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import android.view.View$MeasureSpec;
import com.twitter.library.av.VideoPlayerView$Mode;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;
import com.twitter.library.av.VideoPlayerView;

public class VideoPlayerNativeCardView extends VideoPlayerView
{
    public VideoPlayerNativeCardView(final Context context, final AVPlayer avPlayer, final VideoPlayerView$Mode videoPlayerView$Mode) {
        super(context, avPlayer, videoPlayerView$Mode);
    }
    
    @Override
    protected void onMeasure(final int n, final int n2) {
        final int size = View$MeasureSpec.getSize(n);
        this.setMeasuredDimension(size, (int)(size / 1.7777778f));
        this.measureChildren(n, n2);
    }
}
