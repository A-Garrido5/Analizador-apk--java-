// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;

enum ReferenceList$ReferenceFactory
{
    a("WEAK", 0) {
        ReferenceList$ReferenceFactory$1(final String s, final int n) {
        }
        
        @Override
        public Reference a(final Object o) {
            return new WeakReference(o);
        }
    }, 
    b("SOFT", 1) {
        ReferenceList$ReferenceFactory$2(final String s, final int n) {
        }
        
        @Override
        public Reference a(final Object o) {
            return new SoftReference(o);
        }
    };
    
    private ReferenceList$ReferenceFactory(final String s, final int n) {
    }
    
    public abstract Reference a(final Object p0);
}
