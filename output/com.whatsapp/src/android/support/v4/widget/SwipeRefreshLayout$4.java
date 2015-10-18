// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class SwipeRefreshLayout$4 extends Animation
{
    final SwipeRefreshLayout this$0;
    final int val$endingAlpha;
    final int val$startingAlpha;
    
    SwipeRefreshLayout$4(final SwipeRefreshLayout this$0, final int val$startingAlpha, final int val$endingAlpha) {
        this.this$0 = this$0;
        this.val$startingAlpha = val$startingAlpha;
        this.val$endingAlpha = val$endingAlpha;
    }
    
    public void applyTransformation(final float n, final Transformation transformation) {
        SwipeRefreshLayout.access$100(this.this$0).setAlpha((int)(this.val$startingAlpha + n * (this.val$endingAlpha - this.val$startingAlpha)));
    }
}
