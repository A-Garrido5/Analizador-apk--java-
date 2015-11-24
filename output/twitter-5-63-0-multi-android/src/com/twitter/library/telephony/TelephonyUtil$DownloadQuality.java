// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.telephony;

public enum TelephonyUtil$DownloadQuality
{
    a("UNKNOWN", 0, 0, 0.0f), 
    b("VERY_LOW", 1, 1, 12.5f), 
    c("LOW", 2, 2, 12.5f), 
    d("MEDIUM_LOW", 3, 3, 50.0f), 
    e("MEDIUM", 4, 4, 87.5f), 
    f("MEDIUM_HIGH", 5, 5, 250.0f), 
    g("HIGH", 6, 6, 1250.0f), 
    h("VERY_HIGH", 7, 7, 2500.0f);
    
    private int mIndex;
    private float mThreshold;
    
    private TelephonyUtil$DownloadQuality(final String s, final int n, final int mIndex, final float mThreshold) {
        this.mIndex = mIndex;
        this.mThreshold = mThreshold;
    }
    
    public static final int a() {
        return 1 + TelephonyUtil$DownloadQuality.h.b();
    }
    
    public int b() {
        return this.mIndex;
    }
    
    public float c() {
        return this.mThreshold;
    }
}
