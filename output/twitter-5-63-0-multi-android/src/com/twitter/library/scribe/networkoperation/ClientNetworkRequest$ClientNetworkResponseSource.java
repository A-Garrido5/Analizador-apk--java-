// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum ClientNetworkRequest$ClientNetworkResponseSource
{
    a("ORIGIN", 0, 0), 
    b("CDN", 1, 1), 
    c("CDN_UNKNOWN", 2, 3), 
    d("LOCAL_CACHE", 3, 4), 
    e("PUSH", 4, 5);
    
    private static final SparseArray f;
    private final int mValue;
    
    static {
        int i = 0;
        f = new SparseArray();
        for (ClientNetworkRequest$ClientNetworkResponseSource[] values = values(); i < values.length; ++i) {
            final ClientNetworkRequest$ClientNetworkResponseSource clientNetworkRequest$ClientNetworkResponseSource = values[i];
            ClientNetworkRequest$ClientNetworkResponseSource.f.put(clientNetworkRequest$ClientNetworkResponseSource.a(), (Object)clientNetworkRequest$ClientNetworkResponseSource);
        }
    }
    
    private ClientNetworkRequest$ClientNetworkResponseSource(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static ClientNetworkRequest$ClientNetworkResponseSource a(final int n) {
        return (ClientNetworkRequest$ClientNetworkResponseSource)ClientNetworkRequest$ClientNetworkResponseSource.f.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
