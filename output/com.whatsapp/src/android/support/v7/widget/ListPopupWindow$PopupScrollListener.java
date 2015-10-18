// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.widget.AbsListView;
import android.widget.AbsListView$OnScrollListener;

class ListPopupWindow$PopupScrollListener implements AbsListView$OnScrollListener
{
    final ListPopupWindow this$0;
    
    private ListPopupWindow$PopupScrollListener(final ListPopupWindow this$0) {
        this.this$0 = this$0;
    }
    
    ListPopupWindow$PopupScrollListener(final ListPopupWindow listPopupWindow, final ListPopupWindow$1 listPopupWindow$1) {
        this(listPopupWindow);
    }
    
    public void onScroll(final AbsListView absListView, final int n, final int n2, final int n3) {
    }
    
    public void onScrollStateChanged(final AbsListView absListView, final int n) {
        if (n == 1 && !this.this$0.isInputMethodNotNeeded() && ListPopupWindow.access$1100(this.this$0).getContentView() != null) {
            ListPopupWindow.access$1300(this.this$0).removeCallbacks((Runnable)ListPopupWindow.access$1200(this.this$0));
            ListPopupWindow.access$1200(this.this$0).run();
        }
    }
}
