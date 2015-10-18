// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.crypto;

public class InvalidCipherTextException extends CryptoException
{
    public InvalidCipherTextException() {
    }
    
    public InvalidCipherTextException(final String s) {
        super(s);
    }
    
    public InvalidCipherTextException(final String s, final Throwable t) {
        super(s, t);
    }
}
