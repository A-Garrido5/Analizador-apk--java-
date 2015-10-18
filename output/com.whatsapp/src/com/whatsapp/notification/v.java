// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.notification;

import com.whatsapp.util.cq;
import com.whatsapp.eu;

class v implements eu
{
    final PopupNotification a;
    
    v(final PopupNotification a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final int n) {
        PopupNotification.o(this.a).dismiss();
        int selectionStart = PopupNotification.i(this.a).getSelectionStart();
        int selectionEnd = PopupNotification.i(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(PopupNotification.i(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        PopupNotification.i(this.a).setText((CharSequence)text);
        if (selectionEnd <= PopupNotification.i(this.a).length() - cq.a(n)) {
            PopupNotification.i(this.a).setSelection(selectionEnd + cq.a(n));
        }
    }
}
