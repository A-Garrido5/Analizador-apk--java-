// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import java.io.IOException;
import com.whatsapp.util.Log;
import android.hardware.Camera;
import android.hardware.Camera$ErrorCallback;

class c implements Camera$ErrorCallback
{
    private static final String[] z;
    final CameraView a;
    
    static {
        final String[] z2 = new String[5];
        String s = "!u0\r\u0017#b4\r\u0012mg)\t\u00176w<\u0005\u00000u}\u000b\u0004/q/\tE'f/\u0007\u0017x";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0156:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'e';
                        break;
                    }
                    case 0: {
                        c2 = 'B';
                        break;
                    }
                    case 1: {
                        c2 = '\u0014';
                        break;
                    }
                    case 2: {
                        c2 = ']';
                        break;
                    }
                    case 3: {
                        c2 = 'h';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "b}3\u0018\u0017'b4\r\u0012x";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "bf8\u000b\n0p4\u0006\u0002x";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "b`<\u0003\f,s-\u0001\u00066a/\r_";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    n2 = 4;
                    array = z2;
                    s = "!u0\r\u0017#b4\r\u0012mg)\t\u00176w<\u0005\u00000u}";
                    n = 3;
                    continue;
                }
                case 3: {
                    break Label_0156;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    c(final CameraView a) {
        this.a = a;
    }
    
    public void onError(final int n, final Camera camera) {
        Log.w(c.z[0] + n + c.z[3] + CameraView.b(this.a) + c.z[2] + CameraView.d(this.a) + c.z[1] + CameraView.c(this.a));
        if (n != 100) {
            return;
        }
        CameraView.i(this.a);
        CameraView.j(this.a);
        try {
            CameraView.g(this.a).setPreviewDisplay(CameraView.k(this.a));
            CameraView.h(this.a);
        }
        catch (RuntimeException ex) {}
        catch (IOException ex2) {
            goto Label_0125;
        }
    }
}
