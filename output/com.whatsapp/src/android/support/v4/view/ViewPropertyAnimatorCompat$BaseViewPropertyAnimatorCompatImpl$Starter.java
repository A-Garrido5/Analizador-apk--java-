// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.View;
import java.lang.ref.WeakReference;

class ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl$Starter implements Runnable
{
    WeakReference mViewRef;
    ViewPropertyAnimatorCompat mVpa;
    final ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl this$0;
    
    private ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl$Starter(final ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl this$0, final ViewPropertyAnimatorCompat mVpa, final View view) {
        this.this$0 = this$0;
        this.mViewRef = new WeakReference((T)view);
        this.mVpa = mVpa;
    }
    
    ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl$Starter(final ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl viewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl, final ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, final View view, final ViewPropertyAnimatorCompat$1 viewPropertyAnimatorCompat$1) {
        this(viewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl, viewPropertyAnimatorCompat, view);
    }
    
    @Override
    public void run() {
        final View view = (View)this.mViewRef.get();
        if (view != null) {
            ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl.access$200(this.this$0, this.mVpa, view);
        }
    }
}
