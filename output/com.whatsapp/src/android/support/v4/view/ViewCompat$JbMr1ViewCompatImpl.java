// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class ViewCompat$JbMr1ViewCompatImpl extends ViewCompat$JBViewCompatImpl
{
    @Override
    public int getLayoutDirection(final View view) {
        return ViewCompatJellybeanMr1.getLayoutDirection(view);
    }
    
    @Override
    public int getWindowSystemUiVisibility(final View view) {
        return ViewCompatJellybeanMr1.getWindowSystemUiVisibility(view);
    }
    
    @Override
    public void setLayerPaint(final View view, final Paint paint) {
        ViewCompatJellybeanMr1.setLayerPaint(view, paint);
    }
    
    @Override
    public void setLayoutDirection(final View view, final int n) {
        ViewCompatJellybeanMr1.setLayoutDirection(view, n);
    }
}
