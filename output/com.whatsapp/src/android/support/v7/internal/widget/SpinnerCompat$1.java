// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.v7.widget.ListPopupWindow;
import android.view.View;
import android.support.v7.widget.ListPopupWindow$ForwardingListener;

class SpinnerCompat$1 extends ListPopupWindow$ForwardingListener
{
    final SpinnerCompat this$0;
    final SpinnerCompat$DropdownPopup val$popup;
    
    SpinnerCompat$1(final SpinnerCompat this$0, final View view, final SpinnerCompat$DropdownPopup val$popup) {
        this.this$0 = this$0;
        this.val$popup = val$popup;
        super(view);
    }
    
    @Override
    public ListPopupWindow getPopup() {
        return this.val$popup;
    }
    
    public boolean onForwardingStarted() {
        if (!SpinnerCompat.access$100(this.this$0).isShowing()) {
            SpinnerCompat.access$100(this.this$0).show();
        }
        return true;
    }
}
