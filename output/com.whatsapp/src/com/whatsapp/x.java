// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.fieldstats.b9;
import com.whatsapp.fieldstats.br;
import android.content.Context;
import com.whatsapp.fieldstats.a5;
import com.whatsapp.fieldstats.a1;
import java.util.Vector;

class x implements Runnable
{
    private static final String z;
    final String a;
    final Vector b;
    final NewGroup c;
    final String d;
    
    static {
        final char[] charArray = "\u001a3-\\\u001d -6G\n\u000b".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'd';
                    break;
                }
                case 0: {
                    c2 = '\u007f';
                    break;
                }
                case 1: {
                    c2 = ']';
                    break;
                }
                case 2: {
                    c2 = 'Y';
                    break;
                }
                case 3: {
                    c2 = '.';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    x(final NewGroup c, final String a, final String d, final Vector b) {
        this.c = c;
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void run() {
        try {
            Thread.sleep(300L);
            App.d(new nr(this, this.a, this.d, this.b, 13));
            a5.a((Context)App.aq, a1.GROUP_CREATE_C, Integer.valueOf(1));
            final br br = new br();
            br.a = (double)this.c.getIntent().getIntExtra(x.z, 0);
            a5.a((Context)App.aq, br);
        }
        catch (InterruptedException ex) {}
    }
}
