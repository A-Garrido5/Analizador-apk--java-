// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.support.v7.app.ActionBar$Tab;
import android.view.ViewGroup;
import android.view.View;
import android.widget.BaseAdapter;

class ScrollingTabContainerView$TabAdapter extends BaseAdapter
{
    final ScrollingTabContainerView this$0;
    
    private ScrollingTabContainerView$TabAdapter(final ScrollingTabContainerView this$0) {
        this.this$0 = this$0;
    }
    
    ScrollingTabContainerView$TabAdapter(final ScrollingTabContainerView scrollingTabContainerView, final ScrollingTabContainerView$1 scrollingTabContainerView$1) {
        this(scrollingTabContainerView);
    }
    
    public int getCount() {
        return ScrollingTabContainerView.access$200(this.this$0).getChildCount();
    }
    
    public Object getItem(final int n) {
        return ((ScrollingTabContainerView$TabView)ScrollingTabContainerView.access$200(this.this$0).getChildAt(n)).getTab();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, final View view, final ViewGroup viewGroup) {
        Object access$300;
        if (view == null) {
            access$300 = ScrollingTabContainerView.access$300(this.this$0, (ActionBar$Tab)this.getItem(n), true);
            if (AdapterViewCompat.a == 0) {
                return (View)access$300;
            }
        }
        else {
            access$300 = view;
        }
        ((ScrollingTabContainerView$TabView)access$300).bindTab((ActionBar$Tab)this.getItem(n));
        return (View)access$300;
    }
}
