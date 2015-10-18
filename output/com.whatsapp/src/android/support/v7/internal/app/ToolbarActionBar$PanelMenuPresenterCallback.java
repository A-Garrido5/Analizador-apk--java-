// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.view.Menu;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPresenter$Callback;

final class ToolbarActionBar$PanelMenuPresenterCallback implements MenuPresenter$Callback
{
    final ToolbarActionBar this$0;
    
    private ToolbarActionBar$PanelMenuPresenterCallback(final ToolbarActionBar this$0) {
        this.this$0 = this$0;
    }
    
    ToolbarActionBar$PanelMenuPresenterCallback(final ToolbarActionBar toolbarActionBar, final ToolbarActionBar$1 toolbarActionBar$1) {
        this(toolbarActionBar);
    }
    
    @Override
    public void onCloseMenu(final MenuBuilder menuBuilder, final boolean b) {
        if (ToolbarActionBar.access$000(this.this$0) != null) {
            ToolbarActionBar.access$000(this.this$0).onPanelClosed(0, (Menu)menuBuilder);
        }
    }
    
    @Override
    public boolean onOpenSubMenu(final MenuBuilder menuBuilder) {
        if (menuBuilder == null && ToolbarActionBar.access$000(this.this$0) != null) {
            ToolbarActionBar.access$000(this.this$0).onMenuOpened(0, (Menu)menuBuilder);
        }
        return true;
    }
}
