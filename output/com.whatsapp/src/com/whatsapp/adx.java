// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.List;
import com.whatsapp.protocol.bi;
import java.util.ArrayList;
import com.whatsapp.protocol.c6;
import com.whatsapp.protocol.cq;

class adx implements Runnable
{
    private static final String z;
    final p9 a;
    final String b;
    final cq c;
    final String d;
    
    static {
        final char[] charArray = "fDK".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0011';
                    break;
                }
                case 0: {
                    c2 = '\u0011';
                    break;
                }
                case 1: {
                    c2 = '!';
                    break;
                }
                case 2: {
                    c2 = ')';
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
    
    adx(final p9 a, final cq c, final String d, final String b) {
        this.a = a;
        this.c = c;
        this.d = d;
        this.b = b;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        List<bi> list = null;
        Label_0130: {
            if (this.c.g != null) {
                list = (List<bi>)App.ak.a(new c6(this.c.d, this.c.a, this.c.g), this.c.i);
                if (!i) {
                    break Label_0130;
                }
            }
            final bi c = App.ak.C(this.c.d);
            if (c != null) {
                list = (List<bi>)App.ak.a(c.a, this.c.i);
                if (list == null) {
                    break Label_0130;
                }
                list.add(c);
                if (!i) {
                    break Label_0130;
                }
            }
            list = new ArrayList<bi>();
        }
        Label_0156: {
            if (list != null) {
                App.a(this.d, list);
                if (!i) {
                    break Label_0156;
                }
            }
            App.b(this.d, 404);
        }
        App.b(this.d, this.b, adx.z);
    }
}
