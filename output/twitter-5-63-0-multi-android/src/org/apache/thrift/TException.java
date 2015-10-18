// 
// Decompiled by Procyon v0.5.30
// 

package org.apache.thrift;

public class TException extends Exception
{
    private static final long serialVersionUID = 1L;
    
    public TException() {
    }
    
    public TException(final String s) {
        super(s);
    }
    
    public TException(final Throwable t) {
        super(t);
    }
}
