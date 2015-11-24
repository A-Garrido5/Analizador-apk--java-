// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View;

class ViewCompat$LollipopViewCompatImpl extends ViewCompat$KitKatViewCompatImpl
{
    @Override
    public WindowInsetsCompat onApplyWindowInsets(final View view, final WindowInsetsCompat windowInsetsCompat) {
        return ViewCompatLollipop.onApplyWindowInsets(view, windowInsetsCompat);
    }
    
    @Override
    public void requestApplyInsets(final View view) {
        ViewCompatLollipop.requestApplyInsets(view);
    }
    
    @Override
    public void setElevation(final View view, final float n) {
        ViewCompatLollipop.setElevation(view, n);
    }
    
    @Override
    public void setOnApplyWindowInsetsListener(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        ViewCompatLollipop.setOnApplyWindowInsetsListener(view, onApplyWindowInsetsListener);
    }
    
    @Override
    public void setTransitionName(final View view, final String s) {
        ViewCompatLollipop.setTransitionName(view, s);
    }
    
    @Override
    public void stopNestedScroll(final View view) {
        ViewCompatLollipop.stopNestedScroll(view);
    }
}
