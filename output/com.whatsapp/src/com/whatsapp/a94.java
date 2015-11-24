// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.View;
import android.support.v4.view.ViewPager$PageTransformer;

class a94 implements ViewPager$PageTransformer
{
    final PhotoViewPager a;
    
    a94(final PhotoViewPager a) {
        this.a = a;
    }
    
    @Override
    public void transformPage(final View view, final float n) {
        if (n < 0.0f || n >= 1.0f) {
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
            if (!App.I) {
                return;
            }
        }
        view.setTranslationX(-n * view.getWidth());
        view.setAlpha(Math.max(0.0f, 1.0f - n));
        final float max = Math.max(0.0f, 1.0f - 0.3f * n);
        view.setScaleX(max);
        view.setScaleY(max);
    }
}
