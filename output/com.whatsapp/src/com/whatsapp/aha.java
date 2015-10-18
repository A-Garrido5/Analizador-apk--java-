// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;

class aha implements MediaPlayer$OnErrorListener
{
    private static final String z;
    final VideoView a;
    
    static {
        final char[] charArray = "\\\"2\u000bi\\\"3\u0019)\n\u000e$\u001ciXqv".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0006';
                    break;
                }
                case 0: {
                    c2 = '*';
                    break;
                }
                case 1: {
                    c2 = 'K';
                    break;
                }
                case 2: {
                    c2 = 'V';
                    break;
                }
                case 3: {
                    c2 = 'n';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    aha(final VideoView a) {
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        Log.w(aha.z + n + "," + n2);
        VideoView.e(this.a, -1);
        VideoView.f(this.a, -1);
        if (VideoView.k(this.a) == null || VideoView.k(this.a).onError(VideoView.f(this.a), n, n2)) {}
        return true;
    }
}
