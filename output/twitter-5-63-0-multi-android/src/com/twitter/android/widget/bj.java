// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.animation.Animation;
import com.twitter.library.util.f;

class bj extends f
{
    final /* synthetic */ DraggableDrawerLayout a;
    
    bj(final DraggableDrawerLayout a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.d();
    }
}
