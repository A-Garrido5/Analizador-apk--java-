// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import com.whatsapp.protocol.bi;
import java.util.Iterator;
import android.os.ConditionVariable;
import java.util.List;
import android.content.Context;
import com.whatsapp.notification.y;
import com.whatsapp.protocol.c6;
import com.whatsapp.util.Log;
import com.whatsapp.protocol.be;
import java.util.Collection;
import java.util.HashSet;
import android.util.Pair;
import java.util.ArrayList;
import com.whatsapp.protocol.cq;

class za implements Runnable
{
    private static final String[] z;
    final int a;
    final cq b;
    final p9 c;
    final String d;
    final String e;
    
    static {
        final String[] z2 = new String[8];
        String s = "\u0000P\u0016(\"\u0014P0v%\u0014Q<42^F,52\u0005Gf";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0232:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'W';
                        break;
                    }
                    case 0: {
                        c2 = 'q';
                        break;
                    }
                    case 1: {
                        c2 = '\"';
                        break;
                    }
                    case 2: {
                        c2 = 'I';
                        break;
                    }
                    case 3: {
                        c2 = 'Y';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "QA&,9\u0005\u0018";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "\u0000P\u0016(\"\u0014P0v%\u0014Q<42^A&7!\u0014P:8#\u0018M'*x";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "\u0000P\u0016(\"\u0014P0v%\u0014Q<42^C!<6\u0015\r";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "QA&,9\u0005\u0018";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "\u0006G+";
                    n = 4;
                    continue;
                }
                case 4: {
                    array[n2] = intern;
                    n2 = 6;
                    s = "\u0000P\u0016(\"\u0014P0v%\u0014Q<42^A%<6\u0003\r";
                    n = 5;
                    array = z2;
                    continue;
                }
                case 5: {
                    array[n2] = intern;
                    n2 = 7;
                    s = "\u0000P\u0016(\"\u0014P0v%\u0014Q<42^A%<6\u0003\r$63\u0005C.v";
                    n = 6;
                    array = z2;
                    continue;
                }
                case 6: {
                    break Label_0232;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    za(final p9 c, final cq b, final String d, final int a, final String e) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = a;
        this.e = e;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final ArrayList<cq> list = new ArrayList<cq>();
        final ArrayList<Pair> list2 = new ArrayList<Pair>();
        final HashSet<String> set = new HashSet<String>(z8.j());
        for (final be be : this.b.c) {
            final c6 f = be.f;
            final boolean d = be.d;
            final String e = be.e;
            final long g = be.g;
            final int b = be.b;
            final boolean h = be.h;
            cq cq = null;
            Label_0258: {
                if (set.contains(e)) {
                    final bi c = App.ak.C(e);
                    if (App.ak.j(e) != be.a) {
                        final cq b2 = p9.b(e, 1);
                        final bi b3 = App.ak.b(e, p9.a(b2.f, be.c));
                        if (b3 != null) {
                            list2.add(Pair.create((Object)e, (Object)b3.a));
                            b2.l = true;
                        }
                        Log.i(za.z[7] + e + za.z[1] + p9.a(b2.f, be.c));
                        cq = b2;
                    }
                    else {
                        if (c != null) {
                            if (f == null) {
                                final cq b4 = p9.b(e, 0);
                                list2.add(Pair.create((Object)e, (Object)null));
                                b4.l = true;
                                cq = b4;
                                break Label_0258;
                            }
                            if (!c.a.equals(f)) {
                                if (App.ak.a(f) != null) {
                                    cq = p9.b(e, 0);
                                    list2.add(Pair.create((Object)e, (Object)f));
                                    cq.l = true;
                                    Log.i(za.z[2] + e);
                                    break Label_0258;
                                }
                                final cq b5 = p9.b(e, 3);
                                final bi b6 = App.ak.b(e, p9.a(b5.f, be.c));
                                if (b6 != null) {
                                    list2.add(Pair.create((Object)e, (Object)b6.a));
                                    b5.l = true;
                                }
                                Log.i(za.z[3] + e + za.z[4] + p9.a(b5.f, be.c));
                                cq = b5;
                                break Label_0258;
                            }
                        }
                        else if (f != null) {
                            cq = p9.b(e, 1);
                            Log.i(za.z[6] + e);
                            break Label_0258;
                        }
                        cq = null;
                    }
                }
                else {
                    cq = new cq();
                    cq.d = e;
                    cq.h = 2;
                    Log.i(za.z[0] + e);
                }
            }
            set.remove(e);
            final boolean n = App.ak.n(e);
            final long e2 = y.e((Context)App.aq, e);
            final long n2 = 1000L * (e2 / 1000L);
            final boolean k = adc.b(e) && !adc.f(e);
            final a_9 a = z8.a(e);
            int l;
            if (a != null) {
                l = a.l;
            }
            else {
                l = 0;
            }
            if (cq == null && (n != d || n2 != g || k != h || (a != null && b != l))) {
                cq = new cq();
                cq.d = e;
            }
            if (cq != null) {
                cq.a = n;
                cq.p = e2;
                cq.k = k;
                cq.i = l;
                list.add(cq);
            }
            if (i) {
                break;
            }
        }
        for (final String s : set) {
            final cq b7 = p9.b(s, 0);
            b7.a = App.ak.n(s);
            b7.p = y.e((Context)App.aq, s);
            b7.k = (adc.b(s) && !adc.f(s));
            list.add(b7);
            list2.add(Pair.create((Object)s, (Object)null));
            if (App.ak.C(s) != null) {
                b7.l = true;
            }
            if (i) {
                break;
            }
        }
        App.a(this.d, list, this.a, false, Integer.toString(App.S.h()));
        App.b(this.d, this.e, za.z[5]);
        for (final Pair pair : list2) {
            List<bi> list3;
            if (pair.second != null) {
                p9.a(this.c);
                list3 = (List<bi>)App.ak.a((String)pair.first, (c6)pair.second);
            }
            else {
                p9.a(this.c);
                final bi c2 = App.ak.C((String)pair.first);
                list3 = null;
                if (c2 != null) {
                    p9.a(this.c);
                    list3 = (List<bi>)App.ak.a(c2.a, 20);
                    if (list3 != null) {
                        list3.add(c2);
                    }
                }
            }
            if (list3 != null) {
                App.a(2, list3, false, false, null, null);
            }
            if (i) {
                break;
            }
        }
    }
}
