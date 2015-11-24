// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.logbase.thriftandroid;

import org.apache.thrift.protocol.d;
import java.util.Collections;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import java.util.EnumMap;
import java.util.BitSet;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.protocol.a;
import org.apache.thrift.TBase;
import java.io.Serializable;

public class LogBase implements Serializable, Cloneable, TBase
{
    private static final a A;
    private static final a B;
    private static final a C;
    private static final a D;
    private static final a E;
    private static final a F;
    private static final a G;
    private static final a H;
    private static final a I;
    private static final a J;
    public static final Map a;
    public static final LogBase$_Fields b;
    public static final LogBase$_Fields c;
    public static final LogBase$_Fields d;
    public static final LogBase$_Fields e;
    public static final LogBase$_Fields f;
    public static final LogBase$_Fields g;
    public static final LogBase$_Fields h;
    public static final LogBase$_Fields i;
    public static final LogBase$_Fields j;
    public static final LogBase$_Fields k;
    public static final LogBase$_Fields l;
    public static final LogBase$_Fields m;
    public static final LogBase$_Fields n;
    public static final LogBase$_Fields o;
    public static final LogBase$_Fields p;
    public static final LogBase$_Fields q;
    public static final LogBase$_Fields r;
    private static final e s;
    private static final a t;
    private static final a u;
    private static final a v;
    private static final a w;
    private static final a x;
    private static final a y;
    private static final a z;
    private BitSet __isset_bit_vector;
    private long client_app_id;
    private String country;
    private String device_id;
    private boolean do_not_track;
    private long guest_id;
    private String ip_address;
    private boolean is_ssl;
    private String language;
    private String page;
    private String pid;
    private String referer;
    private long session_created_at;
    private String session_id;
    private long timestamp;
    private String transaction_id;
    private String user_agent;
    private long user_id;
    
    static {
        s = new e("LogBase");
        t = new a("transaction_id", (byte)11, (short)1);
        u = new a("ip_address", (byte)11, (short)2);
        v = new a("user_id", (byte)10, (short)3);
        w = new a("guest_id", (byte)10, (short)4);
        x = new a("timestamp", (byte)10, (short)5);
        y = new a("user_agent", (byte)11, (short)6);
        z = new a("referer", (byte)11, (short)7);
        A = new a("language", (byte)11, (short)8);
        B = new a("page", (byte)11, (short)9);
        C = new a("session_id", (byte)11, (short)10);
        D = new a("session_created_at", (byte)10, (short)11);
        E = new a("client_app_id", (byte)10, (short)12);
        F = new a("device_id", (byte)11, (short)13);
        G = new a("is_ssl", (byte)2, (short)14);
        H = new a("country", (byte)11, (short)15);
        I = new a("pid", (byte)11, (short)16);
        J = new a("do_not_track", (byte)2, (short)17);
        final EnumMap<LogBase$_Fields, FieldMetaData> enumMap = new EnumMap<LogBase$_Fields, FieldMetaData>(LogBase$_Fields.class);
        enumMap.put(LogBase$_Fields.a, new FieldMetaData("transaction_id", (byte)3, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.b, new FieldMetaData("ip_address", (byte)3, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.c, new FieldMetaData("user_id", (byte)2, new FieldValueMetaData((byte)10)));
        enumMap.put(LogBase$_Fields.d, new FieldMetaData("guest_id", (byte)2, new FieldValueMetaData((byte)10)));
        enumMap.put(LogBase$_Fields.e, new FieldMetaData("timestamp", (byte)3, new FieldValueMetaData((byte)10)));
        enumMap.put(LogBase$_Fields.f, new FieldMetaData("user_agent", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.g, new FieldMetaData("referer", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.h, new FieldMetaData("language", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.i, new FieldMetaData("page", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.j, new FieldMetaData("session_id", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.k, new FieldMetaData("session_created_at", (byte)2, new FieldValueMetaData((byte)10)));
        enumMap.put(LogBase$_Fields.l, new FieldMetaData("client_app_id", (byte)2, new FieldValueMetaData((byte)10)));
        enumMap.put(LogBase$_Fields.m, new FieldMetaData("device_id", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.n, new FieldMetaData("is_ssl", (byte)2, new FieldValueMetaData((byte)2)));
        enumMap.put(LogBase$_Fields.o, new FieldMetaData("country", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.p, new FieldMetaData("pid", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(LogBase$_Fields.q, new FieldMetaData("do_not_track", (byte)2, new FieldValueMetaData((byte)2)));
        FieldMetaData.a(LogBase.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = LogBase$_Fields.a;
        c = LogBase$_Fields.b;
        d = LogBase$_Fields.c;
        e = LogBase$_Fields.d;
        f = LogBase$_Fields.e;
        g = LogBase$_Fields.f;
        h = LogBase$_Fields.g;
        i = LogBase$_Fields.h;
        j = LogBase$_Fields.i;
        k = LogBase$_Fields.j;
        l = LogBase$_Fields.k;
        m = LogBase$_Fields.l;
        n = LogBase$_Fields.m;
        o = LogBase$_Fields.n;
        p = LogBase$_Fields.o;
        q = LogBase$_Fields.p;
        r = LogBase$_Fields.q;
    }
    
    public LogBase() {
        this.__isset_bit_vector = new BitSet(7);
    }
    
    public void a() {
    }
    
    @Override
    public void a(final d d) {
        this.a();
        d.a(LogBase.s);
        if (this.transaction_id != null) {
            d.a(LogBase.t);
            d.a(this.transaction_id);
            d.b();
        }
        if (this.ip_address != null) {
            d.a(LogBase.u);
            d.a(this.ip_address);
            d.b();
        }
        if (this.a(LogBase$_Fields.c)) {
            d.a(LogBase.v);
            d.a(this.user_id);
            d.b();
        }
        if (this.a(LogBase$_Fields.d)) {
            d.a(LogBase.w);
            d.a(this.guest_id);
            d.b();
        }
        d.a(LogBase.x);
        d.a(this.timestamp);
        d.b();
        if (this.user_agent != null && this.a(LogBase$_Fields.f)) {
            d.a(LogBase.y);
            d.a(this.user_agent);
            d.b();
        }
        if (this.referer != null && this.a(LogBase$_Fields.g)) {
            d.a(LogBase.z);
            d.a(this.referer);
            d.b();
        }
        if (this.language != null && this.a(LogBase$_Fields.h)) {
            d.a(LogBase.A);
            d.a(this.language);
            d.b();
        }
        if (this.page != null && this.a(LogBase$_Fields.i)) {
            d.a(LogBase.B);
            d.a(this.page);
            d.b();
        }
        if (this.session_id != null && this.a(LogBase$_Fields.j)) {
            d.a(LogBase.C);
            d.a(this.session_id);
            d.b();
        }
        if (this.a(LogBase$_Fields.k)) {
            d.a(LogBase.D);
            d.a(this.session_created_at);
            d.b();
        }
        if (this.a(LogBase$_Fields.l)) {
            d.a(LogBase.E);
            d.a(this.client_app_id);
            d.b();
        }
        if (this.device_id != null && this.a(LogBase$_Fields.m)) {
            d.a(LogBase.F);
            d.a(this.device_id);
            d.b();
        }
        if (this.a(LogBase$_Fields.n)) {
            d.a(LogBase.G);
            d.a(this.is_ssl);
            d.b();
        }
        if (this.country != null && this.a(LogBase$_Fields.o)) {
            d.a(LogBase.H);
            d.a(this.country);
            d.b();
        }
        if (this.pid != null && this.a(LogBase$_Fields.p)) {
            d.a(LogBase.I);
            d.a(this.pid);
            d.b();
        }
        if (this.a(LogBase$_Fields.q)) {
            d.a(LogBase.J);
            d.a(this.do_not_track);
            d.b();
        }
        d.c();
        d.a();
    }
    
    public boolean a(final LogBase$_Fields logBase$_Fields) {
        switch (com.twitter.logbase.thriftandroid.a.a[logBase$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                if (this.transaction_id != null) {
                    break;
                }
                return false;
            }
            case 2: {
                if (this.ip_address == null) {
                    return false;
                }
                break;
            }
            case 3: {
                return this.__isset_bit_vector.get(0);
            }
            case 4: {
                return this.__isset_bit_vector.get(1);
            }
            case 5: {
                return this.__isset_bit_vector.get(2);
            }
            case 6: {
                if (this.user_agent == null) {
                    return false;
                }
                break;
            }
            case 7: {
                if (this.referer == null) {
                    return false;
                }
                break;
            }
            case 8: {
                if (this.language == null) {
                    return false;
                }
                break;
            }
            case 9: {
                if (this.page == null) {
                    return false;
                }
                break;
            }
            case 10: {
                if (this.session_id == null) {
                    return false;
                }
                break;
            }
            case 11: {
                return this.__isset_bit_vector.get(3);
            }
            case 12: {
                return this.__isset_bit_vector.get(4);
            }
            case 13: {
                if (this.device_id == null) {
                    return false;
                }
                break;
            }
            case 14: {
                return this.__isset_bit_vector.get(5);
            }
            case 15: {
                if (this.country == null) {
                    return false;
                }
                break;
            }
            case 16: {
                if (this.pid == null) {
                    return false;
                }
                break;
            }
            case 17: {
                return this.__isset_bit_vector.get(6);
            }
        }
        return true;
    }
    
    public boolean a(final LogBase logBase) {
        if (logBase != null) {
            final boolean a = this.a(LogBase$_Fields.a);
            final boolean a2 = logBase.a(LogBase$_Fields.a);
            if ((!a && !a2) || (a && a2 && this.transaction_id.equals(logBase.transaction_id))) {
                final boolean a3 = this.a(LogBase$_Fields.b);
                final boolean a4 = logBase.a(LogBase$_Fields.b);
                if ((!a3 && !a4) || (a3 && a4 && this.ip_address.equals(logBase.ip_address))) {
                    final boolean a5 = this.a(LogBase$_Fields.c);
                    final boolean a6 = logBase.a(LogBase$_Fields.c);
                    if ((!a5 && !a6) || (a5 && a6 && this.user_id == logBase.user_id)) {
                        final boolean a7 = this.a(LogBase$_Fields.d);
                        final boolean a8 = logBase.a(LogBase$_Fields.d);
                        if (((!a7 && !a8) || (a7 && a8 && this.guest_id == logBase.guest_id)) && this.timestamp == logBase.timestamp) {
                            final boolean a9 = this.a(LogBase$_Fields.f);
                            final boolean a10 = logBase.a(LogBase$_Fields.f);
                            if ((!a9 && !a10) || (a9 && a10 && this.user_agent.equals(logBase.user_agent))) {
                                final boolean a11 = this.a(LogBase$_Fields.g);
                                final boolean a12 = logBase.a(LogBase$_Fields.g);
                                if ((!a11 && !a12) || (a11 && a12 && this.referer.equals(logBase.referer))) {
                                    final boolean a13 = this.a(LogBase$_Fields.h);
                                    final boolean a14 = logBase.a(LogBase$_Fields.h);
                                    if ((!a13 && !a14) || (a13 && a14 && this.language.equals(logBase.language))) {
                                        final boolean a15 = this.a(LogBase$_Fields.i);
                                        final boolean a16 = logBase.a(LogBase$_Fields.i);
                                        if ((!a15 && !a16) || (a15 && a16 && this.page.equals(logBase.page))) {
                                            final boolean a17 = this.a(LogBase$_Fields.j);
                                            final boolean a18 = logBase.a(LogBase$_Fields.j);
                                            if ((!a17 && !a18) || (a17 && a18 && this.session_id.equals(logBase.session_id))) {
                                                final boolean a19 = this.a(LogBase$_Fields.k);
                                                final boolean a20 = logBase.a(LogBase$_Fields.k);
                                                if ((!a19 && !a20) || (a19 && a20 && this.session_created_at == logBase.session_created_at)) {
                                                    final boolean a21 = this.a(LogBase$_Fields.l);
                                                    final boolean a22 = logBase.a(LogBase$_Fields.l);
                                                    if ((!a21 && !a22) || (a21 && a22 && this.client_app_id == logBase.client_app_id)) {
                                                        final boolean a23 = this.a(LogBase$_Fields.m);
                                                        final boolean a24 = logBase.a(LogBase$_Fields.m);
                                                        if ((!a23 && !a24) || (a23 && a24 && this.device_id.equals(logBase.device_id))) {
                                                            final boolean a25 = this.a(LogBase$_Fields.n);
                                                            final boolean a26 = logBase.a(LogBase$_Fields.n);
                                                            if ((!a25 && !a26) || (a25 && a26 && this.is_ssl == logBase.is_ssl)) {
                                                                final boolean a27 = this.a(LogBase$_Fields.o);
                                                                final boolean a28 = logBase.a(LogBase$_Fields.o);
                                                                if ((!a27 && !a28) || (a27 && a28 && this.country.equals(logBase.country))) {
                                                                    final boolean a29 = this.a(LogBase$_Fields.p);
                                                                    final boolean a30 = logBase.a(LogBase$_Fields.p);
                                                                    if ((!a29 && !a30) || (a29 && a30 && this.pid.equals(logBase.pid))) {
                                                                        final boolean a31 = this.a(LogBase$_Fields.q);
                                                                        final boolean a32 = logBase.a(LogBase$_Fields.q);
                                                                        if ((!a31 && !a32) || (a31 && a32 && this.do_not_track == logBase.do_not_track)) {
                                                                            return true;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public int b(final LogBase logBase) {
        int n;
        if (!this.getClass().equals(logBase.getClass())) {
            n = this.getClass().getName().compareTo(logBase.getClass().getName());
        }
        else {
            n = Boolean.valueOf(this.a(LogBase$_Fields.a)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.a)));
            if (n == 0) {
                if (this.a(LogBase$_Fields.a)) {
                    n = org.apache.thrift.a.a(this.transaction_id, logBase.transaction_id);
                    if (n != 0) {
                        return n;
                    }
                }
                n = Boolean.valueOf(this.a(LogBase$_Fields.b)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.b)));
                if (n == 0) {
                    if (this.a(LogBase$_Fields.b)) {
                        n = org.apache.thrift.a.a(this.ip_address, logBase.ip_address);
                        if (n != 0) {
                            return n;
                        }
                    }
                    n = Boolean.valueOf(this.a(LogBase$_Fields.c)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.c)));
                    if (n == 0) {
                        if (this.a(LogBase$_Fields.c)) {
                            n = org.apache.thrift.a.a(this.user_id, logBase.user_id);
                            if (n != 0) {
                                return n;
                            }
                        }
                        n = Boolean.valueOf(this.a(LogBase$_Fields.d)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.d)));
                        if (n == 0) {
                            if (this.a(LogBase$_Fields.d)) {
                                n = org.apache.thrift.a.a(this.guest_id, logBase.guest_id);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            n = Boolean.valueOf(this.a(LogBase$_Fields.e)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.e)));
                            if (n == 0) {
                                if (this.a(LogBase$_Fields.e)) {
                                    n = org.apache.thrift.a.a(this.timestamp, logBase.timestamp);
                                    if (n != 0) {
                                        return n;
                                    }
                                }
                                n = Boolean.valueOf(this.a(LogBase$_Fields.f)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.f)));
                                if (n == 0) {
                                    if (this.a(LogBase$_Fields.f)) {
                                        n = org.apache.thrift.a.a(this.user_agent, logBase.user_agent);
                                        if (n != 0) {
                                            return n;
                                        }
                                    }
                                    n = Boolean.valueOf(this.a(LogBase$_Fields.g)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.g)));
                                    if (n == 0) {
                                        if (this.a(LogBase$_Fields.g)) {
                                            n = org.apache.thrift.a.a(this.referer, logBase.referer);
                                            if (n != 0) {
                                                return n;
                                            }
                                        }
                                        n = Boolean.valueOf(this.a(LogBase$_Fields.h)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.h)));
                                        if (n == 0) {
                                            if (this.a(LogBase$_Fields.h)) {
                                                n = org.apache.thrift.a.a(this.language, logBase.language);
                                                if (n != 0) {
                                                    return n;
                                                }
                                            }
                                            n = Boolean.valueOf(this.a(LogBase$_Fields.i)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.i)));
                                            if (n == 0) {
                                                if (this.a(LogBase$_Fields.i)) {
                                                    n = org.apache.thrift.a.a(this.page, logBase.page);
                                                    if (n != 0) {
                                                        return n;
                                                    }
                                                }
                                                n = Boolean.valueOf(this.a(LogBase$_Fields.j)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.j)));
                                                if (n == 0) {
                                                    if (this.a(LogBase$_Fields.j)) {
                                                        n = org.apache.thrift.a.a(this.session_id, logBase.session_id);
                                                        if (n != 0) {
                                                            return n;
                                                        }
                                                    }
                                                    n = Boolean.valueOf(this.a(LogBase$_Fields.k)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.k)));
                                                    if (n == 0) {
                                                        if (this.a(LogBase$_Fields.k)) {
                                                            n = org.apache.thrift.a.a(this.session_created_at, logBase.session_created_at);
                                                            if (n != 0) {
                                                                return n;
                                                            }
                                                        }
                                                        n = Boolean.valueOf(this.a(LogBase$_Fields.l)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.l)));
                                                        if (n == 0) {
                                                            if (this.a(LogBase$_Fields.l)) {
                                                                n = org.apache.thrift.a.a(this.client_app_id, logBase.client_app_id);
                                                                if (n != 0) {
                                                                    return n;
                                                                }
                                                            }
                                                            n = Boolean.valueOf(this.a(LogBase$_Fields.m)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.m)));
                                                            if (n == 0) {
                                                                if (this.a(LogBase$_Fields.m)) {
                                                                    n = org.apache.thrift.a.a(this.device_id, logBase.device_id);
                                                                    if (n != 0) {
                                                                        return n;
                                                                    }
                                                                }
                                                                n = Boolean.valueOf(this.a(LogBase$_Fields.n)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.n)));
                                                                if (n == 0) {
                                                                    if (this.a(LogBase$_Fields.n)) {
                                                                        n = org.apache.thrift.a.a(this.is_ssl, logBase.is_ssl);
                                                                        if (n != 0) {
                                                                            return n;
                                                                        }
                                                                    }
                                                                    n = Boolean.valueOf(this.a(LogBase$_Fields.o)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.o)));
                                                                    if (n == 0) {
                                                                        if (this.a(LogBase$_Fields.o)) {
                                                                            n = org.apache.thrift.a.a(this.country, logBase.country);
                                                                            if (n != 0) {
                                                                                return n;
                                                                            }
                                                                        }
                                                                        n = Boolean.valueOf(this.a(LogBase$_Fields.p)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.p)));
                                                                        if (n == 0) {
                                                                            if (this.a(LogBase$_Fields.p)) {
                                                                                n = org.apache.thrift.a.a(this.pid, logBase.pid);
                                                                                if (n != 0) {
                                                                                    return n;
                                                                                }
                                                                            }
                                                                            n = Boolean.valueOf(this.a(LogBase$_Fields.q)).compareTo(Boolean.valueOf(logBase.a(LogBase$_Fields.q)));
                                                                            if (n == 0) {
                                                                                if (this.a(LogBase$_Fields.q)) {
                                                                                    n = org.apache.thrift.a.a(this.do_not_track, logBase.do_not_track);
                                                                                    if (n != 0) {
                                                                                        return n;
                                                                                    }
                                                                                }
                                                                                return 0;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof LogBase && this.a((LogBase)o);
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        if (this.a(LogBase$_Fields.a)) {
            n = 31 + this.transaction_id.hashCode();
        }
        if (this.a(LogBase$_Fields.b)) {
            n = n * 31 + this.ip_address.hashCode();
        }
        if (this.a(LogBase$_Fields.c)) {
            n = n * 31 + Long.valueOf(this.user_id).hashCode();
        }
        if (this.a(LogBase$_Fields.d)) {
            n = n * 31 + Long.valueOf(this.guest_id).hashCode();
        }
        int n2 = n * 31 + Long.valueOf(this.timestamp).hashCode();
        if (this.a(LogBase$_Fields.f)) {
            n2 = n2 * 31 + this.user_agent.hashCode();
        }
        if (this.a(LogBase$_Fields.g)) {
            n2 = n2 * 31 + this.referer.hashCode();
        }
        if (this.a(LogBase$_Fields.h)) {
            n2 = n2 * 31 + this.language.hashCode();
        }
        if (this.a(LogBase$_Fields.i)) {
            n2 = n2 * 31 + this.page.hashCode();
        }
        if (this.a(LogBase$_Fields.j)) {
            n2 = n2 * 31 + this.session_id.hashCode();
        }
        if (this.a(LogBase$_Fields.k)) {
            n2 = n2 * 31 + Long.valueOf(this.session_created_at).hashCode();
        }
        if (this.a(LogBase$_Fields.l)) {
            n2 = n2 * 31 + Long.valueOf(this.client_app_id).hashCode();
        }
        if (this.a(LogBase$_Fields.m)) {
            n2 = n2 * 31 + this.device_id.hashCode();
        }
        if (this.a(LogBase$_Fields.n)) {
            n2 = n2 * 31 + Boolean.valueOf(this.is_ssl).hashCode();
        }
        if (this.a(LogBase$_Fields.o)) {
            n2 = n2 * 31 + this.country.hashCode();
        }
        if (this.a(LogBase$_Fields.p)) {
            n2 = n2 * 31 + this.pid.hashCode();
        }
        if (this.a(LogBase$_Fields.q)) {
            n2 = n2 * 31 + Boolean.valueOf(this.do_not_track).hashCode();
        }
        return n2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LogBase(");
        sb.append("transaction_id:");
        if (this.transaction_id == null) {
            sb.append("null");
        }
        else {
            sb.append(this.transaction_id);
        }
        sb.append(", ");
        sb.append("ip_address:");
        if (this.ip_address == null) {
            sb.append("null");
        }
        else {
            sb.append(this.ip_address);
        }
        if (this.a(LogBase$_Fields.c)) {
            sb.append(", ");
            sb.append("user_id:");
            sb.append(this.user_id);
        }
        if (this.a(LogBase$_Fields.d)) {
            sb.append(", ");
            sb.append("guest_id:");
            sb.append(this.guest_id);
        }
        sb.append(", ");
        sb.append("timestamp:");
        sb.append(this.timestamp);
        if (this.a(LogBase$_Fields.f)) {
            sb.append(", ");
            sb.append("user_agent:");
            if (this.user_agent == null) {
                sb.append("null");
            }
            else {
                sb.append(this.user_agent);
            }
        }
        if (this.a(LogBase$_Fields.g)) {
            sb.append(", ");
            sb.append("referer:");
            if (this.referer == null) {
                sb.append("null");
            }
            else {
                sb.append(this.referer);
            }
        }
        if (this.a(LogBase$_Fields.h)) {
            sb.append(", ");
            sb.append("language:");
            if (this.language == null) {
                sb.append("null");
            }
            else {
                sb.append(this.language);
            }
        }
        if (this.a(LogBase$_Fields.i)) {
            sb.append(", ");
            sb.append("page:");
            if (this.page == null) {
                sb.append("null");
            }
            else {
                sb.append(this.page);
            }
        }
        if (this.a(LogBase$_Fields.j)) {
            sb.append(", ");
            sb.append("session_id:");
            if (this.session_id == null) {
                sb.append("null");
            }
            else {
                sb.append(this.session_id);
            }
        }
        if (this.a(LogBase$_Fields.k)) {
            sb.append(", ");
            sb.append("session_created_at:");
            sb.append(this.session_created_at);
        }
        if (this.a(LogBase$_Fields.l)) {
            sb.append(", ");
            sb.append("client_app_id:");
            sb.append(this.client_app_id);
        }
        if (this.a(LogBase$_Fields.m)) {
            sb.append(", ");
            sb.append("device_id:");
            if (this.device_id == null) {
                sb.append("null");
            }
            else {
                sb.append(this.device_id);
            }
        }
        if (this.a(LogBase$_Fields.n)) {
            sb.append(", ");
            sb.append("is_ssl:");
            sb.append(this.is_ssl);
        }
        if (this.a(LogBase$_Fields.o)) {
            sb.append(", ");
            sb.append("country:");
            if (this.country == null) {
                sb.append("null");
            }
            else {
                sb.append(this.country);
            }
        }
        if (this.a(LogBase$_Fields.p)) {
            sb.append(", ");
            sb.append("pid:");
            if (this.pid == null) {
                sb.append("null");
            }
            else {
                sb.append(this.pid);
            }
        }
        if (this.a(LogBase$_Fields.q)) {
            sb.append(", ");
            sb.append("do_not_track:");
            sb.append(this.do_not_track);
        }
        sb.append(")");
        return sb.toString();
    }
}
