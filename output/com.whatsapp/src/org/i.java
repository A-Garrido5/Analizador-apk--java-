// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.util.Iterator;
import java.util.EventListener;
import java.util.concurrent.CopyOnWriteArrayList;
import java.io.Serializable;

public class i implements Serializable, Iterable
{
    public static int b = 0;
    private static final long serialVersionUID = -1934227607974228213L;
    private final CopyOnWriteArrayList a;
    
    public i() {
        final int b = i.b;
        this.a = new CopyOnWriteArrayList();
        if (b != 0) {
            ++l.a;
        }
    }
    
    public int a() {
        return this.a.size();
    }
    
    public void a(final EventListener eventListener) {
        this.a.remove(eventListener);
    }
    
    public void b(final EventListener eventListener) {
        this.a.add(eventListener);
    }
    
    @Override
    public Iterator iterator() {
        return this.a.iterator();
    }
}
