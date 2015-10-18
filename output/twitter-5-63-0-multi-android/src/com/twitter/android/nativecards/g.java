// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import android.view.View$OnClickListener;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.util.AttributeSet;
import android.content.Context;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.FrameLayout;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class g extends f
{
    final /* synthetic */ CardPreviewView a;
    
    g(final CardPreviewView a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        super.onAnimationEnd(animation);
        if (this.a.d != null) {
            this.a.d.setVisibility(8);
            this.a.d.setAnimation((Animation)null);
        }
    }
}
