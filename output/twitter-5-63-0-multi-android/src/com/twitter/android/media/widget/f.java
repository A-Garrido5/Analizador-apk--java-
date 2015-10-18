// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.animation.Animation;

class f extends com.twitter.library.util.f
{
    final /* synthetic */ CameraToolbar a;
    
    f(final CameraToolbar a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationStart(final Animation animation) {
        this.a.setVisibility(0);
    }
}
