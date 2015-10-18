// 
// Decompiled by Procyon v0.5.30
// 

package com.whatsapp;

import java.util.Iterator;
import java.util.Map;
import android.os.Handler;
import java.util.HashMap;

public class a04
{
    private final HashMap a;
    private final Handler b;
    private final HashMap c;
    
    public a04() {
        this.b = new Handler();
        this.c = new HashMap();
        this.a = new HashMap();
    }
    
    static HashMap a(final a04 a04) {
        return a04.a;
    }
    
    private static boolean a(final long n) {
        return n != 0L && 25000L + n > System.currentTimeMillis();
    }
    
    public int a(final String s, final String s2) {
        final fc fc = this.a.get(s);
        if (fc != null) {
            if (s2 != null && adc.b(s)) {
                if (fc.b != null) {
                    final ei ei = fc.b.get(s2);
                    if (ei != null) {
                        int b;
                        if (a(ei.a)) {
                            b = ei.b;
                        }
                        else {
                            b = -1;
                        }
                        return b;
                    }
                }
            }
            else if (a(fc.a)) {
                return fc.c;
            }
        }
        return -1;
    }
    
    public String a(final String s, final long d) {
        final boolean i = App.I;
        fc fc = this.a.get(s);
        if (fc == null) {
            fc = new fc(null);
            this.a.put(s, fc);
        }
        Label_0067: {
            if (d == 0L) {
                fc.d = 0L;
                if (!i) {
                    break Label_0067;
                }
            }
            fc.d = d;
        }
        fc.a = 0L;
        for (final Map.Entry<String, V> entry : this.a.entrySet()) {
            if (adc.b(entry.getKey())) {
                final fc fc2 = (fc)entry.getValue();
                if (fc2.b == null) {
                    continue;
                }
                final ei ei = fc2.b.get(s);
                if (ei != null) {
                    ei.a = 0L;
                    return entry.getKey();
                }
                continue;
            }
        }
        return null;
    }
    
    public void a() {
        final boolean i = App.I;
        this.a.clear();
        final Iterator<a95> iterator = this.c.values().iterator();
        while (iterator.hasNext()) {
            this.b.removeCallbacks((Runnable)iterator.next());
            if (i) {
                break;
            }
        }
        this.c.clear();
    }
    
    public void a(final String s) {
        fc fc = this.a.get(s);
        if (fc == null) {
            fc = new fc(null);
            this.a.put(s, fc);
        }
        fc.d = 1L;
    }
    
    public void a(final String s, final String s2, final int n) {
        final fc fc = this.a.get(s);
        fc fc3;
        if (fc == null) {
            final fc fc2 = new fc(null);
            this.a.put(s, fc2);
            fc3 = fc2;
        }
        else {
            fc3 = fc;
        }
        if (s2 != null && adc.b(s)) {
            if (fc3.b == null) {
                fc3.b = new HashMap();
            }
            ei ei = fc3.b.get(s2);
            if (ei == null) {
                ei = new ei(null);
                fc3.b.put(s2, ei);
            }
            ei.a = System.currentTimeMillis();
            ei.b = n;
        }
        fc3.a = System.currentTimeMillis();
        fc3.c = n;
        final String string = s + s2;
        a95 a95 = this.c.get(string);
        if (a95 == null) {
            a95 = new a95(this, s, s2);
            this.c.put(string, a95);
        }
        this.b.removeCallbacks((Runnable)a95);
        this.b.postDelayed((Runnable)a95, 25000L);
    }
    
    public void a(final String s, final boolean e) {
        fc fc = this.a.get(s);
        if (fc == null) {
            fc = new fc(null);
            this.a.put(s, fc);
        }
        if (!(fc.e = e)) {
            fc.d = 0L;
        }
    }
    
    public void b(final String s, final String s2) {
        final fc fc = this.a.get(s);
        fc fc3;
        if (fc == null) {
            final fc fc2 = new fc(null);
            this.a.put(s, fc2);
            fc3 = fc2;
        }
        else {
            fc3 = fc;
        }
        if (s2 != null && adc.b(s)) {
            if (fc3.b == null) {
                fc3.b = new HashMap();
            }
            ei ei = fc3.b.get(s2);
            if (ei == null) {
                ei = new ei(null);
                fc3.b.put(s2, ei);
            }
            ei.a = 0L;
        }
        fc3.a = 0L;
        final a95 a95 = this.c.get(s + s2);
        if (a95 != null) {
            this.b.removeCallbacks((Runnable)a95);
        }
    }
    
    public boolean b(final String s) {
        final fc fc = this.a.get(s);
        return fc != null && fc.e;
    }
    
    public boolean c(final String s) {
        if (adc.b(s)) {
            return true;
        }
        final fc fc = this.a.get(s);
        return fc != null && fc.d == 1L;
    }
    
    public qo d(final String s) {
        final boolean i = App.I;
        final fc fc = this.a.get(s);
        if (fc != null) {
            Label_0174: {
                if (adc.b(s)) {
                    if (fc.b != null) {
                        long a = 0L;
                        final Iterator<Map.Entry<K, ei>> iterator = fc.b.entrySet().iterator();
                        int n = -1;
                        String s2 = null;
                        while (true) {
                            while (iterator.hasNext()) {
                                final Map.Entry<K, ei> entry = iterator.next();
                                int b;
                                String s4;
                                if (entry.getValue().a > a) {
                                    final String s3 = (String)entry.getKey();
                                    a = entry.getValue().a;
                                    b = entry.getValue().b;
                                    s4 = s3;
                                }
                                else {
                                    b = n;
                                    s4 = s2;
                                }
                                if (i) {
                                    if (a(a)) {
                                        return new qo(s4, b);
                                    }
                                    if (i) {
                                        break Label_0174;
                                    }
                                    return null;
                                }
                                else {
                                    n = b;
                                    s2 = s4;
                                }
                            }
                            int b = n;
                            String s4 = s2;
                            continue;
                        }
                    }
                    return null;
                }
            }
            final int a2 = this.a(s, null);
            if (a2 != -1) {
                return new qo(s, a2);
            }
        }
        return null;
    }
    
    public long e(final String s) {
        final fc fc = this.a.get(s);
        if (fc == null) {
            return 0L;
        }
        return fc.d;
    }
}
