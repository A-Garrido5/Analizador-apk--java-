// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player;

public enum YouTubeInitializationResult
{
    a("SUCCESS", 0), 
    b("INTERNAL_ERROR", 1), 
    c("UNKNOWN_ERROR", 2), 
    d("SERVICE_MISSING", 3), 
    e("SERVICE_VERSION_UPDATE_REQUIRED", 4), 
    f("SERVICE_DISABLED", 5), 
    g("SERVICE_INVALID", 6), 
    h("ERROR_CONNECTING_TO_SERVICE", 7), 
    i("CLIENT_LIBRARY_UPDATE_REQUIRED", 8), 
    j("NETWORK_ERROR", 9), 
    k("DEVELOPER_KEY_INVALID", 10), 
    l("INVALID_APPLICATION_SIGNATURE", 11);
    
    private YouTubeInitializationResult(final String s, final int n) {
    }
}
