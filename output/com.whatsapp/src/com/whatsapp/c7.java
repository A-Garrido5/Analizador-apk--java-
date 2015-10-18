// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.widget.TextView;
import android.view.MotionEvent;
import android.view.View;
import android.view.View$OnTouchListener;

class c7 implements View$OnTouchListener
{
    final RegisterName a;
    
    c7(final RegisterName a) {
        this.a = a;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        Label_0052: {
            switch (motionEvent.getAction()) {
                case 0: {
                    ((TextView)view).setTextColor(-1);
                    if (App.I) {
                        break Label_0052;
                    }
                    break;
                }
                case 1:
                case 3: {
                    ((TextView)view).setTextColor(-7031883);
                    break;
                }
            }
        }
        return false;
    }
}
