// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View;
import android.os.Build$VERSION;

public class ViewCompat
{
    static final ViewCompat$ViewCompatImpl IMPL;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 21) {
            IMPL = new ViewCompat$LollipopViewCompatImpl();
            return;
        }
        if (sdk_INT >= 19) {
            IMPL = new ViewCompat$KitKatViewCompatImpl();
            return;
        }
        if (sdk_INT >= 17) {
            IMPL = new ViewCompat$JbMr1ViewCompatImpl();
            return;
        }
        if (sdk_INT >= 16) {
            IMPL = new ViewCompat$JBViewCompatImpl();
            return;
        }
        if (sdk_INT >= 14) {
            IMPL = new ViewCompat$ICSViewCompatImpl();
            return;
        }
        if (sdk_INT >= 11) {
            IMPL = new ViewCompat$HCViewCompatImpl();
            return;
        }
        if (sdk_INT >= 9) {
            IMPL = new ViewCompat$GBViewCompatImpl();
            return;
        }
        if (sdk_INT >= 7) {
            IMPL = new ViewCompat$EclairMr1ViewCompatImpl();
            return;
        }
        IMPL = new ViewCompat$BaseViewCompatImpl();
    }
    
    public static ViewPropertyAnimatorCompat animate(final View view) {
        return ViewCompat.IMPL.animate(view);
    }
    
    public static boolean canScrollHorizontally(final View view, final int n) {
        return ViewCompat.IMPL.canScrollHorizontally(view, n);
    }
    
    public static boolean canScrollVertically(final View view, final int n) {
        return ViewCompat.IMPL.canScrollVertically(view, n);
    }
    
    public static boolean getFitsSystemWindows(final View view) {
        return ViewCompat.IMPL.getFitsSystemWindows(view);
    }
    
    public static int getImportantForAccessibility(final View view) {
        return ViewCompat.IMPL.getImportantForAccessibility(view);
    }
    
    public static int getLayerType(final View view) {
        return ViewCompat.IMPL.getLayerType(view);
    }
    
    public static int getLayoutDirection(final View view) {
        return ViewCompat.IMPL.getLayoutDirection(view);
    }
    
    public static int getMeasuredState(final View view) {
        return ViewCompat.IMPL.getMeasuredState(view);
    }
    
    public static int getMeasuredWidthAndState(final View view) {
        return ViewCompat.IMPL.getMeasuredWidthAndState(view);
    }
    
    public static int getMinimumHeight(final View view) {
        return ViewCompat.IMPL.getMinimumHeight(view);
    }
    
    public static int getOverScrollMode(final View view) {
        return ViewCompat.IMPL.getOverScrollMode(view);
    }
    
    public static ViewParent getParentForAccessibility(final View view) {
        return ViewCompat.IMPL.getParentForAccessibility(view);
    }
    
    public static float getScaleX(final View view) {
        return ViewCompat.IMPL.getScaleX(view);
    }
    
    public static float getTranslationY(final View view) {
        return ViewCompat.IMPL.getTranslationY(view);
    }
    
    public static int getWindowSystemUiVisibility(final View view) {
        return ViewCompat.IMPL.getWindowSystemUiVisibility(view);
    }
    
    public static boolean isLaidOut(final View view) {
        return ViewCompat.IMPL.isLaidOut(view);
    }
    
    public static boolean isOpaque(final View view) {
        return ViewCompat.IMPL.isOpaque(view);
    }
    
    public static void jumpDrawablesToCurrentState(final View view) {
        ViewCompat.IMPL.jumpDrawablesToCurrentState(view);
    }
    
    public static WindowInsetsCompat onApplyWindowInsets(final View view, final WindowInsetsCompat windowInsetsCompat) {
        return ViewCompat.IMPL.onApplyWindowInsets(view, windowInsetsCompat);
    }
    
    public static void postInvalidateOnAnimation(final View view) {
        ViewCompat.IMPL.postInvalidateOnAnimation(view);
    }
    
    public static void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        ViewCompat.IMPL.postInvalidateOnAnimation(view, n, n2, n3, n4);
    }
    
    public static void postOnAnimation(final View view, final Runnable runnable) {
        ViewCompat.IMPL.postOnAnimation(view, runnable);
    }
    
    public static void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
        ViewCompat.IMPL.postOnAnimationDelayed(view, runnable, n);
    }
    
    public static void requestApplyInsets(final View view) {
        ViewCompat.IMPL.requestApplyInsets(view);
    }
    
    public static int resolveSizeAndState(final int n, final int n2, final int n3) {
        return ViewCompat.IMPL.resolveSizeAndState(n, n2, n3);
    }
    
    public static void setAccessibilityDelegate(final View view, final AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.IMPL.setAccessibilityDelegate(view, accessibilityDelegateCompat);
    }
    
    public static void setActivated(final View view, final boolean b) {
        ViewCompat.IMPL.setActivated(view, b);
    }
    
    public static void setAlpha(final View view, final float n) {
        ViewCompat.IMPL.setAlpha(view, n);
    }
    
    public static void setChildrenDrawingOrderEnabled(final ViewGroup viewGroup, final boolean b) {
        ViewCompat.IMPL.setChildrenDrawingOrderEnabled(viewGroup, b);
    }
    
    public static void setElevation(final View view, final float n) {
        ViewCompat.IMPL.setElevation(view, n);
    }
    
    public static void setImportantForAccessibility(final View view, final int n) {
        ViewCompat.IMPL.setImportantForAccessibility(view, n);
    }
    
    public static void setLayerPaint(final View view, final Paint paint) {
        ViewCompat.IMPL.setLayerPaint(view, paint);
    }
    
    public static void setLayerType(final View view, final int n, final Paint paint) {
        ViewCompat.IMPL.setLayerType(view, n, paint);
    }
    
    public static void setLayoutDirection(final View view, final int n) {
        ViewCompat.IMPL.setLayoutDirection(view, n);
    }
    
    public static void setOnApplyWindowInsetsListener(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ViewCompat.IMPL.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
    }
    
    public static void setSaveFromParentEnabled(final View view, final boolean b) {
        ViewCompat.IMPL.setSaveFromParentEnabled(view, b);
    }
    
    public static void setScaleX(final View view, final float n) {
        ViewCompat.IMPL.setScaleX(view, n);
    }
    
    public static void setScaleY(final View view, final float n) {
        ViewCompat.IMPL.setScaleY(view, n);
    }
    
    public static void setTransitionName(final View view, final String s) {
        ViewCompat.IMPL.setTransitionName(view, s);
    }
    
    public static void setTranslationX(final View view, final float n) {
        ViewCompat.IMPL.setTranslationX(view, n);
    }
    
    public static void setTranslationY(final View view, final float n) {
        ViewCompat.IMPL.setTranslationY(view, n);
    }
    
    public static void stopNestedScroll(final View view) {
        ViewCompat.IMPL.stopNestedScroll(view);
    }
}
