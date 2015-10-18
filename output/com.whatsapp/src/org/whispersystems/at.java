// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class at
{
    private LinkedList a;
    private boolean b;
    private aL c;
    
    public at() {
        this.c = new aL();
        this.a = new LinkedList();
        this.b = false;
        this.b = true;
    }
    
    public at(final byte[] array) {
        final boolean o = aZ.o;
        this.c = new aL();
        this.a = new LinkedList();
        this.b = false;
        final ay a = ay.a(array);
        this.c = new aL(a.l());
        this.b = false;
        final Iterator iterator = a.n().iterator();
        while (iterator.hasNext()) {
            this.a.add(new aL(iterator.next()));
            if (o) {
                break;
            }
        }
    }
    
    public void a(final aL c) {
        this.a.addFirst(this.c);
        this.c = c;
        if (this.a.size() > 40) {
            this.a.removeLast();
        }
    }
    
    public boolean a() {
        return this.b;
    }
    
    public boolean a(final int n, final byte[] array) {
        final boolean o = aZ.o;
        if (this.c.c() == n && Arrays.equals(array, this.c.l())) {
            return true;
        }
        for (final aL al : this.a) {
            if (al.c() == n && Arrays.equals(array, al.l())) {
                return true;
            }
            if (o) {
                break;
            }
        }
        return false;
    }
    
    public aL b() {
        return this.c;
    }
    
    public void b(final aL c) {
        this.c = c;
    }
    
    public void c() {
        this.a(new aL());
    }
    
    public byte[] d() {
        final boolean o = aZ.o;
        final LinkedList<aZ> list = new LinkedList<aZ>();
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            list.add(iterator.next().i());
            if (o) {
                break;
            }
        }
        return ay.b().a(this.c.i()).a(list).b().a();
    }
    
    public List e() {
        return this.a;
    }
}
