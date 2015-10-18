// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

public class al
{
    public static final al[] a;
    public final String b;
    public final int c;
    public final long d;
    public final String e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    
    static {
        a = new al[0];
    }
    
    public al(final String b, final int c, final long d, final String e, final boolean f, final String h, final String i, final String j, final String k, final String l, final String m, final String n, final int g) {
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
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o == null || this.getClass() != o.getClass()) {
                return false;
            }
            final al al = (al)o;
            if (this.c != al.c) {
                return false;
            }
            if (this.f != al.f) {
                return false;
            }
            if (this.g != al.g) {
                return false;
            }
            if (this.d != al.d) {
                return false;
            }
            Label_0112: {
                if (this.b != null) {
                    if (this.b.equals(al.b)) {
                        break Label_0112;
                    }
                }
                else if (al.b == null) {
                    break Label_0112;
                }
                return false;
            }
            Label_0142: {
                if (this.e != null) {
                    if (this.e.equals(al.e)) {
                        break Label_0142;
                    }
                }
                else if (al.e == null) {
                    break Label_0142;
                }
                return false;
            }
            Label_0172: {
                if (this.h != null) {
                    if (this.h.equals(al.h)) {
                        break Label_0172;
                    }
                }
                else if (al.h == null) {
                    break Label_0172;
                }
                return false;
            }
            Label_0202: {
                if (this.i != null) {
                    if (this.i.equals(al.i)) {
                        break Label_0202;
                    }
                }
                else if (al.i == null) {
                    break Label_0202;
                }
                return false;
            }
            Label_0232: {
                if (this.j != null) {
                    if (this.j.equals(al.j)) {
                        break Label_0232;
                    }
                }
                else if (al.j == null) {
                    break Label_0232;
                }
                return false;
            }
            Label_0262: {
                if (this.k != null) {
                    if (this.k.equals(al.k)) {
                        break Label_0262;
                    }
                }
                else if (al.k == null) {
                    break Label_0262;
                }
                return false;
            }
            Label_0292: {
                if (this.l != null) {
                    if (this.l.equals(al.l)) {
                        break Label_0292;
                    }
                }
                else if (al.l == null) {
                    break Label_0292;
                }
                return false;
            }
            Label_0322: {
                if (this.m != null) {
                    if (this.m.equals(al.m)) {
                        break Label_0322;
                    }
                }
                else if (al.m == null) {
                    break Label_0322;
                }
                return false;
            }
            if (this.n != null) {
                if (this.n.equals(al.n)) {
                    return true;
                }
            }
            else if (al.n == null) {
                return true;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hashCode;
        if (this.b != null) {
            hashCode = this.b.hashCode();
        }
        else {
            hashCode = 0;
        }
        final int n = 31 * (31 * (hashCode * 31 + this.c) + (int)(this.d ^ this.d >>> 32));
        int hashCode2;
        if (this.e != null) {
            hashCode2 = this.e.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final int n2 = 31 * (hashCode2 + n);
        int hashCode3;
        if (this.h != null) {
            hashCode3 = this.h.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int n3 = 31 * (hashCode3 + n2);
        int hashCode4;
        if (this.i != null) {
            hashCode4 = this.i.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int n4 = 31 * (hashCode4 + n3);
        int hashCode5;
        if (this.j != null) {
            hashCode5 = this.j.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final int n5 = 31 * (hashCode5 + n4);
        int hashCode6;
        if (this.k != null) {
            hashCode6 = this.k.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final int n6 = 31 * (hashCode6 + n5);
        int hashCode7;
        if (this.l != null) {
            hashCode7 = this.l.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final int n7 = 31 * (hashCode7 + n6);
        int hashCode8;
        if (this.m != null) {
            hashCode8 = this.m.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final int n8 = 31 * (hashCode8 + n7);
        int hashCode9;
        if (this.n != null) {
            hashCode9 = this.n.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final int n9 = 31 * (hashCode9 + n8);
        final boolean f = this.f;
        int n10 = 0;
        if (f) {
            n10 = 1;
        }
        return 31 * (n9 + n10) + this.g;
    }
}
