// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.upload.internal;

public class BaseUploadRequest$BuilderInitException extends Exception
{
    private final int mErrorCode;
    
    public BaseUploadRequest$BuilderInitException(final int mErrorCode, final Exception ex) {
        super(ex);
        this.mErrorCode = mErrorCode;
    }
    
    public int a() {
        return this.mErrorCode;
    }
    
    public Exception b() {
        return (Exception)super.getCause();
    }
}
