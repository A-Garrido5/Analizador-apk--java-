// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.View;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;

public class am extends aq
{
    private final VideoSurfaceView a;
    
    am(final Context context, final AVPlayer avPlayer) {
        this.a = new VideoSurfaceView(context, avPlayer);
    }
    
    @Override
    public View a() {
        return (View)this.a;
    }
    
    @Override
    public void a(final boolean b) {
    }
    
    @Override
    protected ad b() {
        return this.a;
    }
}
