// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import com.whatsapp.protocol.cq;

class dy implements Runnable
{
    private static final String z;
    final String a;
    final p9 b;
    final String c;
    final int d;
    final cq e;
    
    static {
        final char[] charArray = "j\u001b(".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = '\u0019';
                    break;
                }
                case 0: {
                    c2 = '\u001d';
                    break;
                }
                case 1: {
                    c2 = '~';
                    break;
                }
                case 2: {
                    c2 = 'J';
                    break;
                }
                case 3: {
                    c2 = '\b';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    dy(final p9 b, final int d, final cq e, final String c, final String a) {
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        int d = this.d;
        int n = 0;
        List<cq> list = null;
        Label_0145: {
            if (l7.i) {
                d = 15;
                if (!i) {
                    n = d;
                    list = null;
                    break Label_0145;
                }
            }
            n = d;
            final ArrayList<cq> list2 = new ArrayList<cq>(this.e.c.size());
            for (final String r : this.e.c) {
                if (l7.o.containsKey(r)) {
                    final cq cq = new cq();
                    cq.r = r;
                    cq.h = l7.o.get(r);
                    list2.add(cq);
                }
                if (i) {
                    break;
                }
            }
            list = list2;
        }
        App.a(this.c, list, n);
        App.b(this.c, this.a, dy.z);
    }
}
