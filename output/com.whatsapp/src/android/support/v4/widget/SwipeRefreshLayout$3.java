// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class SwipeRefreshLayout$3 extends Animation
{
    final SwipeRefreshLayout this$0;
    
    SwipeRefreshLayout$3(final SwipeRefreshLayout this$0) {
        this.this$0 = this$0;
    }
    
    public void applyTransformation(final float n, final Transformation transformation) {
        SwipeRefreshLayout.access$700(this.this$0, 1.0f - n);
    }
}
