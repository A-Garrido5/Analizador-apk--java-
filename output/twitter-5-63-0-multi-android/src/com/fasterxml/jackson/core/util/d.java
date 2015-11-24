// 
// Decompiled by Procyon v0.5.30
// 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.io.e;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.ArrayList;

public final class d
{
    static final char[] a;
    private final a b;
    private char[] c;
    private int d;
    private int e;
    private ArrayList f;
    private boolean g;
    private int h;
    private char[] i;
    private int j;
    private String k;
    private char[] l;
    
    static {
        a = new char[0];
    }
    
    public d(final a b) {
        this.g = false;
        this.b = b;
    }
    
    private char[] b(final int n) {
        if (this.b != null) {
            return this.b.b(2, n);
        }
        return new char[Math.max(n, 1000)];
    }
    
    private void c(final int n) {
        final int e = this.e;
        this.e = 0;
        final char[] c = this.c;
        this.c = null;
        final int d = this.d;
        this.d = -1;
        final int n2 = e + n;
        if (this.i == null || n2 > this.i.length) {
            this.i = this.b(n2);
        }
        if (e > 0) {
            System.arraycopy(c, d, this.i, 0, e);
        }
        this.h = 0;
        this.j = e;
    }
    
    private void d(final int n) {
        int n2 = 1000;
        if (this.f == null) {
            this.f = new ArrayList();
        }
        final char[] i = this.i;
        this.g = true;
        this.f.add(i);
        this.h += i.length;
        this.j = 0;
        final int length = i.length;
        final int n3 = length + (length >> 1);
        if (n3 >= n2) {
            if (n3 > 262144) {
                n2 = 262144;
            }
            else {
                n2 = n3;
            }
        }
        this.i = this.e(n2);
    }
    
    private char[] e(final int n) {
        return new char[n];
    }
    
    private void o() {
        this.g = false;
        this.f.clear();
        this.h = 0;
        this.j = 0;
    }
    
    private char[] p() {
        if (this.k != null) {
            return this.k.toCharArray();
        }
        if (this.d >= 0) {
            final int e = this.e;
            if (e < 1) {
                return com.fasterxml.jackson.core.util.d.a;
            }
            final int d = this.d;
            if (d == 0) {
                return Arrays.copyOf(this.c, e);
            }
            return Arrays.copyOfRange(this.c, d, e + d);
        }
        else {
            final int c = this.c();
            if (c < 1) {
                return com.fasterxml.jackson.core.util.d.a;
            }
            final char[] e2 = this.e(c);
            int n2;
            if (this.f != null) {
                final int size = this.f.size();
                int i = 0;
                int n = 0;
                while (i < size) {
                    final char[] array = this.f.get(i);
                    final int length = array.length;
                    System.arraycopy(array, 0, e2, n, length);
                    n += length;
                    ++i;
                }
                n2 = n;
            }
            else {
                n2 = 0;
            }
            System.arraycopy(this.i, 0, e2, n2, this.j);
            return e2;
        }
    }
    
    public void a() {
        if (this.b == null) {
            this.b();
        }
        else if (this.i != null) {
            this.b();
            final char[] i = this.i;
            this.i = null;
            this.b.a(2, i);
        }
    }
    
    public void a(final int j) {
        this.j = j;
    }
    
    public void a(final String k) {
        this.c = null;
        this.d = -1;
        this.e = 0;
        this.k = k;
        this.l = null;
        if (this.g) {
            this.o();
        }
        this.j = 0;
    }
    
    public void a(final char[] c, final int d, final int e) {
        this.k = null;
        this.l = null;
        this.c = c;
        this.d = d;
        this.e = e;
        if (this.g) {
            this.o();
        }
    }
    
    public void b() {
        this.d = -1;
        this.j = 0;
        this.e = 0;
        this.c = null;
        this.k = null;
        this.l = null;
        if (this.g) {
            this.o();
        }
    }
    
    public void b(final char[] array, final int n, final int n2) {
        this.c = null;
        this.d = -1;
        this.e = 0;
        this.k = null;
        this.l = null;
        if (this.g) {
            this.o();
        }
        else if (this.i == null) {
            this.i = this.b(n2);
        }
        this.h = 0;
        this.j = 0;
        this.c(array, n, n2);
    }
    
    public int c() {
        if (this.d >= 0) {
            return this.e;
        }
        if (this.l != null) {
            return this.l.length;
        }
        if (this.k != null) {
            return this.k.length();
        }
        return this.h + this.j;
    }
    
    public void c(final char[] array, int n, int i) {
        if (this.d >= 0) {
            this.c(i);
        }
        this.k = null;
        this.l = null;
        final char[] j = this.i;
        final int n2 = j.length - this.j;
        if (n2 >= i) {
            System.arraycopy(array, n, j, this.j, i);
            this.j += i;
            return;
        }
        if (n2 > 0) {
            System.arraycopy(array, n, j, this.j, n2);
            n += n2;
            i -= n2;
        }
        do {
            this.d(i);
            final int min = Math.min(this.i.length, i);
            System.arraycopy(array, n, this.i, 0, min);
            this.j += min;
            n += min;
            i -= min;
        } while (i > 0);
    }
    
    public int d() {
        if (this.d >= 0) {
            return this.d;
        }
        return 0;
    }
    
    public char[] e() {
        if (this.d >= 0) {
            return this.c;
        }
        if (this.l != null) {
            return this.l;
        }
        if (this.k != null) {
            return this.l = this.k.toCharArray();
        }
        if (!this.g) {
            return this.i;
        }
        return this.g();
    }
    
    public String f() {
        if (this.k == null) {
            if (this.l != null) {
                this.k = new String(this.l);
            }
            else if (this.d >= 0) {
                if (this.e < 1) {
                    return this.k = "";
                }
                this.k = new String(this.c, this.d, this.e);
            }
            else {
                final int h = this.h;
                final int j = this.j;
                if (h == 0) {
                    String k;
                    if (j == 0) {
                        k = "";
                    }
                    else {
                        k = new String(this.i, 0, j);
                    }
                    this.k = k;
                }
                else {
                    final StringBuilder sb = new StringBuilder(h + j);
                    if (this.f != null) {
                        for (int size = this.f.size(), i = 0; i < size; ++i) {
                            final char[] array = this.f.get(i);
                            sb.append(array, 0, array.length);
                        }
                    }
                    sb.append(this.i, 0, this.j);
                    this.k = sb.toString();
                }
            }
        }
        return this.k;
    }
    
    public char[] g() {
        char[] l = this.l;
        if (l == null) {
            l = this.p();
            this.l = l;
        }
        return l;
    }
    
    public BigDecimal h() {
        if (this.l != null) {
            return com.fasterxml.jackson.core.io.e.a(this.l);
        }
        if (this.d >= 0 && this.c != null) {
            return com.fasterxml.jackson.core.io.e.c(this.c, this.d, this.e);
        }
        if (this.h == 0 && this.i != null) {
            return com.fasterxml.jackson.core.io.e.c(this.i, 0, this.j);
        }
        return com.fasterxml.jackson.core.io.e.a(this.g());
    }
    
    public double i() {
        return com.fasterxml.jackson.core.io.e.a(this.f());
    }
    
    public char[] j() {
        if (this.d >= 0) {
            this.c(1);
        }
        else {
            final char[] i = this.i;
            if (i == null) {
                this.i = this.b(0);
            }
            else if (this.j >= i.length) {
                this.d(1);
            }
        }
        return this.i;
    }
    
    public char[] k() {
        this.d = -1;
        this.j = 0;
        this.e = 0;
        this.c = null;
        this.k = null;
        this.l = null;
        if (this.g) {
            this.o();
        }
        char[] i = this.i;
        if (i == null) {
            i = this.b(0);
            this.i = i;
        }
        return i;
    }
    
    public int l() {
        return this.j;
    }
    
    public char[] m() {
        int n = 1000;
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.g = true;
        this.f.add(this.i);
        final int length = this.i.length;
        this.h += length;
        this.j = 0;
        final int n2 = length + (length >> 1);
        if (n2 >= n) {
            if (n2 > 262144) {
                n = 262144;
            }
            else {
                n = n2;
            }
        }
        return this.i = this.e(n);
    }
    
    public char[] n() {
        final char[] i = this.i;
        final int length = i.length;
        int n = length + (length >> 1);
        if (n > 262144) {
            n = length + (length >> 2);
        }
        return this.i = Arrays.copyOf(i, n);
    }
    
    @Override
    public String toString() {
        return this.f();
    }
}
