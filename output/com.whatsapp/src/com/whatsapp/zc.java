// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class zc implements View$OnTouchListener
{
    final l1 a;
    
    zc(final l1 a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        final int n = (int)motionEvent.getX();
        final int n2 = (int)motionEvent.getY();
        final int[] array = new int[2];
        view.getLocationOnScreen(array);
        final int n3 = n + array[0];
        final int n4 = n2 + array[1];
        final int[] array2 = new int[2];
        l1.d(this.a).getLocationOnScreen(array2);
        final int n5 = n3 - array2[0];
        final int n6 = n4 - array2[1];
        if (n5 >= 0 && n5 < l1.d(this.a).getWidth() && n6 >= 0 && n6 < l1.d(this.a).getHeight()) {
            l1.a(this.a, true);
        }
        else {
            final int[] array3 = new int[2];
            l1.b(this.a).getLocationOnScreen(array3);
            final int n7 = n4 - array3[1];
            if (n7 >= 0 && n7 < l1.b(this.a).getHeight()) {
                return true;
            }
        }
        return false;
    }
}
