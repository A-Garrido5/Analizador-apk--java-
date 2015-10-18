// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.common_header.thriftandroid;

import java.util.Iterator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import org.apache.thrift.d;

public enum ServerHeader$_Fields implements d
{
    a("CLIENT_TIMESTAMP_MS", 0, (short)1, "clientTimestampMs"), 
    b("SERVER_TIMESTAMP_MS", 1, (short)2, "serverTimestampMs"), 
    c("SERVER_IP_ADDRESS", 2, (short)3, "serverIpAddress"), 
    d("SERVER_NAME", 3, (short)4, "serverName"), 
    e("SERVER_VERSION", 4, (short)5, "serverVersion"), 
    f("LOGGING_LIB_VERSION", 5, (short)6, "loggingLibVersion"), 
    g("REQUEST_INFO", 6, (short)7, "requestInfo"), 
    h("TRANSACTION_ID", 7, (short)8, "transactionId"), 
    i("CLIENT_TIMEZONE_OFFSET_MIN", 8, (short)9, "clientTimezoneOffsetMin");
    
    private static final Map j;
    private final String _fieldName;
    private final short _thriftId;
    
    static {
        j = new HashMap();
        for (final ServerHeader$_Fields serverHeader$_Fields : EnumSet.allOf(ServerHeader$_Fields.class)) {
            ServerHeader$_Fields.j.put(serverHeader$_Fields.b(), serverHeader$_Fields);
        }
    }
    
    private ServerHeader$_Fields(final String s, final int n, final short thriftId, final String fieldName) {
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
