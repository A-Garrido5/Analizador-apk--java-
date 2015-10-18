// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import java.util.List;

public class w extends v
{
    public w() {
    }
    
    public w(final int n) {
        super(n);
    }
    
    public w(final EntityList list) {
        super(list);
    }
    
    @Override
    protected EntityList a(final List list) {
        if (!CollectionUtils.a((Collection)list)) {
            return new EntityList(list);
        }
        return EntityList.a();
    }
}
