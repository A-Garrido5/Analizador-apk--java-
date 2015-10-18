// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;

class ActionMenuView$ActionMenuPresenterCallback implements MenuPresenter$Callback
{
    final ActionMenuView this$0;
    
    private ActionMenuView$ActionMenuPresenterCallback(final ActionMenuView this$0) {
        this.this$0 = this$0;
    }
    
    ActionMenuView$ActionMenuPresenterCallback(final ActionMenuView actionMenuView, final ActionMenuView$1 actionMenuView$1) {
        this(actionMenuView);
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
    }
    
    @Override
    public boolean onOpenSubMenu(final MenuBuilder menuBuilder) {
        return false;
    }
}
