// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue;

import java.util.Map;
import java.util.LinkedHashMap;

final class ViewDwellTimeMonitor$1 extends LinkedHashMap
{
    private final int mCacheSize;
    
    ViewDwellTimeMonitor$1() {
        this.mCacheSize = 20;
    }
    
    @Override
    protected boolean removeEldestEntry(final Map.Entry entry) {
        return this.size() >= 20;
    }
}
