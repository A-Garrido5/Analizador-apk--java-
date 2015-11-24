// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.cq;
import android.view.KeyEvent;

class td implements eu
{
    final Conversation a;
    
    td(final Conversation a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        Conversation.m(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }
    
    @Override
    public void a(final int n) {
        int selectionStart = Conversation.m(this.a).getSelectionStart();
        int selectionEnd = Conversation.m(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(Conversation.m(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        Conversation.m(this.a).setText((CharSequence)text);
        Conversation.m(this.a).setSelection(selectionEnd + cq.a(n));
    }
}
