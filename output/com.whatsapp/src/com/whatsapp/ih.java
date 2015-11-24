// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.view.View;
import android.view.View$OnClickListener;

class ih implements View$OnClickListener
{
    private static final String z;
    final RecordAudio a;
    
    static {
        final char[] charArray = "L<\u0016saZ8\u0000xzQv\u0016}}]<\u0019".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0013';
                    break;
                }
                case 0: {
                    c2 = '>';
                    break;
                }
                case 1: {
                    c2 = 'Y';
                    break;
                }
                case 2: {
                    c2 = 'u';
                    break;
                }
                case 3: {
                    c2 = '\u001c';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ih(final RecordAudio a) {
        this.a = a;
    }
    
    public void onClick(final View view) {
        Log.i(ih.z);
        this.a.finish();
        if (!RecordAudio.b(this.a) && RecordAudio.f(this.a) != null && RecordAudio.f(this.a).exists()) {
            RecordAudio.f(this.a).delete();
        }
    }
}
