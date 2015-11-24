// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.view.inputmethod.InputMethodManager;
import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView$OnEditorActionListener;

class v implements TextView$OnEditorActionListener
{
    private static final String z;
    final CameraActivity a;
    
    static {
        final char[] charArray = "\u001fkt/G)ha.[\u0019a".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '3';
                    break;
                }
                case 0: {
                    c2 = 'v';
                    break;
                }
                case 1: {
                    c2 = '\u0005';
                    break;
                }
                case 2: {
                    c2 = '\u0004';
                    break;
                }
                case 3: {
                    c2 = 'Z';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    v(final CameraActivity a) {
        this.a = a;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            ((InputMethodManager)this.a.getSystemService(v.z)).hideSoftInputFromWindow(CameraActivity.i(this.a).getWindowToken(), 0);
            return true;
        }
        return false;
    }
}
