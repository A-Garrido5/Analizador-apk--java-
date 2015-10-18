// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import com.whatsapp.util.Log;
import android.os.Handler;
import android.database.ContentObserver;

class ar extends ContentObserver
{
    private static final String z;
    final MediaGalleryBase a;
    
    static {
        final char[] charArray = "\u0013\u0015Bmn\u0019\u0011Jhj\f\t\tka\u001d\u0018Gjh\u001bP".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u000f';
                    break;
                }
                case 0: {
                    c2 = '~';
                    break;
                }
                case 1: {
                    c2 = 'p';
                    break;
                }
                case 2: {
                    c2 = '&';
                    break;
                }
                case 3: {
                    c2 = '\u0004';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ar(final MediaGalleryBase a, final Handler handler) {
        this.a = a;
        super(handler);
    }
    
    public boolean deliverSelfNotifications() {
        return true;
    }
    
    public void onChange(final boolean b) {
        Log.i(ar.z + b);
        if (this.a.o != null) {
            if (!b) {
                this.a.o.c();
            }
            this.a.B = this.a.o.e();
        }
        this.a.s.notifyDataSetChanged();
    }
}
