// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.whatsapp.util.cq;

class b_ implements eu
{
    final NewGroup a;
    
    b_(final NewGroup a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final int n) {
        NewGroup.c(this.a).dismiss();
        int selectionStart = NewGroup.b(this.a).getSelectionStart();
        int selectionEnd = NewGroup.b(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(NewGroup.b(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        if (text.codePointCount(0, text.length()) <= ym.m) {
            NewGroup.b(this.a).setText((CharSequence)text);
            if (selectionEnd <= NewGroup.b(this.a).length() - cq.a(n)) {
                NewGroup.b(this.a).setSelection(selectionEnd + cq.a(n));
            }
        }
    }
}
