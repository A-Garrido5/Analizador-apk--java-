// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

class js implements TextView$OnEditorActionListener
{
    final Conversation a;
    
    js(final Conversation a) {
        this.a = a;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        final boolean i = App.I;
        if (keyEvent != null) {}
        if (n == 4) {
            Conversation.k(this.a);
        }
        else {
            if (keyEvent != null && keyEvent.getKeyCode() == 66) {
                if (this.a.an) {
                    this.a.an = false;
                    if (!i) {
                        return true;
                    }
                }
                if (Conversation.a3) {
                    Conversation.k(this.a);
                    if (!i) {
                        return this.a.an = true;
                    }
                }
                final int selectionStart = Conversation.m(this.a).getSelectionStart();
                final int selectionEnd = Conversation.m(this.a).getSelectionEnd();
                if (selectionStart != Conversation.m(this.a).length()) {
                    Conversation.m(this.a).getText().replace(Math.min(selectionStart, selectionEnd), Math.max(selectionStart, selectionEnd), (CharSequence)"\n", 0, 1);
                    if (!i) {
                        return this.a.an = true;
                    }
                }
                Conversation.m(this.a).append((CharSequence)"\n");
                return this.a.an = true;
            }
            return false;
        }
        return true;
    }
}
