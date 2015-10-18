// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.whatsapp.util.cq;
import android.view.KeyEvent;
import android.net.Uri;
import android.widget.EditText;
import com.whatsapp.eu;

class at implements eu
{
    private static final String z;
    final ImagePreview a;
    
    static {
        final char[] charArray = "'\\3\u0002".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ',';
                    break;
                }
                case 0: {
                    c2 = 'B';
                    break;
                }
                case 1: {
                    c2 = '8';
                    break;
                }
                case 2: {
                    c2 = 'Z';
                    break;
                }
                case 3: {
                    c2 = 'v';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    at(final ImagePreview a) {
        this.a = a;
    }
    
    private EditText a() {
        if (ImagePreview.t(this.a) >= 0) {
            return (EditText)ImagePreview.b(this.a).findViewWithTag((Object)(ImagePreview.q(this.a).get(ImagePreview.t(this.a)).toString() + at.z));
        }
        return null;
    }
    
    @Override
    public void a() {
        final EditText a = this.a();
        if (a != null) {
            a.dispatchKeyEvent(new KeyEvent(0, 67));
        }
    }
    
    @Override
    public void a(final int n) {
        final EditText a = this.a();
        if (a != null) {
            int selectionStart = a.getSelectionStart();
            int selectionEnd = a.getSelectionEnd();
            if (selectionStart <= selectionEnd) {
                final int n2 = selectionEnd;
                selectionEnd = selectionStart;
                selectionStart = n2;
            }
            final StringBuilder text = new StringBuilder(a.getText().toString());
            text.replace(selectionEnd, selectionStart, cq.f(n));
            if (text.codePointCount(0, text.length()) > 160) {
                return;
            }
            a.setText((CharSequence)text);
            a.setSelection(selectionEnd + cq.a(n));
        }
        ImagePreview.v(this.a).dismiss();
    }
}
