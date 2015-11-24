// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.database.DataSetObserver;

class ViewPager$PagerObserver extends DataSetObserver
{
    final ViewPager this$0;
    
    private ViewPager$PagerObserver(final ViewPager this$0) {
        this.this$0 = this$0;
    }
    
    ViewPager$PagerObserver(final ViewPager viewPager, final ViewPager$1 viewPager$1) {
        this(viewPager);
    }
    
    public void onChanged() {
        this.this$0.dataSetChanged();
    }
    
    public void onInvalidated() {
        this.this$0.dataSetChanged();
    }
}
