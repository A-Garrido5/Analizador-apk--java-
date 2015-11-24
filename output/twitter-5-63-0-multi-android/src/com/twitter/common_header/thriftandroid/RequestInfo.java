// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import java.util.Iterator;
import org.apache.thrift.protocol.c;
import org.apache.thrift.protocol.d;
import org.apache.thrift.protocol.TProtocolException;
import java.util.Collections;
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.EnumMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import java.util.EnumMap;
import java.util.BitSet;
import org.apache.thrift.protocol.a;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.TBase;
import java.io.Serializable;

public class RequestInfo implements Serializable, Cloneable, TBase
{
    public static final Map a;
    public static final RequestInfo$_Fields b;
    public static final RequestInfo$_Fields c;
    public static final RequestInfo$_Fields d;
    public static final RequestInfo$_Fields e;
    public static final RequestInfo$_Fields f;
    public static final RequestInfo$_Fields g;
    private static final e h;
    private static final a i;
    private static final a j;
    private static final a k;
    private static final a l;
    private static final a m;
    private static final a n;
    private BitSet __isset_bit_vector;
    private String clientIpAddress;
    private String countryCode;
    private Map ids;
    private String languageCode;
    private long oauthAppId;
    private String userAgent;
    
    static {
        h = new e("RequestInfo");
        i = new a("ids", (byte)13, (short)1);
        j = new a("clientIpAddress", (byte)11, (short)2);
        k = new a("oauthAppId", (byte)10, (short)4);
        l = new a("userAgent", (byte)11, (short)5);
        m = new a("languageCode", (byte)11, (short)6);
        n = new a("countryCode", (byte)11, (short)7);
        final EnumMap<RequestInfo$_Fields, FieldMetaData> enumMap = new EnumMap<RequestInfo$_Fields, FieldMetaData>(RequestInfo$_Fields.class);
        enumMap.put(RequestInfo$_Fields.a, new FieldMetaData("ids", (byte)1, new MapMetaData((byte)13, new EnumMetaData((byte)16, IdType.class), new FieldValueMetaData((byte)11))));
        enumMap.put(RequestInfo$_Fields.b, new FieldMetaData("clientIpAddress", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(RequestInfo$_Fields.c, new FieldMetaData("oauthAppId", (byte)2, new FieldValueMetaData((byte)10)));
        enumMap.put(RequestInfo$_Fields.d, new FieldMetaData("userAgent", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(RequestInfo$_Fields.e, new FieldMetaData("languageCode", (byte)2, new FieldValueMetaData((byte)11)));
        enumMap.put(RequestInfo$_Fields.f, new FieldMetaData("countryCode", (byte)2, new FieldValueMetaData((byte)11)));
        FieldMetaData.a(RequestInfo.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = RequestInfo$_Fields.a;
        c = RequestInfo$_Fields.b;
        d = RequestInfo$_Fields.c;
        e = RequestInfo$_Fields.d;
        f = RequestInfo$_Fields.e;
        g = RequestInfo$_Fields.f;
    }
    
    public RequestInfo() {
        this.__isset_bit_vector = new BitSet(1);
    }
    
    public void a() {
        if (this.ids == null) {
            throw new TProtocolException("Required field 'ids' was not present! Struct: " + this.toString());
        }
        if (this.clientIpAddress == null) {
            throw new TProtocolException("Required field 'clientIpAddress' was not present! Struct: " + this.toString());
        }
        if (this.userAgent == null) {
            throw new TProtocolException("Required field 'userAgent' was not present! Struct: " + this.toString());
        }
    }
    
    @Override
    public void a(final d d) {
        this.a();
        d.a(RequestInfo.h);
        if (this.ids != null) {
            d.a(RequestInfo.i);
            d.a(new c((byte)8, (byte)11, this.ids.size()));
            for (final Map.Entry<IdType, V> entry : this.ids.entrySet()) {
                d.a(entry.getKey().a());
                d.a((String)entry.getValue());
            }
            d.d();
            d.b();
        }
        if (this.clientIpAddress != null) {
            d.a(RequestInfo.j);
            d.a(this.clientIpAddress);
            d.b();
        }
        if (this.a(RequestInfo$_Fields.c)) {
            d.a(RequestInfo.k);
            d.a(this.oauthAppId);
            d.b();
        }
        if (this.userAgent != null) {
            d.a(RequestInfo.l);
            d.a(this.userAgent);
            d.b();
        }
        if (this.languageCode != null && this.a(RequestInfo$_Fields.e)) {
            d.a(RequestInfo.m);
            d.a(this.languageCode);
            d.b();
        }
        if (this.countryCode != null && this.a(RequestInfo$_Fields.f)) {
            d.a(RequestInfo.n);
            d.a(this.countryCode);
            d.b();
        }
        d.c();
        d.a();
    }
    
    public boolean a(final RequestInfo$_Fields requestInfo$_Fields) {
        switch (com.twitter.common_header.thriftandroid.d.a[requestInfo$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                if (this.ids != null) {
                    break;
                }
                return false;
            }
            case 2: {
                if (this.clientIpAddress == null) {
                    return false;
                }
                break;
            }
            case 3: {
                return this.__isset_bit_vector.get(0);
            }
            case 4: {
                if (this.userAgent == null) {
                    return false;
                }
                break;
            }
            case 5: {
                if (this.languageCode == null) {
                    return false;
                }
                break;
            }
            case 6: {
                if (this.countryCode == null) {
                    return false;
                }
                break;
            }
        }
        return true;
    }
    
    public boolean a(final RequestInfo requestInfo) {
        if (requestInfo != null) {
            final boolean a = this.a(RequestInfo$_Fields.a);
            final boolean a2 = requestInfo.a(RequestInfo$_Fields.a);
            if ((!a && !a2) || (a && a2 && this.ids.equals(requestInfo.ids))) {
                final boolean a3 = this.a(RequestInfo$_Fields.b);
                final boolean a4 = requestInfo.a(RequestInfo$_Fields.b);
                if ((!a3 && !a4) || (a3 && a4 && this.clientIpAddress.equals(requestInfo.clientIpAddress))) {
                    final boolean a5 = this.a(RequestInfo$_Fields.c);
                    final boolean a6 = requestInfo.a(RequestInfo$_Fields.c);
                    if ((!a5 && !a6) || (a5 && a6 && this.oauthAppId == requestInfo.oauthAppId)) {
                        final boolean a7 = this.a(RequestInfo$_Fields.d);
                        final boolean a8 = requestInfo.a(RequestInfo$_Fields.d);
                        if ((!a7 && !a8) || (a7 && a8 && this.userAgent.equals(requestInfo.userAgent))) {
                            final boolean a9 = this.a(RequestInfo$_Fields.e);
                            final boolean a10 = requestInfo.a(RequestInfo$_Fields.e);
                            if ((!a9 && !a10) || (a9 && a10 && this.languageCode.equals(requestInfo.languageCode))) {
                                final boolean a11 = this.a(RequestInfo$_Fields.f);
                                final boolean a12 = requestInfo.a(RequestInfo$_Fields.f);
                                if ((!a11 && !a12) || (a11 && a12 && this.countryCode.equals(requestInfo.countryCode))) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public int b(final RequestInfo requestInfo) {
        int n;
        if (!this.getClass().equals(requestInfo.getClass())) {
            n = this.getClass().getName().compareTo(requestInfo.getClass().getName());
        }
        else {
            n = Boolean.valueOf(this.a(RequestInfo$_Fields.a)).compareTo(Boolean.valueOf(requestInfo.a(RequestInfo$_Fields.a)));
            if (n == 0) {
                if (this.a(RequestInfo$_Fields.a)) {
                    n = org.apache.thrift.a.a(this.ids, requestInfo.ids);
                    if (n != 0) {
                        return n;
                    }
                }
                n = Boolean.valueOf(this.a(RequestInfo$_Fields.b)).compareTo(Boolean.valueOf(requestInfo.a(RequestInfo$_Fields.b)));
                if (n == 0) {
                    if (this.a(RequestInfo$_Fields.b)) {
                        n = org.apache.thrift.a.a(this.clientIpAddress, requestInfo.clientIpAddress);
                        if (n != 0) {
                            return n;
                        }
                    }
                    n = Boolean.valueOf(this.a(RequestInfo$_Fields.c)).compareTo(Boolean.valueOf(requestInfo.a(RequestInfo$_Fields.c)));
                    if (n == 0) {
                        if (this.a(RequestInfo$_Fields.c)) {
                            n = org.apache.thrift.a.a(this.oauthAppId, requestInfo.oauthAppId);
                            if (n != 0) {
                                return n;
                            }
                        }
                        n = Boolean.valueOf(this.a(RequestInfo$_Fields.d)).compareTo(Boolean.valueOf(requestInfo.a(RequestInfo$_Fields.d)));
                        if (n == 0) {
                            if (this.a(RequestInfo$_Fields.d)) {
                                n = org.apache.thrift.a.a(this.userAgent, requestInfo.userAgent);
                                if (n != 0) {
                                    return n;
                                }
                            }
                            n = Boolean.valueOf(this.a(RequestInfo$_Fields.e)).compareTo(Boolean.valueOf(requestInfo.a(RequestInfo$_Fields.e)));
                            if (n == 0) {
                                if (this.a(RequestInfo$_Fields.e)) {
                                    n = org.apache.thrift.a.a(this.languageCode, requestInfo.languageCode);
                                    if (n != 0) {
                                        return n;
                                    }
                                }
                                n = Boolean.valueOf(this.a(RequestInfo$_Fields.f)).compareTo(Boolean.valueOf(requestInfo.a(RequestInfo$_Fields.f)));
                                if (n == 0) {
                                    if (this.a(RequestInfo$_Fields.f)) {
                                        n = org.apache.thrift.a.a(this.countryCode, requestInfo.countryCode);
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
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof RequestInfo && this.a((RequestInfo)o);
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        if (this.a(RequestInfo$_Fields.a)) {
            n = 31 + this.ids.hashCode();
        }
        if (this.a(RequestInfo$_Fields.b)) {
            n = n * 31 + this.clientIpAddress.hashCode();
        }
        if (this.a(RequestInfo$_Fields.c)) {
            n = n * 31 + Long.valueOf(this.oauthAppId).hashCode();
        }
        if (this.a(RequestInfo$_Fields.d)) {
            n = n * 31 + this.userAgent.hashCode();
        }
        if (this.a(RequestInfo$_Fields.e)) {
            n = n * 31 + this.languageCode.hashCode();
        }
        if (this.a(RequestInfo$_Fields.f)) {
            n = n * 31 + this.countryCode.hashCode();
        }
        return n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RequestInfo(");
        sb.append("ids:");
        if (this.ids == null) {
            sb.append("null");
        }
        else {
            sb.append(this.ids);
        }
        sb.append(", ");
        sb.append("clientIpAddress:");
        if (this.clientIpAddress == null) {
            sb.append("null");
        }
        else {
            sb.append(this.clientIpAddress);
        }
        if (this.a(RequestInfo$_Fields.c)) {
            sb.append(", ");
            sb.append("oauthAppId:");
            sb.append(this.oauthAppId);
        }
        sb.append(", ");
        sb.append("userAgent:");
        if (this.userAgent == null) {
            sb.append("null");
        }
        else {
            sb.append(this.userAgent);
        }
        if (this.a(RequestInfo$_Fields.e)) {
            sb.append(", ");
            sb.append("languageCode:");
            if (this.languageCode == null) {
                sb.append("null");
            }
            else {
                sb.append(this.languageCode);
            }
        }
        if (this.a(RequestInfo$_Fields.f)) {
            sb.append(", ");
            sb.append("countryCode:");
            if (this.countryCode == null) {
                sb.append("null");
            }
            else {
                sb.append(this.countryCode);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
