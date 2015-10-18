// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp.gallerypicker;

import java.util.Collection;
import com.whatsapp.util.Log;
import java.util.ArrayList;

class ad implements Runnable
{
    private static final String z;
    final int a;
    final ArrayList b;
    final ae c;
    final w d;
    
    static {
        final char[] charArray = "p{\u0007p1z\u007f\u000fu5ogLk5mq\u0011mp{w\u0011j$=|\u0016z;xjKjy={\u0002k<d>".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'P';
                    break;
                }
                case 0: {
                    c2 = '\u001d';
                    break;
                }
                case 1: {
                    c2 = '\u001e';
                    break;
                }
                case 2: {
                    c2 = 'c';
                    break;
                }
                case 3: {
                    c2 = '\u0019';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    ad(final w d, final int a, final ArrayList b, final ae c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public void run() {
        if (!this.d.isCancelled()) {
            this.d.c.B = this.a;
            if (this.d.d == 0) {
                Log.i(ad.z + this.b.size() + " " + this.c.b);
                MediaGalleryBase.a(this.d.c).addAll(this.b);
                MediaGalleryBase.a(this.d.c).add(this.c);
                this.d.c.s.notifyDataSetChanged();
            }
        }
        if (!this.d.a) {
            this.d.c.setSupportProgressBarIndeterminateVisibility(false);
        }
    }
}
