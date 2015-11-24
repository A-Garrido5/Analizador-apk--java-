// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView$OnItemSelectedListener;

class ListPopupWindow$3 implements AdapterView$OnItemSelectedListener
{
    final ListPopupWindow this$0;
    
    ListPopupWindow$3(final ListPopupWindow this$0) {
        this.this$0 = this$0;
    }
    
    public void onItemSelected(final AdapterView adapterView, final View view, final int n, final long n2) {
        if (n != -1) {
            final ListPopupWindow$DropDownListView access$600 = ListPopupWindow.access$600(this.this$0);
            if (access$600 != null) {
                ListPopupWindow$DropDownListView.access$502(access$600, false);
            }
        }
    }
    
    public void onNothingSelected(final AdapterView adapterView) {
    }
}
