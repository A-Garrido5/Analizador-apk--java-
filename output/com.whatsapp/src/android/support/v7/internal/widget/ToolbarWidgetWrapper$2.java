// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;

class ToolbarWidgetWrapper$2 extends ViewPropertyAnimatorListenerAdapter
{
    private boolean mCanceled;
    final ToolbarWidgetWrapper this$0;
    
    ToolbarWidgetWrapper$2(final ToolbarWidgetWrapper this$0) {
        this.this$0 = this$0;
        this.mCanceled = false;
    }
    
    @Override
    public void onAnimationCancel(final View view) {
        this.mCanceled = true;
    }
    
    @Override
    public void onAnimationEnd(final View view) {
        if (!this.mCanceled) {
            ToolbarWidgetWrapper.access$000(this.this$0).setVisibility(8);
        }
    }
}
