// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import android.view.animation.Animation;
import com.twitter.library.util.f;

class n extends f
{
    final /* synthetic */ m a;
    
    n(final m a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.b.clearAnimation();
        this.a.b.setRotation((float)this.a.a);
    }
}
