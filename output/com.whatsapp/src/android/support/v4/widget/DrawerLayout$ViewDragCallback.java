// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.view.View;

class DrawerLayout$ViewDragCallback extends ViewDragHelper$Callback
{
    private final int mAbsGravity;
    private ViewDragHelper mDragger;
    private final Runnable mPeekRunnable;
    final DrawerLayout this$0;
    
    public DrawerLayout$ViewDragCallback(final DrawerLayout this$0, final int mAbsGravity) {
        this.this$0 = this$0;
        this.mPeekRunnable = new DrawerLayout$ViewDragCallback$1(this);
        this.mAbsGravity = mAbsGravity;
    }
    
    static void access$000(final DrawerLayout$ViewDragCallback drawerLayout$ViewDragCallback) {
        drawerLayout$ViewDragCallback.peekDrawer();
    }
    
    private void closeOtherDrawer() {
        int n = 3;
        if (this.mAbsGravity == n) {
            n = 5;
        }
        final View drawerWithGravity = this.this$0.findDrawerWithGravity(n);
        if (drawerWithGravity != null) {
            this.this$0.closeDrawer(drawerWithGravity);
        }
    }
    
    private void peekDrawer() {
        final int edgeSize = this.mDragger.getEdgeSize();
        boolean b;
        if (this.mAbsGravity == 3) {
            b = true;
        }
        else {
            b = false;
        }
        View view = null;
        int n3 = 0;
        Label_0087: {
            if (b) {
                final View drawerWithGravity = this.this$0.findDrawerWithGravity(3);
                int n = 0;
                if (drawerWithGravity != null) {
                    n = -drawerWithGravity.getWidth();
                }
                final int n2 = n + edgeSize;
                if (!SlidingPaneLayout.a) {
                    view = drawerWithGravity;
                    n3 = n2;
                    break Label_0087;
                }
            }
            final View drawerWithGravity2 = this.this$0.findDrawerWithGravity(5);
            final int n4 = this.this$0.getWidth() - edgeSize;
            view = drawerWithGravity2;
            n3 = n4;
        }
        if (view != null && ((b && view.getLeft() < n3) || (!b && view.getLeft() > n3)) && this.this$0.getDrawerLockMode(view) == 0) {
            final DrawerLayout$LayoutParams drawerLayout$LayoutParams = (DrawerLayout$LayoutParams)view.getLayoutParams();
            this.mDragger.smoothSlideViewTo(view, n3, view.getTop());
            drawerLayout$LayoutParams.isPeeking = true;
            this.this$0.invalidate();
            this.closeOtherDrawer();
            this.this$0.cancelChildViewTouch();
        }
    }
    
    @Override
    public int clampViewPositionHorizontal(final View view, final int n, final int n2) {
        if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(n, 0));
        }
        final int width = this.this$0.getWidth();
        return Math.max(width - view.getWidth(), Math.min(n, width));
    }
    
    @Override
    public int clampViewPositionVertical(final View view, final int n, final int n2) {
        return view.getTop();
    }
    
    @Override
    public int getViewHorizontalDragRange(final View view) {
        if (this.this$0.isDrawerView(view)) {
            return view.getWidth();
        }
        return 0;
    }
    
    @Override
    public void onEdgeDragStarted(final int n, final int n2) {
        View view = null;
        Label_0031: {
            if ((n & 0x1) == 0x1) {
                view = this.this$0.findDrawerWithGravity(3);
                if (!SlidingPaneLayout.a) {
                    break Label_0031;
                }
            }
            view = this.this$0.findDrawerWithGravity(5);
        }
        if (view != null && this.this$0.getDrawerLockMode(view) == 0) {
            this.mDragger.captureChildView(view, n2);
        }
    }
    
    @Override
    public boolean onEdgeLock(final int n) {
        return false;
    }
    
    @Override
    public void onEdgeTouched(final int n, final int n2) {
        this.this$0.postDelayed(this.mPeekRunnable, 160L);
    }
    
    @Override
    public void onViewCaptured(final View view, final int n) {
        ((DrawerLayout$LayoutParams)view.getLayoutParams()).isPeeking = false;
        this.closeOtherDrawer();
    }
    
    @Override
    public void onViewDragStateChanged(final int n) {
        this.this$0.updateDrawerState(this.mAbsGravity, n, this.mDragger.getCapturedView());
    }
    
    @Override
    public void onViewPositionChanged(final View view, final int n, final int n2, final int n3, final int n4) {
        final int width = view.getWidth();
        float n5 = 0.0f;
        Label_0051: {
            if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
                n5 = (width + n) / width;
                if (!SlidingPaneLayout.a) {
                    break Label_0051;
                }
            }
            n5 = (this.this$0.getWidth() - n) / width;
        }
        this.this$0.setDrawerViewOffset(view, n5);
        int visibility;
        if (n5 == 0.0f) {
            visibility = 4;
        }
        else {
            visibility = 0;
        }
        view.setVisibility(visibility);
        this.this$0.invalidate();
    }
    
    @Override
    public void onViewReleased(final View view, final float n, final float n2) {
        final float drawerViewOffset = this.this$0.getDrawerViewOffset(view);
        final int width = view.getWidth();
        int width2 = 0;
        Label_0093: {
            if (this.this$0.checkDrawerViewAbsoluteGravity(view, 3)) {
                if (n > 0.0f || (n == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 = 0;
                }
                else {
                    width2 = -width;
                }
                if (!SlidingPaneLayout.a) {
                    break Label_0093;
                }
            }
            width2 = this.this$0.getWidth();
            if (n < 0.0f || (n == 0.0f && drawerViewOffset > 0.5f)) {
                width2 -= width;
            }
        }
        this.mDragger.settleCapturedViewAt(width2, view.getTop());
        this.this$0.invalidate();
    }
    
    public void removeCallbacks() {
        this.this$0.removeCallbacks(this.mPeekRunnable);
    }
    
    public void setDragger(final ViewDragHelper mDragger) {
        this.mDragger = mDragger;
    }
    
    @Override
    public boolean tryCaptureView(final View view, final int n) {
        return this.this$0.isDrawerView(view) && this.this$0.checkDrawerViewAbsoluteGravity(view, this.mAbsGravity) && this.this$0.getDrawerLockMode(view) == 0;
    }
}
