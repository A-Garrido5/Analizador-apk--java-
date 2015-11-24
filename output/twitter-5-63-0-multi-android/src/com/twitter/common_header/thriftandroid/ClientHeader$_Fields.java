// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum ClientHeader$_Fields implements d
{
    a("TIMESTAMP_MS", 0, (short)1, "timestampMs"), 
    b("TIMEZONE_OFFSET_MIN", 1, (short)2, "timezoneOffsetMin");
    
    private static final Map c;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        c = new HashMap();
        for (final ClientHeader$_Fields clientHeader$_Fields : EnumSet.allOf(ClientHeader$_Fields.class)) {
            ClientHeader$_Fields.c.put(clientHeader$_Fields.b(), clientHeader$_Fields);
        }
    }
    
    private ClientHeader$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
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
