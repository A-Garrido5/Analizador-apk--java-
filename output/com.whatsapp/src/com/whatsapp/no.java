// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.whatsapp.util.cq;

class no implements eu
{
    final ProfilePhotoReminder a;
    
    no(final ProfilePhotoReminder a) {
        this.a = a;
    }
    
    @Override
    public void a() {
    }
    
    @Override
    public void a(final int n) {
        ProfilePhotoReminder.e(this.a).dismiss();
        int selectionStart = ProfilePhotoReminder.c(this.a).getSelectionStart();
        int selectionEnd = ProfilePhotoReminder.c(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(ProfilePhotoReminder.c(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        if (text.length() <= 25) {
            ProfilePhotoReminder.c(this.a).setText((CharSequence)text);
            if (selectionEnd <= ProfilePhotoReminder.c(this.a).length() - cq.a(n)) {
                ProfilePhotoReminder.c(this.a).setSelection(selectionEnd + cq.a(n));
            }
        }
    }
}
