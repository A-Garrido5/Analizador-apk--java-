// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuBuilder$Callback;

final class ToolbarActionBar$MenuBuilderCallback implements MenuBuilder$Callback
{
    final ToolbarActionBar this$0;
    
    private ToolbarActionBar$MenuBuilderCallback(final ToolbarActionBar this$0) {
        this.this$0 = this$0;
    }
    
    ToolbarActionBar$MenuBuilderCallback(final ToolbarActionBar toolbarActionBar, final ToolbarActionBar$1 toolbarActionBar$1) {
        this(toolbarActionBar);
    }
    
    @Override
    public boolean onMenuItemSelected(final MenuBuilder menuBuilder, final MenuItem menuItem) {
        return false;
    }
    
    @Override
    public void onMenuModeChange(final MenuBuilder menuBuilder) {
        if (ToolbarActionBar.access$000(this.this$0) != null) {
            if (ToolbarActionBar.access$300(this.this$0).isOverflowMenuShowing()) {
                ToolbarActionBar.access$000(this.this$0).onPanelClosed(8, (Menu)menuBuilder);
                if (ToolbarActionBar.b == 0) {
                    return;
                }
            }
            if (ToolbarActionBar.access$000(this.this$0).onPreparePanel(0, (View)null, (Menu)menuBuilder)) {
                ToolbarActionBar.access$000(this.this$0).onMenuOpened(8, (Menu)menuBuilder);
            }
        }
    }
}
