// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.camera;

import android.os.Build$VERSION;
import com.whatsapp.util.Log;
import android.hardware.Camera;
import android.hardware.Camera$PictureCallback;

class b implements Camera$PictureCallback
{
    private static final String[] z;
    final CameraView a;
    final y b;
    
    static {
        final String[] z2 = new String[2];
        String s = "\u007fA9I8}V=I=3T5G/lI7X?nEtI8nO&\f9hO$\\#rGtO+qE&MjlR1Z#yW";
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
                        c2 = 'J';
                        break;
                    }
                    case 0: {
                        c2 = '\u001c';
                        break;
                    }
                    case 1: {
                        c2 = ' ';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = ',';
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
                    s = "\u007fA9I8}V=I=3T5G/lI7X?nEtX+wE:\f";
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
    
    b(final CameraView a, final y b) {
        this.a = a;
        this.b = b;
    }
    
    public void onPictureTaken(final byte[] array, final Camera camera) {
        Log.i(com.whatsapp.camera.b.z[1] + CameraView.f(this.a));
        while (true) {
            if (Build$VERSION.SDK_INT < 11) {
                break Label_0049;
            }
            try {
                CameraView.g(this.a).stopPreview();
                CameraView.a(this.a, false);
                this.b.a(array, CameraView.f(this.a));
            }
            catch (Exception ex) {
                Log.c(com.whatsapp.camera.b.z[0], ex);
                continue;
            }
            break;
        }
    }
}
