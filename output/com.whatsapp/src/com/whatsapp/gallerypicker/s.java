// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import android.view.inputmethod.InputMethodManager;
import android.view.KeyEvent;
import android.widget.TextView;
import com.whatsapp.ConversationTextEntry;
import android.widget.TextView$OnEditorActionListener;

class s implements TextView$OnEditorActionListener
{
    private static final String z;
    final a5 a;
    final ConversationTextEntry b;
    
    static {
        final char[] charArray = "0\u0010b~d\u0006\u0013w\u007fx6\u001a".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0010';
                    break;
                }
                case 0: {
                    c2 = 'Y';
                    break;
                }
                case 1: {
                    c2 = '~';
                    break;
                }
                case 2: {
                    c2 = '\u0012';
                    break;
                }
                case 3: {
                    c2 = '\u000b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    s(final a5 a, final ConversationTextEntry b) {
        this.a = a;
        this.b = b;
    }
    
    public boolean onEditorAction(final TextView textView, final int n, final KeyEvent keyEvent) {
        if (keyEvent != null && keyEvent.getKeyCode() == 66) {
            ((InputMethodManager)this.a.a.getSystemService(s.z)).hideSoftInputFromWindow(this.b.getWindowToken(), 0);
            return true;
        }
        return false;
    }
}
