// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import com.twitter.errorreporter.ErrorReporter;
import android.support.v4.util.LruCache;

class y extends LruCache
{
    final /* synthetic */ x a;
    
    y(final x a, final int n) {
        this.a = a;
        super(n);
    }
    
    @Override
    protected void entryRemoved(final boolean b, final Object o, final Object o2, final Object o3) {
        if (b) {
            this.a.b.a(o, o2);
            return;
        }
        this.a.b.c(o);
    }
    
    @Override
    protected int sizeOf(final Object o, final Object o2) {
        return this.a.c(o2);
    }
    
    @Override
    public void trimToSize(final int n) {
        while (true) {
            try {
                super.trimToSize(n);
                this.a.b.e();
            }
            catch (IllegalStateException ex) {
                ErrorReporter.a(new z(this.a.a).a(new IllegalStateException("COMPOSE-2135")));
                continue;
            }
            break;
        }
    }
}
