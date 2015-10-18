// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.graphics.Rect;
import android.support.v7.internal.widget.FitWindowsViewGroup$OnFitSystemWindowsListener;

class AppCompatDelegateImplV7$3 implements FitWindowsViewGroup$OnFitSystemWindowsListener
{
    final AppCompatDelegateImplV7 this$0;
    
    AppCompatDelegateImplV7$3(final AppCompatDelegateImplV7 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public void onFitSystemWindows(final Rect rect) {
        rect.top = AppCompatDelegateImplV7.access$300(this.this$0, rect.top);
    }
}
