// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum ClientNetworkStatus$CaptivePortalStatus
{
    a("UNKNOWN", 0, 0), 
    b("YES", 1, 1), 
    c("NO", 2, 2);
    
    private static final SparseArray d;
    private final int mValue;
    
    static {
        int i = 0;
        d = new SparseArray();
        for (ClientNetworkStatus$CaptivePortalStatus[] values = values(); i < values.length; ++i) {
            final ClientNetworkStatus$CaptivePortalStatus clientNetworkStatus$CaptivePortalStatus = values[i];
            ClientNetworkStatus$CaptivePortalStatus.d.put(clientNetworkStatus$CaptivePortalStatus.a(), (Object)clientNetworkStatus$CaptivePortalStatus);
        }
    }
    
    private ClientNetworkStatus$CaptivePortalStatus(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static ClientNetworkStatus$CaptivePortalStatus a(final int n) {
        return (ClientNetworkStatus$CaptivePortalStatus)ClientNetworkStatus$CaptivePortalStatus.d.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
