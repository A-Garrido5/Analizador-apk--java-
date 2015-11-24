// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.Display;
import android.view.ViewTreeObserver$OnGlobalLayoutListener;

class a_o implements ViewTreeObserver$OnGlobalLayoutListener
{
    final l1 a;
    
    a_o(final l1 a) {
        this.a = a;
    }
    
    public void onGlobalLayout() {
        if (l1.c(this.a) != null) {
            final int height = l1.c(this.a).getHeight();
            final int[] array = new int[2];
            l1.c(this.a).getLocationOnScreen(array);
            final int n = height + array[1];
            final Display defaultDisplay = l1.a(this.a).getWindowManager().getDefaultDisplay();
            final int width = defaultDisplay.getWidth();
            int n2;
            if (defaultDisplay.getHeight() - n < 128.0f * vc.b().b) {
                n2 = 1;
            }
            else {
                n2 = 0;
            }
            int n3 = 0;
            Label_0130: {
                if (n2 != 0) {
                    this.a.dismiss();
                    if (!App.I) {
                        n3 = 0;
                        break Label_0130;
                    }
                }
                n3 = defaultDisplay.getHeight() - n;
                l1.a(this.a, n3);
            }
            this.a.update(0, n, width, n3, true);
        }
    }
}
