// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import android.view.View;
import android.graphics.Matrix;
import com.twitter.library.av.playback.AVPlayer;
import android.content.Context;

public class an extends aq
{
    private final VideoTextureView a;
    
    an(final Context context, final AVPlayer avPlayer, final n n) {
        this.a = new VideoTextureView(context, avPlayer, n);
        final Matrix transform = new Matrix();
        transform.setScale(1.000001f, 1.000001f);
        this.a.setTransform(transform);
    }
    
    @Override
    public View a() {
        return (View)this.a;
    }
    
    @Override
    public void a(final boolean keepScreenOn) {
        this.a.setKeepScreenOn(keepScreenOn);
    }
    
    @Override
    protected ad b() {
        return this.a;
    }
}
