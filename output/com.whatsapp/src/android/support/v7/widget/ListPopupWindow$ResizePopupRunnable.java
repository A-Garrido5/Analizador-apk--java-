// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

class ListPopupWindow$ResizePopupRunnable implements Runnable
{
    final ListPopupWindow this$0;
    
    private ListPopupWindow$ResizePopupRunnable(final ListPopupWindow this$0) {
        this.this$0 = this$0;
    }
    
    ListPopupWindow$ResizePopupRunnable(final ListPopupWindow listPopupWindow, final ListPopupWindow$1 listPopupWindow$1) {
        this(listPopupWindow);
    }
    
    @Override
    public void run() {
        if (ListPopupWindow.access$600(this.this$0) != null && ListPopupWindow.access$600(this.this$0).getCount() > ListPopupWindow.access$600(this.this$0).getChildCount() && ListPopupWindow.access$600(this.this$0).getChildCount() <= this.this$0.mListItemExpandMaximum) {
            ListPopupWindow.access$1100(this.this$0).setInputMethodMode(2);
            this.this$0.show();
        }
    }
}
