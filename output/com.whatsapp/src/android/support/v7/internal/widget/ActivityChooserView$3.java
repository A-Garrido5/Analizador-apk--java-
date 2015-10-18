// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.support.v7.widget.ListPopupWindow$ForwardingListener;

class ActivityChooserView$3 extends ListPopupWindow$ForwardingListener
{
    final ActivityChooserView this$0;
    
    ActivityChooserView$3(final ActivityChooserView this$0, final View view) {
        this.this$0 = this$0;
        super(view);
    }
    
    @Override
    public ListPopupWindow getPopup() {
        return ActivityChooserView.access$100(this.this$0);
    }
    
    @Override
    protected boolean onForwardingStarted() {
        this.this$0.showPopup();
        return true;
    }
    
    @Override
    protected boolean onForwardingStopped() {
        this.this$0.dismissPopup();
        return true;
    }
}
