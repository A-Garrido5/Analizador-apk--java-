// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import com.whatsapp.util.Log;
import android.content.Context;
import com.whatsapp.App;

class b implements j
{
    private static final String z;
    final QrCodeActivity a;
    
    static {
        final char[] charArray = "\u0005nNS\u001d\u001djFD\u0010[l]U\u001f\u001dyXB\f\u0015xV".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'i';
                    break;
                }
                case 0: {
                    c2 = 't';
                    break;
                }
                case 1: {
                    c2 = '\u001c';
                    break;
                }
                case 2: {
                    c2 = '/';
                    break;
                }
                case 3: {
                    c2 = '0';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    b(final QrCodeActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        App.a((Context)this.a, 2131230880, 1);
        this.a.finish();
    }
    
    @Override
    public void b() {
        Log.i(b.z);
        QrCodeActivity.b(this.a, true);
        if (!QrCodeActivity.b(this.a)) {
            QrCodeActivity.e(this.a).c().setOneShotPreviewCallback(QrCodeActivity.g(this.a));
        }
    }
}
