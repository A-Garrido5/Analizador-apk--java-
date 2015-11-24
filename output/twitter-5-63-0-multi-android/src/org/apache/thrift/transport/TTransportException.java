// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift.transport;

import org.apache.thrift.TException;

public class TTransportException extends TException
{
    private static final long serialVersionUID = 1L;
    protected int type_;
    
    public TTransportException() {
        this.type_ = 0;
    }
    
    public TTransportException(final int type_, final String s) {
        super(s);
        this.type_ = 0;
        this.type_ = type_;
    }
    
    public TTransportException(final int type_, final Throwable t) {
        super(t);
        this.type_ = 0;
        this.type_ = type_;
    }
}
