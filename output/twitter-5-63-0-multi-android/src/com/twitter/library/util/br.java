// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.util.Iterator;
import com.twitter.util.n;
import com.twitter.util.m;

public class br extends m
{
    private final ReferenceList a;
    
    public br() {
        this.a = ReferenceList.a(5);
    }
    
    @Override
    public void a(final Object o) {
        synchronized (this) {
            final Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                iterator.next().a(o);
            }
        }
    }
    // monitorexit(this)
    
    @Override
    public boolean a(final n n) {
        synchronized (this) {
            boolean b;
            if (this.a.a(n)) {
                b = false;
            }
            else {
                this.a.b(n);
                b = true;
            }
            return b;
        }
    }
    
    @Override
    public boolean b(final n n) {
        synchronized (this) {
            return this.a.c(n);
        }
    }
}
