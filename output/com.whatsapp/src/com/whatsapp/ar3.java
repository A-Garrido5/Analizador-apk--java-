// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.whatsapp.util.cq;

class ar3 implements eu
{
    final RegisterName a;
    
    ar3(final RegisterName a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final int n) {
        RegisterName.e(this.a).dismiss();
        int selectionStart = RegisterName.g(this.a).getSelectionStart();
        int selectionEnd = RegisterName.g(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(RegisterName.g(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        if (text.length() <= 25) {
            RegisterName.g(this.a).setText((CharSequence)text);
            if (selectionEnd <= RegisterName.g(this.a).length() - cq.a(n)) {
                RegisterName.g(this.a).setSelection(selectionEnd + cq.a(n));
            }
        }
    }
}
