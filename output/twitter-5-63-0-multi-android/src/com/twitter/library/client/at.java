// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import java.util.Iterator;
import com.twitter.internal.android.service.a;
import java.util.concurrent.CopyOnWriteArraySet;
import com.twitter.internal.android.service.c;

class at implements c
{
    private final CopyOnWriteArraySet a;
    
    at() {
        this.a = new CopyOnWriteArraySet();
    }
    
    public void a(final c c) {
        if (c != null && !this.a.contains(c)) {
            this.a.add(c);
        }
    }
    
    @Override
    public void a(final Object o, final a a) {
        final Iterator<c> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a(o, a);
        }
    }
    
    @Override
    public void a_(final a a) {
        final Iterator<c> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().a_(a);
        }
    }
    
    @Override
    public final void b(final a a) {
        final Iterator<c> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b(a);
        }
    }
    
    public void b(final c c) {
        if (c != null) {
            this.a.remove(c);
        }
    }
}
