// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.view.inputmethod.InputMethodManager;
import android.view.View;
import android.view.View$OnClickListener;

class a61 implements View$OnClickListener
{
    private static final String z;
    final ProfilePhotoReminder a;
    
    static {
        final char[] charArray = "9\u0018['\u001b\u000f\u001bN&\u0007?\u0012".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'o';
                    break;
                }
                case 0: {
                    c2 = 'P';
                    break;
                }
                case 1: {
                    c2 = 'v';
                    break;
                }
                case 2: {
                    c2 = '+';
                    break;
                }
                case 3: {
                    c2 = 'R';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a61(final ProfilePhotoReminder a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        ((InputMethodManager)this.a.getSystemService(a61.z)).hideSoftInputFromWindow(ProfilePhotoReminder.c(this.a).getWindowToken(), 0);
        ProfilePhotoReminder.e(this.a).a(this.a.findViewById(2131755548));
    }
}
