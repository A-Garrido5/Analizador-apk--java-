// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.MenuItem;
import android.view.View;
import android.support.v7.internal.view.menu.ActionMenuItem;
import android.view.View$OnClickListener;

class ToolbarWidgetWrapper$1 implements View$OnClickListener
{
    final ActionMenuItem mNavItem;
    final ToolbarWidgetWrapper this$0;
    
    ToolbarWidgetWrapper$1(final ToolbarWidgetWrapper this$0) {
        this.this$0 = this$0;
        this.mNavItem = new ActionMenuItem(ToolbarWidgetWrapper.access$000(this.this$0).getContext(), 0, 16908332, 0, 0, ToolbarWidgetWrapper.access$100(this.this$0));
    }
    
    public void onClick(final View view) {
        if (ToolbarWidgetWrapper.access$200(this.this$0) != null && ToolbarWidgetWrapper.access$300(this.this$0)) {
            ToolbarWidgetWrapper.access$200(this.this$0).onMenuItemSelected(0, (MenuItem)this.mNavItem);
        }
    }
}
