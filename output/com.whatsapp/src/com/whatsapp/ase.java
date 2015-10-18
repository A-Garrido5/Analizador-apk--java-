// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.MotionEvent;
import android.view.View;
import android.os.Handler;
import android.view.View$OnTouchListener;

class ase implements View$OnTouchListener
{
    final bi a;
    final Handler b;
    
    ase(final bi a, final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0: {
                if (bi.a(this.a) != null) {
                    bi.a(this.a).a();
                    this.b.sendEmptyMessageDelayed(0, (long)bi.d());
                    return false;
                }
                break;
            }
            case 1: {
                this.b.removeMessages(0);
                return false;
            }
            case 3: {
                this.b.removeMessages(0);
                return false;
            }
        }
        return false;
    }
}
