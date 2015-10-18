// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.view.MotionEvent;
import android.graphics.drawable.Drawable;
import android.view.View$MeasureSpec;
import com.twitter.library.view.x;
import android.view.animation.Animation$AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.ViewConfiguration;
import android.util.AttributeSet;
import android.content.Context;
import com.twitter.library.view.TickMarksView;
import android.view.View;
import com.twitter.library.widget.am;
import android.widget.ProgressBar;
import android.widget.FrameLayout;
import android.view.animation.Animation;
import com.twitter.library.util.f;

class ak extends f
{
    final /* synthetic */ VideoClipRangeSeekBar a;
    
    ak(final VideoClipRangeSeekBar a) {
        this.a = a;
    }
    
    @Override
    public void onAnimationEnd(final Animation animation) {
        this.a.D = false;
    }
}
