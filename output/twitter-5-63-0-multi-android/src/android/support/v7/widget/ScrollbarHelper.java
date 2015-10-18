// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.widget;

import android.view.View;

class ScrollbarHelper
{
    static int computeScrollExtent(final RecyclerView$State recyclerView$State, final OrientationHelper orientationHelper, final View view, final View view2, final RecyclerView$LayoutManager recyclerView$LayoutManager, final boolean b) {
        if (recyclerView$LayoutManager.getChildCount() == 0 || recyclerView$State.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return 1 + Math.abs(recyclerView$LayoutManager.getPosition(view) - recyclerView$LayoutManager.getPosition(view2));
        }
        return Math.min(orientationHelper.getTotalSpace(), orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view));
    }
    
    static int computeScrollOffset(final RecyclerView$State recyclerView$State, final OrientationHelper orientationHelper, final View view, final View view2, final RecyclerView$LayoutManager recyclerView$LayoutManager, final boolean b, final boolean b2) {
        final int childCount = recyclerView$LayoutManager.getChildCount();
        int n = 0;
        if (childCount != 0) {
            final int itemCount = recyclerView$State.getItemCount();
            n = 0;
            if (itemCount != 0) {
                n = 0;
                if (view != null) {
                    n = 0;
                    if (view2 != null) {
                        final int min = Math.min(recyclerView$LayoutManager.getPosition(view), recyclerView$LayoutManager.getPosition(view2));
                        final int max = Math.max(recyclerView$LayoutManager.getPosition(view), recyclerView$LayoutManager.getPosition(view2));
                        if (b2) {
                            n = Math.max(0, -1 + (recyclerView$State.getItemCount() - max));
                        }
                        else {
                            n = Math.max(0, min);
                        }
                        if (b) {
                            return Math.round(Math.abs(orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (1 + Math.abs(recyclerView$LayoutManager.getPosition(view) - recyclerView$LayoutManager.getPosition(view2))) * n + (orientationHelper.getStartAfterPadding() - orientationHelper.getDecoratedStart(view)));
                        }
                    }
                }
            }
        }
        return n;
    }
    
    static int computeScrollRange(final RecyclerView$State recyclerView$State, final OrientationHelper orientationHelper, final View view, final View view2, final RecyclerView$LayoutManager recyclerView$LayoutManager, final boolean b) {
        if (recyclerView$LayoutManager.getChildCount() == 0 || recyclerView$State.getItemCount() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!b) {
            return recyclerView$State.getItemCount();
        }
        return (orientationHelper.getDecoratedEnd(view2) - orientationHelper.getDecoratedStart(view)) / (1 + Math.abs(recyclerView$LayoutManager.getPosition(view) - recyclerView$LayoutManager.getPosition(view2))) * recyclerView$State.getItemCount();
    }
}
