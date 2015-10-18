// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.widget;

import android.view.animation.Animation;
import android.view.View;
import com.twitter.library.util.f;

class bk extends f
{
    final /* synthetic */ View a;
    final /* synthetic */ float b;
    final /* synthetic */ DraggableDrawerLayout c;
    
    bk(final DraggableDrawerLayout c, final View a, final float b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.setAlpha(this.b);
    }
}
