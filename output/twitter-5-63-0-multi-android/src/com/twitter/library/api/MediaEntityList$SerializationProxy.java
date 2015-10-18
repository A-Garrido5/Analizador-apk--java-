// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;

class MediaEntityList$SerializationProxy extends EntityList$SerializationProxy
{
    private static final long serialVersionUID = 1001918647934680337L;
    
    public MediaEntityList$SerializationProxy() {
    }
    
    public MediaEntityList$SerializationProxy(final MediaEntityList list) {
        super(list);
    }
    
    private Object readResolve() {
        if (!CollectionUtils.a((Collection)this.mList)) {
            return new MediaEntityList(this.mList);
        }
        return MediaEntityList.e();
    }
}
