// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum VersionedCommonHeader$_Fields implements d
{
    a("LOG_BASE", 0, (short)1, "log_base"), 
    b("COMMON_HEADER", 1, (short)2, "commonHeader");
    
    private static final Map c;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        c = new HashMap();
        for (final VersionedCommonHeader$_Fields versionedCommonHeader$_Fields : EnumSet.allOf(VersionedCommonHeader$_Fields.class)) {
            VersionedCommonHeader$_Fields.c.put(versionedCommonHeader$_Fields.b(), versionedCommonHeader$_Fields);
        }
    }
    
    private VersionedCommonHeader$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
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
