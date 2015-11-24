// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

public enum UrlNetworkStats$NetworkQuality
{
    a("LOW", 0, 1), 
    b("MEDIUM", 1, 2), 
    c("HIGH", 2, 3), 
    d("UNKNOWN", 3, 100);
    
    private int mVal;
    
    private UrlNetworkStats$NetworkQuality(final String s, final int n, final int mVal) {
        this.mVal = mVal;
    }
}
