// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.view.View;
import com.twitter.library.util.f;

class ui extends f
{
    final /* synthetic */ View a;
    final /* synthetic */ TranslateAnimation b;
    final /* synthetic */ uh c;
    
    ui(final uh c, final View a, final TranslateAnimation b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.startAnimation((Animation)this.b);
    }
}
