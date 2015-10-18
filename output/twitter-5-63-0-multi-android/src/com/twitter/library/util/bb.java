// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

class bb extends WeakReference implements az
{
    private final Object a;
    
    public bb(final Object a, final Object o, final ReferenceQueue referenceQueue) {
        super(o, referenceQueue);
        this.a = a;
    }
    
    @Override
    public Object a() {
        return this.a;
    }
}
