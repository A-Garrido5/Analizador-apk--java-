// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View$OnApplyWindowInsetsListener;
import android.view.WindowInsets;
import android.view.View;

class ViewCompatLollipop
{
    public static WindowInsetsCompat onApplyWindowInsets(final View view, WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat instanceof WindowInsetsCompatApi21) {
            final WindowInsets unwrap = ((WindowInsetsCompatApi21)windowInsetsCompat).unwrap();
            final WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(unwrap);
            if (onApplyWindowInsets != unwrap) {
                windowInsetsCompat = new WindowInsetsCompatApi21(onApplyWindowInsets);
            }
        }
        return windowInsetsCompat;
    }
    
    public static void requestApplyInsets(final View view) {
        view.requestApplyInsets();
    }
    
    public static void setElevation(final View view, final float elevation) {
        view.setElevation(elevation);
    }
    
    public static void setOnApplyWindowInsetsListener(final View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new ViewCompatLollipop$1(onApplyWindowInsetsListener));
    }
    
    public static void setTransitionName(final View view, final String transitionName) {
        view.setTransitionName(transitionName);
    }
    
    public static void stopNestedScroll(final View view) {
        view.stopNestedScroll();
    }
}
