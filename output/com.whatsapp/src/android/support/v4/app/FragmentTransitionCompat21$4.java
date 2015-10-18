// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.Iterator;
import java.util.Map;
import android.view.View;
import java.util.ArrayList;
import android.transition.Transition;
import android.view.ViewTreeObserver$OnPreDrawListener;

final class FragmentTransitionCompat21$4 implements ViewTreeObserver$OnPreDrawListener
{
    final Transition val$enterTransition;
    final ArrayList val$enteringViews;
    final Transition val$exitTransition;
    final ArrayList val$exitingViews;
    final ArrayList val$hiddenViews;
    final View val$nonExistentView;
    final Transition val$overallTransition;
    final Map val$renamedViews;
    final View val$sceneRoot;
    final ArrayList val$sharedElementTargets;
    final Transition val$sharedElementTransition;
    
    FragmentTransitionCompat21$4(final View val$sceneRoot, final Transition val$enterTransition, final View val$nonExistentView, final ArrayList val$enteringViews, final Transition val$exitTransition, final ArrayList val$exitingViews, final Transition val$sharedElementTransition, final ArrayList val$sharedElementTargets, final Map val$renamedViews, final ArrayList val$hiddenViews, final Transition val$overallTransition) {
        this.val$sceneRoot = val$sceneRoot;
        this.val$enterTransition = val$enterTransition;
        this.val$nonExistentView = val$nonExistentView;
        this.val$enteringViews = val$enteringViews;
        this.val$exitTransition = val$exitTransition;
        this.val$exitingViews = val$exitingViews;
        this.val$sharedElementTransition = val$sharedElementTransition;
        this.val$sharedElementTargets = val$sharedElementTargets;
        this.val$renamedViews = val$renamedViews;
        this.val$hiddenViews = val$hiddenViews;
        this.val$overallTransition = val$overallTransition;
    }
    
    public boolean onPreDraw() {
        final int a = NotificationCompatBase$Action.a;
        this.val$sceneRoot.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        if (this.val$enterTransition != null) {
            this.val$enterTransition.removeTarget(this.val$nonExistentView);
            FragmentTransitionCompat21.removeTargets(this.val$enterTransition, this.val$enteringViews);
        }
        if (this.val$exitTransition != null) {
            FragmentTransitionCompat21.removeTargets(this.val$exitTransition, this.val$exitingViews);
        }
        if (this.val$sharedElementTransition != null) {
            FragmentTransitionCompat21.removeTargets(this.val$sharedElementTransition, this.val$sharedElementTargets);
        }
        for (final Map.Entry<K, View> entry : this.val$renamedViews.entrySet()) {
            entry.getValue().setTransitionName((String)entry.getKey());
            if (a != 0) {
                break;
            }
        }
        int n;
        for (int size = this.val$hiddenViews.size(), i = 0; i < size; i = n) {
            this.val$overallTransition.excludeTarget((View)this.val$hiddenViews.get(i), false);
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
        this.val$overallTransition.excludeTarget(this.val$nonExistentView, false);
        return true;
    }
}
