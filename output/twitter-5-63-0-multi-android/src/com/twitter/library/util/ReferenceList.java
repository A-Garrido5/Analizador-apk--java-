// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.lang.ref.Reference;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ReferenceList implements Iterable
{
    private final List a;
    private final ReferenceList$ReferenceFactory b;
    
    private ReferenceList(final int n, final ReferenceList$ReferenceFactory b) {
        this.a = new ArrayList(n);
        this.b = b;
    }
    
    private ReferenceList(final ReferenceList$ReferenceFactory b) {
        this.a = new ArrayList();
        this.b = b;
    }
    
    public static ReferenceList a() {
        return new ReferenceList(ReferenceList$ReferenceFactory.a);
    }
    
    public static ReferenceList a(final int n) {
        return new ReferenceList(n, ReferenceList$ReferenceFactory.a);
    }
    
    public boolean a(final Object o) {
        final List a = this.a;
        // monitorenter(a)
        if (o == null) {
            return false;
        }
        try {
            final Iterator iterator = this.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(o)) {
                    return true;
                }
            }
            return false;
        }
        finally {
        }
        // monitorexit(a)
    }
    
    public void b() {
        synchronized (this.a) {
            this.a.clear();
        }
    }
    
    public void b(final Object o) {
        synchronized (this.a) {
            this.d();
            if (o != null) {
                this.a.add(this.b.a(o));
            }
        }
    }
    
    public int c() {
        synchronized (this.a) {
            return this.a.size();
        }
    }
    
    public boolean c(final Object o) {
        synchronized (this.a) {
            this.d();
            final Iterator iterator = this.iterator();
            while (iterator.hasNext()) {
                if (iterator.next().equals(o)) {
                    iterator.remove();
                    return true;
                }
            }
            return false;
        }
    }
    
    public void d() {
        while (true) {
            while (true) {
                int n;
                synchronized (this.a) {
                    final List a = this.a;
                    n = -1 + a.size();
                    if (n < 0) {
                        return;
                    }
                    if (a.get(n).get() == null) {
                        a.remove(n);
                    }
                }
                --n;
                continue;
            }
        }
    }
    
    @Override
    public Iterator iterator() {
        return new at(this, null);
    }
}
