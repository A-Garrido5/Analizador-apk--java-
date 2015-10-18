// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.observablescrollview;

import android.view.MotionEvent;
import android.view.ViewGroup;

class c implements Runnable
{
    final ObservableListView a;
    final ViewGroup b;
    final MotionEvent c;
    
    c(final ObservableListView a, final ViewGroup b, final MotionEvent c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        this.b.dispatchTouchEvent(this.c);
    }
}
