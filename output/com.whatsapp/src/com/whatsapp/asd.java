// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnKeyListener;

class asd implements View$OnKeyListener
{
    final Conversation a;
    
    asd(final Conversation a) {
        this.a = a;
    }
    
    public boolean onKey(final View view, final int n, final KeyEvent keyEvent) {
        if (Conversation.a3 && keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 1) {
            Conversation.k(this.a);
            return true;
        }
        return false;
    }
}
