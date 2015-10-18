// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view;

import android.view.View;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;

class ViewPropertyAnimatorCompatSet$1 extends ViewPropertyAnimatorListenerAdapter
{
    private int mProxyEndCount;
    private boolean mProxyStarted;
    final ViewPropertyAnimatorCompatSet this$0;
    
    ViewPropertyAnimatorCompatSet$1(final ViewPropertyAnimatorCompatSet this$0) {
        this.this$0 = this$0;
        this.mProxyStarted = false;
        this.mProxyEndCount = 0;
    }
    
    @Override
    public void onAnimationEnd(final View view) {
        final int mProxyEndCount = 1 + this.mProxyEndCount;
        this.mProxyEndCount = mProxyEndCount;
        if (mProxyEndCount == ViewPropertyAnimatorCompatSet.access$200(this.this$0).size()) {
            if (ViewPropertyAnimatorCompatSet.access$000(this.this$0) != null) {
                ViewPropertyAnimatorCompatSet.access$000(this.this$0).onAnimationEnd(null);
            }
            this.onEnd();
        }
    }
    
    @Override
    public void onAnimationStart(final View view) {
        if (!this.mProxyStarted) {
            this.mProxyStarted = true;
            if (ViewPropertyAnimatorCompatSet.access$000(this.this$0) != null) {
                ViewPropertyAnimatorCompatSet.access$000(this.this$0).onAnimationStart(null);
            }
        }
    }
    
    void onEnd() {
        this.mProxyEndCount = 0;
        this.mProxyStarted = false;
        ViewPropertyAnimatorCompatSet.access$100(this.this$0);
    }
}
