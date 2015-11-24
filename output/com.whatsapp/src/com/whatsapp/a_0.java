// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.whatsapp.util.cq;
import android.view.KeyEvent;

class a_0 implements eu
{
    final VideoPreviewActivity a;
    
    a_0(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        VideoPreviewActivity.f(this.a).dispatchKeyEvent(new KeyEvent(0, 67));
    }
    
    @Override
    public void a(final int n) {
        int selectionStart = VideoPreviewActivity.f(this.a).getSelectionStart();
        int selectionEnd = VideoPreviewActivity.f(this.a).getSelectionEnd();
        if (selectionStart <= selectionEnd) {
            final int n2 = selectionEnd;
            selectionEnd = selectionStart;
            selectionStart = n2;
        }
        final StringBuilder text = new StringBuilder(VideoPreviewActivity.f(this.a).getText().toString());
        text.replace(selectionEnd, selectionStart, cq.f(n));
        if (text.codePointCount(0, text.length()) > 160) {
            return;
        }
        VideoPreviewActivity.f(this.a).setText((CharSequence)text);
        VideoPreviewActivity.f(this.a).setSelection(selectionEnd + cq.a(n));
        VideoPreviewActivity.e(this.a).dismiss();
    }
}
