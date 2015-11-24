// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.List;
import com.whatsapp.protocol.ay;
import java.util.Map;
import java.util.Vector;
import java.util.ArrayList;
import com.whatsapp.protocol.cq;

class a8z implements Runnable
{
    private static final String z;
    final int a;
    final cq b;
    final String c;
    final p9 d;
    final String e;
    
    static {
        final char[] charArray = "YV=".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c = charArray[n];
            char c2 = '\0';
            switch (n % 5) {
                default: {
                    c2 = 'O';
                    break;
                }
                case 0: {
                    c2 = '.';
                    break;
                }
                case 1: {
                    c2 = '3';
                    break;
                }
                case 2: {
                    c2 = '_';
                    break;
                }
                case 3: {
                    c2 = '\u000e';
                    break;
                }
            }
            charArray[n] = (char)(c2 ^ c);
        }
        z = new String(charArray).intern();
    }
    
    a8z(final p9 d, final cq b, final String e, final int a, final String c) {
        this.d = d;
        this.b = b;
        this.e = e;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final ArrayList<Object> list = new ArrayList<Object>();
    Label_0273:
        for (final cq cq : this.b.c) {
            final Map e = App.ak.e(cq.d, cq.g);
            final Vector c = new Vector<Object>(e.size());
            final Iterator<Map.Entry<String, V>> iterator2 = e.entrySet().iterator();
            long n = 0L;
            while (true) {
                while (iterator2.hasNext()) {
                    final Map.Entry<String, V> entry = iterator2.next();
                    final String s = entry.getKey();
                    final wg wg = (wg)entry.getValue();
                    long n2;
                    Object o;
                    if (wg.b > cq.f) {
                        final ay ay = new ay(s, 4);
                        n2 = wg.b;
                        o = ay;
                    }
                    else if (wg.c > cq.f) {
                        final ay ay2 = new ay(s, 3);
                        n2 = wg.c;
                        o = ay2;
                    }
                    else if (wg.a > cq.f) {
                        final ay ay3 = new ay(s, 2);
                        n2 = wg.a;
                        o = ay3;
                    }
                    else if (wg.d > cq.f) {
                        final ay ay4 = new ay(s, 1);
                        n2 = wg.d;
                        o = ay4;
                    }
                    else {
                        n2 = 0L;
                        o = null;
                    }
                    long f;
                    if (o != null) {
                        c.add(o);
                        if (n2 > n) {
                            n = n2;
                        }
                        f = n;
                    }
                    else {
                        f = n;
                    }
                    if (i) {
                        Object o2;
                        if (c.size() > 0) {
                            final cq cq2 = new cq();
                            cq2.d = cq.d;
                            cq2.f = f;
                            cq2.c = c;
                            o2 = cq2;
                        }
                        else {
                            o2 = null;
                        }
                        if (o2 != null) {
                            list.add(o2);
                        }
                        if (i) {
                            break Label_0273;
                        }
                        continue Label_0273;
                    }
                    else {
                        n = f;
                    }
                }
                long f = n;
                continue;
            }
        }
        App.a(this.e, list, this.a);
        App.b(this.e, this.c, a8z.z);
    }
}
