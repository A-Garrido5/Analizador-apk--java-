// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class um implements View$OnTouchListener
{
    final QuickContactActivity a;
    
    um(final QuickContactActivity a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        QuickContactActivity.a(this.a);
        return true;
    }
}
