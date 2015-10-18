// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.support.v4.util.ArrayMap;
import java.util.ArrayList;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

class BackStackRecord$2 implements ViewTreeObserver$OnPreDrawListener
{
    final BackStackRecord this$0;
    final Fragment val$inFragment;
    final boolean val$isBack;
    final Fragment val$outFragment;
    final View val$sceneRoot;
    final ArrayList val$sharedElementTargets;
    final Object val$sharedElementTransition;
    final BackStackRecord$TransitionState val$state;
    
    BackStackRecord$2(final BackStackRecord this$0, final View val$sceneRoot, final Object val$sharedElementTransition, final ArrayList val$sharedElementTargets, final BackStackRecord$TransitionState val$state, final boolean val$isBack, final Fragment val$inFragment, final Fragment val$outFragment) {
        this.this$0 = this$0;
        this.val$sceneRoot = val$sceneRoot;
        this.val$sharedElementTransition = val$sharedElementTransition;
        this.val$sharedElementTargets = val$sharedElementTargets;
        this.val$state = val$state;
        this.val$isBack = val$isBack;
        this.val$inFragment = val$inFragment;
        this.val$outFragment = val$outFragment;
    }
    
    public boolean onPreDraw() {
        this.val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        if (this.val$sharedElementTransition != null) {
            FragmentTransitionCompat21.removeTargets(this.val$sharedElementTransition, this.val$sharedElementTargets);
            this.val$sharedElementTargets.clear();
            final ArrayMap access$000 = BackStackRecord.access$000(this.this$0, this.val$state, this.val$isBack, this.val$inFragment);
            this.val$sharedElementTargets.add(this.val$state.nonExistentView);
            this.val$sharedElementTargets.addAll(access$000.values());
            FragmentTransitionCompat21.addTargets(this.val$sharedElementTransition, this.val$sharedElementTargets);
            BackStackRecord.access$100(this.this$0, access$000, this.val$state);
            BackStackRecord.access$200(this.this$0, this.val$state, this.val$inFragment, this.val$outFragment, this.val$isBack, access$000);
        }
        return true;
    }
}
