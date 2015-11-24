// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

class ListPopupWindow$ForwardingListener$TriggerLongPress implements Runnable
{
    final ListPopupWindow$ForwardingListener this$0;
    
    private ListPopupWindow$ForwardingListener$TriggerLongPress(final ListPopupWindow$ForwardingListener this$0) {
        this.this$0 = this$0;
    }
    
    ListPopupWindow$ForwardingListener$TriggerLongPress(final ListPopupWindow$ForwardingListener listPopupWindow$ForwardingListener, final ListPopupWindow$1 listPopupWindow$1) {
        this(listPopupWindow$ForwardingListener);
    }
    
    @Override
    public void run() {
        ListPopupWindow$ForwardingListener.access$1000(this.this$0);
    }
}
