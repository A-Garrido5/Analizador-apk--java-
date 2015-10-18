// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;
import android.view.View$OnFocusChangeListener;

class SearchView$4 implements View$OnFocusChangeListener
{
    final SearchView this$0;
    
    SearchView$4(final SearchView this$0) {
        this.this$0 = this$0;
    }
    
    public void onFocusChange(final View view, final boolean b) {
        if (SearchView.access$200(this.this$0) != null) {
            SearchView.access$200(this.this$0).onFocusChange((View)this.this$0, b);
        }
    }
}
