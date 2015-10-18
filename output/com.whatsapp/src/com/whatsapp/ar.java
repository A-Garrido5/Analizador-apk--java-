// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import android.content.Context;
import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class ar implements View$OnClickListener
{
    private static final String z;
    final ProfilePhotoReminder a;
    
    static {
        final char[] charArray = "\u0013'!k\u001a\u0015'4l\b\f'il\u0006L23q\u0001\u000f#+g".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'i';
                    break;
                }
                case 0: {
                    c2 = 'a';
                    break;
                }
                case 1: {
                    c2 = 'B';
                    break;
                }
                case 2: {
                    c2 = 'F';
                    break;
                }
                case 3: {
                    c2 = '\u0002';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ar(final ProfilePhotoReminder a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        final String trim = ProfilePhotoReminder.c(this.a).getText().toString().trim();
        Label_0071: {
            if (trim.length() == 0) {
                Log.w(ar.z);
                App.a((Context)this.a, 2131231539, 0);
                if (!App.I) {
                    break Label_0071;
                }
            }
            if (!trim.equals(App.q((Context)this.a))) {
                App.aq.m(trim);
                App.b(trim);
            }
        }
        this.a.finish();
    }
}
