// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.support.v4.util.LruCache;
import com.twitter.errorreporter.a;

class z extends a
{
    public z(final LruCache lruCache) {
        this.a("InconsistentCacheSize.size", lruCache.size());
        this.a("InconsistentCacheSize.create_count", lruCache.createCount());
        this.a("InconsistentCacheSize.put_count", lruCache.putCount());
        this.a("InconsistentCacheSize.stats", lruCache.toString());
    }
}
