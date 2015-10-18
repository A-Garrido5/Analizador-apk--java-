// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.whatsapp.util.cq;

class a2q implements eu
{
    final ah6 a;
    
    a2q(final ah6 a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final int n) {
        ah6.c(this.a).dismiss();
        int selectionStart = ah6.e(this.a).getSelectionStart();
        int selectionEnd = ah6.e(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(ah6.e(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        final int codePointCount = text.codePointCount(0, text.length());
        if (ah6.f(this.a) <= 0 || codePointCount <= ah6.f(this.a)) {
            ah6.e(this.a).setText((CharSequence)text);
            final int a = cq.a(n);
            if (selectionEnd <= ah6.e(this.a).length() - a) {
                ah6.e(this.a).setSelection(a + selectionEnd);
            }
        }
    }
}
