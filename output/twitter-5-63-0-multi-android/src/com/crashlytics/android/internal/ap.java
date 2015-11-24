// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

public enum ap
{
    a("WIFI_MAC_ADDRESS", 0, 1), 
    b("BLUETOOTH_MAC_ADDRESS", 1, 2), 
    c("ANDROID_ID", 2, 100), 
    d("ANDROID_DEVICE_ID", 3, 101), 
    e("ANDROID_SERIAL", 4, 102);
    
    public final int f;
    
    private ap(final String s, final int n, final int f) {
        this.f = f;
    }
}
