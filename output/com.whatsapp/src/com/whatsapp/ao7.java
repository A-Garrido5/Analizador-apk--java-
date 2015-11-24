// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import com.whatsapp.protocol.c6;
import java.util.List;
import android.text.TextUtils;
import android.content.Context;
import com.whatsapp.notification.y;
import com.whatsapp.protocol.bi;
import java.util.Map;
import android.util.Pair;
import com.whatsapp.protocol.cq;
import java.util.ArrayList;
import java.util.HashMap;
import android.os.ConditionVariable;

final class ao7 implements Runnable
{
    final ConditionVariable a;
    final boolean b;
    final String c;
    final HashMap d;
    final ConditionVariable e;
    
    ao7(final HashMap d, final String c, final boolean b, final ConditionVariable e, final ConditionVariable a) {
        this.d = d;
        this.c = c;
        this.b = b;
        this.e = e;
        this.a = a;
    }
    
    @Override
    public void run() {
        final boolean i = App.I;
        final ArrayList<cq> list = new ArrayList<cq>();
        final long currentTimeMillis = System.currentTimeMillis();
        final ArrayList<Pair> list2 = new ArrayList<Pair>();
        try {
            for (final Map.Entry<String, V> entry : this.d.entrySet()) {
                final String d = entry.getKey();
                final bi bi = (bi)entry.getValue();
                final cq cq = new cq();
                final a_9 a = z8.a(d);
                cq.f = App.ak.m(d);
                cq.s = App.ak.j(d);
                cq.d = d;
                long e;
                if (a.m()) {
                    e = y.e((Context)App.aq, d);
                }
                else {
                    e = 0L;
                }
                cq.p = e;
                cq.i = a.l;
                cq.a = App.ak.n(d);
                String t;
                if (TextUtils.isEmpty((CharSequence)a.t)) {
                    t = null;
                }
                else {
                    t = a.t;
                }
                cq.j = t;
                if (a.m()) {
                    cq.k = !adc.f(d);
                }
                list.add(cq);
                if (bi != null && a_9.h(d) && bi.c == 6) {
                    App.b(d, true);
                }
                if (currentTimeMillis - 86400000L < cq.f && bi != null) {
                    list2.add(Pair.create((Object)bi.a, (Object)(20 + cq.i)));
                }
                if (i) {
                    break;
                }
            }
            final String c = this.c;
            int n;
            if (this.b) {
                n = 7;
            }
            else {
                n = 0;
            }
            App.a(c, list, n, this.b, null);
            this.e.open();
            for (final Pair pair : list2) {
                App.a(1, App.ak.a((c6)pair.first, (int)pair.second), false, this.b, null, this.a);
                if (i) {
                    break;
                }
            }
        }
        finally {
            final String c2 = this.c;
            int n2;
            if (this.b) {
                n2 = 7;
            }
            else {
                n2 = 0;
            }
            while (true) {
                App.a(c2, list, n2, this.b, null);
                this.e.open();
                continue;
            }
        }
    }
}
