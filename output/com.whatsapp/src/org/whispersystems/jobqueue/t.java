// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems.jobqueue;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

class t
{
    private final Set a;
    private final LinkedList b;
    
    t() {
        this.a = new HashSet();
        this.b = new LinkedList();
    }
    
    private a a() {
        final boolean h = v.h;
        if (this.b.isEmpty()) {
            return null;
        }
        final ListIterator listIterator = this.b.listIterator();
        while (listIterator.hasNext()) {
            final a a = listIterator.next();
            if (a.b() && this.b(a.d())) {
                listIterator.remove();
                this.c(a.d());
                return a;
            }
            if (h) {
                break;
            }
        }
        return null;
    }
    
    private boolean b(final String s) {
        return s == null || !this.a.contains(s);
    }
    
    private void c(final String s) {
        if (s != null) {
            this.a.add(s);
        }
    }
    
    void a(final String s) {
        // monitorenter(this)
        if (s == null) {
            return;
        }
        try {
            this.a.remove(s);
            this.notifyAll();
        }
        finally {
        }
        // monitorexit(this)
    }
    
    void a(final List list) {
        synchronized (this) {
            this.b.addAll(list);
            this.notifyAll();
        }
    }
    
    void a(final a a) {
        synchronized (this) {
            this.b.add(a);
            this.notifyAll();
        }
    }
    
    void b() {
        synchronized (this) {
            this.notifyAll();
        }
    }
    
    void b(final a a) {
        synchronized (this) {
            this.b.addFirst(a);
        }
    }
    
    a c() {
        synchronized (this) {
            final boolean h = v.h;
            try {
                a a;
                do {
                    a = this.a();
                    if (a != null) {
                        break;
                    }
                    this.wait();
                } while (!h);
                return a;
            }
            catch (InterruptedException ex) {
                throw new AssertionError((Object)ex);
            }
        }
    }
}
