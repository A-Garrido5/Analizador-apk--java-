// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;

class ActionBarOverlayLayout$1 extends ViewPropertyAnimatorListenerAdapter
{
    final ActionBarOverlayLayout this$0;
    
    ActionBarOverlayLayout$1(final ActionBarOverlayLayout this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onAnimationCancel(final View view) {
        ActionBarOverlayLayout.access$002(this.this$0, null);
        ActionBarOverlayLayout.access$102(this.this$0, false);
    }
    
    @Override
    public void onAnimationEnd(final View view) {
        ActionBarOverlayLayout.access$002(this.this$0, null);
        ActionBarOverlayLayout.access$102(this.this$0, false);
    }
}
