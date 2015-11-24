// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.scribe.networkoperation;

import android.util.SparseArray;

public enum ClientNetworkOperationStatus
{
    a("SUCCESS", 0, 0), 
    b("FAILURE", 1, 1), 
    c("PROHIBITED", 2, 2), 
    d("CANCEL", 3, 3), 
    e("ABORT", 4, 4);
    
    private static final SparseArray f;
    private final int mValue;
    
    static {
        int i = 0;
        f = new SparseArray();
        for (ClientNetworkOperationStatus[] values = values(); i < values.length; ++i) {
            final ClientNetworkOperationStatus clientNetworkOperationStatus = values[i];
            ClientNetworkOperationStatus.f.put(clientNetworkOperationStatus.a(), (Object)clientNetworkOperationStatus);
        }
    }
    
    private ClientNetworkOperationStatus(final String s, final int n, final int mValue) {
        this.mValue = mValue;
    }
    
    public static ClientNetworkOperationStatus a(final int n) {
        return (ClientNetworkOperationStatus)ClientNetworkOperationStatus.f.get(n);
    }
    
    public int a() {
        return this.mValue;
    }
}
