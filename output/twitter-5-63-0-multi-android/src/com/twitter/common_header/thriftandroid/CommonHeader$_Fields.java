// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum CommonHeader$_Fields implements d
{
    a("CLIENT_HEADER", 0, (short)1, "clientHeader"), 
    b("SERVER_HEADER", 1, (short)2, "serverHeader");
    
    private static final Map c;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        c = new HashMap();
        for (final CommonHeader$_Fields commonHeader$_Fields : EnumSet.allOf(CommonHeader$_Fields.class)) {
            CommonHeader$_Fields.c.put(commonHeader$_Fields.b(), commonHeader$_Fields);
        }
    }
    
    private CommonHeader$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
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
