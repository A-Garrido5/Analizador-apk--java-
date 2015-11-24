// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

enum ReferenceMap$ReferenceFactory
{
    a("WEAK", 0) {
        ReferenceMap$ReferenceFactory$1(final String s, final int n) {
        }
        
        @Override
        public Reference a(final Object o, final Object o2, final ReferenceQueue referenceQueue) {
            return new bb(o, o2, referenceQueue);
        }
    }, 
    b("SOFT", 1) {
        ReferenceMap$ReferenceFactory$2(final String s, final int n) {
        }
        
        @Override
        public Reference a(final Object o, final Object o2, final ReferenceQueue referenceQueue) {
            return new ba(o, o2, referenceQueue);
        }
    };
    
    private ReferenceMap$ReferenceFactory(final String s, final int n) {
    }
    
    public abstract Reference a(final Object p0, final Object p1, final ReferenceQueue p2);
}
