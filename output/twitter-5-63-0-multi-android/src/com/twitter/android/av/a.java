// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.av.playback.PlaybackMode;
import java.util.Map;
import com.twitter.library.av.model.b;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.content.Context;

public class a
{
    public final Context a;
    public final Tweet b;
    public final TwitterScribeAssociation c;
    public final String d;
    public final int e;
    public final b f;
    public final com.twitter.library.av.model.a g;
    public final Map h;
    public final int i;
    public final boolean j;
    public final String k;
    public final Boolean l;
    public final String m;
    public final Long n;
    public final PlaybackMode o;
    public final Integer p;
    public final Long q;
    
    private a(final Context a, final Tweet b, final TwitterScribeAssociation c, final String d, final int e, final b f, final com.twitter.library.av.model.a g, final Map h, final int i, final boolean j, final String k, final Boolean l, final String m, final Long n, final PlaybackMode o, final Integer p17, final Long q) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p17;
        this.q = q;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        boolean b2;
        if (this == o) {
            b2 = b;
        }
        else {
            b2 = false;
            if (o != null) {
                final Class<? extends a> class1 = this.getClass();
                final Class<?> class2 = o.getClass();
                b2 = false;
                if (class1 == class2) {
                    final a a = (a)o;
                    final int e = this.e;
                    final int e2 = a.e;
                    b2 = false;
                    if (e == e2) {
                        final int i = this.i;
                        final int j = a.i;
                        b2 = false;
                        if (i == j) {
                            final boolean k = this.j;
                            final boolean l = a.j;
                            b2 = false;
                            if (k == l) {
                                if (this.a != null) {
                                    final boolean equals = this.a.equals(a.a);
                                    b2 = false;
                                    if (!equals) {
                                        return b2;
                                    }
                                }
                                else if (a.a != null) {
                                    return false;
                                }
                                if (this.b != null) {
                                    final boolean equals2 = this.b.equals(a.b);
                                    b2 = false;
                                    if (!equals2) {
                                        return b2;
                                    }
                                }
                                else if (a.b != null) {
                                    return false;
                                }
                                if (this.c != null) {
                                    final boolean equals3 = this.c.equals(a.c);
                                    b2 = false;
                                    if (!equals3) {
                                        return b2;
                                    }
                                }
                                else if (a.c != null) {
                                    return false;
                                }
                                if (this.d != null) {
                                    final boolean equals4 = this.d.equals(a.d);
                                    b2 = false;
                                    if (!equals4) {
                                        return b2;
                                    }
                                }
                                else if (a.d != null) {
                                    return false;
                                }
                                if (this.f != null) {
                                    final boolean equals5 = this.f.equals(a.f);
                                    b2 = false;
                                    if (!equals5) {
                                        return b2;
                                    }
                                }
                                else if (a.f != null) {
                                    return false;
                                }
                                if (this.g != null) {
                                    final boolean equals6 = this.g.equals(a.g);
                                    b2 = false;
                                    if (!equals6) {
                                        return b2;
                                    }
                                }
                                else if (a.g != null) {
                                    return false;
                                }
                                if (this.h != null) {
                                    final boolean equals7 = this.h.equals(a.h);
                                    b2 = false;
                                    if (!equals7) {
                                        return b2;
                                    }
                                }
                                else if (a.h != null) {
                                    return false;
                                }
                                if (this.k != null) {
                                    final boolean equals8 = this.k.equals(a.k);
                                    b2 = false;
                                    if (!equals8) {
                                        return b2;
                                    }
                                }
                                else if (a.k != null) {
                                    return false;
                                }
                                if (this.l != null) {
                                    final boolean equals9 = this.l.equals(a.l);
                                    b2 = false;
                                    if (!equals9) {
                                        return b2;
                                    }
                                }
                                else if (a.l != null) {
                                    return false;
                                }
                                if (this.m != null) {
                                    final boolean equals10 = this.m.equals(a.m);
                                    b2 = false;
                                    if (!equals10) {
                                        return b2;
                                    }
                                }
                                else if (a.m != null) {
                                    return false;
                                }
                                if (this.n != null) {
                                    final boolean equals11 = this.n.equals(a.n);
                                    b2 = false;
                                    if (!equals11) {
                                        return b2;
                                    }
                                }
                                else if (a.n != null) {
                                    return false;
                                }
                                final PlaybackMode o2 = this.o;
                                final PlaybackMode o3 = a.o;
                                b2 = false;
                                if (o2 == o3) {
                                    if (this.p != null) {
                                        final boolean equals12 = this.p.equals(a.p);
                                        b2 = false;
                                        if (!equals12) {
                                            return b2;
                                        }
                                    }
                                    else if (a.p != null) {
                                        return false;
                                    }
                                    if (this.q != null) {
                                        if (this.q.equals(a.q)) {
                                            return b;
                                        }
                                    }
                                    else if (a.q == null) {
                                        return b;
                                    }
                                    b = false;
                                    return b;
                                }
                            }
                        }
                    }
                }
            }
        }
        return b2;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.a != null) {
            hashCode = this.a.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = hashCode * 31;
        int hashCode2;
        if (this.b != null) {
            hashCode2 = this.b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.c != null) {
            hashCode3 = this.c.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.d != null) {
            hashCode4 = this.d.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (31 * (hashCode4 + n3) + this.e);
        int hashCode5;
        if (this.f != null) {
            hashCode5 = this.f.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.g != null) {
            hashCode6 = this.g.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        int hashCode7;
        if (this.h != null) {
            hashCode7 = this.h.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n7 = 31 * (31 * (hashCode7 + n6) + this.i);
        int n8;
        if (this.j) {
            n8 = 1;
        }
        else {
            n8 = 0;
        }
        final int n9 = 31 * (n8 + n7);
        int hashCode8;
        if (this.k != null) {
            hashCode8 = this.k.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n10 = 31 * (hashCode8 + n9);
        int hashCode9;
        if (this.l != null) {
            hashCode9 = this.l.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n11 = 31 * (hashCode9 + n10);
        int hashCode10;
        if (this.m != null) {
            hashCode10 = this.m.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final int n12 = 31 * (hashCode10 + n11);
        int hashCode11;
        if (this.n != null) {
            hashCode11 = this.n.hashCode();
        }
        else {
            hashCode11 = 0;
        }
        final int n13 = 31 * (hashCode11 + n12);
        int hashCode12;
        if (this.o != null) {
            hashCode12 = this.o.hashCode();
        }
        else {
            hashCode12 = 0;
        }
        final int n14 = 31 * (hashCode12 + n13);
        int hashCode13;
        if (this.p != null) {
            hashCode13 = this.p.hashCode();
        }
        else {
            hashCode13 = 0;
        }
        final int n15 = 31 * (hashCode13 + n14);
        final Long q = this.q;
        int hashCode14 = 0;
        if (q != null) {
            hashCode14 = this.q.hashCode();
        }
        return n15 + hashCode14;
    }
}
