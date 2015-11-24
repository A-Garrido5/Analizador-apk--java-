// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.widget.PopupWindow$OnDismissListener;

class u7 implements PopupWindow$OnDismissListener
{
    private static final String z;
    final n7 a;
    
    static {
        final char[] charArray = "\u001da_nv+bJoj\u001bk".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0002';
                    break;
                }
                case 0: {
                    c2 = 't';
                    break;
                }
                case 1: {
                    c2 = '\u000f';
                    break;
                }
                case 2: {
                    c2 = '/';
                    break;
                }
                case 3: {
                    c2 = '\u001b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    u7(final n7 a) {
        this.a = a;
    }
    
    public void onDismiss() {
        ((InputMethodManager)n7.a(this.a).getSystemService(u7.z)).toggleSoftInput(1, 0);
    }
}
