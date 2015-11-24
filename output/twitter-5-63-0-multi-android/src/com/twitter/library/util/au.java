// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;

class au implements Iterable
{
    final /* synthetic */ ReferenceMap a;
    
    au(final ReferenceMap a) {
        this.a = a;
    }
    
    @Override
    public Iterator iterator() {
        return new av(this);
    }
}
