// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.rufous.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum RufousScribeLogCollection$_Fields implements d
{
    a("LOGS", 0, (short)1, "logs");
    
    private static final Map b;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        b = new HashMap();
        for (final RufousScribeLogCollection$_Fields rufousScribeLogCollection$_Fields : EnumSet.allOf(RufousScribeLogCollection$_Fields.class)) {
            RufousScribeLogCollection$_Fields.b.put(rufousScribeLogCollection$_Fields.b(), rufousScribeLogCollection$_Fields);
        }
    }
    
    private RufousScribeLogCollection$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
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
