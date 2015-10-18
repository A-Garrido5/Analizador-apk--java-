// 
// Decompiled by Procyon v0.5.30
// 

package org.whispersystems;

public class Q
{
    private static final String d;
    private static final String[] z;
    private final V a;
    private final i b;
    private final a5 c;
    private final M e;
    private final a4 f;
    
    static {
        final String[] z2 = new String[6];
        String s = "s\u0018t\u000b\u0015Q\u0018?\u0013\u001fT\u0005v\n\u0014\u001cV";
        int n = -1;
        String[] array = z2;
        int n2 = 0;
        String intern = null;
    Label_0183:
        while (true) {
            final char[] charArray = s.toCharArray();
            for (int i = charArray.length, n3 = 0; i > n3; ++n3) {
                final char c = charArray[n3];
                char c2 = '\0';
                switch (n3 % 5) {
                    default: {
                        c2 = 'z';
                        break;
                    }
                    case 0: {
                        c2 = '&';
                        break;
                    }
                    case 1: {
                        c2 = 'v';
                        break;
                    }
                    case 2: {
                        c2 = '\u001f';
                        break;
                    }
                    case 3: {
                        c2 = 'e';
                        break;
                    }
                }
                charArray[n3] = (char)(c2 ^ c);
            }
            intern = new String(charArray).intern();
            switch (n) {
                default: {
                    array[n2] = intern;
                    s = "o\u0018i\u0004\u0016O\u0012?\u0016\u0013A\u0018~\u0011\u000fT\u0013?\n\u0014\u0006\u0012z\u0013\u0013E\u0013?\u000e\u001f_W";
                    n2 = 1;
                    array = z2;
                    n = 0;
                    continue;
                }
                case 0: {
                    array[n2] = intern;
                    s = "d\u0019k\rZU\u001fx\u000b\u001fBV~\u000b\u001e\u0006\u0003q\u0016\u0013A\u0018z\u0001ZV\u0004z\u000e\u001f_\u0005?\u0004\bCV~\u0007\tC\u0018kD";
                    n2 = 2;
                    array = z2;
                    n = 1;
                    continue;
                }
                case 1: {
                    array[n2] = intern;
                    s = "q\u00138\u0013\u001f\u0006\u0017s\u0017\u001fG\u0012fE\tC\u0002j\u0015ZGVl\u0000\tU\u001fp\u000bZ@\u0019mE\u000eN\u001flE,\u0015Vr\u0000\tU\u0017x\u0000V\u0006\u001az\u0011\u000eO\u0018xE\u0018S\u0018{\t\u001fBVr\u0000\tU\u0017x\u0000Z@\u0017s\tZR\u001em\n\u000fA\u001e1KT";
                    n2 = 3;
                    array = z2;
                    n = 2;
                    continue;
                }
                case 2: {
                    array[n2] = intern;
                    s = "q\u00138\u0013\u001f\u0006\u0017s\u0017\u001fG\u0012fE\nT\u0019|\u0000\tU\u0013{E\u000eN\u0013?\u0015\bC\u001dz\u001cZV\u0017m\u0011ZI\u0010?\u0011\u0012O\u0005?3H\u0006\u0005z\u0016\tO\u0019qIZJ\u0013k\u0011\u0013H\u0011?\u0007\u000fH\u0012s\u0000\u001e\u0006\u001bz\u0016\tG\u0011zE\u001cG\u001asE\u000eN\u0004p\u0010\u001dNX1K";
                    n2 = 4;
                    array = z2;
                    n = 3;
                    continue;
                }
                case 3: {
                    array[n2] = intern;
                    n2 = 5;
                    array = z2;
                    s = "pD?\b\u001fU\u0005~\u0002\u001f\u0006\u0004z\u0014\u000fO\u0004z\u0016ZI\u0018zE\u000eO\u001bzE\nT\u0013t\u0000\u0003\u0006\u001f{D";
                    n = 4;
                    continue;
                }
                case 4: {
                    break Label_0183;
                }
            }
        }
        array[n2] = intern;
        z = z2;
        d = Q.class.getSimpleName();
    }
    
    public Q(final i b, final M e, final a4 f, final a5 c, final V a) {
        this.b = b;
        this.e = e;
        this.f = f;
        this.c = c;
        this.a = a;
    }
    
    private R a(final at at, final W w) {
        if (!w.d().c()) {
            throw new aW(Q.z[5]);
        }
        if (!this.e.a((int)w.d().d()) && this.b.a(this.a)) {
            bm.a(Q.d, Q.z[4]);
            return R.a();
        }
        final w a = this.e.b((int)w.d().d()).a();
        final H f = E.f();
        f.a(this.c.a()).b(a).a(a).a(R.a()).a(w.b()).a(w.g());
        if (!at.a()) {
            at.c();
        }
        bk.a(at.b(), w.e(), f.a());
        at.b().a(this.c.b());
        at.b().d(w.f());
        at.b().a(w.g().a());
        if ((int)w.d().d() != aS.a) {
            return w.d();
        }
        return R.a();
    }
    
    private R c(final at at, final W w) {
        if (at.a(w.e(), w.g().a())) {
            bm.a(Q.d, Q.z[3]);
            return R.a();
        }
        final w a = this.f.a(w.a()).a();
        final H f = E.f();
        f.a(w.g()).a(w.b()).a(this.c.a()).b(a).a(a);
        Label_0153: {
            if (w.d().c()) {
                f.a(R.a(this.e.b((int)w.d().d()).a()));
                if (aA.a == 0) {
                    break Label_0153;
                }
            }
            f.a(R.a());
        }
        if (!at.a()) {
            at.c();
        }
        bk.a(at.b(), w.e(), f.a());
        at.b().a(this.c.b());
        at.b().d(w.f());
        at.b().a(w.g().a());
        if (w.d().c() && (int)w.d().d() != aS.a) {
            return w.d();
        }
        return R.a();
    }
    
    public void a(final bP bp) {
        int n = 2;
        final int a = aA.a;
        synchronized (aK.a) {
            if (!this.c.a(this.a.b(), bp.b())) {
                throw new au();
            }
        }
        if (bp.d() != null && !s.a(bp.b().a(), bp.d().a(), bp.g())) {
            throw new aA(Q.z[1]);
        }
        if (bp.d() == null && bp.a() == null) {
            throw new aA(Q.z[2]);
        }
        boolean b;
        if (bp.d() != null) {
            b = true;
        }
        else {
            b = false;
        }
        final at b2 = this.b.b(this.a);
        final w a2 = s.a();
        ak ak;
        if (b) {
            ak = bp.d();
        }
        else {
            ak = bp.a();
        }
        R r = R.b(bp.a());
        R r2;
        if (r.c()) {
            r2 = R.a(bp.e());
        }
        else {
            r2 = R.a();
        }
        final a3 g = Z.g();
        final a3 b3 = g.a(a2).a(this.c.a()).a(bp.b()).a(ak).b(ak);
        if (!b) {
            r = R.a();
        }
        b3.a(r);
        if (!b2.a()) {
            b2.c();
        }
        final aL b4 = b2.b();
        if (b) {
            n = 3;
        }
        bk.a(b4, n, g.a());
        b2.b().a(r2, bp.f(), a2.b());
        b2.b().a(this.c.b());
        b2.b().d(bp.c());
        b2.b().a(a2.b().a());
        this.b.a(this.a, b2);
        this.c.b(this.a.b(), bp.b());
        // monitorexit(o)
        if (a != 0) {
            ++bO.s;
        }
    }
    
    R b(final at at, final W w) {
        final int a = aA.a;
        final int e = w.e();
        final o b = w.b();
        if (!this.c.a(this.a.b(), b)) {
            throw new au();
        }
        R r = null;
        Label_0123: {
            Label_0111: {
                switch (e) {
                    case 2: {
                        r = this.a(at, w);
                        if (a != 0) {
                            break Label_0111;
                        }
                        break Label_0123;
                    }
                    case 3: {
                        r = this.c(at, w);
                        if (a == 0) {
                            break Label_0123;
                        }
                        break;
                    }
                }
            }
            throw new AssertionError((Object)(Q.z[0] + e));
        }
        this.c.b(this.a.b(), b);
        return r;
    }
}
