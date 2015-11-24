// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import org.apache.thrift.protocol.d;
import org.apache.thrift.protocol.TProtocolException;
import java.util.Collections;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import java.util.EnumMap;
import java.util.BitSet;
import org.apache.thrift.protocol.a;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.TBase;
import java.io.Serializable;

public class ServerHeader implements Serializable, Cloneable, TBase
{
    public static final Map a;
    public static final ServerHeader$_Fields b;
    public static final ServerHeader$_Fields c;
    public static final ServerHeader$_Fields d;
    public static final ServerHeader$_Fields e;
    public static final ServerHeader$_Fields f;
    public static final ServerHeader$_Fields g;
    public static final ServerHeader$_Fields h;
    public static final ServerHeader$_Fields i;
    public static final ServerHeader$_Fields j;
    private static final e k;
    private static final a l;
    private static final a m;
    private static final a n;
    private static final a o;
    private static final a p;
    private static final a q;
    private static final a r;
    private static final a s;
    private static final a t;
    private BitSet __isset_bit_vector;
    private long clientTimestampMs;
    private short clientTimezoneOffsetMin;
    private String loggingLibVersion;
    private RequestInfo requestInfo;
    private String serverIpAddress;
    private String serverName;
    private long serverTimestampMs;
    private String serverVersion;
    private String transactionId;
    
    static {
        k = new e("ServerHeader");
        l = new a("clientTimestampMs", (byte)10, (short)1);
        m = new a("serverTimestampMs", (byte)10, (short)2);
        n = new a("serverIpAddress", (byte)11, (short)3);
        o = new a("serverName", (byte)11, (short)4);
        p = new a("serverVersion", (byte)11, (short)5);
        q = new a("loggingLibVersion", (byte)11, (short)6);
        r = new a("requestInfo", (byte)12, (short)7);
        s = new a("transactionId", (byte)11, (short)8);
        t = new a("clientTimezoneOffsetMin", (byte)6, (short)9);
        final EnumMap<ServerHeader$_Fields, FieldMetaData> enumMap = new EnumMap<ServerHeader$_Fields, FieldMetaData>(ServerHeader$_Fields.class);
        enumMap.put(ServerHeader$_Fields.a, new FieldMetaData("clientTimestampMs", (byte)1, new FieldValueMetaData((byte)10)));
        enumMap.put(ServerHeader$_Fields.b, new FieldMetaData("serverTimestampMs", (byte)1, new FieldValueMetaData((byte)10)));
        enumMap.put(ServerHeader$_Fields.c, new FieldMetaData("serverIpAddress", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(ServerHeader$_Fields.d, new FieldMetaData("serverName", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(ServerHeader$_Fields.e, new FieldMetaData("serverVersion", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(ServerHeader$_Fields.f, new FieldMetaData("loggingLibVersion", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(ServerHeader$_Fields.g, new FieldMetaData("requestInfo", (byte)2, new StructMetaData((byte)12, RequestInfo.class)));
        enumMap.put(ServerHeader$_Fields.h, new FieldMetaData("transactionId", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(ServerHeader$_Fields.i, new FieldMetaData("clientTimezoneOffsetMin", (byte)2, new FieldValueMetaData((byte)6)));
        FieldMetaData.a(ServerHeader.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = ServerHeader$_Fields.a;
        c = ServerHeader$_Fields.b;
        d = ServerHeader$_Fields.c;
        e = ServerHeader$_Fields.d;
        f = ServerHeader$_Fields.e;
        g = ServerHeader$_Fields.f;
        h = ServerHeader$_Fields.g;
        i = ServerHeader$_Fields.h;
        j = ServerHeader$_Fields.i;
    }
    
    public ServerHeader() {
        this.__isset_bit_vector = new BitSet(3);
    }
    
    public void a() {
        if (this.serverIpAddress == null) {
            throw new TProtocolException("Required field 'serverIpAddress' was not present! Struct: " + this.toString());
        }
        if (this.serverName == null) {
            throw new TProtocolException("Required field 'serverName' was not present! Struct: " + this.toString());
        }
        if (this.serverVersion == null) {
            throw new TProtocolException("Required field 'serverVersion' was not present! Struct: " + this.toString());
        }
        if (this.loggingLibVersion == null) {
            throw new TProtocolException("Required field 'loggingLibVersion' was not present! Struct: " + this.toString());
        }
        if (this.transactionId == null) {
            throw new TProtocolException("Required field 'transactionId' was not present! Struct: " + this.toString());
        }
    }
    
    @Override
    public void a(final d d) {
        this.a();
        d.a(ServerHeader.k);
        d.a(ServerHeader.l);
        d.a(this.clientTimestampMs);
        d.b();
        d.a(ServerHeader.m);
        d.a(this.serverTimestampMs);
        d.b();
        if (this.serverIpAddress != null) {
            d.a(ServerHeader.n);
            d.a(this.serverIpAddress);
            d.b();
        }
        if (this.serverName != null) {
            d.a(ServerHeader.o);
            d.a(this.serverName);
            d.b();
        }
        if (this.serverVersion != null) {
            d.a(ServerHeader.p);
            d.a(this.serverVersion);
            d.b();
        }
        if (this.loggingLibVersion != null) {
            d.a(ServerHeader.q);
            d.a(this.loggingLibVersion);
            d.b();
        }
        if (this.requestInfo != null && this.a(ServerHeader$_Fields.g)) {
            d.a(ServerHeader.r);
            this.requestInfo.a(d);
            d.b();
        }
        if (this.transactionId != null) {
            d.a(ServerHeader.s);
            d.a(this.transactionId);
            d.b();
        }
        if (this.a(ServerHeader$_Fields.i)) {
            d.a(ServerHeader.t);
            d.a(this.clientTimezoneOffsetMin);
            d.b();
        }
        d.c();
        d.a();
    }
    
    public boolean a(final ServerHeader$_Fields serverHeader$_Fields) {
        int value = 1;
        switch (com.twitter.common_header.thriftandroid.e.a[serverHeader$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                value = (this.__isset_bit_vector.get(0) ? 1 : 0);
                break;
            }
            case 2: {
                return this.__isset_bit_vector.get(value);
            }
            case 3: {
                if (this.serverIpAddress == null) {
                    return false;
                }
                break;
            }
            case 4: {
                if (this.serverName == null) {
                    return false;
                }
                break;
            }
            case 5: {
                if (this.serverVersion == null) {
                    return false;
                }
                break;
            }
            case 6: {
                if (this.loggingLibVersion == null) {
                    return false;
                }
                break;
            }
            case 7: {
                if (this.requestInfo == null) {
                    return false;
                }
                break;
            }
            case 8: {
                if (this.transactionId == null) {
                    return false;
                }
                break;
            }
            case 9: {
                return this.__isset_bit_vector.get(2);
            }
        }
        return value != 0;
    }
    
    public boolean a(final ServerHeader serverHeader) {
        if (serverHeader != null && this.clientTimestampMs == serverHeader.clientTimestampMs && this.serverTimestampMs == serverHeader.serverTimestampMs) {
            final boolean a = this.a(ServerHeader$_Fields.c);
            final boolean a2 = serverHeader.a(ServerHeader$_Fields.c);
            if ((!a && !a2) || (a && a2 && this.serverIpAddress.equals(serverHeader.serverIpAddress))) {
                final boolean a3 = this.a(ServerHeader$_Fields.d);
                final boolean a4 = serverHeader.a(ServerHeader$_Fields.d);
                if ((!a3 && !a4) || (a3 && a4 && this.serverName.equals(serverHeader.serverName))) {
                    final boolean a5 = this.a(ServerHeader$_Fields.e);
                    final boolean a6 = serverHeader.a(ServerHeader$_Fields.e);
                    if ((!a5 && !a6) || (a5 && a6 && this.serverVersion.equals(serverHeader.serverVersion))) {
                        final boolean a7 = this.a(ServerHeader$_Fields.f);
                        final boolean a8 = serverHeader.a(ServerHeader$_Fields.f);
                        if ((!a7 && !a8) || (a7 && a8 && this.loggingLibVersion.equals(serverHeader.loggingLibVersion))) {
                            final boolean a9 = this.a(ServerHeader$_Fields.g);
                            final boolean a10 = serverHeader.a(ServerHeader$_Fields.g);
                            if ((!a9 && !a10) || (a9 && a10 && this.requestInfo.a(serverHeader.requestInfo))) {
                                final boolean a11 = this.a(ServerHeader$_Fields.h);
                                final boolean a12 = serverHeader.a(ServerHeader$_Fields.h);
                                if ((!a11 && !a12) || (a11 && a12 && this.transactionId.equals(serverHeader.transactionId))) {
                                    final boolean a13 = this.a(ServerHeader$_Fields.i);
                                    final boolean a14 = serverHeader.a(ServerHeader$_Fields.i);
                                    if ((!a13 && !a14) || (a13 && a14 && this.clientTimezoneOffsetMin == serverHeader.clientTimezoneOffsetMin)) {
                                        return true;
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
    
    public int b(final ServerHeader serverHeader) {
        int n;
        if (!this.getClass().equals(serverHeader.getClass())) {
            n = this.getClass().getName().compareTo(serverHeader.getClass().getName());
        }
        else {
            n = Boolean.valueOf(this.a(ServerHeader$_Fields.a)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.a)));
            if (n == 0) {
                if (this.a(ServerHeader$_Fields.a)) {
                    n = org.apache.thrift.a.a(this.clientTimestampMs, serverHeader.clientTimestampMs);
                    if (n != 0) {
                        return n;
                    }
                }
                n = Boolean.valueOf(this.a(ServerHeader$_Fields.b)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.b)));
                if (n == 0) {
                    if (this.a(ServerHeader$_Fields.b)) {
                        n = org.apache.thrift.a.a(this.serverTimestampMs, serverHeader.serverTimestampMs);
                        if (n != 0) {
                            return n;
                        }
                    }
                    n = Boolean.valueOf(this.a(ServerHeader$_Fields.c)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.c)));
                    if (n == 0) {
                        if (this.a(ServerHeader$_Fields.c)) {
                            n = org.apache.thrift.a.a(this.serverIpAddress, serverHeader.serverIpAddress);
                            if (n != 0) {
                                return n;
                            }
                        }
                        n = Boolean.valueOf(this.a(ServerHeader$_Fields.d)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.d)));
                        if (n == 0) {
                            if (this.a(ServerHeader$_Fields.d)) {
                                n = org.apache.thrift.a.a(this.serverName, serverHeader.serverName);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            n = Boolean.valueOf(this.a(ServerHeader$_Fields.e)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.e)));
                            if (n == 0) {
                                if (this.a(ServerHeader$_Fields.e)) {
                                    n = org.apache.thrift.a.a(this.serverVersion, serverHeader.serverVersion);
                                    if (n != 0) {
                                        return n;
                                    }
                                }
                                n = Boolean.valueOf(this.a(ServerHeader$_Fields.f)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.f)));
                                if (n == 0) {
                                    if (this.a(ServerHeader$_Fields.f)) {
                                        n = org.apache.thrift.a.a(this.loggingLibVersion, serverHeader.loggingLibVersion);
                                        if (n != 0) {
                                            return n;
                                        }
                                    }
                                    n = Boolean.valueOf(this.a(ServerHeader$_Fields.g)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.g)));
                                    if (n == 0) {
                                        if (this.a(ServerHeader$_Fields.g)) {
                                            n = org.apache.thrift.a.a(this.requestInfo, serverHeader.requestInfo);
                                            if (n != 0) {
                                                return n;
                                            }
                                        }
                                        n = Boolean.valueOf(this.a(ServerHeader$_Fields.h)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.h)));
                                        if (n == 0) {
                                            if (this.a(ServerHeader$_Fields.h)) {
                                                n = org.apache.thrift.a.a(this.transactionId, serverHeader.transactionId);
                                                if (n != 0) {
                                                    return n;
                                                }
                                            }
                                            n = Boolean.valueOf(this.a(ServerHeader$_Fields.i)).compareTo(Boolean.valueOf(serverHeader.a(ServerHeader$_Fields.i)));
                                            if (n == 0) {
                                                if (this.a(ServerHeader$_Fields.i)) {
                                                    n = org.apache.thrift.a.a(this.clientTimezoneOffsetMin, serverHeader.clientTimezoneOffsetMin);
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
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof ServerHeader && this.a((ServerHeader)o);
    }
    
    @Override
    public int hashCode() {
        int n = 31 * (31 + Long.valueOf(this.clientTimestampMs).hashCode()) + Long.valueOf(this.serverTimestampMs).hashCode();
        if (this.a(ServerHeader$_Fields.c)) {
            n = n * 31 + this.serverIpAddress.hashCode();
        }
        if (this.a(ServerHeader$_Fields.d)) {
            n = n * 31 + this.serverName.hashCode();
        }
        if (this.a(ServerHeader$_Fields.e)) {
            n = n * 31 + this.serverVersion.hashCode();
        }
        if (this.a(ServerHeader$_Fields.f)) {
            n = n * 31 + this.loggingLibVersion.hashCode();
        }
        if (this.a(ServerHeader$_Fields.g)) {
            n = n * 31 + this.requestInfo.hashCode();
        }
        if (this.a(ServerHeader$_Fields.h)) {
            n = n * 31 + this.transactionId.hashCode();
        }
        if (this.a(ServerHeader$_Fields.i)) {
            n = n * 31 + Short.valueOf(this.clientTimezoneOffsetMin).hashCode();
        }
        return n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServerHeader(");
        sb.append("clientTimestampMs:");
        sb.append(this.clientTimestampMs);
        sb.append(", ");
        sb.append("serverTimestampMs:");
        sb.append(this.serverTimestampMs);
        sb.append(", ");
        sb.append("serverIpAddress:");
        if (this.serverIpAddress == null) {
            sb.append("null");
        }
        else {
            sb.append(this.serverIpAddress);
        }
        sb.append(", ");
        sb.append("serverName:");
        if (this.serverName == null) {
            sb.append("null");
        }
        else {
            sb.append(this.serverName);
        }
        sb.append(", ");
        sb.append("serverVersion:");
        if (this.serverVersion == null) {
            sb.append("null");
        }
        else {
            sb.append(this.serverVersion);
        }
        sb.append(", ");
        sb.append("loggingLibVersion:");
        if (this.loggingLibVersion == null) {
            sb.append("null");
        }
        else {
            sb.append(this.loggingLibVersion);
        }
        if (this.a(ServerHeader$_Fields.g)) {
            sb.append(", ");
            sb.append("requestInfo:");
            if (this.requestInfo == null) {
                sb.append("null");
            }
            else {
                sb.append(this.requestInfo);
            }
        }
        sb.append(", ");
        sb.append("transactionId:");
        if (this.transactionId == null) {
            sb.append("null");
        }
        else {
            sb.append(this.transactionId);
        }
        if (this.a(ServerHeader$_Fields.i)) {
            sb.append(", ");
            sb.append("clientTimezoneOffsetMin:");
            sb.append(this.clientTimezoneOffsetMin);
        }
        sb.append(")");
        return sb.toString();
    }
}
