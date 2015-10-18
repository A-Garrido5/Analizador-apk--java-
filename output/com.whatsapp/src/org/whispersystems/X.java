// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
import com.google.hv;

public class X
{
    private af a;
    
    public X(final int n, final int n2, final byte[] array, final ak ak) {
        this(n, n2, array, ak, R.a());
    }
    
    private X(final int n, final int n2, final byte[] array, final ak ak, final R r) {
        final aa d = aa.e().a(n2).a(hv.a(array)).d();
        final a7 a = as.c().a(hv.a(ak.a()));
        if (r.c()) {
            a.b(hv.a(((P)r.d()).a()));
        }
        this.a = af.i().a(n).b(d).a(a).h();
    }
    
    public X(final int n, final int n2, final byte[] array, final w w) {
        this(n, n2, array, w.b(), R.a(w.a()));
    }
    
    public X(final af a) {
        this.a = a;
    }
    
    public P a() {
        return s.a(this.a.k().d().a());
    }
    
    public ar a(final int n) {
        final boolean a = aT.a;
        final LinkedList<aF> list = new LinkedList<aF>(this.a.f());
        final Iterator<Object> iterator = list.iterator();
        while (true) {
            while (iterator.hasNext()) {
                final aF af = iterator.next();
                if (af.d() == n) {
                    iterator.remove();
                    this.a = this.a.j().j().a(list).h();
                    ar ar;
                    if (af != null) {
                        ar = new ar(af.d(), af.h().a());
                    }
                    else {
                        ar = null;
                        if (a) {
                            ++bO.s;
                            return null;
                        }
                    }
                    return ar;
                }
            }
            final aF af = null;
            continue;
        }
    }
    
    public void a(final a9 a9) {
        this.a = this.a.j().b(aa.e().a(a9.a()).a(hv.a(a9.c())).d()).h();
    }
    
    public void a(final ar ar) {
        final boolean a = aT.a;
        this.a = this.a.j().a(aF.j().a(ar.c()).a(hv.a(ar.d())).g()).h();
        if (bO.s != 0) {
            aT.a = !a;
        }
    }
    
    public int b() {
        return this.a.b();
    }
    
    public boolean b(final int n) {
        final boolean a = aT.a;
        final Iterator<aF> iterator = this.a.f().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().d() == n) {
                return true;
            }
            if (a) {
                break;
            }
        }
        return false;
    }
    
    public af c() {
        return this.a;
    }
    
    public a9 d() {
        return new a9(this.a.t().b(), this.a.t().k().a());
    }
    
    public ak e() {
        return s.a(this.a.k().a().a(), 0);
    }
}
