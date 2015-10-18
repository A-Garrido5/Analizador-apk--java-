// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.protocol;

import org.apache.thrift.TException;

public class TProtocolException extends TException
{
    private static final long serialVersionUID = 1L;
    protected int type_;
    
    public TProtocolException() {
        this.type_ = 0;
    }
    
    public TProtocolException(final String s) {
        super(s);
        this.type_ = 0;
    }
}
