// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class ViewCompatJellybeanMr1
{
    public static int getLayoutDirection(final View view) {
        return view.getLayoutDirection();
    }
    
    public static int getWindowSystemUiVisibility(final View view) {
        return view.getWindowSystemUiVisibility();
    }
    
    public static void setLayerPaint(final View view, final Paint layerPaint) {
        view.setLayerPaint(layerPaint);
    }
    
    public static void setLayoutDirection(final View view, final int layoutDirection) {
        view.setLayoutDirection(layoutDirection);
    }
}
