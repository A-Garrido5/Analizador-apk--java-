// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class SpinnerCompat$2 implements ViewTreeObserver$OnGlobalLayoutListener
{
    final SpinnerCompat this$0;
    
    SpinnerCompat$2(final SpinnerCompat this$0) {
        this.this$0 = this$0;
    }
    
    public void onGlobalLayout() {
        if (!SpinnerCompat.access$100(this.this$0).isShowing()) {
            SpinnerCompat.access$100(this.this$0).show();
        }
        final ViewTreeObserver viewTreeObserver = this.this$0.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener((ViewTreeObserver$OnGlobalLayoutListener)this);
        }
    }
}
