// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.ViewParent;
import android.view.View;

class ViewCompat$JBViewCompatImpl extends ViewCompat$ICSViewCompatImpl
{
    @Override
    public boolean getFitsSystemWindows(final View view) {
        return ViewCompatJB.getFitsSystemWindows(view);
    }
    
    @Override
    public int getImportantForAccessibility(final View view) {
        return ViewCompatJB.getImportantForAccessibility(view);
    }
    
    @Override
    public int getMinimumHeight(final View view) {
        return ViewCompatJB.getMinimumHeight(view);
    }
    
    @Override
    public ViewParent getParentForAccessibility(final View view) {
        return ViewCompatJB.getParentForAccessibility(view);
    }
    
    @Override
    public void postInvalidateOnAnimation(final View view) {
        ViewCompatJB.postInvalidateOnAnimation(view);
    }
    
    @Override
    public void postInvalidateOnAnimation(final View view, final int n, final int n2, final int n3, final int n4) {
        ViewCompatJB.postInvalidateOnAnimation(view, n, n2, n3, n4);
    }
    
    @Override
    public void postOnAnimation(final View view, final Runnable runnable) {
        ViewCompatJB.postOnAnimation(view, runnable);
    }
    
    @Override
    public void postOnAnimationDelayed(final View view, final Runnable runnable, final long n) {
        ViewCompatJB.postOnAnimationDelayed(view, runnable, n);
    }
    
    @Override
    public void requestApplyInsets(final View view) {
        ViewCompatJB.requestApplyInsets(view);
    }
    
    @Override
    public void setImportantForAccessibility(final View view, int n) {
        if (n == 4) {
            n = 2;
        }
        ViewCompatJB.setImportantForAccessibility(view, n);
    }
}
