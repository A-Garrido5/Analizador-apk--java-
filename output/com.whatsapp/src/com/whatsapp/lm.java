// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnPreparedListener;

class lm implements MediaPlayer$OnPreparedListener
{
    private static final String z;
    final RecordAudio a;
    
    static {
        final char[] charArray = "v5;\u0005u`1-\u000enk\u007f(\u0006f}5*\u001aua 9\u0018b`".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0007';
                    break;
                }
                case 0: {
                    c2 = '\u0004';
                    break;
                }
                case 1: {
                    c2 = 'P';
                    break;
                }
                case 2: {
                    c2 = 'X';
                    break;
                }
                case 3: {
                    c2 = 'j';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    lm(final RecordAudio a) {
        this.a = a;
    }
    
    public void onPrepared(final MediaPlayer mediaPlayer) {
        Log.i(lm.z);
    }
}
