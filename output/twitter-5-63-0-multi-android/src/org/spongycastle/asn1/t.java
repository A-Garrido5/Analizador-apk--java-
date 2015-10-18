// 
// Decompiled by Procyon v0.5.30
// 

package org.spongycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.Enumeration;
import java.util.Vector;

public abstract class t extends q
{
    private Vector a;
    private boolean b;
    
    protected t() {
        this.a = new Vector();
        this.b = false;
    }
    
    protected t(final d d) {
        this.a = new Vector();
        this.b = false;
        this.a.addElement(d);
    }
    
    protected t(final e e, final boolean b) {
        int i = 0;
        this.a = new Vector();
        this.b = false;
        while (i != e.a()) {
            this.a.addElement(e.a(i));
            ++i;
        }
        if (b) {
            this.e();
        }
    }
    
    protected t(final d[] array, final boolean b) {
        int i = 0;
        this.a = new Vector();
        this.b = false;
        while (i != array.length) {
            this.a.addElement(array[i]);
            ++i;
        }
        if (b) {
            this.e();
        }
    }
    
    private d a(final Enumeration enumeration) {
        d a = enumeration.nextElement();
        if (a == null) {
            a = ay.a;
        }
        return a;
    }
    
    public static t a(final w w, final boolean b) {
        if (b) {
            if (!w.d()) {
                throw new IllegalArgumentException("object implicit - explicit expected.");
            }
            return (t)w.j();
        }
        else if (w.d()) {
            if (w instanceof aj) {
                return new ah(w.j());
            }
            return new br(w.j());
        }
        else {
            if (w.j() instanceof t) {
                return (t)w.j();
            }
            new e();
            if (!(w.j() instanceof r)) {
                throw new IllegalArgumentException("unknown object in getInstance: " + w.getClass().getName());
            }
            final r r = (r)w.j();
            if (w instanceof aj) {
                return new ah(r.c());
            }
            return new br(r.c());
        }
    }
    
    private boolean a(final byte[] array, final byte[] array2) {
        final int min = Math.min(array.length, array2.length);
        int i = 0;
        while (i != min) {
            if (array[i] != array2[i]) {
                if ((0xFF & array[i]) < (0xFF & array2[i])) {
                    return true;
                }
                return false;
            }
            else {
                ++i;
            }
        }
        if (min != array.length) {
            return false;
        }
        return true;
    }
    
    private byte[] a(final d d) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final o o = new o(byteArrayOutputStream);
        try {
            o.a(d);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException ex) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }
    
    @Override
    abstract void a(final o p0);
    
    @Override
    boolean a(final q q) {
        if (q instanceof t) {
            final t t = (t)q;
            if (this.d() == t.d()) {
                final Enumeration c = this.c();
                final Enumeration c2 = t.c();
                while (c.hasMoreElements()) {
                    final d a = this.a(c);
                    final d a2 = this.a(c2);
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
    
    public Enumeration c() {
        return this.a.elements();
    }
    
    public int d() {
        return this.a.size();
    }
    
    protected void e() {
        if (!this.b) {
            this.b = true;
            if (this.a.size() > 1) {
                int n = -1 + this.a.size();
                int i = 1;
                while (i != 0) {
                    byte[] a = this.a(this.a.elementAt(0));
                    int n2 = 0;
                    int j = 0;
                    i = 0;
                    while (j != n) {
                        byte[] a2 = this.a(this.a.elementAt(j + 1));
                        int n3;
                        int n4;
                        if (this.a(a, a2)) {
                            n3 = n2;
                            n4 = i;
                        }
                        else {
                            final Object element = this.a.elementAt(j);
                            this.a.setElementAt(this.a.elementAt(j + 1), j);
                            this.a.setElementAt(element, j + 1);
                            a2 = a;
                            n4 = 1;
                            n3 = j;
                        }
                        ++j;
                        i = n4;
                        n2 = n3;
                        a = a2;
                    }
                    n = n2;
                }
            }
        }
    }
    
    @Override
    q f() {
        if (this.b) {
            final bh bh = new bh();
            bh.a = this.a;
            return bh;
        }
        final Vector<Object> a = new Vector<Object>();
        for (int i = 0; i != this.a.size(); ++i) {
            a.addElement(this.a.elementAt(i));
        }
        final bh bh2 = new bh();
        bh2.a = a;
        bh2.e();
        return bh2;
    }
    
    @Override
    q g() {
        final br br = new br();
        br.a = this.a;
        return br;
    }
    
    @Override
    boolean h() {
        return true;
    }
    
    @Override
    public int hashCode() {
        final Enumeration c = this.c();
        int d = this.d();
        while (c.hasMoreElements()) {
            d = (d * 17 ^ this.a(c).hashCode());
        }
        return d;
    }
    
    @Override
    public String toString() {
        return this.a.toString();
    }
}
