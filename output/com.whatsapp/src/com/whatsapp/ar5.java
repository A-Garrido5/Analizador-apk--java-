// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;

class ar5 implements MediaPlayer$OnErrorListener
{
    private static final String[] z;
    final MediaView a;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u000fRY}\u0005]\u0013\u0006";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0087:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'q';
                        break;
                    }
                    case 0: {
                        c2 = '/';
                        break;
                    }
                    case 1: {
                        c2 = 'r';
                        break;
                    }
                    case 2: {
                        c2 = '<';
                        break;
                    }
                    case 3: {
                        c2 = '\u0005';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    n2 = 1;
                    array = z2;
                    s = "B\u0017Xl\u0010Y\u001bYr^J\u0000Nj\u0003\u0015RKm\u0010[H";
                    n = 0;
                    continue;
                }
                case 0: {
                    break Label_0087;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    ar5(final MediaView a) {
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        Log.e(ar5.z[1] + n + ar5.z[0] + n2);
        return false;
    }
}
