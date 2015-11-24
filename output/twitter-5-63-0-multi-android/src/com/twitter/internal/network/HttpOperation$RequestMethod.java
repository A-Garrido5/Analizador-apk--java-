// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.internal.network;

public enum HttpOperation$RequestMethod
{
    a("GET", 0, "GET", false), 
    b("POST", 1, "POST", true), 
    c("PUT", 2, "PUT", true), 
    d("DELETE", 3, "DELETE", false);
    
    private final boolean mHasRequestBody;
    private final String mMethod;
    
    private HttpOperation$RequestMethod(final String s, final int n, final String mMethod, final boolean mHasRequestBody) {
        this.mMethod = mMethod;
        this.mHasRequestBody = mHasRequestBody;
    }
    
    public boolean a() {
        return this.mHasRequestBody;
    }
    
    @Override
    public String toString() {
        return this.mMethod;
    }
}
