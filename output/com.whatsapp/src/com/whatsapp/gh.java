// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

class gh implements Runnable
{
    final t9 a;
    
    gh(final t9 a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        VideoPreviewActivity.p(this.a.a).setVisibility(8);
        final AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        ((Animation)alphaAnimation).setDuration(600L);
        VideoPreviewActivity.p(this.a.a).startAnimation((Animation)alphaAnimation);
    }
}
