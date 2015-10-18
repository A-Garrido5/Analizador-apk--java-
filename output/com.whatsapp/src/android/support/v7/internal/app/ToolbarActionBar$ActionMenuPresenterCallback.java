// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.view.Menu;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;

final class ToolbarActionBar$ActionMenuPresenterCallback implements MenuPresenter$Callback
{
    private boolean mClosingActionMenu;
    final ToolbarActionBar this$0;
    
    private ToolbarActionBar$ActionMenuPresenterCallback(final ToolbarActionBar this$0) {
        this.this$0 = this$0;
    }
    
    ToolbarActionBar$ActionMenuPresenterCallback(final ToolbarActionBar toolbarActionBar, final ToolbarActionBar$1 toolbarActionBar$1) {
        this(toolbarActionBar);
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
        if (this.mClosingActionMenu) {
            return;
        }
        this.mClosingActionMenu = true;
        ToolbarActionBar.access$300(this.this$0).dismissPopupMenus();
        if (ToolbarActionBar.access$000(this.this$0) != null) {
            ToolbarActionBar.access$000(this.this$0).onPanelClosed(8, (Menu)menuBuilder);
        }
        this.mClosingActionMenu = false;
    }
    
    @Override
    public boolean onOpenSubMenu(final MenuBuilder menuBuilder) {
        if (ToolbarActionBar.access$000(this.this$0) != null) {
            ToolbarActionBar.access$000(this.this$0).onMenuOpened(8, (Menu)menuBuilder);
            return true;
        }
        return false;
    }
}
