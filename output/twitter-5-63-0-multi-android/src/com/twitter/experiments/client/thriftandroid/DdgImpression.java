// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.experiments.client.thriftandroid;

import org.apache.thrift.protocol.d;
import org.apache.thrift.protocol.TProtocolException;
import java.util.Collections;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.StructMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import java.util.EnumMap;
import com.twitter.common_header.thriftandroid.VersionedCommonHeader;
import java.util.BitSet;
import org.apache.thrift.protocol.a;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.TBase;
import java.io.Serializable;

public class DdgImpression implements Serializable, Cloneable, TBase
{
    public static final Map a;
    public static final DdgImpression$_Fields b;
    public static final DdgImpression$_Fields c;
    public static final DdgImpression$_Fields d;
    public static final DdgImpression$_Fields e;
    private static final e f;
    private static final a g;
    private static final a h;
    private static final a i;
    private static final a j;
    private BitSet __isset_bit_vector;
    private String bucket;
    private VersionedCommonHeader commonHeader;
    private String experiment;
    private int version;
    
    static {
        f = new e("DdgImpression");
        g = new a("commonHeader", (byte)12, (short)1);
        h = new a("experiment", (byte)11, (short)2);
        i = new a("version", (byte)8, (short)3);
        j = new a("bucket", (byte)11, (short)4);
        final EnumMap<DdgImpression$_Fields, FieldMetaData> enumMap = new EnumMap<DdgImpression$_Fields, FieldMetaData>(DdgImpression$_Fields.class);
        enumMap.put(DdgImpression$_Fields.a, new FieldMetaData("commonHeader", (byte)1, new StructMetaData((byte)12, VersionedCommonHeader.class)));
        enumMap.put(DdgImpression$_Fields.b, new FieldMetaData("experiment", (byte)1, new FieldValueMetaData((byte)11)));
        enumMap.put(DdgImpression$_Fields.c, new FieldMetaData("version", (byte)1, new FieldValueMetaData((byte)8)));
        enumMap.put(DdgImpression$_Fields.d, new FieldMetaData("bucket", (byte)1, new FieldValueMetaData((byte)11)));
        FieldMetaData.a(DdgImpression.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = DdgImpression$_Fields.a;
        c = DdgImpression$_Fields.b;
        d = DdgImpression$_Fields.c;
        e = DdgImpression$_Fields.d;
    }
    
    public DdgImpression() {
        this.__isset_bit_vector = new BitSet(1);
    }
    
    public DdgImpression(final VersionedCommonHeader commonHeader, final String experiment, final Integer n, final String bucket) {
        this();
        if (commonHeader != null) {
            this.commonHeader = commonHeader;
        }
        if (experiment != null) {
            this.experiment = experiment;
        }
        if (n != null) {
            this.version = n;
            this.__isset_bit_vector.set(0, true);
        }
        if (bucket != null) {
            this.bucket = bucket;
        }
    }
    
    public void a() {
        if (this.commonHeader == null) {
            throw new TProtocolException("Required field 'commonHeader' was not present! Struct: " + this.toString());
        }
        if (this.experiment == null) {
            throw new TProtocolException("Required field 'experiment' was not present! Struct: " + this.toString());
        }
        if (this.bucket == null) {
            throw new TProtocolException("Required field 'bucket' was not present! Struct: " + this.toString());
        }
    }
    
    @Override
    public void a(final d d) {
        this.a();
        d.a(DdgImpression.f);
        if (this.commonHeader != null) {
            d.a(DdgImpression.g);
            this.commonHeader.a(d);
            d.b();
        }
        if (this.experiment != null) {
            d.a(DdgImpression.h);
            d.a(this.experiment);
            d.b();
        }
        d.a(DdgImpression.i);
        d.a(this.version);
        d.b();
        if (this.bucket != null) {
            d.a(DdgImpression.j);
            d.a(this.bucket);
            d.b();
        }
        d.c();
        d.a();
    }
    
    public boolean a(final DdgImpression$_Fields ddgImpression$_Fields) {
        switch (com.twitter.experiments.client.thriftandroid.a.a[ddgImpression$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                if (this.commonHeader != null) {
                    break;
                }
                return false;
            }
            case 2: {
                if (this.experiment == null) {
                    return false;
                }
                break;
            }
            case 3: {
                return this.__isset_bit_vector.get(0);
            }
            case 4: {
                if (this.bucket == null) {
                    return false;
                }
                break;
            }
        }
        return true;
    }
    
    public boolean a(final DdgImpression ddgImpression) {
        if (ddgImpression != null) {
            final boolean a = this.a(DdgImpression$_Fields.a);
            final boolean a2 = ddgImpression.a(DdgImpression$_Fields.a);
            if ((!a && !a2) || (a && a2 && this.commonHeader.a(ddgImpression.commonHeader))) {
                final boolean a3 = this.a(DdgImpression$_Fields.b);
                final boolean a4 = ddgImpression.a(DdgImpression$_Fields.b);
                if (((!a3 && !a4) || (a3 && a4 && this.experiment.equals(ddgImpression.experiment))) && this.version == ddgImpression.version) {
                    final boolean a5 = this.a(DdgImpression$_Fields.d);
                    final boolean a6 = ddgImpression.a(DdgImpression$_Fields.d);
                    if ((!a5 && !a6) || (a5 && a6 && this.bucket.equals(ddgImpression.bucket))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public int b(final DdgImpression ddgImpression) {
        int n;
        if (!this.getClass().equals(ddgImpression.getClass())) {
            n = this.getClass().getName().compareTo(ddgImpression.getClass().getName());
        }
        else {
            n = Boolean.valueOf(this.a(DdgImpression$_Fields.a)).compareTo(Boolean.valueOf(ddgImpression.a(DdgImpression$_Fields.a)));
            if (n == 0) {
                if (this.a(DdgImpression$_Fields.a)) {
                    n = org.apache.thrift.a.a(this.commonHeader, ddgImpression.commonHeader);
                    if (n != 0) {
                        return n;
                    }
                }
                n = Boolean.valueOf(this.a(DdgImpression$_Fields.b)).compareTo(Boolean.valueOf(ddgImpression.a(DdgImpression$_Fields.b)));
                if (n == 0) {
                    if (this.a(DdgImpression$_Fields.b)) {
                        n = org.apache.thrift.a.a(this.experiment, ddgImpression.experiment);
                        if (n != 0) {
                            return n;
                        }
                    }
                    n = Boolean.valueOf(this.a(DdgImpression$_Fields.c)).compareTo(Boolean.valueOf(ddgImpression.a(DdgImpression$_Fields.c)));
                    if (n == 0) {
                        if (this.a(DdgImpression$_Fields.c)) {
                            n = org.apache.thrift.a.a(this.version, ddgImpression.version);
                            if (n != 0) {
                                return n;
                            }
                        }
                        n = Boolean.valueOf(this.a(DdgImpression$_Fields.d)).compareTo(Boolean.valueOf(ddgImpression.a(DdgImpression$_Fields.d)));
                        if (n == 0) {
                            if (this.a(DdgImpression$_Fields.d)) {
                                n = org.apache.thrift.a.a(this.bucket, ddgImpression.bucket);
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
        return n;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof DdgImpression && this.a((DdgImpression)o);
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        if (this.a(DdgImpression$_Fields.a)) {
            n = 31 + this.commonHeader.hashCode();
        }
        if (this.a(DdgImpression$_Fields.b)) {
            n = n * 31 + this.experiment.hashCode();
        }
        int n2 = n * 31 + Integer.valueOf(this.version).hashCode();
        if (this.a(DdgImpression$_Fields.d)) {
            n2 = n2 * 31 + this.bucket.hashCode();
        }
        return n2;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DdgImpression(");
        sb.append("commonHeader:");
        if (this.commonHeader == null) {
            sb.append("null");
        }
        else {
            sb.append(this.commonHeader);
        }
        sb.append(", ");
        sb.append("experiment:");
        if (this.experiment == null) {
            sb.append("null");
        }
        else {
            sb.append(this.experiment);
        }
        sb.append(", ");
        sb.append("version:");
        sb.append(this.version);
        sb.append(", ");
        sb.append("bucket:");
        if (this.bucket == null) {
            sb.append("null");
        }
        else {
            sb.append(this.bucket);
        }
        sb.append(")");
        return sb.toString();
    }
}
