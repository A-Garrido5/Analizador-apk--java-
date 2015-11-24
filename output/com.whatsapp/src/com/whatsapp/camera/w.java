// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.whatsapp.util.cq;
import android.view.KeyEvent;
import com.whatsapp.eu;

class w implements eu
{
    final CameraActivity a;
    
    w(final CameraActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        CameraActivity.i(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }
    
    @Override
    public void a(final int n) {
        int selectionStart = CameraActivity.i(this.a).getSelectionStart();
        int selectionEnd = CameraActivity.i(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(CameraActivity.i(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        if (text.codePointCount(0, text.length()) > 160) {
            return;
        }
        CameraActivity.i(this.a).setText((CharSequence)text);
        CameraActivity.i(this.a).setSelection(selectionEnd + cq.a(n));
        CameraActivity.k(this.a).dismiss();
    }
}
