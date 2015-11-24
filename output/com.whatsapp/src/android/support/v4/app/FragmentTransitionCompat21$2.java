// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import java.util.Iterator;
import java.util.Collection;
import java.util.Map;
import java.util.ArrayList;
import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver$OnPreDrawListener;

final class FragmentTransitionCompat21$2 implements ViewTreeObserver$OnPreDrawListener
{
    final View val$container;
    final Transition val$enterTransition;
    final ArrayList val$enteringViews;
    final FragmentTransitionCompat21$ViewRetriever val$inFragment;
    final Map val$nameOverrides;
    final View val$nonExistentView;
    final Map val$renamedViews;
    
    FragmentTransitionCompat21$2(final View val$container, final FragmentTransitionCompat21$ViewRetriever val$inFragment, final Map val$nameOverrides, final Map val$renamedViews, final Transition val$enterTransition, final ArrayList val$enteringViews, final View val$nonExistentView) {
        this.val$container = val$container;
        this.val$inFragment = val$inFragment;
        this.val$nameOverrides = val$nameOverrides;
        this.val$renamedViews = val$renamedViews;
        this.val$enterTransition = val$enterTransition;
        this.val$enteringViews = val$enteringViews;
        this.val$nonExistentView = val$nonExistentView;
    }
    
    public boolean onPreDraw() {
        final int a = NotificationCompatBase$Action.a;
        this.val$container.getViewTreeObserver().removeOnPreDrawListener((ViewTreeObserver$OnPreDrawListener)this);
        final View view = this.val$inFragment.getView();
        if (view != null) {
            if (!this.val$nameOverrides.isEmpty()) {
                FragmentTransitionCompat21.findNamedViews(this.val$renamedViews, view);
                this.val$renamedViews.keySet().retainAll(this.val$nameOverrides.values());
                for (final Map.Entry<K, String> entry : this.val$nameOverrides.entrySet()) {
                    final View view2 = this.val$renamedViews.get(entry.getValue());
                    if (view2 != null) {
                        view2.setTransitionName((String)entry.getKey());
                    }
                    if (a != 0) {
                        break;
                    }
                }
            }
            if (this.val$enterTransition != null) {
                FragmentTransitionCompat21.access$000(this.val$enteringViews, view);
                this.val$enteringViews.removeAll(this.val$renamedViews.values());
                this.val$enteringViews.add(this.val$nonExistentView);
                this.val$enterTransition.removeTarget(this.val$nonExistentView);
                FragmentTransitionCompat21.addTargets(this.val$enterTransition, this.val$enteringViews);
            }
        }
        return true;
    }
}
