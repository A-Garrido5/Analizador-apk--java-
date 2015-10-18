// 
// Decompiled by Procyon v0.5.30
// 

package org;

import java.util.Iterator;
import java.util.EventListener;
import java.io.Serializable;

public class A implements Serializable
{
    private static final long serialVersionUID = -8017692739988399978L;
    private final Object a;
    private final i b;
    
    public A(final Object a) {
        this.b = new i();
        this.a = a;
    }
    
    public int a() {
        return this.b.a();
    }
    
    public void a(final int n, final String s) {
        final boolean c = M.c;
        final L l = new L(this.a, n, s);
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((E)iterator.next()).a(l);
            if (c) {
                break;
            }
        }
    }
    
    public void a(final String s, final String s2) {
        final boolean c = M.c;
        final L l = new L(this.a, s, s2);
        final Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((E)iterator.next()).b(l);
            if (c) {
                break;
            }
        }
    }
    
    public void a(final E e) {
        this.b.a(e);
    }
    
    public void b(final E e) {
        this.b.b(e);
    }
}
