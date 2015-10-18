// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.media.player.InlineVideoView;

public class VideoPlayerView extends PlayerView
{
    public final InlineVideoView a;
    
    public VideoPlayerView(final Context context) {
        this(context, null);
    }
    
    public VideoPlayerView(final Context context, final AttributeSet set) {
        this(context, set, 2130771979);
    }
    
    public VideoPlayerView(final Context context, final AttributeSet set, final int n) {
        super(context, set, n);
        this.a = new InlineVideoView(context);
    }
    
    public void a(final String videoPath) {
        this.a.setVideoPath(videoPath);
        this.addView((View)this.a);
        this.a.start();
    }
    
    public void e() {
        this.a.a();
    }
    
    @Override
    protected void onLayout(final boolean b, final int n, final int n2, final int n3, final int n4) {
        super.onLayout(b, n, n2, n3, n4);
        this.a.layout(n, n2, n3, n4);
    }
}
