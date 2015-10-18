// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import org.apache.thrift.protocol.d;
import java.util.Collections;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import java.util.EnumMap;
import java.util.BitSet;
import org.apache.thrift.protocol.a;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.TBase;
import java.io.Serializable;

public class ClientHeader implements Serializable, Cloneable, TBase
{
    public static final Map a;
    public static final ClientHeader$_Fields b;
    public static final ClientHeader$_Fields c;
    private static final e d;
    private static final a e;
    private static final a f;
    private BitSet __isset_bit_vector;
    private long timestampMs;
    private short timezoneOffsetMin;
    
    static {
        d = new e("ClientHeader");
        e = new a("timestampMs", (byte)10, (short)1);
        f = new a("timezoneOffsetMin", (byte)6, (short)2);
        final EnumMap<ClientHeader$_Fields, Object> enumMap = new EnumMap<ClientHeader$_Fields, Object>(ClientHeader$_Fields.class);
        enumMap.put(ClientHeader$_Fields.a, new FieldMetaData("timestampMs", (byte)1, new FieldValueMetaData((byte)10)));
        enumMap.put(ClientHeader$_Fields.b, new FieldMetaData("timezoneOffsetMin", (byte)2, new FieldValueMetaData((byte)6)));
        FieldMetaData.a(ClientHeader.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = ClientHeader$_Fields.a;
        c = ClientHeader$_Fields.b;
    }
    
    public ClientHeader() {
        this.__isset_bit_vector = new BitSet(2);
    }
    
    public ClientHeader(final Long n, final Short n2) {
        this();
        if (n != null) {
            this.timestampMs = n;
            this.__isset_bit_vector.set(0, true);
        }
        if (n2 != null) {
            this.timezoneOffsetMin = n2;
            this.__isset_bit_vector.set(1, true);
        }
    }
    
    public void a() {
    }
    
    @Override
    public void a(final d d) {
        this.a();
        d.a(ClientHeader.d);
        d.a(ClientHeader.e);
        d.a(this.timestampMs);
        d.b();
        if (this.a(ClientHeader$_Fields.b)) {
            d.a(ClientHeader.f);
            d.a(this.timezoneOffsetMin);
            d.b();
        }
        d.c();
        d.a();
    }
    
    public boolean a(final ClientHeader$_Fields clientHeader$_Fields) {
        switch (com.twitter.common_header.thriftandroid.a.a[clientHeader$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                return this.__isset_bit_vector.get(0);
            }
            case 2: {
                return this.__isset_bit_vector.get(1);
            }
        }
    }
    
    public boolean a(final ClientHeader clientHeader) {
        if (clientHeader != null && this.timestampMs == clientHeader.timestampMs) {
            final boolean a = this.a(ClientHeader$_Fields.b);
            final boolean a2 = clientHeader.a(ClientHeader$_Fields.b);
            if ((!a && !a2) || (a && a2 && this.timezoneOffsetMin == clientHeader.timezoneOffsetMin)) {
                return true;
            }
        }
        return false;
    }
    
    public int b(final ClientHeader clientHeader) {
        int n;
        if (!this.getClass().equals(clientHeader.getClass())) {
            n = this.getClass().getName().compareTo(clientHeader.getClass().getName());
        }
        else {
            n = Boolean.valueOf(this.a(ClientHeader$_Fields.a)).compareTo(Boolean.valueOf(clientHeader.a(ClientHeader$_Fields.a)));
            if (n == 0) {
                if (this.a(ClientHeader$_Fields.a)) {
                    n = org.apache.thrift.a.a(this.timestampMs, clientHeader.timestampMs);
                    if (n != 0) {
                        return n;
                    }
                }
                n = Boolean.valueOf(this.a(ClientHeader$_Fields.b)).compareTo(Boolean.valueOf(clientHeader.a(ClientHeader$_Fields.b)));
                if (n == 0) {
                    if (this.a(ClientHeader$_Fields.b)) {
                        n = org.apache.thrift.a.a(this.timezoneOffsetMin, clientHeader.timezoneOffsetMin);
                        if (n != 0) {
                            return n;
                        }
                    }
                    return 0;
                }
            }
        }
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof ClientHeader && this.a((ClientHeader)o);
    }
    
    @Override
    public int hashCode() {
        int n = 31 + Long.valueOf(this.timestampMs).hashCode();
        if (this.a(ClientHeader$_Fields.b)) {
            n = n * 31 + Short.valueOf(this.timezoneOffsetMin).hashCode();
        }
        return n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClientHeader(");
        sb.append("timestampMs:");
        sb.append(this.timestampMs);
        if (this.a(ClientHeader$_Fields.b)) {
            sb.append(", ");
            sb.append("timezoneOffsetMin:");
            sb.append(this.timezoneOffsetMin);
        }
        sb.append(")");
        return sb.toString();
    }
}
