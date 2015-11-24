// 
// Decompiled by Procyon v0.5.30
// 

package com.facebook.rebound.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class d implements View$OnTouchListener
{
    final SpringConfiguratorView a;
    
    private d(final SpringConfiguratorView a) {
        this.a = a;
    }
    
    d(final SpringConfiguratorView springConfiguratorView, final e e) {
        this(springConfiguratorView);
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            SpringConfiguratorView.c(this.a);
        }
        return true;
    }
}
