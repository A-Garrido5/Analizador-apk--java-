// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v4.view;

import android.view.animation.Interpolator;
import java.util.WeakHashMap;
import android.view.View;
import java.lang.ref.WeakReference;

class ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl$Starter implements Runnable
{
    WeakReference mViewRef;
    ViewPropertyAnimatorCompat mVpa;
    final /* synthetic */ ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl this$0;
    
    private ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl$Starter(final ViewPropertyAnimatorCompat$BaseViewPropertyAnimatorCompatImpl this$0, final ViewPropertyAnimatorCompat mVpa, final View view) {
        this.this$0 = this$0;
        this.mViewRef = new WeakReference((T)view);
        this.mVpa = mVpa;
    }
    
    @Override
    public void run() {
        this.this$0.startAnimation(this.mVpa, (View)this.mViewRef.get());
    }
}
