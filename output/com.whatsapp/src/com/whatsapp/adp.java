// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

class adp implements TextView$OnEditorActionListener
{
    final fa a;
    
    adp(final fa a) {
        this.a = a;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (n == 3 || (keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0)) {
            Conversation.b(this.a.a, true);
            return true;
        }
        return false;
    }
}
