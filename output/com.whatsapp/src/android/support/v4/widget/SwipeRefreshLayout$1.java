// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.animation.Animation;
import android.view.animation.Animation$AnimationListener;

class SwipeRefreshLayout$1 implements Animation$AnimationListener
{
    final SwipeRefreshLayout this$0;
    
    SwipeRefreshLayout$1(final SwipeRefreshLayout this$0) {
        this.this$0 = this$0;
    }
    
    public void onAnimationEnd(final Animation animation) {
        final boolean a = SlidingPaneLayout.a;
        Label_0150: {
            if (SwipeRefreshLayout.access$000(this.this$0)) {
                SwipeRefreshLayout.access$100(this.this$0).setAlpha(255);
                SwipeRefreshLayout.access$100(this.this$0).start();
                if (!SwipeRefreshLayout.access$200(this.this$0) || SwipeRefreshLayout.access$300(this.this$0) == null) {
                    break Label_0150;
                }
                SwipeRefreshLayout.access$300(this.this$0).onRefresh();
                if (!a) {
                    break Label_0150;
                }
            }
            SwipeRefreshLayout.access$100(this.this$0).stop();
            SwipeRefreshLayout.access$400(this.this$0).setVisibility(8);
            SwipeRefreshLayout.access$500(this.this$0, 255);
            if (SwipeRefreshLayout.access$600(this.this$0)) {
                SwipeRefreshLayout.access$700(this.this$0, 0.0f);
                if (!a) {
                    break Label_0150;
                }
            }
            SwipeRefreshLayout.access$900(this.this$0, this.this$0.mOriginalOffsetTop - SwipeRefreshLayout.access$800(this.this$0), true);
        }
        SwipeRefreshLayout.access$802(this.this$0, SwipeRefreshLayout.access$400(this.this$0).getTop());
    }
    
    public void onAnimationRepeat(final Animation animation) {
    }
    
    public void onAnimationStart(final Animation animation) {
    }
}
