// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.ViewGroup;
import com.whatsapp.util.b_;
import com.whatsapp.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.app.Activity;
import android.view.View$OnTouchListener;

class c0 implements View$OnTouchListener
{
    private static final String z;
    final gw a;
    final Activity b;
    final FrameLayout c;
    
    static {
        final char[] charArray = "X\"o~tQ&tobI!rqsV!4keL8x~cP9ujcP:h".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0017';
                    break;
                }
                case 0: {
                    c2 = '9';
                    break;
                }
                case 1: {
                    c2 = 'V';
                    break;
                }
                case 2: {
                    c2 = '\u001b';
                    break;
                }
                case 3: {
                    c2 = '\u001f';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    c0(final gw a, final FrameLayout c, final Activity b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public boolean onTouch(final View view, final MotionEvent motionEvent) {
        if (motionEvent.getAction() == 4) {
            this.a.dismiss();
            return true;
        }
        if (App.aS == 3) {
            Log.i(c0.z);
            b_.a((ViewGroup)this.c, this.b, true);
        }
        return false;
    }
}
