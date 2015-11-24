// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import com.whatsapp.protocol.bi;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.c6;
import java.util.HashMap;

public class gj
{
    private static final HashMap c;
    private static final String z;
    public c6 a;
    public String[] b;
    public String d;
    
    static {
        final char[] charArray = "\u0015\u0004I\"G\u0002\u0002M/E\u0013\tI(Q\u000b\u0004ZiV\u000b\u0004I4\u0015".toCharArray();
        for (int i = charArray.length, n = 0; i > n; ++n) {
            final char c2 = charArray[n];
            char c3 = '\0';
            switch (n % 5) {
                default: {
                    c3 = '5';
                    break;
                }
                case 0: {
                    c3 = 'g';
                    break;
                }
                case 1: {
                    c3 = 'a';
                    break;
                }
                case 2: {
                    c3 = '(';
                    break;
                }
                case 3: {
                    c3 = 'F';
                    break;
                }
            }
            charArray[n] = (char)(c3 ^ c2);
        }
        z = new String(charArray).intern();
        c = new HashMap();
    }
    
    public static void a() {
        synchronized (gj.c) {
            Log.i(gj.z + gj.c.size());
            gj.c.clear();
        }
    }
    
    public static void a(final bi bi) {
        final ArrayList<asb> list = new ArrayList<asb>();
        list.add(new asb(bi, App.ak.f(bi)));
        a(list);
    }
    
    public static void a(final c6 c6) {
        synchronized (gj.c) {
            final l3 l3 = gj.c.get(c6.a);
            if (l3 != null) {
                l3.b.remove(c6.c);
                if (l3.b.isEmpty()) {
                    App.ak.a(c6.a, l3.a);
                    gj.c.remove(c6.a);
                }
            }
        }
    }
    
    public static void a(final Collection collection) {
        final boolean i = App.I;
        final HashMap<ah7, ArrayList<asb>> hashMap = new HashMap<ah7, ArrayList<asb>>();
        for (final asb asb : collection) {
            final bi b = asb.b;
            final ah7 ah7 = new ah7(b.a.a, b.t);
            ArrayList<asb> list = hashMap.get(ah7);
            if (list == null) {
                list = new ArrayList<asb>();
                hashMap.put(ah7, list);
            }
            list.add((Object)asb);
            if (i) {
                break;
            }
        }
        while (true) {
            final ArrayList list2 = new ArrayList<gj>(hashMap.size());
            while (true) {
                int n3 = 0;
                Label_0463: {
                    synchronized (gj.c) {
                        for (final ArrayList<asb> list3 : hashMap.values()) {
                            final gj gj = new gj();
                            final bi b2 = list3.get(0).b;
                            gj.a = b2.a;
                            gj.d = b2.t;
                            long n = list3.get(0).a;
                            if (list3.size() > 1) {
                                gj.b = new String[-1 + list3.size()];
                                final int n2 = 1;
                                if (n2 < list3.size()) {
                                    gj.b[n2 - 1] = list3.get(n2).b.a.c;
                                    n = Math.max(n, list3.get(n2).a);
                                    n3 = n2 + 1;
                                    if (!i) {
                                        break Label_0463;
                                    }
                                }
                            }
                            l3 l3 = com.whatsapp.gj.c.get(b2.a.a);
                            if (l3 == null) {
                                l3 = new l3();
                                com.whatsapp.gj.c.put(b2.a.a, l3);
                            }
                            l3.b.put(b2.a.c, gj);
                            l3.a = Math.max(l3.a, n);
                            list2.add(gj);
                            if (i) {
                                break;
                            }
                        }
                        // monitorexit(gj.c)
                        final Iterator<gj> iterator3 = list2.iterator();
                        while (iterator3.hasNext()) {
                            App.a(iterator3.next());
                            if (i) {
                                break;
                            }
                        }
                        return;
                    }
                }
                final int n2 = n3;
                continue;
            }
        }
    }
}
