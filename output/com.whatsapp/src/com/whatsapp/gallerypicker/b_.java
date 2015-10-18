// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.Collection;
import com.whatsapp.util.Log;
import java.util.ArrayList;

class b_ implements Runnable
{
    private static final String z;
    final int a;
    final ArrayList b;
    final w c;
    
    static {
        final char[] charArray = "\u001b(mtZ\u0011,eq^\u00044&o^\u0006\"{i\u001b\u00148jv^\u0002m".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = ';';
                    break;
                }
                case 0: {
                    c2 = 'v';
                    break;
                }
                case 1: {
                    c2 = 'M';
                    break;
                }
                case 2: {
                    c2 = '\t';
                    break;
                }
                case 3: {
                    c2 = '\u001d';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    b_(final w c, final int a, final ArrayList b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public void run() {
        if (!this.c.isCancelled()) {
            this.c.c.B = this.a;
            Log.i(b_.z + this.c.d + " " + this.b.size());
            if (this.c.d == 0) {
                MediaGalleryBase.a(this.c.c).clear();
            }
            final w c = this.c;
            c.d += this.b.size();
            MediaGalleryBase.a(this.c.c).addAll(this.b);
            this.c.c.s.notifyDataSetChanged();
        }
        if (!this.c.a) {
            this.c.c.setSupportProgressBarIndeterminateVisibility(false);
        }
    }
}
