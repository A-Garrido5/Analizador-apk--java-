// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.ListIterator;
import java.util.Iterator;
import java.util.ArrayList;

public class az implements ab, Comparable
{
    public final int a;
    public final long b;
    public final long c;
    public final long d;
    public final int e;
    public final int f;
    public final ArrayList g;
    public final int h;
    public final int i;
    public final ArrayList j;
    public final ArrayList k;
    public final ArrayList l;
    public final int m;
    public final int n;
    public final ArrayList o;
    public final ArrayList p;
    public final long q;
    
    public az(final int a, final long b, final long c, final long d, final int e, final int f, final ArrayList g, final int h, final int i, final ArrayList j, final ArrayList k, final ArrayList l, final int m, final int n, final ArrayList o, final ArrayList p17, final long q) {
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
    
    private int a(final ArrayList list) {
        if (list == null) {
            return 0;
        }
        final Iterator<ab> iterator = list.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final ab ab = iterator.next();
            final int n2 = n * 31;
            int n3;
            if (ab == null) {
                n3 = 0;
            }
            else {
                n3 = (int)ab.a();
            }
            n = n3 + n2;
        }
        return n;
    }
    
    private boolean a(final ArrayList list, final ArrayList list2) {
        boolean b;
        if (list == list2) {
            b = true;
        }
        else {
            b = false;
            if (list != null) {
                b = false;
                if (list2 != null) {
                    final ListIterator<ab> listIterator = list.listIterator();
                    final ListIterator<ab> listIterator2 = list2.listIterator();
                    while (listIterator.hasNext() && listIterator2.hasNext()) {
                        final ab ab = listIterator.next();
                        final ab ab2 = listIterator2.next();
                        if (ab == null) {
                            b = false;
                            if (ab2 != null) {
                                return b;
                            }
                        }
                        if (ab != null) {
                            b = false;
                            if (ab2 == null) {
                                return b;
                            }
                        }
                        if (ab != null && ab.a() != ab2.a()) {
                            return false;
                        }
                    }
                    return !listIterator.hasNext() && !listIterator2.hasNext();
                }
            }
        }
        return b;
    }
    
    public int a(final az az) {
        if (az == null) {
            return 1;
        }
        return Long.valueOf(this.c).compareTo(Long.valueOf(az.c));
    }
    
    @Override
    public long a() {
        return this.b;
    }
    
    @Override
    public String b() {
        return String.valueOf(this.b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final az az = (az)o;
            if (this.b != az.b) {
                return false;
            }
            if (this.a != az.a) {
                return false;
            }
            if (this.c != az.c) {
                return false;
            }
            if (this.d != az.d) {
                return false;
            }
            if (this.f != az.f) {
                return false;
            }
            if (this.e != az.e) {
                return false;
            }
            if (this.n != az.n) {
                return false;
            }
            if (this.m != az.m) {
                return false;
            }
            if (this.i != az.i) {
                return false;
            }
            if (this.h != az.h) {
                return false;
            }
            if (!this.a(this.g, az.g)) {
                return false;
            }
            if (!this.a(this.j, az.j)) {
                return false;
            }
            if (!this.a(this.k, az.k)) {
                return false;
            }
            if (!this.a(this.l, az.l)) {
                return false;
            }
            if (!this.a(this.o, az.o)) {
                return false;
            }
            if (!this.a(this.p, az.p)) {
                return false;
            }
            if (this.q != az.q) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * this.a + (int)(this.b ^ this.b >>> 32)) + (int)(this.c ^ this.c >>> 32)) + (int)(this.d ^ this.d >>> 32)) + (int)(this.q ^ this.q >>> 32)) + this.e) + this.f) + this.a(this.g)) + this.h) + this.i) + this.a(this.j)) + this.a(this.k)) + this.a(this.l)) + this.m) + this.n) + this.a(this.o)) + this.a(this.p);
    }
    
    @Override
    public String toString() {
        return "event=" + this.a + ", createdAt=" + this.b + ", maxPosition=" + this.c + ", minPosition=" + this.d + ", sourcesSize=" + this.e + ", sourceType=" + this.f + ", targetsSize=" + this.h + ", targetType=" + this.i + ", targetObjectsSize=" + this.m + ", targetObjectType=" + this.n + ", magicRecId=" + this.q;
    }
}
