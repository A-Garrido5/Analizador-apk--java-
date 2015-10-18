// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av.control;

import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;

public class e
{
    public VideoControlView a(final Context context, final AVPlayer avPlayer) {
        return new VideoControlView(context, avPlayer, false);
    }
    
    public VideoControlView b(final Context context, final AVPlayer avPlayer) {
        return new VideoControlView(context, avPlayer, true);
    }
}
