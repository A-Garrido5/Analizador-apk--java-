// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import org.apache.thrift.d;
import java.util.Collections;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import com.twitter.logbase.thriftandroid.LogBase;
import java.util.EnumMap;
import org.apache.thrift.protocol.a;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.TUnion;

public class VersionedCommonHeader extends TUnion
{
    public static final Map a;
    public static final VersionedCommonHeader$_Fields b;
    public static final VersionedCommonHeader$_Fields c;
    private static final e d;
    private static final a e;
    private static final a f;
    
    static {
        d = new e("VersionedCommonHeader");
        e = new a("log_base", (byte)12, (short)1);
        f = new a("commonHeader", (byte)12, (short)2);
        final EnumMap<VersionedCommonHeader$_Fields, Object> enumMap = new EnumMap<VersionedCommonHeader$_Fields, Object>(VersionedCommonHeader$_Fields.class);
        enumMap.put(VersionedCommonHeader$_Fields.a, new FieldMetaData("log_base", (byte)3, new StructMetaData((byte)12, LogBase.class)));
        enumMap.put(VersionedCommonHeader$_Fields.b, new FieldMetaData("commonHeader", (byte)3, new StructMetaData((byte)12, CommonHeader.class)));
        FieldMetaData.a(VersionedCommonHeader.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = VersionedCommonHeader$_Fields.a;
        c = VersionedCommonHeader$_Fields.b;
    }
    
    protected a a(final VersionedCommonHeader$_Fields versionedCommonHeader$_Fields) {
        switch (com.twitter.common_header.thriftandroid.f.a[versionedCommonHeader$_Fields.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unknown field id " + versionedCommonHeader$_Fields);
            }
            case 1: {
                return VersionedCommonHeader.e;
            }
            case 2: {
                return VersionedCommonHeader.f;
            }
        }
    }
    
    @Override
    protected e a() {
        return VersionedCommonHeader.d;
    }
    
    protected void a(final VersionedCommonHeader$_Fields versionedCommonHeader$_Fields, final Object o) {
        switch (com.twitter.common_header.thriftandroid.f.a[versionedCommonHeader$_Fields.ordinal()]) {
            default: {
                throw new IllegalArgumentException("Unknown field id " + versionedCommonHeader$_Fields);
            }
            case 1: {
                if (o instanceof LogBase) {
                    break;
                }
                throw new ClassCastException("Was expecting value of type com.twitter.logbase.thriftandroid.LogBase for field 'log_base', but got " + o.getClass().getSimpleName());
            }
            case 2: {
                if (!(o instanceof CommonHeader)) {
                    throw new ClassCastException("Was expecting value of type CommonHeader for field 'commonHeader', but got " + o.getClass().getSimpleName());
                }
                break;
            }
        }
    }
    
    public boolean a(final VersionedCommonHeader versionedCommonHeader) {
        return versionedCommonHeader != null && this.b() == versionedCommonHeader.b() && this.c().equals(versionedCommonHeader.c());
    }
    
    public int b(final VersionedCommonHeader versionedCommonHeader) {
        int n = org.apache.thrift.a.a((Comparable)this.b(), (Comparable)versionedCommonHeader.b());
        if (n == 0) {
            n = org.apache.thrift.a.a(this.c(), versionedCommonHeader.c());
        }
        return n;
    }
    
    @Override
    protected void b(final org.apache.thrift.protocol.d d) {
        switch (com.twitter.common_header.thriftandroid.f.a[((VersionedCommonHeader$_Fields)this.setField_).ordinal()]) {
            default: {
                throw new IllegalStateException("Cannot write union with unknown field " + this.setField_);
            }
            case 1: {
                ((LogBase)this.value_).a(d);
            }
            case 2: {
                ((CommonHeader)this.value_).a(d);
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof VersionedCommonHeader && this.a((VersionedCommonHeader)o);
    }
    
    @Override
    public int hashCode() {
        int hashCode = this.getClass().getName().hashCode();
        final d b = this.b();
        if (b != null) {
            final short a = b.a();
            hashCode = a + hashCode * 31;
            if (a && this.b(VersionedCommonHeader$_Fields.a)) {
                hashCode = hashCode * 31 + ((LogBase)this.c()).hashCode();
            }
            if (2 == a && this.b(VersionedCommonHeader$_Fields.b)) {
                hashCode = hashCode * 31 + ((CommonHeader)this.c()).hashCode();
            }
        }
        return hashCode;
    }
}
