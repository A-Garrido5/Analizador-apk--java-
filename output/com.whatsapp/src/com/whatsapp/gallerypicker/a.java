// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.animation.Animation;
import android.view.animation.AlphaAnimation;

class a implements Runnable
{
    final ImagePreview a;
    
    a(final ImagePreview a) {
        this.a = a;
    }
    
    @Override
    public void run() {
        ImagePreview.l(this.a).setBackgroundColor(1962934272);
        if (!ImagePreview.g(this.a)) {
            ImagePreview.x(this.a).setTextColor(-1291845633);
            ImagePreview.i(this.a).setAlpha(178);
        }
        final AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        ((Animation)alphaAnimation).setDuration(300L);
        ImagePreview.l(this.a).startAnimation((Animation)alphaAnimation);
    }
}
