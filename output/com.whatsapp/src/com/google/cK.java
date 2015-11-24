// 
// Decompiled by Procyon v0.5.30
// 

package com.google;

import java.util.Locale;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.UUID;
import java.net.InetAddress;
import java.net.URI;
import java.net.URL;
import java.util.BitSet;

public final class cK
{
    public static final h9 A;
    public static final e_ B;
    public static final h9 C;
    public static final e_ D;
    public static final h9 E;
    public static final e_ F;
    public static final e_ G;
    public static final h9 H;
    public static final e_ I;
    public static final e_ J;
    public static final e_ K;
    public static final h9 L;
    public static final e_ M;
    public static final e_ N;
    public static final h9 O;
    public static final e_ P;
    public static final e_ Q;
    public static final h9 R;
    public static final h9 S;
    public static final e_ a;
    public static final e_ b;
    public static final e_ c;
    public static final h9 d;
    public static final h9 e;
    public static final e_ f;
    public static final h9 g;
    public static final e_ h;
    public static final h9 i;
    public static final h9 j;
    public static final e_ k;
    public static boolean l;
    public static final e_ m;
    public static final h9 n;
    public static final h9 o;
    public static final h9 p;
    public static final h9 q;
    public static final h9 r;
    public static final e_ s;
    public static final e_ t;
    public static final h9 u;
    public static final e_ v;
    public static final e_ w;
    public static final e_ x;
    public static final h9 y;
    public static final e_ z;
    
    static {
        m = new eN();
        q = a(Class.class, cK.m);
        Q = new eH();
        y = a(BitSet.class, cK.Q);
        G = new ek();
        N = new e5();
        n = a(Boolean.TYPE, Boolean.class, cK.G);
        s = new eY();
        d = a(Byte.TYPE, Byte.class, cK.s);
        h = new eA();
        g = a(Short.TYPE, Short.class, cK.h);
        D = new eo();
        E = a(Integer.TYPE, Integer.class, cK.D);
        J = new e3();
        b = new eG();
        f = new eh();
        M = new eD();
        j = a(Number.class, cK.M);
        a = new ev();
        L = a(Character.TYPE, Character.class, cK.a);
        w = new ej();
        t = new eu();
        k = new eU();
        u = a(String.class, cK.w);
        P = new eV();
        O = a(StringBuilder.class, cK.P);
        c = new eg();
        S = a(StringBuffer.class, cK.c);
        B = new e8();
        C = a(URL.class, cK.B);
        x = new eM();
        i = a(URI.class, cK.x);
        K = new eP();
        H = b(InetAddress.class, cK.K);
        v = new e9();
        R = a(UUID.class, cK.v);
        e = new dH();
        F = new eL();
        p = b(Calendar.class, GregorianCalendar.class, cK.F);
        I = new eb();
        o = a(Locale.class, cK.I);
        z = new eK();
        A = b(fL.class, cK.z);
        r = new Y();
    }
    
    public static h9 a(final Class clazz, final e_ e_) {
        return new j(clazz, e_);
    }
    
    public static h9 a(final Class clazz, final Class clazz2, final e_ e_) {
        return new bI(clazz, clazz2, e_);
    }
    
    public static h9 b(final Class clazz, final e_ e_) {
        return new ck(clazz, e_);
    }
    
    public static h9 b(final Class clazz, final Class clazz2, final e_ e_) {
        return new O(clazz, clazz2, e_);
    }
}
