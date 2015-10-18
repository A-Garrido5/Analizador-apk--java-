// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.widget;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.View;
import android.support.v4.app.RemoteInputCompatBase$RemoteInput;
import android.view.WindowInsets;
import android.view.ViewGroup$MarginLayoutParams;

class DrawerLayoutCompatApi21
{
    private static final int[] THEME_ATTRS;
    
    static {
        THEME_ATTRS = new int[] { 16843828 };
    }
    
    public static void applyMarginInsets(final ViewGroup$MarginLayoutParams viewGroup$MarginLayoutParams, final Object o, final int n) {
        final boolean a = SearchViewCompatIcs$MySearchView.a;
        final WindowInsets windowInsets = (WindowInsets)o;
        WindowInsets windowInsets2 = null;
        Label_0078: {
            if (n == 3) {
                windowInsets2 = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                if (!a) {
                    break Label_0078;
                }
                ++RemoteInputCompatBase$RemoteInput.a;
            }
            else {
                windowInsets2 = windowInsets;
            }
            if (n == 5) {
                windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
            }
        }
        viewGroup$MarginLayoutParams.leftMargin = windowInsets2.getSystemWindowInsetLeft();
        viewGroup$MarginLayoutParams.topMargin = windowInsets2.getSystemWindowInsetTop();
        viewGroup$MarginLayoutParams.rightMargin = windowInsets2.getSystemWindowInsetRight();
        viewGroup$MarginLayoutParams.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
    }
    
    public static void configureApplyInsets(final View view) {
        if (view instanceof DrawerLayoutImpl) {
            view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)new DrawerLayoutCompatApi21$InsetsListener());
            view.setSystemUiVisibility(1280);
        }
    }
    
    public static void dispatchChildInsets(final View view, final Object o, final int n) {
        final boolean a = SearchViewCompatIcs$MySearchView.a;
        final WindowInsets windowInsets = (WindowInsets)o;
        WindowInsets windowInsets2 = null;
        Label_0070: {
            if (n == 3) {
                windowInsets2 = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
                if (!a) {
                    break Label_0070;
                }
            }
            else {
                windowInsets2 = windowInsets;
            }
            if (n == 5) {
                windowInsets2 = windowInsets2.replaceSystemWindowInsets(0, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
            }
        }
        view.dispatchApplyWindowInsets(windowInsets2);
        if (RemoteInputCompatBase$RemoteInput.a != 0) {
            SearchViewCompatIcs$MySearchView.a = !a;
        }
    }
    
    public static Drawable getDefaultStatusBarBackground(final Context context) {
        final TypedArray obtainStyledAttributes = context.obtainStyledAttributes(DrawerLayoutCompatApi21.THEME_ATTRS);
        try {
            return obtainStyledAttributes.getDrawable(0);
        }
        finally {
            obtainStyledAttributes.recycle();
        }
    }
    
    public static int getTopInset(final Object o) {
        if (o != null) {
            return ((WindowInsets)o).getSystemWindowInsetTop();
        }
        return 0;
    }
}
