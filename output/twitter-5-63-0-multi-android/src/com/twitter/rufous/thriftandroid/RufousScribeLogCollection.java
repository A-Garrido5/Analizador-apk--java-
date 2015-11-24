// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.rufous.thriftandroid;

import java.util.Iterator;
import java.nio.ByteBuffer;
import org.apache.thrift.protocol.b;
import java.util.List;
import org.apache.thrift.protocol.c;
import org.apache.thrift.protocol.d;
import org.apache.thrift.protocol.TProtocolException;
import java.util.Collections;
import org.apache.thrift.meta_data.MapMetaData;
import org.apache.thrift.meta_data.ListMetaData;
import org.apache.thrift.meta_data.FieldValueMetaData;
import org.apache.thrift.meta_data.FieldMetaData;
import java.util.EnumMap;
import org.apache.thrift.protocol.a;
import org.apache.thrift.protocol.e;
import java.util.Map;
import org.apache.thrift.TBase;
import java.io.Serializable;

public class RufousScribeLogCollection implements Serializable, Cloneable, TBase
{
    public static final Map a;
    public static final RufousScribeLogCollection$_Fields b;
    private static final e c;
    private static final a d;
    private Map logs;
    
    static {
        c = new e("RufousScribeLogCollection");
        d = new a("logs", (byte)13, (short)1);
        final EnumMap<RufousScribeLogCollection$_Fields, FieldMetaData> enumMap = new EnumMap<RufousScribeLogCollection$_Fields, FieldMetaData>(RufousScribeLogCollection$_Fields.class);
        enumMap.put(RufousScribeLogCollection$_Fields.a, new FieldMetaData("logs", (byte)1, new MapMetaData((byte)13, new FieldValueMetaData((byte)11), new ListMetaData((byte)15, new FieldValueMetaData((byte)11)))));
        FieldMetaData.a(RufousScribeLogCollection.class, a = Collections.unmodifiableMap((Map<?, ?>)enumMap));
        b = RufousScribeLogCollection$_Fields.a;
    }
    
    public RufousScribeLogCollection() {
    }
    
    public RufousScribeLogCollection(final Map logs) {
        this();
        if (logs != null) {
            this.logs = logs;
        }
    }
    
    public Object a(final RufousScribeLogCollection$_Fields rufousScribeLogCollection$_Fields) {
        switch (com.twitter.rufous.thriftandroid.a.a[rufousScribeLogCollection$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                return this.logs;
            }
        }
    }
    
    public void a() {
        if (this.logs == null) {
            throw new TProtocolException("Required field 'logs' was not present! Struct: " + this.toString());
        }
    }
    
    @Override
    public void a(final d d) {
        this.a();
        d.a(RufousScribeLogCollection.c);
        if (this.logs != null) {
            d.a(RufousScribeLogCollection.d);
            d.a(new c((byte)11, (byte)15, this.logs.size()));
            for (final Map.Entry<String, V> entry : this.logs.entrySet()) {
                d.a(entry.getKey());
                d.a(new b((byte)11, ((List)entry.getValue()).size()));
                final Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) {
                    d.a(iterator2.next());
                }
                d.e();
            }
            d.d();
            d.b();
        }
        d.c();
        d.a();
    }
    
    public boolean a(final RufousScribeLogCollection collection) {
        if (collection != null) {
            final boolean c = this.c(RufousScribeLogCollection$_Fields.a);
            final boolean c2 = collection.c(RufousScribeLogCollection$_Fields.a);
            if ((!c && !c2) || (c && c2 && this.logs.equals(collection.logs))) {
                return true;
            }
        }
        return false;
    }
    
    public int b(final RufousScribeLogCollection collection) {
        int n;
        if (!this.getClass().equals(collection.getClass())) {
            n = this.getClass().getName().compareTo(collection.getClass().getName());
        }
        else {
            n = Boolean.valueOf(this.c(RufousScribeLogCollection$_Fields.a)).compareTo(Boolean.valueOf(collection.c(RufousScribeLogCollection$_Fields.a)));
            if (n == 0) {
                if (this.c(RufousScribeLogCollection$_Fields.a)) {
                    n = org.apache.thrift.a.a(this.logs, collection.logs);
                    if (n != 0) {
                        return n;
                    }
                }
                return 0;
            }
        }
        return n;
    }
    
    public Object b(final RufousScribeLogCollection$_Fields rufousScribeLogCollection$_Fields) {
        switch (com.twitter.rufous.thriftandroid.a.a[rufousScribeLogCollection$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException("Invalid field type");
            }
            case 1: {
                return this.a(rufousScribeLogCollection$_Fields);
            }
        }
    }
    
    public boolean c(final RufousScribeLogCollection$_Fields rufousScribeLogCollection$_Fields) {
        switch (com.twitter.rufous.thriftandroid.a.a[rufousScribeLogCollection$_Fields.ordinal()]) {
            default: {
                throw new IllegalStateException();
            }
            case 1: {
                return this.logs != null;
            }
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        return o != null && o instanceof RufousScribeLogCollection && this.a((RufousScribeLogCollection)o);
    }
    
    @Override
    public int hashCode() {
        int n = 1;
        if (this.c(RufousScribeLogCollection$_Fields.a)) {
            n = 31 + this.logs.hashCode();
        }
        return n;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("RufousScribeLogCollection(");
        sb.append("logs:");
        if (this.logs == null) {
            sb.append("null");
        }
        else {
            sb.append(this.logs);
        }
        sb.append(")");
        return sb.toString();
    }
}
