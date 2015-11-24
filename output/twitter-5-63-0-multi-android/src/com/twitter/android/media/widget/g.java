// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.animation.Animation;
import com.twitter.library.util.f;

class g extends f
{
    final /* synthetic */ CameraToolbar a;
    
    g(final CameraToolbar a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.setVisibility(8);
    }
}
