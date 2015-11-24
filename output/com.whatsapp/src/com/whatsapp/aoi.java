// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class aoi implements View$OnClickListener
{
    private static final String z;
    final ConversationRowAudio a;
    
    static {
        final char[] charArray = "Ri*3jE( 2r_d+<a\u0011e!9lP()8vBi#8%Fa05%_gd0`Ua%}dE|%>mTl".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0005';
                    break;
                }
                case 0: {
                    c2 = '1';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = 'D';
                    break;
                }
                case 3: {
                    c2 = ']';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aoi(final ConversationRowAudio a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        if (this.a.t.d != null) {
            App.a((DialogToastActivity)this.a.getContext(), this.a.t);
            if (!App.I) {
                return;
            }
        }
        Log.e(aoi.z);
        App.a(this.a.getContext(), 2131231256, 0);
    }
}
