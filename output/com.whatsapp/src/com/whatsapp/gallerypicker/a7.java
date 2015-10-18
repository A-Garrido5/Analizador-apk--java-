// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.Collection;
import com.whatsapp.util.Log;
import java.util.ArrayList;

class a7 implements Runnable
{
    private static final String z;
    final w a;
    final ArrayList b;
    final int c;
    
    static {
        final char[] charArray = "Pm'<\u001bZi/9\u001fOql'\u001fMg1!ZQi0!Z_} >\u001fI(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'z';
                    break;
                }
                case 0: {
                    c2 = '=';
                    break;
                }
                case 1: {
                    c2 = '\b';
                    break;
                }
                case 2: {
                    c2 = 'C';
                    break;
                }
                case 3: {
                    c2 = 'U';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a7(final w a, final ArrayList b, final int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        if (!this.a.isCancelled() && !this.b.isEmpty()) {
            Log.i(a7.z + this.a.d + " " + this.b.size());
            this.a.c.B = this.c;
            if (this.a.d == 0) {
                MediaGalleryBase.a(this.a.c).clear();
            }
            MediaGalleryBase.a(this.a.c).addAll(this.b);
            this.a.c.s.notifyDataSetChanged();
        }
        if (!this.a.a) {
            this.a.c.setSupportProgressBarIndeterminateVisibility(false);
        }
    }
}
