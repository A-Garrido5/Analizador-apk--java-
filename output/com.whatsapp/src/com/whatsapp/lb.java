// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.util.Log;
import android.media.MediaPlayer;
import android.media.MediaPlayer$OnErrorListener;

class lb implements MediaPlayer$OnErrorListener
{
    private static final String[] z;
    final RecordAudio a;
    
    static {
        final String[] z2 = new String[2];
        String s = "w#ZP\u0004a'L[\u001fji\\M\u0004j4\u0019H\u001ed2\u0003";
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
                        c2 = 'v';
                        break;
                    }
                    case 0: {
                        c2 = '\u0005';
                        break;
                    }
                    case 1: {
                        c2 = 'F';
                        break;
                    }
                    case 2: {
                        c2 = '9';
                        break;
                    }
                    case 3: {
                        c2 = '?';
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
                    s = "%f\\G\u0002w'\u0003";
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
    
    lb(final RecordAudio a) {
        this.a = a;
    }
    
    public boolean onError(final MediaPlayer mediaPlayer, final int n, final int n2) {
        Log.e(lb.z[0] + n + lb.z[1] + n2);
        return false;
    }
}
