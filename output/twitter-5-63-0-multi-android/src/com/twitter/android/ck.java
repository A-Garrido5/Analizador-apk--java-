// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.view.animation.Animation;
import com.twitter.library.util.f;

public class ck extends f
{
    private final cl a;
    
    public ck(final cl a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        if (animation.equals(this.a.U_())) {
            this.a.a(4);
        }
    }
    
    @Override
    public void onAnimationStart(final Animation animation) {
        if (animation.equals(this.a.b())) {
            this.a.a(0);
        }
    }
}
