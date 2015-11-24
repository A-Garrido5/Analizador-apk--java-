// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.View;
import android.view.View$OnClickListener;

class ScrollingTabContainerView$TabClickListener implements View$OnClickListener
{
    final ScrollingTabContainerView this$0;
    
    private ScrollingTabContainerView$TabClickListener(final ScrollingTabContainerView this$0) {
        this.this$0 = this$0;
    }
    
    ScrollingTabContainerView$TabClickListener(final ScrollingTabContainerView scrollingTabContainerView, final ScrollingTabContainerView$1 scrollingTabContainerView$1) {
        this(scrollingTabContainerView);
    }
    
    public void onClick(final View view) {
        final int a = AdapterViewCompat.a;
        ((ScrollingTabContainerView$TabView)view).getTab().select();
        int n;
        for (int childCount = ScrollingTabContainerView.access$200(this.this$0).getChildCount(), i = 0; i < childCount; i = n) {
            final View child = ScrollingTabContainerView.access$200(this.this$0).getChildAt(i);
            child.setSelected(child == view);
            n = i + 1;
            if (a != 0) {
                break;
            }
        }
    }
}
