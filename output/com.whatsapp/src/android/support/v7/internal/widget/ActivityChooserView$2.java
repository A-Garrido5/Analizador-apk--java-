// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.widget;

import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class ActivityChooserView$2 implements ViewTreeObserver$OnGlobalLayoutListener
{
    final ActivityChooserView this$0;
    
    ActivityChooserView$2(final ActivityChooserView this$0) {
        this.this$0 = this$0;
    }
    
    public void onGlobalLayout() {
        if (this.this$0.isShowingPopup()) {
            if (!this.this$0.isShown()) {
                ActivityChooserView.access$100(this.this$0).dismiss();
                if (AdapterViewCompat.a == 0) {
                    return;
                }
            }
            ActivityChooserView.access$100(this.this$0).show();
            if (this.this$0.mProvider != null) {
                this.this$0.mProvider.subUiVisibilityChanged(true);
            }
        }
    }
}
