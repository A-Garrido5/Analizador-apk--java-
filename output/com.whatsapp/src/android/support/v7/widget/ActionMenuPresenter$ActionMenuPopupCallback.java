// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.ActionMenuItemView$PopupCallback;

class ActionMenuPresenter$ActionMenuPopupCallback extends ActionMenuItemView$PopupCallback
{
    final ActionMenuPresenter this$0;
    
    private ActionMenuPresenter$ActionMenuPopupCallback(final ActionMenuPresenter this$0) {
        this.this$0 = this$0;
    }
    
    ActionMenuPresenter$ActionMenuPopupCallback(final ActionMenuPresenter actionMenuPresenter, final ActionMenuPresenter$1 actionMenuPresenter$1) {
        this(actionMenuPresenter);
    }
    
    @Override
    public ListPopupWindow getPopup() {
        if (ActionMenuPresenter.access$700(this.this$0) != null) {
            return ActionMenuPresenter.access$700(this.this$0).getPopup();
        }
        return null;
    }
}
