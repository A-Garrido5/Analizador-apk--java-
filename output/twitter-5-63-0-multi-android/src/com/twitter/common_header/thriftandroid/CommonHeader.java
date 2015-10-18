// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import org.apache.thrift.d;
import java.util.Collections;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import java.util.EnumMap;
import org.apache.thrift.protocol.a;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.TUnion;

public class CommonHeader extends TUnion
{
    public static final Map a;
    public static final CommonHeader$_Fields b;
    public static final CommonHeader$_Fields c;
    private static final e d;
    private static final a e;
    private static final a f;
    
    static {
        d = new e("CommonHeader");
        e = new a("clientHeader", (byte)12, (short)1);
        f = new a("serverHeader", (byte)12, (short)2);
        final EnumMap<CommonHeader$_Fields, Object> enumMap = new EnumMap<CommonHeader$_Fields, Object>(CommonHeader$_Fields.class);
        enumMap.put(CommonHeader$_Fields.a, new FieldMetaData("clientHeader", (byte)3, new StructMetaData((byte)12, ClientHeader.class)));
        enumMap.put(CommonHeader$_Fields.b, new FieldMetaData("serverHeader", (byte)3, new StructMetaData((byte)12, ServerHeader.class)));
        FieldMetaData.a(CommonHeader.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = CommonHeader$_Fields.a;
        c = CommonHeader$_Fields.b;
    }
    
    protected a a(final CommonHeader$_Fields commonHeader$_Fields) {
        switch (com.twitter.common_header.thriftandroid.c.a[commonHeader$_Fields.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unknown field id " + commonHeader$_Fields);
            }
            case 1: {
                return CommonHeader.e;
            }
            case 2: {
                return CommonHeader.f;
            }
        }
    }
    
    @Override
    protected e a() {
        return CommonHeader.d;
    }
    
    protected void a(final CommonHeader$_Fields commonHeader$_Fields, final Object o) {
        switch (com.twitter.common_header.thriftandroid.c.a[commonHeader$_Fields.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unknown field id " + commonHeader$_Fields);
            }
            case 1: {
                if (o instanceof ClientHeader) {
                    break;
                }
                throw new ClassCastException("Was expecting value of type ClientHeader for field 'clientHeader', but got " + o.getClass().getSimpleName());
            }
            case 2: {
                if (!(o instanceof ServerHeader)) {
                    throw new ClassCastException("Was expecting value of type ServerHeader for field 'serverHeader', but got " + o.getClass().getSimpleName());
                }
                break;
            }
        }
    }
    
    public boolean a(final CommonHeader commonHeader) {
        return commonHeader != null && this.b() == commonHeader.b() && this.c().equals(commonHeader.c());
    }
    
    public int b(final CommonHeader commonHeader) {
        int n = org.apache.thrift.a.a((Comparable)this.b(), (Comparable)commonHeader.b());
        if (n == 0) {
            n = org.apache.thrift.a.a(this.c(), commonHeader.c());
        }
        return n;
    }
    
    @Override
    protected void b(final org.apache.thrift.protocol.d d) {
        switch (com.twitter.common_header.thriftandroid.c.a[((CommonHeader$_Fields)this.setField_).ordinal()]) {
            default: {
                throw new IllegalStateException("Cannot write union with unknown field " + this.setField_);
            }
            case 1: {
                ((ClientHeader)this.value_).a(d);
            }
            case 2: {
                ((ServerHeader)this.value_).a(d);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof CommonHeader && this.a((CommonHeader)o);
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.getClass().getName().hashCode();
        final d b = this.b();
        if (b != null) {
            final short a = b.a();
            hashCode = a + hashCode * 31;
            if (a && this.b(CommonHeader$_Fields.a)) {
                hashCode = hashCode * 31 + ((ClientHeader)this.c()).hashCode();
            }
            if (2 == a && this.b(CommonHeader$_Fields.b)) {
                hashCode = hashCode * 31 + ((ServerHeader)this.c()).hashCode();
            }
        }
        return hashCode;
    }
}
