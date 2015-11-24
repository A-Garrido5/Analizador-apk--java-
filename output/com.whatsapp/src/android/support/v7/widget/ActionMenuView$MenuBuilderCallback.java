// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.MenuItem;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;

class ActionMenuView$MenuBuilderCallback implements MenuBuilder$Callback
{
    final ActionMenuView this$0;
    
    private ActionMenuView$MenuBuilderCallback(final ActionMenuView this$0) {
        this.this$0 = this$0;
    }
    
    ActionMenuView$MenuBuilderCallback(final ActionMenuView actionMenuView, final ActionMenuView$1 actionMenuView$1) {
        this(actionMenuView);
    }
    
    @Override
    public boolean onMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        return ActionMenuView.access$200(this.this$0) != null && ActionMenuView.access$200(this.this$0).onMenuItemClick(menuItem);
    }
    
    @Override
    public void onMenuModeChange(final MenuBuilder menuBuilder) {
        if (ActionMenuView.access$300(this.this$0) != null) {
            ActionMenuView.access$300(this.this$0).onMenuModeChange(menuBuilder);
        }
    }
}
