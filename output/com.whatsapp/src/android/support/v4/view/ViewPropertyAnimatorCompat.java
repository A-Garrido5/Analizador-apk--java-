// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.animation.Interpolator;
import android.view.View;
import android.os.Build$VERSION;
import java.lang.ref.WeakReference;

public class ViewPropertyAnimatorCompat
{
    static final ViewPropertyAnimatorCompat$ViewPropertyAnimatorCompatImpl IMPL;
    private Runnable mEndAction;
    private int mOldLayerType;
    private Runnable mStartAction;
    private WeakReference mView;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 19) {
            IMPL = new ViewPropertyAnimatorCompat$KitKatViewPropertyAnimatorCompatImpl();
            return;
        }
        if (sdk_INT >= 18) {
            IMPL = new ViewPropertyAnimatorCompat$JBMr2ViewPropertyAnimatorCompatImpl();
            return;
        }
        if (sdk_INT >= 16) {
            IMPL = new ViewPropertyAnimatorCompat$JBViewPropertyAnimatorCompatImpl();
            return;
        }
        if (sdk_INT >= 14) {
            IMPL = new ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl();
            return;
        }
        IMPL = new ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl();
    }
    
    ViewPropertyAnimatorCompat(final View view) {
        this.mStartAction = null;
        this.mEndAction = null;
        this.mOldLayerType = -1;
        this.mView = new WeakReference((T)view);
    }
    
    static Runnable access$000(final ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        return viewPropertyAnimatorCompat.mEndAction;
    }
    
    static Runnable access$100(final ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        return viewPropertyAnimatorCompat.mStartAction;
    }
    
    static int access$400(final ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        return viewPropertyAnimatorCompat.mOldLayerType;
    }
    
    static int access$402(final ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, final int mOldLayerType) {
        return viewPropertyAnimatorCompat.mOldLayerType = mOldLayerType;
    }
    
    public ViewPropertyAnimatorCompat alpha(final float n) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.alpha(this, view, n);
        }
        return this;
    }
    
    public void cancel() {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.cancel(this, view);
        }
    }
    
    public ViewPropertyAnimatorCompat scaleY(final float n) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.scaleY(this, view, n);
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompat setDuration(final long n) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.setDuration(this, view, n);
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompat setInterpolator(final Interpolator interpolator) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.setInterpolator(this, view, interpolator);
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompat setListener(final ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.setListener(this, view, viewPropertyAnimatorListener);
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompat setUpdateListener(final ViewPropertyAnimatorUpdateListener viewPropertyAnimatorUpdateListener) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.setUpdateListener(this, view, viewPropertyAnimatorUpdateListener);
        }
        return this;
    }
    
    public void start() {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.start(this, view);
        }
    }
    
    public ViewPropertyAnimatorCompat translationX(final float n) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.translationX(this, view, n);
        }
        return this;
    }
    
    public ViewPropertyAnimatorCompat translationY(final float n) {
        final View view = (View)this.mView.get();
        if (view != null) {
            ViewPropertyAnimatorCompat.IMPL.translationY(this, view, n);
        }
        return this;
    }
}
