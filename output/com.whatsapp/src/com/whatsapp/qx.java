// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.media.AudioManager$OnAudioFocusChangeListener;

final class qx implements AudioManager$OnAudioFocusChangeListener
{
    private static final String z;
    
    static {
        final char[] charArray = "!aq\u001d\u00176{|\u0004Xwhw\u000eB$.{\u0005V9i}\t\rw".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '7';
                    break;
                }
                case 0: {
                    c2 = 'W';
                    break;
                }
                case 1: {
                    c2 = '\u000e';
                    break;
                }
                case 2: {
                    c2 = '\u0018';
                    break;
                }
                case 3: {
                    c2 = 'm';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    public void onAudioFocusChange(final int n) {
        Log.i(qx.z + n);
    }
}
