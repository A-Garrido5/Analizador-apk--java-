// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.graphics.drawable.Drawable;
import android.view.ViewParent;
import android.view.View;
import java.util.WeakHashMap;

class ViewCompat$BaseViewCompatImpl implements ViewCompat$ViewCompatImpl
{
    WeakHashMap mViewPropertyAnimatorCompatMap;
    
    ViewCompat$BaseViewCompatImpl() {
        this.mViewPropertyAnimatorCompatMap = null;
    }
    
    private boolean canScrollingViewScrollHorizontally(final ScrollingView scrollingView, final int n) {
        boolean b = true;
        final int computeHorizontalScrollOffset = scrollingView.computeHorizontalScrollOffset();
        final int n2 = scrollingView.computeHorizontalScrollRange() - scrollingView.computeHorizontalScrollExtent();
        if (n2 == 0) {
            b = false;
        }
        else if (n < 0) {
            if (computeHorizontalScrollOffset <= 0) {
                return false;
            }
        }
        else if (computeHorizontalScrollOffset >= n2 - 1) {
            return false;
        }
        return b;
    }
    
    private boolean canScrollingViewScrollVertically(final ScrollingView scrollingView, final int n) {
        boolean b = true;
        final int computeVerticalScrollOffset = scrollingView.computeVerticalScrollOffset();
        final int n2 = scrollingView.computeVerticalScrollRange() - scrollingView.computeVerticalScrollExtent();
        if (n2 == 0) {
            b = false;
        }
        else if (n < 0) {
            if (computeVerticalScrollOffset <= 0) {
                return false;
            }
        }
        else if (computeVerticalScrollOffset >= n2 - 1) {
            return false;
        }
        return b;
    }
    
    @Override
    public ViewPropertyAnimatorCompat animate(final View view) {
        return new ViewPropertyAnimatorCompat(view);
    }
    
    @Override
    public boolean canScrollHorizontally(final View view, final int n) {
        return view instanceof ScrollingView && this.canScrollingViewScrollHorizontally((ScrollingView)view, n);
    }
    
    @Override
    public boolean canScrollVertically(final View view, final int n) {
        return view instanceof ScrollingView && this.canScrollingViewScrollVertically((ScrollingView)view, n);
    }
    
    @Override
    public boolean getFitsSystemWindows(final View view) {
        return false;
    }
    
    long getFrameTime() {
        return 10L;
    }
    
    @Override
    public int getImportantForAccessibility(final View view) {
        return 0;
    }
    
    @Override
    public int getLayerType(final View view) {
        return 0;
    }
    
    @Override
    public int getLayoutDirection(final View view) {
        return 0;
    }
    
    @Override
    public int getMeasuredState(final View view) {
        return 0;
    }
    
    @Override
    public int getMeasuredWidthAndState(final View view) {
        return view.getMeasuredWidth();
    }
    
    @Override
    public int getMinimumHeight(final View view) {
        return 0;
    }
    
    @Override
    public int getOverScrollMode(final View view) {
        return 2;
    }
    
    @Override
    public ViewParent getParentForAccessibility(final View view) {
        return view.getParent();
    }
    
    @Override
    public float getScaleX(final View view) {
        return 0.0f;
    }
    
    @Override
    public float getTranslationY(final View view) {
        return 0.0f;
    }
    
    @Override
    public int getWindowSystemUiVisibility(final View view) {
        return 0;
    }
    
    @Override
    public boolean isLaidOut(final View view) {
        return ViewCompatBase.isLaidOut(view);
    }
    
    @Override
    public boolean isOpaque(final View view) {
        final Drawable background = view.getBackground();
        boolean b = false;
        if (background != null) {
            final int opacity = background.getOpacity();
            b = false;
            if (opacity == -1) {
                b = true;
            }
        }
        return b;
    }
    
    @Override
    public void jumpDrawablesToCurrentState(final View view) {
    }
    
    @Override
    public WindowInsetsCompat onApplyWindowInsets(final View view, final WindowInsetsCompat windowInsetsCompat) {
        return windowInsetsCompat;
    }
    
    @Override
    public void postInvalidateOnAnimation(final View view) {
        view.invalidate();
    }
    
    @Override
    public void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        view.invalidate(n, n2, n3, n4);
    }
    
    @Override
    public void postOnAnimation(final View view, final Runnable runnable) {
        view.postDelayed(runnable, this.getFrameTime());
    }
    
    @Override
    public void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
        view.postDelayed(runnable, n + this.getFrameTime());
    }
    
    @Override
    public void requestApplyInsets(final View view) {
    }
    
    @Override
    public int resolveSizeAndState(final int n, final int n2, final int n3) {
        return View.resolveSize(n, n2);
    }
    
    @Override
    public void setAccessibilityDelegate(final View view, final AccessibilityDelegateCompat accessibilityDelegateCompat) {
    }
    
    @Override
    public void setActivated(final View view, final boolean b) {
    }
    
    @Override
    public void setAlpha(final View view, final float n) {
    }
    
    @Override
    public void setChildrenDrawingOrderEnabled(final ViewGroup viewGroup, final boolean b) {
    }
    
    @Override
    public void setElevation(final View view, final float n) {
    }
    
    @Override
    public void setImportantForAccessibility(final View view, final int n) {
    }
    
    @Override
    public void setLayerPaint(final View view, final Paint paint) {
    }
    
    @Override
    public void setLayerType(final View view, final int n, final Paint paint) {
    }
    
    @Override
    public void setLayoutDirection(final View view, final int n) {
    }
    
    @Override
    public void setOnApplyWindowInsetsListener(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
    }
    
    @Override
    public void setSaveFromParentEnabled(final View view, final boolean b) {
    }
    
    @Override
    public void setScaleX(final View view, final float n) {
    }
    
    @Override
    public void setScaleY(final View view, final float n) {
    }
    
    @Override
    public void setTransitionName(final View view, final String s) {
    }
    
    @Override
    public void setTranslationX(final View view, final float n) {
    }
    
    @Override
    public void setTranslationY(final View view, final float n) {
    }
    
    @Override
    public void stopNestedScroll(final View view) {
        if (view instanceof NestedScrollingChild) {
            ((NestedScrollingChild)view).stopNestedScroll();
        }
    }
}
