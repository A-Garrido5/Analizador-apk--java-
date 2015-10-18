// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class am
{
    private static final am a;
    private List b;
    private List c;
    private List d;
    private List e;
    private List f;
    
    static {
        a = c().b();
    }
    
    private am() {
    }
    
    am(final cv cv) {
        this();
    }
    
    static List a(final am am) {
        return am.f;
    }
    
    static List a(final am am, final List d) {
        return am.d = d;
    }
    
    static List b(final am am) {
        return am.d;
    }
    
    static List b(final am am, final List b) {
        return am.b = b;
    }
    
    public static ea c() {
        return ea.a();
    }
    
    static List c(final am am) {
        return am.e;
    }
    
    static List c(final am am, final List e) {
        return am.e = e;
    }
    
    static List d(final am am) {
        return am.b;
    }
    
    static List d(final am am, final List c) {
        return am.c = c;
    }
    
    static List e(final am am) {
        return am.c;
    }
    
    static List e(final am am, final List f) {
        return am.f = f;
    }
    
    private Object[] e() {
        return new Object[] { this.b, this.d, this.f, this.c, this.e };
    }
    
    public int a(final int n) {
        final boolean b = dt.b;
        final Iterator<hv> iterator = this.c.iterator();
        int n2 = 0;
        while (iterator.hasNext()) {
            final int n3 = n2 + ep.a(n, iterator.next());
            if (b) {
                return n3;
            }
            n2 = n3;
        }
        return n2;
    }
    
    public List a() {
        return this.b;
    }
    
    public void a(final int n, final ep ep) {
        final boolean b = dt.b;
        final Iterator<hv> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            ep.d(n, iterator.next());
            if (b) {
                break;
            }
        }
    }
    
    public int b(final int n) {
        final boolean b = dt.b;
        final Iterator<Long> iterator = this.b.iterator();
        int n2 = 0;
        while (true) {
            while (iterator.hasNext()) {
                final int n3 = n2 + ep.e(n, iterator.next());
                if (b) {
                    final Iterator<Integer> iterator2 = this.d.iterator();
                    int n4 = n3;
                    while (true) {
                        while (iterator2.hasNext()) {
                            final int n5 = n4 + ep.f(n, iterator2.next());
                            if (b) {
                                final Iterator<Long> iterator3 = this.f.iterator();
                                int n6 = n5;
                                while (true) {
                                    while (iterator3.hasNext()) {
                                        final int n7 = n6 + ep.d(n, iterator3.next());
                                        if (b) {
                                            final Iterator<hv> iterator4 = this.c.iterator();
                                            int n8 = n7;
                                            while (true) {
                                                while (iterator4.hasNext()) {
                                                    final int n9 = n8 + ep.b(n, iterator4.next());
                                                    if (b) {
                                                        final Iterator<ce> iterator5 = this.e.iterator();
                                                        int n10 = n9;
                                                        while (iterator5.hasNext()) {
                                                            final int n11 = n10 + ep.c(n, iterator5.next());
                                                            if (b) {
                                                                return n11;
                                                            }
                                                            n10 = n11;
                                                        }
                                                        return n10;
                                                    }
                                                    n8 = n9;
                                                }
                                                final int n9 = n8;
                                                continue;
                                            }
                                        }
                                        n6 = n7;
                                    }
                                    final int n7 = n6;
                                    continue;
                                }
                            }
                            n4 = n5;
                        }
                        final int n5 = n4;
                        continue;
                    }
                }
                n2 = n3;
            }
            final int n3 = n2;
            continue;
        }
    }
    
    public List b() {
        return this.c;
    }
    
    public void b(final int n, final ep ep) {
        final boolean b = dt.b;
        final Iterator<Long> iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ep.b(n, iterator.next());
            if (b) {
                break;
            }
        }
        final Iterator<Integer> iterator2 = this.d.iterator();
        while (iterator2.hasNext()) {
            ep.i(n, iterator2.next());
            if (b) {
                break;
            }
        }
        final Iterator<Long> iterator3 = this.f.iterator();
        while (iterator3.hasNext()) {
            ep.c(n, iterator3.next());
            if (b) {
                break;
            }
        }
        final Iterator<hv> iterator4 = this.c.iterator();
        while (iterator4.hasNext()) {
            ep.c(n, iterator4.next());
            if (b) {
                break;
            }
        }
        final Iterator<ce> iterator5 = this.e.iterator();
        while (iterator5.hasNext()) {
            ep.b(n, iterator5.next());
            if (b) {
                break;
            }
        }
    }
    
    public List d() {
        return this.e;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof am && Arrays.equals(this.e(), ((am)o).e()));
    }
    
    public List f() {
        return this.f;
    }
    
    public List g() {
        return this.d;
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.e());
    }
}
