// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

class BackStackRecord$3 implements ViewTreeObserver$OnPreDrawListener
{
    final BackStackRecord this$0;
    final int val$containerId;
    final View val$sceneRoot;
    final BackStackRecord$TransitionState val$state;
    final Object val$transition;
    
    BackStackRecord$3(final BackStackRecord this$0, final View val$sceneRoot, final BackStackRecord$TransitionState val$state, final int val$containerId, final Object val$transition) {
        this.this$0 = this$0;
        this.val$sceneRoot = val$sceneRoot;
        this.val$state = val$state;
        this.val$containerId = val$containerId;
        this.val$transition = val$transition;
    }
    
    public boolean onPreDraw() {
        this.val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        BackStackRecord.access$300(this.this$0, this.val$state, this.val$containerId, this.val$transition);
        return true;
    }
}
