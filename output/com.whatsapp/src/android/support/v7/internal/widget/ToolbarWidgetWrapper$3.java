// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;

class ToolbarWidgetWrapper$3 extends ViewPropertyAnimatorListenerAdapter
{
    final ToolbarWidgetWrapper this$0;
    
    ToolbarWidgetWrapper$3(final ToolbarWidgetWrapper this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onAnimationStart(final View view) {
        ToolbarWidgetWrapper.access$000(this.this$0).setVisibility(0);
    }
}
