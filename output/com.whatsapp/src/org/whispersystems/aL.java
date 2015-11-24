// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import java.util.Collection;
import java.util.LinkedList;
import com.google.hv;
import java.util.Iterator;

public class aL
{
    private static final String[] z;
    private aZ a;
    
    static {
        final String[] z2 = new String[4];
        String s = "Ig'U,ul\u0006C&up0pw";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0133:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'E';
                        break;
                    }
                    case 0: {
                        c2 = '\u001a';
                        break;
                    }
                    case 1: {
                        c2 = '\u0002';
                        break;
                    }
                    case 2: {
                        c2 = 'T';
                        break;
                    }
                    case 3: {
                        c2 = '&';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "[G\u0007";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "Ro5E\u0016RCf\u0013s";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    n2 = 3;
                    array = z2;
                    s = "Ig'U,ul\u0006C&up0pw";
                    n = 2;
                    continue;
                }
                case 2: {
                    break Label_0133;
                }
            }
        }
        array[n2] = intern;
        z = z2;
    }
    
    public aL() {
        this.a = aZ.o().b();
    }
    
    public aL(final aL al) {
        this.a = al.a.r().b();
    }
    
    public aL(final aZ a) {
        this.a = a;
    }
    
    private g a(final ak ak) {
        final boolean o = aZ.o;
        final Iterator<a_> iterator = (Iterator<a_>)this.a.a().iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final a_ a_ = iterator.next();
            try {
                if (s.a(a_.f().a(), 0).equals(ak)) {
                    return new g(a_, n);
                }
            }
            catch (aA aa) {
                bm.a(aL.z[3], aa);
            }
            final int n2 = n + 1;
            if (o) {
                break;
            }
            n = n2;
        }
        return null;
    }
    
    public J a() {
        final aN e = this.a.q().e();
        return new J(B.a(this.c()), e.g().a(), e.c());
    }
    
    public void a(final int n) {
        this.a = this.a.r().a(n).b();
    }
    
    public void a(final J j) {
        this.a = this.a.r().a(this.a.q().d().b(aN.m().a(hv.a(j.b())).a(j.c()).a()).l()).b();
    }
    
    public void a(final R r, final int n, final ak ak) {
        final bS a = av.a().b(n).a(hv.a(ak.a()));
        if (r.c()) {
            a.a((int)r.d());
        }
        this.a = this.a.r().a(a.c()).b();
    }
    
    public void a(final ak ak, final J j) {
        final g a = this.a(ak);
        this.a = this.a.r().a((int)a.b(), ((a_)a.a()).d().b(aN.m().a(hv.a(j.b())).a(j.c()).a()).l()).b();
    }
    
    public void a(final ak ak, final O o) {
        final g a = this.a(ak);
        this.a = this.a.r().a((int)a.b(), ((a_)a.a()).d().a(ah.d().c(hv.a(o.a().getEncoded())).a(hv.a(o.b().getEncoded())).a(o.d()).b(hv.a(o.c().getIV())).h()).l()).b();
    }
    
    public void a(final ao ao) {
        this.a = this.a.r().c(hv.a(ao.a())).b();
    }
    
    public void a(final o o) {
        this.a = this.a.r().d(hv.a(o.b())).b();
    }
    
    public void a(final w w, final J j) {
        this.a = this.a.r().a(a_.s().b(hv.a(w.b().a())).a(hv.a(w.a().a())).b(aN.m().a(hv.a(j.b())).a(j.c()).a()).l()).b();
    }
    
    public void a(final byte[] array) {
        this.a = this.a.r().b(hv.a(array)).b();
    }
    
    public boolean a(final ak ak, final int n) {
        final boolean o = aZ.o;
        final a_ a_ = (a_)this.a(ak).a();
        if (a_ == null) {
            return false;
        }
        final Iterator iterator = a_.b().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().k() == n) {
                return true;
            }
            if (o) {
                break;
            }
        }
        return false;
    }
    
    public J b(final ak ak) {
        final a_ a_ = (a_)this.a(ak).a();
        if (a_ == null) {
            return null;
        }
        return new J(B.a(this.c()), a_.e().g().a(), a_.e().c());
    }
    
    public O b(final ak ak, final int n) {
        final g a = this.a(ak);
        final a_ a_ = (a_)a.a();
        if (a_ == null) {
            return null;
        }
        final LinkedList list = new LinkedList<Object>(a_.b());
        final Iterator<ah> iterator = list.iterator();
        while (true) {
            while (iterator.hasNext()) {
                final ah ah = iterator.next();
                if (ah.k() == n) {
                    final O o = new O(new SecretKeySpec(ah.h().a(), aL.z[1]), new SecretKeySpec(ah.c().a(), aL.z[2]), new IvParameterSpec(ah.e().a()), ah.k());
                    iterator.remove();
                    final O o2 = o;
                    this.a = this.a.r().a((int)a.b(), a_.d().e().a(list).l()).b();
                    return o2;
                }
            }
            final O o2 = null;
            continue;
        }
    }
    
    public ao b() {
        return new ao(B.a(this.c()), this.a.c().a());
    }
    
    public void b(final int n) {
        this.a = this.a.r().c(n).b();
    }
    
    public void b(final ak ak, final J j) {
        this.a = this.a.r().c(a_.s().b(aN.m().a(hv.a(j.b())).a(j.c()).a()).b(hv.a(ak.a())).l()).b();
        if (this.a.a().size() > 5) {
            this.a = this.a.r().e(0).b();
        }
    }
    
    public void b(final o o) {
        this.a = this.a.r().a(hv.a(o.b())).b();
    }
    
    public int c() {
        int f = this.a.F();
        if (f == 0) {
            f = 2;
        }
        return f;
    }
    
    public void c(final int n) {
        this.a = this.a.r().d(n).b();
    }
    
    public boolean c(final ak ak) {
        return this.a(ak) != null;
    }
    
    public o d() {
        try {
            return new o(this.a.n().a(), 0);
        }
        catch (aA aa) {
            throw new AssertionError((Object)aa);
        }
    }
    
    public void d(final int n) {
        this.a = this.a.r().b(n).b();
    }
    
    public int e() {
        return this.a.C();
    }
    
    public void f() {
        this.a = this.a.r().j().b();
    }
    
    public o g() {
        try {
            if (!this.a.l()) {
                return null;
            }
            return new o(this.a.w().a(), 0);
        }
        catch (aA aa) {
            bm.a(aL.z[0], aa);
            return null;
        }
    }
    
    public ak h() {
        try {
            return s.a(this.a.q().f().a(), 0);
        }
        catch (aA aa) {
            throw new AssertionError((Object)aa);
        }
    }
    
    public aZ i() {
        return this.a;
    }
    
    public boolean j() {
        return this.a.b();
    }
    
    public int k() {
        return this.a.d();
    }
    
    public byte[] l() {
        return this.a.j().a();
    }
    
    public w m() {
        return new w(this.h(), s.a(this.a.q().j().a()));
    }
    
    public boolean n() {
        return this.a.h();
    }
    
    public c o() {
        try {
            if (this.a.p().m()) {
                final R r = R.a(this.a.p().l());
                if (!aZ.o) {
                    return new c(r, this.a.p().i(), s.a(this.a.p().f().a(), 0));
                }
            }
            final R r = R.a();
            return new c(r, this.a.p().i(), s.a(this.a.p().f().a(), 0));
        }
        catch (aA aa) {
            throw new AssertionError((Object)aa);
        }
    }
    
    public int p() {
        return this.a.z();
    }
}
