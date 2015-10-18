// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.support.annotation.Nullable;
import java.util.WeakHashMap;
import android.view.View;

class ViewCompat$ICSViewCompatImpl extends ViewCompat$HCViewCompatImpl
{
    static boolean accessibilityDelegateCheckFailed;
    
    static {
        ViewCompat$ICSViewCompatImpl.accessibilityDelegateCheckFailed = false;
    }
    
    @Override
    public ViewPropertyAnimatorCompat animate(final View view) {
        if (this.mViewPropertyAnimatorCompatMap == null) {
            this.mViewPropertyAnimatorCompatMap = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = this.mViewPropertyAnimatorCompatMap.get(view);
        if (viewPropertyAnimatorCompat == null) {
            viewPropertyAnimatorCompat = new ViewPropertyAnimatorCompat(view);
            this.mViewPropertyAnimatorCompatMap.put(view, viewPropertyAnimatorCompat);
        }
        return viewPropertyAnimatorCompat;
    }
    
    @Override
    public boolean canScrollHorizontally(final View view, final int n) {
        return ViewCompatICS.canScrollHorizontally(view, n);
    }
    
    @Override
    public boolean canScrollVertically(final View view, final int n) {
        return ViewCompatICS.canScrollVertically(view, n);
    }
    
    @Override
    public void setAccessibilityDelegate(final View view, @Nullable final AccessibilityDelegateCompat accessibilityDelegateCompat) {
        Object bridge;
        if (accessibilityDelegateCompat == null) {
            bridge = null;
        }
        else {
            bridge = accessibilityDelegateCompat.getBridge();
        }
        ViewCompatICS.setAccessibilityDelegate(view, bridge);
    }
}
