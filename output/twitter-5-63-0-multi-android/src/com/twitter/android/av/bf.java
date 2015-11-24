// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.VideoPlayerView$Mode;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;

public class bf
{
    public VideoPlayerNativeCardView a(final Context context, final AVPlayer avPlayer, final VideoPlayerView$Mode videoPlayerView$Mode) {
        return new VideoPlayerNativeCardView(context, avPlayer, videoPlayerView$Mode);
    }
}
