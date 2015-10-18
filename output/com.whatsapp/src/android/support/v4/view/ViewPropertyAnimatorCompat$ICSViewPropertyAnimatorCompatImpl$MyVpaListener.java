// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.View;

class ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener implements ViewPropertyAnimatorListener
{
    ViewPropertyAnimatorCompat mVpa;
    
    ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$MyVpaListener(final ViewPropertyAnimatorCompat mVpa) {
        this.mVpa = mVpa;
    }
    
    @Override
    public void onAnimationCancel(final View view) {
        final Object tag = view.getTag(2113929216);
        ViewPropertyAnimatorListener viewPropertyAnimatorListener;
        if (tag instanceof ViewPropertyAnimatorListener) {
            viewPropertyAnimatorListener = (ViewPropertyAnimatorListener)tag;
        }
        else {
            viewPropertyAnimatorListener = null;
        }
        if (viewPropertyAnimatorListener != null) {
            viewPropertyAnimatorListener.onAnimationCancel(view);
        }
    }
    
    @Override
    public void onAnimationEnd(final View view) {
        if (ViewPropertyAnimatorCompat.access$400(this.mVpa) >= 0) {
            ViewCompat.setLayerType(view, ViewPropertyAnimatorCompat.access$400(this.mVpa), null);
            ViewPropertyAnimatorCompat.access$402(this.mVpa, -1);
        }
        if (ViewPropertyAnimatorCompat.access$000(this.mVpa) != null) {
            ViewPropertyAnimatorCompat.access$000(this.mVpa).run();
        }
        final Object tag = view.getTag(2113929216);
        ViewPropertyAnimatorListener viewPropertyAnimatorListener;
        if (tag instanceof ViewPropertyAnimatorListener) {
            viewPropertyAnimatorListener = (ViewPropertyAnimatorListener)tag;
        }
        else {
            viewPropertyAnimatorListener = null;
        }
        if (viewPropertyAnimatorListener != null) {
            viewPropertyAnimatorListener.onAnimationEnd(view);
        }
    }
    
    @Override
    public void onAnimationStart(final View view) {
        if (ViewPropertyAnimatorCompat.access$400(this.mVpa) >= 0) {
            ViewCompat.setLayerType(view, 2, null);
        }
        if (ViewPropertyAnimatorCompat.access$100(this.mVpa) != null) {
            ViewPropertyAnimatorCompat.access$100(this.mVpa).run();
        }
        final Object tag = view.getTag(2113929216);
        ViewPropertyAnimatorListener viewPropertyAnimatorListener;
        if (tag instanceof ViewPropertyAnimatorListener) {
            viewPropertyAnimatorListener = (ViewPropertyAnimatorListener)tag;
        }
        else {
            viewPropertyAnimatorListener = null;
        }
        if (viewPropertyAnimatorListener != null) {
            viewPropertyAnimatorListener.onAnimationStart(view);
        }
    }
}
