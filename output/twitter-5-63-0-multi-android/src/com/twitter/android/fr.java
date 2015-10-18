// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class fr implements ViewTreeObserver$OnGlobalLayoutListener
{
    final /* synthetic */ View a;
    final /* synthetic */ EditAccountActivity b;
    
    fr(final EditAccountActivity b, final View a) {
        this.b = b;
        this.a = a;
    }
    
    public void onGlobalLayout() {
        final Rect rect = new Rect();
        final Resources resources = this.b.getResources();
        this.a.getWindowVisibleDisplayFrame(rect);
        if (this.a.getRootView().getHeight() - rect.bottom > resources.getDimensionPixelSize(2131558941)) {
            final int[] array = new int[2];
            final int[] array2 = new int[2];
            final View currentFocus = this.b.getCurrentFocus();
            this.b.findViewById(2131886663).getLocationInWindow(array);
            currentFocus.getLocationInWindow(array2);
            this.a.postDelayed((Runnable)new fs(this, array2[1] - array[1]), 80L);
        }
    }
}
