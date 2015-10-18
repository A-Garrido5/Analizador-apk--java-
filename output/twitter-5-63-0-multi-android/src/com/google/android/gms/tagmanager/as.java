// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
import com.google.android.gms.internal.b;
import com.google.android.gms.internal.c;
import java.util.Set;
import java.util.Map;

class as
{
    private static final aj a;
    private final s b;
    private final Map c;
    private final Map d;
    private final Map e;
    private final bi f;
    private final bi g;
    private final Set h;
    private final d i;
    private final Map j;
    private volatile String k;
    private int l;
    
    static {
        a = new aj(bf.a(), true);
    }
    
    private aj a(final c c, final Set set, final bg bg) {
        if (!c.l) {
            return new aj(c, true);
        }
        switch (c.a) {
            default: {
                z.a("Unknown type: " + c.a);
                return as.a;
            }
            case 2: {
                final c a = ao.a(c);
                a.c = new c[c.c.length];
                for (int i = 0; i < c.c.length; ++i) {
                    final aj a2 = this.a(c.c[i], set, bg.a(i));
                    if (a2 == as.a) {
                        return as.a;
                    }
                    a.c[i] = (c)a2.a();
                }
                return new aj(a, false);
            }
            case 3: {
                final c a3 = ao.a(c);
                if (c.d.length != c.e.length) {
                    z.a("Invalid serving value: " + c.toString());
                    return as.a;
                }
                a3.d = new c[c.d.length];
                a3.e = new c[c.d.length];
                for (int j = 0; j < c.d.length; ++j) {
                    final aj a4 = this.a(c.d[j], set, bg.b(j));
                    final aj a5 = this.a(c.e[j], set, bg.c(j));
                    if (a4 == as.a || a5 == as.a) {
                        return as.a;
                    }
                    a3.d[j] = (c)a4.a();
                    a3.e[j] = (c)a5.a();
                }
                return new aj(a3, false);
            }
            case 4: {
                if (set.contains(c.f)) {
                    z.a("Macro cycle detected.  Current macro reference: " + c.f + "." + "  Previous macro references: " + set.toString() + ".");
                    return as.a;
                }
                set.add(c.f);
                final aj a6 = bh.a(this.a(c.f, set, bg.a()), c.k);
                set.remove(c.f);
                return a6;
            }
            case 7: {
                final c a7 = ao.a(c);
                a7.j = new c[c.j.length];
                for (int k = 0; k < c.j.length; ++k) {
                    final aj a8 = this.a(c.j[k], set, bg.d(k));
                    if (a8 == as.a) {
                        return as.a;
                    }
                    a7.j[k] = (c)a8.a();
                }
                return new aj(a7, false);
            }
        }
    }
    
    private aj a(final String s, final Set set, final ab ab) {
        ++this.l;
        final aw aw = (aw)this.g.a(s);
        if (aw != null && !this.b.a()) {
            this.a(aw.b(), set);
            --this.l;
            return aw.a();
        }
        final ax ax = this.j.get(s);
        if (ax == null) {
            z.a(this.a() + "Invalid macro: " + s);
            --this.l;
            return as.a;
        }
        final aj a = this.a(s, ax.a(), ax.b(), ax.c(), ax.e(), ax.d(), set, ab.b());
        ap f;
        if (((Set)a.a()).isEmpty()) {
            f = ax.f();
        }
        else {
            if (((Set)a.a()).size() > 1) {
                z.b(this.a() + "Multiple macros active for macroName " + s);
            }
            f = ((Set)a.a()).iterator().next();
        }
        if (f == null) {
            --this.l;
            return as.a;
        }
        final aj a2 = this.a(this.e, f, set, ab.a());
        final boolean b = a.b() && a2.b();
        aj a3;
        if (a2 == as.a) {
            a3 = as.a;
        }
        else {
            a3 = new aj(a2.a(), b);
        }
        final c b2 = f.b();
        if (a3.b()) {
            this.g.a(s, new aw(a3, b2));
        }
        this.a(b2, set);
        --this.l;
        return a3;
    }
    
    private aj a(final Map map, final ap ap, final Set set, final ak ak) {
        boolean b = true;
        final c c = ap.a().get(com.google.android.gms.internal.b.aL.toString());
        aj a;
        if (c == null) {
            z.a("No function id in properties");
            a = as.a;
        }
        else {
            final String g = c.g;
            final t t = map.get(g);
            if (t == null) {
                z.a(g + " has no backing implementation.");
                return as.a;
            }
            a = (aj)this.f.a(ap);
            if (a == null || this.b.a()) {
                final HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
                final Iterator<Map.Entry<String, V>> iterator = ap.a().entrySet().iterator();
                int n = b ? 1 : 0;
                while (iterator.hasNext()) {
                    final Map.Entry<String, V> entry = iterator.next();
                    final aj a2 = this.a((c)entry.getValue(), set, ak.a(entry.getKey()).a((c)entry.getValue()));
                    if (a2 == as.a) {
                        return as.a;
                    }
                    int n2;
                    if (a2.b()) {
                        ap.a(entry.getKey(), (c)a2.a());
                        n2 = n;
                    }
                    else {
                        n2 = 0;
                    }
                    hashMap.put(entry.getKey(), a2.a());
                    n = n2;
                }
                if (!t.a(hashMap.keySet())) {
                    z.a("Incorrect keys for function " + g + " required " + t.b() + " had " + hashMap.keySet());
                    return as.a;
                }
                if (n == 0 || !t.a()) {
                    b = false;
                }
                final aj aj = new aj(t.a(hashMap), b);
                if (b) {
                    this.f.a(ap, aj);
                }
                ak.a((c)aj.a());
                return aj;
            }
        }
        return a;
    }
    
    private aj a(final Set set, final Set set2, final av av, final ar ar) {
        final HashSet set3 = new HashSet();
        final HashSet set4 = new HashSet();
        final Iterator<aq> iterator = set.iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final aq aq = iterator.next();
            final an a = ar.a();
            final aj a2 = this.a(aq, set2, a);
            if (a2.a()) {
                av.a(aq, set3, set4, a);
            }
            b = (b && a2.b());
        }
        set3.removeAll(set4);
        ar.a(set3);
        return new aj(set3, b);
    }
    
    private String a() {
        if (this.l <= 1) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        sb.append(Integer.toString(this.l));
        for (int i = 2; i < this.l; ++i) {
            sb.append(' ');
        }
        sb.append(": ");
        return sb.toString();
    }
    
    private void a(final c c, final Set set) {
        if (c != null) {
            final aj a = this.a(c, set, new ai());
            if (a != as.a) {
                final Object c2 = bf.c((c)a.a());
                if (c2 instanceof Map) {
                    this.i.a((Map)c2);
                    return;
                }
                if (!(c2 instanceof List)) {
                    z.b("pushAfterEvaluate: value not a Map or List");
                    return;
                }
                for (final Map next : (List<Object>)c2) {
                    if (next instanceof Map) {
                        this.i.a(next);
                    }
                    else {
                        z.b("pushAfterEvaluate: value not a Map");
                    }
                }
            }
        }
    }
    
    aj a(final ap ap, final Set set, final ak ak) {
        final aj a = this.a(this.d, ap, set, ak);
        final Boolean b = bf.b((c)a.a());
        ak.a(bf.c(b));
        return new aj(b, a.b());
    }
    
    aj a(final aq aq, final Set set, final an an) {
        final Iterator<ap> iterator = aq.b().iterator();
        boolean b = true;
        while (iterator.hasNext()) {
            final aj a = this.a(iterator.next(), set, an.a());
            if (a.a()) {
                an.a(bf.c(false));
                return new aj(false, a.b());
            }
            b = (b && a.b());
        }
        final Iterator<ap> iterator2 = aq.a().iterator();
        while (iterator2.hasNext()) {
            final aj a2 = this.a(iterator2.next(), set, an.b());
            if (!(boolean)a2.a()) {
                an.a(bf.c(false));
                return new aj(false, a2.b());
            }
            b = (b && a2.b());
        }
        an.a(bf.c(true));
        return new aj(true, b);
    }
    
    aj a(final String s, final Set set, final Map map, final Map map2, final Map map3, final Map map4, final Set set2, final ar ar) {
        return this.a(set, set2, new at(this, map, map2, map3, map4), ar);
    }
    
    aj a(final Set set, final ar ar) {
        return this.a(set, new HashSet(), new au(this), ar);
    }
    
    public void a(final String s) {
        final r a;
        synchronized (this) {
            this.b(s);
            a = this.b.a(s);
            final bn a2 = a.a();
            final Iterator iterator = ((Set)this.a(this.h, a2.b()).a()).iterator();
            while (iterator.hasNext()) {
                this.a(this.c, iterator.next(), new HashSet(), a2.a());
            }
        }
        a.b();
        this.b(null);
    }
    // monitorexit(this)
    
    void b(final String k) {
        synchronized (this) {
            this.k = k;
        }
    }
}
