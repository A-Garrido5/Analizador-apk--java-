// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.media.widget;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator$AnimatorUpdateListener;

class aw implements ValueAnimator$AnimatorUpdateListener
{
    final /* synthetic */ VideoSegmentListView a;
    final /* synthetic */ av b;
    
    aw(final av b, final VideoSegmentListView a) {
        this.b = b;
        this.a = a;
    }
    
    public void onAnimationUpdate(final ValueAnimator valueAnimator) {
        this.a.invalidate();
    }
}
