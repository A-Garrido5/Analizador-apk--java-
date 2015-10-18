// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.animation.Animation;
import com.twitter.library.util.f;

class d extends f
{
    final /* synthetic */ CameraFragment a;
    
    d(final CameraFragment a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.g.setVisibility(8);
    }
}
