// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class rr implements View$OnTouchListener
{
    final n7 a;
    
    rr(final n7 a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            this.a.dismiss();
            return true;
        }
        return false;
    }
}
