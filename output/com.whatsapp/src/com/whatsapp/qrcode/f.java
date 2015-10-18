// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import java.io.IOException;
import com.whatsapp.util.Log;
import android.hardware.Camera;
import android.hardware.Camera$ErrorCallback;

class f implements Camera$ErrorCallback
{
    private static final String[] z;
    final QrCodeView a;
    
    static {
        final String[] z2 = new String[2];
        String s = "hg\u001c:wn:\u0019'ska\t2\u007f|g\u000bs";
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
                        c2 = '\u0012';
                        break;
                    }
                    case 0: {
                        c2 = '\u0019';
                        break;
                    }
                    case 1: {
                        c2 = '\u0015';
                        break;
                    }
                    case 2: {
                        c2 = 'j';
                        break;
                    }
                    case 3: {
                        c2 = 'S';
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
                    s = "hg\u001c:wn:\u0019'ska\t2\u007f|g\u000bsqxx\u000f!s9p\u0018!}k/";
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
    
    f(final QrCodeView a) {
        this.a = a;
    }
    
    public void onError(final int n, final Camera camera) {
        Log.w(f.z[1] + n);
        if (n != 100) {
            return;
        }
        QrCodeView.a(this.a);
        QrCodeView.e(this.a);
        try {
            QrCodeView.d(this.a).setPreviewDisplay(QrCodeView.b(this.a));
            this.a.b();
        }
        catch (RuntimeException ex) {}
        catch (IOException ex2) {
            goto Label_0071;
        }
    }
}
