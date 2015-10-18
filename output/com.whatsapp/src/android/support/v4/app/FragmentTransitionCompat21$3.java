// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.app;

import android.transition.Transition;
import android.graphics.Rect;
import android.transition.Transition$EpicenterCallback;

final class FragmentTransitionCompat21$3 extends Transition$EpicenterCallback
{
    private Rect mEpicenter;
    final FragmentTransitionCompat21$EpicenterView val$epicenterView;
    
    FragmentTransitionCompat21$3(final FragmentTransitionCompat21$EpicenterView val$epicenterView) {
        this.val$epicenterView = val$epicenterView;
    }
    
    public Rect onGetEpicenter(final Transition transition) {
        if (this.mEpicenter == null && this.val$epicenterView.epicenter != null) {
            this.mEpicenter = FragmentTransitionCompat21.access$100(this.val$epicenterView.epicenter);
        }
        return this.mEpicenter;
    }
}
