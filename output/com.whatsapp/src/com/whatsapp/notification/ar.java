// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

class ar implements TextView$OnEditorActionListener
{
    final PopupNotification a;
    
    ar(final PopupNotification a) {
        this.a = a;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (n == 4) {
            PopupNotification.k(this.a);
            return true;
        }
        return false;
    }
}
