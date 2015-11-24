// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

public abstract class r extends q
{
    protected Vector a;
    
    protected r() {
        this.a = new Vector();
    }
    
    protected r(final e e) {
        this.a = new Vector();
        for (int i = 0; i != e.a(); ++i) {
            this.a.addElement(e.a(i));
        }
    }
    
    private d a(final Enumeration enumeration) {
        return enumeration.nextElement();
    }
    
    public static r a(final Object o) {
        if (o == null || o instanceof r) {
            return (r)o;
        }
        if (o instanceof s) {
            return a((Object)((s)o).a());
        }
        if (o instanceof byte[]) {
            try {
                return a((Object)q.a((byte[])o));
            }
            catch (IOException ex) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + ex.getMessage());
            }
        }
        if (o instanceof d) {
            final q a = ((d)o).a();
            if (a instanceof r) {
                return (r)a;
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + o.getClass().getName());
    }
    
    public d a(final int n) {
        return this.a.elementAt(n);
    }
    
    @Override
    abstract void a(final o p0);
    
    @Override
    boolean a(final q q) {
        if (q instanceof r) {
            final r r = (r)q;
            if (this.e() == r.e()) {
                final Enumeration d = this.d();
                final Enumeration d2 = r.d();
                while (d.hasMoreElements()) {
                    final d a = this.a(d);
                    final d a2 = this.a(d2);
                    final q a3 = a.a();
                    final q a4 = a2.a();
                    if (a3 != a4) {
                        if (a3.equals(a4)) {
                            continue;
                        }
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    public d[] c() {
        final d[] array = new d[this.e()];
        for (int i = 0; i != this.e(); ++i) {
            array[i] = this.a(i);
        }
        return array;
    }
    
    public Enumeration d() {
        return this.a.elements();
    }
    
    public int e() {
        return this.a.size();
    }
    
    @Override
    q f() {
        final bf bf = new bf();
        bf.a = this.a;
        return bf;
    }
    
    @Override
    q g() {
        final bq bq = new bq();
        bq.a = this.a;
        return bq;
    }
    
    @Override
    boolean h() {
        return true;
    }
    
    @Override
    public int hashCode() {
        final Enumeration d = this.d();
        int e = this.e();
        while (d.hasMoreElements()) {
            e = (e * 17 ^ this.a(d).hashCode());
        }
        return e;
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
