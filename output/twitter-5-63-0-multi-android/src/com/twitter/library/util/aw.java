// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;

class aw implements Iterable
{
    final /* synthetic */ ReferenceMap a;
    
    aw(final ReferenceMap a) {
        this.a = a;
    }
    
    @Override
    public Iterator iterator() {
        return new ax(this);
    }
}
