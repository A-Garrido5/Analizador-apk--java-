// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.ViewGroup;
import android.support.annotation.Nullable;
import android.view.ViewParent;
import android.view.View;

interface ViewCompat$ViewCompatImpl
{
    ViewPropertyAnimatorCompat animate(final View p0);
    
    boolean canScrollHorizontally(final View p0, final int p1);
    
    boolean canScrollVertically(final View p0, final int p1);
    
    boolean getFitsSystemWindows(final View p0);
    
    int getImportantForAccessibility(final View p0);
    
    int getLayerType(final View p0);
    
    int getLayoutDirection(final View p0);
    
    int getMeasuredState(final View p0);
    
    int getMeasuredWidthAndState(final View p0);
    
    int getMinimumHeight(final View p0);
    
    int getOverScrollMode(final View p0);
    
    ViewParent getParentForAccessibility(final View p0);
    
    float getScaleX(final View p0);
    
    float getTranslationY(final View p0);
    
    int getWindowSystemUiVisibility(final View p0);
    
    boolean isLaidOut(final View p0);
    
    boolean isOpaque(final View p0);
    
    void jumpDrawablesToCurrentState(final View p0);
    
    WindowInsetsCompat onApplyWindowInsets(final View p0, final WindowInsetsCompat p1);
    
    void postInvalidateOnAnimation(final View p0);
    
    void postInvalidateOnAnimation(final View p0, final int p1, final int p2, final int p3, final int p4);
    
    void postOnAnimation(final View p0, final Runnable p1);
    
    void postOnAnimationDelayed(final View p0, final Runnable p1, final long p2);
    
    void requestApplyInsets(final View p0);
    
    int resolveSizeAndState(final int p0, final int p1, final int p2);
    
    void setAccessibilityDelegate(final View p0, @Nullable final AccessibilityDelegateCompat p1);
    
    void setActivated(final View p0, final boolean p1);
    
    void setAlpha(final View p0, final float p1);
    
    void setChildrenDrawingOrderEnabled(final ViewGroup p0, final boolean p1);
    
    void setElevation(final View p0, final float p1);
    
    void setImportantForAccessibility(final View p0, final int p1);
    
    void setLayerPaint(final View p0, final Paint p1);
    
    void setLayerType(final View p0, final int p1, final Paint p2);
    
    void setLayoutDirection(final View p0, final int p1);
    
    void setOnApplyWindowInsetsListener(final View p0, final OnApplyWindowInsetsListener p1);
    
    void setSaveFromParentEnabled(final View p0, final boolean p1);
    
    void setScaleX(final View p0, final float p1);
    
    void setScaleY(final View p0, final float p1);
    
    void setTransitionName(final View p0, final String p1);
    
    void setTranslationX(final View p0, final float p1);
    
    void setTranslationY(final View p0, final float p1);
    
    void stopNestedScroll(final View p0);
}
