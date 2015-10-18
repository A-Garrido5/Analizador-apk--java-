// 
// Decompiled by Procyon v0.5.30
// 

package android.support.v7.app;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;
import android.support.v4.view.OnApplyWindowInsetsListener;

class AppCompatDelegateImplV7$2 implements OnApplyWindowInsetsListener
{
    final AppCompatDelegateImplV7 this$0;
    
    AppCompatDelegateImplV7$2(final AppCompatDelegateImplV7 this$0) {
        this.this$0 = this$0;
    }
    
    @Override
    public WindowInsetsCompat onApplyWindowInsets(final View view, WindowInsetsCompat replaceSystemWindowInsets) {
        final int systemWindowInsetTop = replaceSystemWindowInsets.getSystemWindowInsetTop();
        final int access$300 = AppCompatDelegateImplV7.access$300(this.this$0, systemWindowInsetTop);
        if (systemWindowInsetTop != access$300) {
            replaceSystemWindowInsets = replaceSystemWindowInsets.replaceSystemWindowInsets(replaceSystemWindowInsets.getSystemWindowInsetLeft(), access$300, replaceSystemWindowInsets.getSystemWindowInsetRight(), replaceSystemWindowInsets.getSystemWindowInsetBottom());
        }
        return ViewCompat.onApplyWindowInsets(view, replaceSystemWindowInsets);
    }
}
