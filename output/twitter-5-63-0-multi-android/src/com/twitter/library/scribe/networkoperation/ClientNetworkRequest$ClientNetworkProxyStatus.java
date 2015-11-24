// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum ClientNetworkRequest$ClientNetworkProxyStatus
{
    a("NONE", 0, 0), 
    b("MANUAL", 1, 1), 
    c("MANUAL_INVALID", 2, 2), 
    d("MANUAL_WITHAUTH", 3, 3), 
    e("AUTO", 4, 4), 
    f("AUTO_INVALID", 5, 5), 
    g("AUTO_WITHAUTH", 6, 6), 
    h("CONFIG", 7, 7), 
    i("CONFIG_WITHAUTH", 8, 8);
    
    private static final SparseArray j;
    private final int mValue;
    
    static {
        int l = 0;
        j = new SparseArray();
        for (ClientNetworkRequest$ClientNetworkProxyStatus[] values = values(); l < values.length; ++l) {
            final ClientNetworkRequest$ClientNetworkProxyStatus clientNetworkRequest$ClientNetworkProxyStatus = values[l];
            ClientNetworkRequest$ClientNetworkProxyStatus.j.put(clientNetworkRequest$ClientNetworkProxyStatus.a(), (Object)clientNetworkRequest$ClientNetworkProxyStatus);
        }
    }
    
    private ClientNetworkRequest$ClientNetworkProxyStatus(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static ClientNetworkRequest$ClientNetworkProxyStatus a(final int n) {
        return (ClientNetworkRequest$ClientNetworkProxyStatus)ClientNetworkRequest$ClientNetworkProxyStatus.j.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
