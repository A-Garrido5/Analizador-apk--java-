// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.view.Menu;
import android.view.View;
import android.view.Window$Callback;
import android.support.v7.internal.view.WindowCallbackWrapper;

class ToolbarActionBar$ToolbarCallbackWrapper extends WindowCallbackWrapper
{
    final ToolbarActionBar this$0;
    
    public ToolbarActionBar$ToolbarCallbackWrapper(final ToolbarActionBar this$0, final Window$Callback window$Callback) {
        this.this$0 = this$0;
        super(window$Callback);
    }
    
    @Override
    public View onCreatePanelView(final int n) {
        switch (n) {
            case 0: {
                final Menu menu = ToolbarActionBar.access$300(this.this$0).getMenu();
                if (this.onPreparePanel(n, null, menu) && this.onMenuOpened(n, menu)) {
                    return ToolbarActionBar.access$400(this.this$0, menu);
                }
                break;
            }
        }
        return super.onCreatePanelView(n);
    }
    
    @Override
    public boolean onPreparePanel(final int n, final View view, final Menu menu) {
        final boolean onPreparePanel = super.onPreparePanel(n, view, menu);
        if (onPreparePanel && !ToolbarActionBar.access$200(this.this$0)) {
            ToolbarActionBar.access$300(this.this$0).setMenuPrepared();
            ToolbarActionBar.access$202(this.this$0, true);
        }
        return onPreparePanel;
    }
}
