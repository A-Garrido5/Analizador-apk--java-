// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.util;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Collection;

public class m
{
    private final Collection a;
    
    public m() {
        this.a = Collections.synchronizedCollection(new HashSet<Object>());
    }
    
    public void a(final Object o) {
        synchronized (this.a) {
            final Iterator<n> iterator = new ArrayList<n>(this.a).iterator();
            while (iterator.hasNext()) {
                iterator.next().a(o);
            }
        }
    }
    // monitorexit(collection)
    
    public boolean a(final n n) {
        return this.a.add(n);
    }
    
    public boolean b(final n n) {
        return this.a.remove(n);
    }
}
