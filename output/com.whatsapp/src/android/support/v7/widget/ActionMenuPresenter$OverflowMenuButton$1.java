// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;

class ActionMenuPresenter$OverflowMenuButton$1 extends ListPopupWindow$ForwardingListener
{
    final ActionMenuPresenter$OverflowMenuButton this$1;
    final ActionMenuPresenter val$this$0;
    
    ActionMenuPresenter$OverflowMenuButton$1(final ActionMenuPresenter$OverflowMenuButton this$1, final View view, final ActionMenuPresenter val$this$0) {
        this.this$1 = this$1;
        this.val$this$0 = val$this$0;
        super(view);
    }
    
    @Override
    public ListPopupWindow getPopup() {
        if (ActionMenuPresenter.access$200(this.this$1.this$0) == null) {
            return null;
        }
        return ActionMenuPresenter.access$200(this.this$1.this$0).getPopup();
    }
    
    public boolean onForwardingStarted() {
        this.this$1.this$0.showOverflowMenu();
        return true;
    }
    
    public boolean onForwardingStopped() {
        if (ActionMenuPresenter.access$300(this.this$1.this$0) != null) {
            return false;
        }
        this.this$1.this$0.hideOverflowMenu();
        return true;
    }
}
