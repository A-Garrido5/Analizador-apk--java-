// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.database.DataSetObserver;

class ActivityChooserView$1 extends DataSetObserver
{
    final ActivityChooserView this$0;
    
    ActivityChooserView$1(final ActivityChooserView this$0) {
        this.this$0 = this$0;
    }
    
    public void onChanged() {
        super.onChanged();
        ActivityChooserView.access$000(this.this$0).notifyDataSetChanged();
    }
    
    public void onInvalidated() {
        super.onInvalidated();
        ActivityChooserView.access$000(this.this$0).notifyDataSetInvalidated();
    }
}
