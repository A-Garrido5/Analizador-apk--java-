// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import android.view.animation.Animation;

class s implements Runnable
{
    final /* synthetic */ Animation a;
    final /* synthetic */ FadeInTextView b;
    
    s(final FadeInTextView b, final Animation a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public void run() {
        this.b.startAnimation(this.a);
    }
}
