// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;

class WindowDecorActionBar$1 extends ViewPropertyAnimatorListenerAdapter
{
    final WindowDecorActionBar this$0;
    
    WindowDecorActionBar$1(final WindowDecorActionBar this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onAnimationEnd(final View view) {
        if (WindowDecorActionBar.access$000(this.this$0) && WindowDecorActionBar.access$100(this.this$0) != null) {
            ViewCompat.setTranslationY(WindowDecorActionBar.access$100(this.this$0), 0.0f);
            ViewCompat.setTranslationY((View)WindowDecorActionBar.access$200(this.this$0), 0.0f);
        }
        if (WindowDecorActionBar.access$300(this.this$0) != null && WindowDecorActionBar.access$400(this.this$0) == 1) {
            WindowDecorActionBar.access$300(this.this$0).setVisibility(8);
        }
        WindowDecorActionBar.access$200(this.this$0).setVisibility(8);
        WindowDecorActionBar.access$200(this.this$0).setTransitioning(false);
        WindowDecorActionBar.access$502(this.this$0, null);
        this.this$0.completeDeferredDestroyActionMode();
        if (WindowDecorActionBar.access$600(this.this$0) != null) {
            ViewCompat.requestApplyInsets((View)WindowDecorActionBar.access$600(this.this$0));
        }
    }
}
