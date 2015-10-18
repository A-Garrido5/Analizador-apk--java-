// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

class xd implements TextView$OnEditorActionListener
{
    private static final String z;
    final VideoPreviewActivity a;
    
    static {
        final char[] charArray = ":m_\f\u0002\fnJ\r\u001e<g".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'v';
                    break;
                }
                case 0: {
                    c2 = 'S';
                    break;
                }
                case 1: {
                    c2 = '\u0003';
                    break;
                }
                case 2: {
                    c2 = '/';
                    break;
                }
                case 3: {
                    c2 = 'y';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    xd(final VideoPreviewActivity a) {
        this.a = a;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            ((InputMethodManager)this.a.getSystemService(xd.z)).hideSoftInputFromWindow(VideoPreviewActivity.f(this.a).getWindowToken(), 0);
            return true;
        }
        return false;
    }
}
