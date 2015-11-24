// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.experiments.client.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum DdgImpression$_Fields implements d
{
    a("COMMON_HEADER", 0, (short)1, "commonHeader"), 
    b("EXPERIMENT", 1, (short)2, "experiment"), 
    c("VERSION", 2, (short)3, "version"), 
    d("BUCKET", 3, (short)4, "bucket");
    
    private static final Map e;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        e = new HashMap();
        for (final DdgImpression$_Fields ddgImpression$_Fields : EnumSet.allOf(DdgImpression$_Fields.class)) {
            DdgImpression$_Fields.e.put(ddgImpression$_Fields.b(), ddgImpression$_Fields);
        }
    }
    
    private DdgImpression$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
        this._thriftId = thriftId;
        this._fieldName = fieldName;
    }
    
    @Override
    public short a() {
        return this._thriftId;
    }
    
    public String b() {
        return this._fieldName;
    }
}
