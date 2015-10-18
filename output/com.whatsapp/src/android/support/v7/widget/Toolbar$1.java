// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.MenuItem;

class Toolbar$1 implements ActionMenuView$OnMenuItemClickListener
{
    final Toolbar this$0;
    
    Toolbar$1(final Toolbar this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public boolean onMenuItemClick(final MenuItem menuItem) {
        return Toolbar.access$000(this.this$0) != null && Toolbar.access$000(this.this$0).onMenuItemClick(menuItem);
    }
}
