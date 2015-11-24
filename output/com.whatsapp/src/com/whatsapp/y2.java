// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class y2 implements View$OnTouchListener
{
    final AccountInfoActivity a;
    
    y2(final AccountInfoActivity a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        Label_0053: {
            switch (motionEvent.getAction()) {
                case 0: {
                    ((TextView)view).setTextColor(-65281);
                    if (App.I) {
                        break Label_0053;
                    }
                    break;
                }
                case 1:
                case 3: {
                    ((TextView)view).setTextColor(-13388315);
                    break;
                }
            }
        }
        return false;
    }
}
