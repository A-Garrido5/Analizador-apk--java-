// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.qrcode;

import com.whatsapp.App;
import android.os.Vibrator;
import com.whatsapp.l7;
import com.whatsapp.og;

class l implements og
{
    private static final String z;
    final QrCodeActivity a;
    
    static {
        final char[] charArray = ";\u001e\u0019\u007fZ9\u0018\t".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ';';
                    break;
                }
                case 0: {
                    c2 = 'M';
                    break;
                }
                case 1: {
                    c2 = 'w';
                    break;
                }
                case 2: {
                    c2 = '{';
                    break;
                }
                case 3: {
                    c2 = '\r';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    l(final QrCodeActivity a) {
        this.a = a;
    }
    
    @Override
    public void a() {
        if (l7.c(QrCodeActivity.f(this.a))) {
            ((Vibrator)this.a.getSystemService(l.z)).vibrate(75L);
            this.a.finish();
        }
    }
    
    @Override
    public void a(final int n) {
        if (n == 403) {
            QrCodeActivity.d(this.a);
            if (QrCodeActivity.r == 0) {
                return;
            }
        }
        App.a(this.a.getBaseContext(), 2131231258, 1);
        this.a.finish();
    }
}
