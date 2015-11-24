// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

class SearchView$9 implements TextView$OnEditorActionListener
{
    final SearchView this$0;
    
    SearchView$9(final SearchView this$0) {
        this.this$0 = this$0;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        SearchView.access$900(this.this$0);
        return true;
    }
}
