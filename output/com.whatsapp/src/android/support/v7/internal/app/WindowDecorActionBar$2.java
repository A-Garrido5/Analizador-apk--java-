// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.internal.app;

import android.support.v7.internal.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.support.v4.view.ViewPropertyAnimatorListenerAdapter;

class WindowDecorActionBar$2 extends ViewPropertyAnimatorListenerAdapter
{
    final WindowDecorActionBar this$0;
    
    WindowDecorActionBar$2(final WindowDecorActionBar this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onAnimationEnd(final View view) {
        WindowDecorActionBar.access$502(this.this$0, null);
        WindowDecorActionBar.access$200(this.this$0).requestLayout();
    }
}
