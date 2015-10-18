// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.view.View;

class AppCompatDelegateImplV7$4 implements Runnable
{
    final AppCompatDelegateImplV7 this$0;
    
    AppCompatDelegateImplV7$4(final AppCompatDelegateImplV7 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void run() {
        this.this$0.mActionModePopup.showAtLocation((View)this.this$0.mActionModeView, 55, 0, 0);
    }
}
