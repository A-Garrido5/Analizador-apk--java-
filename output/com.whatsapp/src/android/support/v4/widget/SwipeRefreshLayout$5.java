// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class SwipeRefreshLayout$5 implements Animation$AnimationListener
{
    final SwipeRefreshLayout this$0;
    
    SwipeRefreshLayout$5(final SwipeRefreshLayout this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationEnd(final Animation animation) {
        if (!SwipeRefreshLayout.access$600(this.this$0)) {
            SwipeRefreshLayout.access$1000(this.this$0, null);
        }
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
