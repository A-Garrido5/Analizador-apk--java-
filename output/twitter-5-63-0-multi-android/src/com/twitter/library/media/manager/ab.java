// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.manager;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.concurrent.Future;
import java.util.List;

class ab
{
    public final List a;
    private Future b;
    
    public ab(final af af) {
        (this.a = new ArrayList(1)).add(af);
    }
    
    public ab(final Future b) {
        this.a = new ArrayList(4);
        this.b = b;
    }
    
    public void a(final ResourceResponse$ResourceSource c) {
        for (final af af : this.a) {
            if (af.c == ResourceResponse$ResourceSource.a) {
                af.c = c;
            }
        }
    }
    
    public void a(final af af) {
        this.a.add(af);
    }
    
    public boolean a() {
        return this.b != null;
    }
    
    public void b() {
        this.a.clear();
        this.b = null;
    }
    
    public boolean b(final af af) {
        if (this.a.remove(af)) {
            af.b.d();
            if (this.a.isEmpty()) {
                this.c();
            }
            return true;
        }
        return false;
    }
    
    public void c() {
        final Iterator<af> iterator = this.a.iterator();
        while (iterator.hasNext()) {
            iterator.next().b.d();
        }
        this.a.clear();
        if (this.b != null) {
            this.b.cancel(false);
            this.b = null;
        }
    }
}
