// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;

public class ag extends v
{
    public ag() {
    }
    
    public ag(final MediaEntityList list) {
        super(list);
    }
    
    protected MediaEntityList b(final List list) {
        if (!CollectionUtils.a((Collection)list)) {
            return new MediaEntityList(list);
        }
        return MediaEntityList.e();
    }
}
