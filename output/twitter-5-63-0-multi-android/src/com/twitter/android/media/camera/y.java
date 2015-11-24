// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.camera;

import android.view.animation.Animation;
import android.view.ViewGroup;
import com.twitter.library.util.f;

class y extends f
{
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ x b;
    
    y(final x b, final ViewGroup a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.requestLayout();
    }
}
