// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

public class CryptoException extends Exception
{
    private Throwable cause;
    
    public CryptoException() {
    }
    
    public CryptoException(final String s) {
        super(s);
    }
    
    @Override
    public Throwable getCause() {
        return this.cause;
    }
}
