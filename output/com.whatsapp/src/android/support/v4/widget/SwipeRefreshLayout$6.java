// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Transformation;
import android.view.animation.Animation;

class SwipeRefreshLayout$6 extends Animation
{
    final SwipeRefreshLayout this$0;
    
    SwipeRefreshLayout$6(final SwipeRefreshLayout this$0) {
        this.this$0 = this$0;
    }
    
    public void applyTransformation(final float n, final Transformation transformation) {
        int n2 = 0;
        Label_0046: {
            if (!SwipeRefreshLayout.access$1100(this.this$0)) {
                n2 = (int)(SwipeRefreshLayout.access$1200(this.this$0) - Math.abs(this.this$0.mOriginalOffsetTop));
                if (!SlidingPaneLayout.a) {
                    break Label_0046;
                }
            }
            n2 = (int)SwipeRefreshLayout.access$1200(this.this$0);
        }
        SwipeRefreshLayout.access$900(this.this$0, this.this$0.mFrom + (int)(n * (n2 - this.this$0.mFrom)) - SwipeRefreshLayout.access$400(this.this$0).getTop(), false);
        SwipeRefreshLayout.access$100(this.this$0).setArrowScale(1.0f - n);
    }
}
