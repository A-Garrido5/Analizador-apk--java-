// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum ClientNetworkStatus$NetworkStatus
{
    a("NONE", 0, 0), 
    b("WIFI", 1, 1), 
    c("WWAN", 2, 2);
    
    private static final SparseArray d;
    private final int mValue;
    
    static {
        int i = 0;
        d = new SparseArray();
        for (ClientNetworkStatus$NetworkStatus[] values = values(); i < values.length; ++i) {
            final ClientNetworkStatus$NetworkStatus clientNetworkStatus$NetworkStatus = values[i];
            ClientNetworkStatus$NetworkStatus.d.put(clientNetworkStatus$NetworkStatus.a(), (Object)clientNetworkStatus$NetworkStatus);
        }
    }
    
    private ClientNetworkStatus$NetworkStatus(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static ClientNetworkStatus$NetworkStatus a(final int n) {
        return (ClientNetworkStatus$NetworkStatus)ClientNetworkStatus$NetworkStatus.d.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
