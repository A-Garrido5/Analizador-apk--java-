// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.view.MenuItem;
import android.support.v7.widget.Toolbar$OnMenuItemClickListener;

class ToolbarActionBar$2 implements Toolbar$OnMenuItemClickListener
{
    final ToolbarActionBar this$0;
    
    ToolbarActionBar$2(final ToolbarActionBar this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public boolean onMenuItemClick(final MenuItem menuItem) {
        return ToolbarActionBar.access$000(this.this$0).onMenuItemSelected(0, menuItem);
    }
}
