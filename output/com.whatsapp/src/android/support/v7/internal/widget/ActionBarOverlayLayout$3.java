// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View;
import android.support.v4.view.ViewCompat;

class ActionBarOverlayLayout$3 implements Runnable
{
    final ActionBarOverlayLayout this$0;
    
    ActionBarOverlayLayout$3(final ActionBarOverlayLayout this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        ActionBarOverlayLayout.access$300(this.this$0);
        ActionBarOverlayLayout.access$002(this.this$0, ViewCompat.animate((View)ActionBarOverlayLayout.access$500(this.this$0)).translationY(0.0f).setListener(ActionBarOverlayLayout.access$400(this.this$0)));
        if (ActionBarOverlayLayout.access$600(this.this$0) != null && ActionBarOverlayLayout.access$600(this.this$0).getVisibility() != 8) {
            ActionBarOverlayLayout.access$202(this.this$0, ViewCompat.animate((View)ActionBarOverlayLayout.access$600(this.this$0)).translationY(0.0f).setListener(ActionBarOverlayLayout.access$700(this.this$0)));
        }
    }
}
