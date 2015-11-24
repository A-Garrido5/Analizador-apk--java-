// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.View;

class SlidingPaneLayout$DragHelperCallback extends ViewDragHelper$Callback
{
    final SlidingPaneLayout this$0;
    
    private SlidingPaneLayout$DragHelperCallback(final SlidingPaneLayout this$0) {
        this.this$0 = this$0;
    }
    
    SlidingPaneLayout$DragHelperCallback(final SlidingPaneLayout slidingPaneLayout, final SlidingPaneLayout$1 slidingPaneLayout$1) {
        this(slidingPaneLayout);
    }
    
    @Override
    public int clampViewPositionHorizontal(final View view, final int n, final int n2) {
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)SlidingPaneLayout.access$400(this.this$0).getLayoutParams();
        if (SlidingPaneLayout.access$700(this.this$0)) {
            final int n3 = this.this$0.getWidth() - (this.this$0.getPaddingRight() + slidingPaneLayout$LayoutParams.rightMargin + SlidingPaneLayout.access$400(this.this$0).getWidth());
            final int max = Math.max(Math.min(n, n3), n3 - SlidingPaneLayout.access$800(this.this$0));
            if (!SlidingPaneLayout.a) {
                return max;
            }
        }
        final int n4 = this.this$0.getPaddingLeft() + slidingPaneLayout$LayoutParams.leftMargin;
        return Math.min(Math.max(n, n4), n4 + SlidingPaneLayout.access$800(this.this$0));
    }
    
    @Override
    public int clampViewPositionVertical(final View view, final int n, final int n2) {
        return view.getTop();
    }
    
    @Override
    public int getViewHorizontalDragRange(final View view) {
        return SlidingPaneLayout.access$800(this.this$0);
    }
    
    @Override
    public void onEdgeDragStarted(final int n, final int n2) {
        SlidingPaneLayout.access$200(this.this$0).captureChildView(SlidingPaneLayout.access$400(this.this$0), n2);
    }
    
    @Override
    public void onViewCaptured(final View view, final int n) {
        this.this$0.setAllChildrenVisible();
    }
    
    @Override
    public void onViewDragStateChanged(final int n) {
        if (SlidingPaneLayout.access$200(this.this$0).getViewDragState() == 0) {
            if (SlidingPaneLayout.access$300(this.this$0) == 0.0f) {
                this.this$0.updateObscuredViewsVisibility(SlidingPaneLayout.access$400(this.this$0));
                this.this$0.dispatchOnPanelClosed(SlidingPaneLayout.access$400(this.this$0));
                SlidingPaneLayout.access$502(this.this$0, false);
                if (!SlidingPaneLayout.a) {
                    return;
                }
            }
            this.this$0.dispatchOnPanelOpened(SlidingPaneLayout.access$400(this.this$0));
            SlidingPaneLayout.access$502(this.this$0, true);
        }
    }
    
    @Override
    public void onViewPositionChanged(final View view, final int n, final int n2, final int n3, final int n4) {
        SlidingPaneLayout.access$600(this.this$0, n);
        this.this$0.invalidate();
    }
    
    @Override
    public void onViewReleased(final View view, final float n, final float n2) {
        final SlidingPaneLayout$LayoutParams slidingPaneLayout$LayoutParams = (SlidingPaneLayout$LayoutParams)view.getLayoutParams();
        int n5 = 0;
        Label_0156: {
            if (SlidingPaneLayout.access$700(this.this$0)) {
                int n3 = this.this$0.getPaddingRight() + slidingPaneLayout$LayoutParams.rightMargin;
                if (n < 0.0f || (n == 0.0f && SlidingPaneLayout.access$300(this.this$0) > 0.5f)) {
                    n3 += SlidingPaneLayout.access$800(this.this$0);
                }
                final int n4 = this.this$0.getWidth() - n3 - SlidingPaneLayout.access$400(this.this$0).getWidth();
                if (!SlidingPaneLayout.a) {
                    n5 = n4;
                    break Label_0156;
                }
            }
            n5 = this.this$0.getPaddingLeft() + slidingPaneLayout$LayoutParams.leftMargin;
            if (n > 0.0f || (n == 0.0f && SlidingPaneLayout.access$300(this.this$0) > 0.5f)) {
                n5 += SlidingPaneLayout.access$800(this.this$0);
            }
        }
        SlidingPaneLayout.access$200(this.this$0).settleCapturedViewAt(n5, view.getTop());
        this.this$0.invalidate();
    }
    
    @Override
    public boolean tryCaptureView(final View view, final int n) {
        return !SlidingPaneLayout.access$100(this.this$0) && ((SlidingPaneLayout$LayoutParams)view.getLayoutParams()).slideable;
    }
}
