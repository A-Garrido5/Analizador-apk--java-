// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.ViewParent;
import android.view.View;

class ViewCompatJB
{
    public static boolean getFitsSystemWindows(final View view) {
        return view.getFitsSystemWindows();
    }
    
    public static int getImportantForAccessibility(final View view) {
        return view.getImportantForAccessibility();
    }
    
    public static int getMinimumHeight(final View view) {
        return view.getMinimumHeight();
    }
    
    public static ViewParent getParentForAccessibility(final View view) {
        return view.getParentForAccessibility();
    }
    
    public static void postInvalidateOnAnimation(final View view) {
        view.postInvalidateOnAnimation();
    }
    
    public static void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        view.postInvalidate(n, n2, n3, n4);
    }
    
    public static void postOnAnimation(final View view, final Runnable runnable) {
        view.postOnAnimation(runnable);
    }
    
    public static void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
        view.postOnAnimationDelayed(runnable, n);
    }
    
    public static void requestApplyInsets(final View view) {
        view.requestFitSystemWindows();
    }
    
    public static void setImportantForAccessibility(final View view, final int importantForAccessibility) {
        view.setImportantForAccessibility(importantForAccessibility);
    }
}
