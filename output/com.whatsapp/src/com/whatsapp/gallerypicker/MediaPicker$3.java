// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

class MediaPicker$3 extends BroadcastReceiver
{
    private static final String[] z;
    final MediaPicker a;
    
    static {
        final String[] z2 = new String[10];
        String s = "y\u0012\u0011kzq\u0018[p{l\u0019\u001bm;y\u001f\u0001pzvR8\\QQ=*TZM2!\\Q";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0282:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = '\u0015';
                        break;
                    }
                    case 0: {
                        c2 = '\u0018';
                        break;
                    }
                    case 1: {
                        c2 = '|';
                        break;
                    }
                    case 2: {
                        c2 = 'u';
                        break;
                    }
                    case 3: {
                        c2 = '\u0019';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "u\u0019\u0011pth\u0015\u0016rpjS\u0007|v}\u0015\u0003|x}\u0018\u001cxwj\u0013\u0014}vy\u000f\u00016T[(<V[G10]\\Y#&ZTV20KJK(4KA]8";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "y\u0012\u0011kzq\u0018[p{l\u0019\u001bm;y\u001f\u0001pzvR8\\QQ=*L[U3 WA]8";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "y\u0012\u0011kzq\u0018[p{l\u0019\u001bm;y\u001f\u0001pzvR8\\QQ=*JVY2;\\GG:<W\\K40]";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "y\u0012\u0011kzq\u0018[p{l\u0019\u001bm;y\u001f\u0001pzvR8\\QQ=*JVY2;\\GG/!XGL91";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "u\u0019\u0011pth\u0015\u0016rpjS\u0007|v}\u0015\u0003|x}\u0018\u001cxwj\u0013\u0014}vy\u000f\u00016T[(<V[G10]\\Y#8V@V(0]";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "u\u0019\u0011pth\u0015\u0016rpjS\u0007|v}\u0015\u0003|x}\u0018\u001cxwj\u0013\u0014}vy\u000f\u00016T[(<V[G10]\\Y#0SP[(";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "u\u0019\u0011pth\u0015\u0016rpjS\u0007|v}\u0015\u0003|x}\u0018\u001cxwj\u0013\u0014}vy\u000f\u00016T[(<V[G10]\\Y# WXW);MP\\";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    array[n2] = intern;
                    n2 = 8;
                    s = "u\u0019\u0011pth\u0015\u0016rpjS\u0007|v}\u0015\u0003|x}\u0018\u001cxwj\u0013\u0014}vy\u000f\u00016T[(<V[G10]\\Y#&ZTV20KJ^5;PFP91";
                    n = 7;
                    array = z2;
                    continue;
                }
                case 7: {
                    array[n2] = intern;
                    n2 = 9;
                    s = "y\u0012\u0011kzq\u0018[p{l\u0019\u001bm;y\u001f\u0001pzvR8\\QQ=*\\_]?!";
                    n = 8;
                    array = z2;
                    continue;
                }
                case 8: {
                    break Label_0282;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    MediaPicker$3(final MediaPicker a) {
        this.a = a;
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final int v = MediaGalleryBase.v;
        final String action = intent.getAction();
        if (action.equals(MediaPicker$3.z[0])) {
            Log.i(MediaPicker$3.z[5]);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(MediaPicker$3.z[2])) {
            Log.i(MediaPicker$3.z[7]);
            this.a.a(true, false);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(MediaPicker$3.z[4])) {
            Log.i(MediaPicker$3.z[1]);
            this.a.a(false, true);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(MediaPicker$3.z[3])) {
            Log.i(MediaPicker$3.z[8]);
            this.a.a(false, false);
            if (v == 0) {
                return;
            }
        }
        if (action.equals(MediaPicker$3.z[9])) {
            Log.i(MediaPicker$3.z[6]);
            this.a.a(true, false);
        }
    }
}
