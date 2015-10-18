// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

class ListPopupWindow$ListSelectorHider implements Runnable
{
    final ListPopupWindow this$0;
    
    private ListPopupWindow$ListSelectorHider(final ListPopupWindow this$0) {
        this.this$0 = this$0;
    }
    
    ListPopupWindow$ListSelectorHider(final ListPopupWindow listPopupWindow, final ListPopupWindow$1 listPopupWindow$1) {
        this(listPopupWindow);
    }
    
    @Override
    public void run() {
        this.this$0.clearListSelection();
    }
}
