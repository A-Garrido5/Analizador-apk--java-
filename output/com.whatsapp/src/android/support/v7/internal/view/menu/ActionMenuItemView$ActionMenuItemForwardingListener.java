// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.view.menu;

import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.support.v7.widget.ListPopupWindow$ForwardingListener;

class ActionMenuItemView$ActionMenuItemForwardingListener extends ListPopupWindow$ForwardingListener
{
    final ActionMenuItemView this$0;
    
    public ActionMenuItemView$ActionMenuItemForwardingListener(final ActionMenuItemView this$0) {
        super((View)(this.this$0 = this$0));
    }
    
    @Override
    public ListPopupWindow getPopup() {
        if (ActionMenuItemView.access$000(this.this$0) != null) {
            return ActionMenuItemView.access$000(this.this$0).getPopup();
        }
        return null;
    }
    
    @Override
    protected boolean onForwardingStarted() {
        final MenuBuilder$ItemInvoker access$100 = ActionMenuItemView.access$100(this.this$0);
        boolean b = false;
        if (access$100 != null) {
            final boolean invokeItem = ActionMenuItemView.access$100(this.this$0).invokeItem(ActionMenuItemView.access$200(this.this$0));
            b = false;
            if (invokeItem) {
                final ListPopupWindow popup = this.getPopup();
                b = false;
                if (popup != null) {
                    final boolean showing = popup.isShowing();
                    b = false;
                    if (showing) {
                        b = true;
                    }
                }
            }
        }
        return b;
    }
    
    @Override
    protected boolean onForwardingStopped() {
        final ListPopupWindow popup = this.getPopup();
        if (popup != null) {
            popup.dismiss();
            return true;
        }
        return false;
    }
}
