import com.fasterxml.jackson.core.JsonFactory$Feature;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.5.30
// 

public final class t
{
    protected final t a;
    protected final AtomicReference b;
    protected boolean c;
    protected final boolean d;
    protected int e;
    protected int f;
    protected int g;
    protected int[] h;
    protected y[] i;
    protected u[] j;
    protected int k;
    protected int l;
    protected BitSet m;
    private final int n;
    private transient boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    
    private t(int n, final boolean c, final int n2, final boolean d) {
        int i = 16;
        this.a = null;
        this.n = n2;
        this.c = c;
        this.d = d;
        if (n < i) {
            n = i;
        }
        else if ((n & n - 1) != 0x0) {
            while (i < n) {
                i += i;
            }
            n = i;
        }
        this.b = new AtomicReference((V)this.f(n));
    }
    
    private t(final t a, final boolean c, final int n, final boolean d, final v v) {
        this.a = a;
        this.n = n;
        this.c = c;
        this.d = d;
        this.b = null;
        this.e = v.a;
        this.g = v.b;
        this.h = v.c;
        this.i = v.d;
        this.j = v.e;
        this.k = v.f;
        this.l = v.g;
        this.f = v.h;
        this.o = false;
        this.p = true;
        this.q = true;
        this.r = true;
    }
    
    public static t a() {
        final long currentTimeMillis = System.currentTimeMillis();
        return a(0x1 | (int)currentTimeMillis + (int)(currentTimeMillis >>> 32));
    }
    
    protected static t a(final int n) {
        return new t(64, true, n, true);
    }
    
    private static y a(final int n, final String s, final int[] array, final int n2) {
        if (n2 < 4) {
            switch (n2) {
                case 1: {
                    return new z(s, n, array[0]);
                }
                case 2: {
                    return new aa(s, n, array[0], array[1]);
                }
                case 3: {
                    return new ab(s, n, array[0], array[1], array[2]);
                }
            }
        }
        return ac.a(s, n, array, n2);
    }
    
    private void a(final int n, final u u) {
        if (this.m == null) {
            (this.m = new BitSet()).set(n);
        }
        else if (this.m.get(n)) {
            if (this.d) {
                this.e(100);
            }
            this.c = false;
        }
        else {
            this.m.set(n);
        }
        this.j[n] = null;
        this.e -= u.d;
        this.f = -1;
    }
    
    private void a(final int n, final y y) {
        if (this.p) {
            this.h();
        }
        if (this.o) {
            this.e();
        }
        ++this.e;
        final int n2 = n & this.g;
        if (this.i[n2] == null) {
            this.h[n2] = n << 8;
            if (this.q) {
                this.j();
            }
            this.i[n2] = y;
        }
        else {
            if (this.r) {
                this.i();
            }
            ++this.k;
            final int n3 = this.h[n2];
            final int n4 = n3 & 0xFF;
            int n5;
            if (n4 == 0) {
                if (this.l <= 254) {
                    n5 = this.l;
                    ++this.l;
                    if (n5 >= this.j.length) {
                        this.k();
                    }
                }
                else {
                    n5 = this.g();
                }
                this.h[n2] = ((n3 & 0xFFFFFF00) | n5 + 1);
            }
            else {
                n5 = n4 - 1;
            }
            final u u = new u(y, this.j[n5]);
            if (u.d > 100) {
                this.a(n5, u);
            }
            else {
                this.j[n5] = u;
                this.f = Math.max(u.d, this.f);
            }
        }
        final int length = this.h.length;
        if (this.e > length >> 1) {
            final int n6 = length >> 2;
            if (this.e > length - n6) {
                this.o = true;
            }
            else if (this.k >= n6) {
                this.o = true;
            }
        }
    }
    
    private void a(v f) {
        final int a = f.a;
        final v v = this.b.get();
        if (a == v.a) {
            return;
        }
        if (a > 6000) {
            f = this.f(64);
        }
        this.b.compareAndSet(v, f);
    }
    
    public static y d() {
        return z.b();
    }
    
    private void e() {
        int f = 0;
        this.o = false;
        this.q = false;
        final int length = this.h.length;
        final int n = length + length;
        if (n > 65536) {
            this.f();
        }
        else {
            this.h = new int[n];
            this.g = n - 1;
            final y[] i = this.i;
            this.i = new y[n];
            int j = 0;
            int n2 = 0;
            while (j < length) {
                final y y = i[j];
                if (y != null) {
                    ++n2;
                    final int hashCode = y.hashCode();
                    final int n3 = hashCode & this.g;
                    this.i[n3] = y;
                    this.h[n3] = hashCode << 8;
                }
                ++j;
            }
            final int l = this.l;
            if (l == 0) {
                this.f = 0;
                return;
            }
            this.k = 0;
            this.l = 0;
            this.r = false;
            final u[] k = this.j;
            this.j = new u[k.length];
            int n4 = 0;
            int n5 = n2;
            while (n4 < l) {
                final u u = k[n4];
                int n6 = n5;
                int n7;
                int max;
                for (u b = u; b != null; b = b.b, f = max, n6 = n7) {
                    n7 = n6 + 1;
                    final y a = b.a;
                    final int hashCode2 = a.hashCode();
                    final int n8 = hashCode2 & this.g;
                    final int n9 = this.h[n8];
                    if (this.i[n8] == null) {
                        this.h[n8] = hashCode2 << 8;
                        this.i[n8] = a;
                        max = f;
                    }
                    else {
                        ++this.k;
                        final int n10 = n9 & 0xFF;
                        int n11;
                        if (n10 == 0) {
                            if (this.l <= 254) {
                                n11 = this.l;
                                ++this.l;
                                if (n11 >= this.j.length) {
                                    this.k();
                                }
                            }
                            else {
                                n11 = this.g();
                            }
                            this.h[n8] = ((n9 & 0xFFFFFF00) | n11 + 1);
                        }
                        else {
                            n11 = n10 - 1;
                        }
                        final u u2 = new u(a, this.j[n11]);
                        this.j[n11] = u2;
                        max = Math.max(f, u2.d);
                    }
                }
                ++n4;
                n5 = n6;
            }
            this.f = f;
            if (n5 != this.e) {
                throw new RuntimeException("Internal error: count after rehash " + n5 + "; should be " + this.e);
            }
        }
    }
    
    private v f(final int n) {
        return new v(0, n - 1, new int[n], new y[n], null, 0, 0, 0);
    }
    
    private void f() {
        this.e = 0;
        this.f = 0;
        Arrays.fill(this.h, 0);
        Arrays.fill(this.i, null);
        Arrays.fill(this.j, null);
        this.k = 0;
        this.l = 0;
    }
    
    private int g() {
        final u[] j = this.j;
        int n = Integer.MAX_VALUE;
        int n2 = -1;
        int i = 0;
        while (i < this.l) {
            final u u = j[i];
            if (u != null) {
                int d = u.d;
                if (d < n) {
                    if (d == 1) {
                        return i;
                    }
                    n2 = i;
                }
                else {
                    d = n;
                }
                ++i;
                n = d;
                continue;
            }
            return i;
        }
        return n2;
    }
    
    private void h() {
        final int[] h = this.h;
        this.h = Arrays.copyOf(h, h.length);
        this.p = false;
    }
    
    private void i() {
        final u[] j = this.j;
        if (j == null) {
            this.j = new u[32];
        }
        else {
            this.j = Arrays.copyOf(j, j.length);
        }
        this.r = false;
    }
    
    private void j() {
        final y[] i = this.i;
        this.i = Arrays.copyOf(i, i.length);
        this.q = false;
    }
    
    private void k() {
        final u[] j = this.j;
        this.j = Arrays.copyOf(j, 2 * j.length);
    }
    
    public y a(final int n, final int n2) {
        int n3;
        if (n2 == 0) {
            n3 = this.d(n);
        }
        else {
            n3 = this.b(n, n2);
        }
        final int n4 = n3 & this.g;
        final int n5 = this.h[n4];
        if ((n3 ^ n5 >> 8) << 8 == 0) {
            final y y = this.i[n4];
            if (y == null) {
                return null;
            }
            if (y.a(n, n2)) {
                return y;
            }
        }
        else if (n5 == 0) {
            return null;
        }
        final int n6 = n5 & 0xFF;
        if (n6 > 0) {
            final u u = this.j[n6 - 1];
            if (u != null) {
                return u.a(n3, n, n2);
            }
        }
        return null;
    }
    
    public y a(String a, final int[] array, final int n) {
        if (this.c) {
            a = InternCache.a.a(a);
        }
        int n2;
        if (n < 3) {
            if (n == 1) {
                n2 = this.d(array[0]);
            }
            else {
                n2 = this.b(array[0], array[1]);
            }
        }
        else {
            n2 = this.b(array, n);
        }
        final y a2 = a(n2, a, array, n);
        this.a(n2, a2);
        return a2;
    }
    
    public y a(final int[] array, final int n) {
        if (n >= 3) {
            final int b = this.b(array, n);
            final int n2 = b & this.g;
            final int n3 = this.h[n2];
            if ((b ^ n3 >> 8) << 8 == 0) {
                final y a = this.i[n2];
                if (a == null || a.a(array, n)) {
                    return a;
                }
            }
            else if (n3 == 0) {
                return null;
            }
            final int n4 = n3 & 0xFF;
            if (n4 > 0) {
                final u u = this.j[n4 - 1];
                if (u != null) {
                    return u.a(b, array, n);
                }
            }
            return null;
        }
        final int n5 = array[0];
        int n6 = 0;
        if (n >= 2) {
            n6 = array[1];
        }
        return this.a(n5, n6);
    }
    
    public int b(final int n, final int n2) {
        final int n3 = (n ^ n >>> 15) + n2 * 33 ^ this.n;
        return n3 + (n3 >>> 7);
    }
    
    public int b(final int[] array, final int n) {
        int i = 3;
        if (n < i) {
            throw new IllegalArgumentException();
        }
        final int n2 = array[0] ^ this.n;
        final int n3 = 65599 * (33 * (n2 + (n2 >>> 9)) + array[1]);
        final int n4 = n3 + (n3 >>> 15) ^ array[2];
        int n5 = n4 + (n4 >>> 17);
        while (i < n) {
            final int n6 = n5 * 31 ^ array[i];
            final int n7 = n6 + (n6 >>> 3);
            n5 = (n7 ^ n7 << 7);
            ++i;
        }
        final int n8 = n5 + (n5 >>> 15);
        return n8 ^ n8 << 9;
    }
    
    public t b(final int n) {
        return new t(this, JsonFactory$Feature.a.a(n), this.n, JsonFactory$Feature.c.a(n), this.b.get());
    }
    
    public void b() {
        if (this.a != null && this.c()) {
            this.a.a(new v(this));
            this.p = true;
            this.q = true;
            this.r = true;
        }
    }
    
    public y c(final int n) {
        final int d = this.d(n);
        final int n2 = d & this.g;
        final int n3 = this.h[n2];
        Label_0066: {
            if ((d ^ n3 >> 8) << 8 == 0) {
                final y y = this.i[n2];
                if (y != null) {
                    if (y.a(n)) {
                        return y;
                    }
                    break Label_0066;
                }
            }
            else if (n3 != 0) {
                break Label_0066;
            }
            return null;
        }
        final int n4 = n3 & 0xFF;
        if (n4 <= 0) {
            return null;
        }
        final u u = this.j[n4 - 1];
        if (u != null) {
            return u.a(d, n, 0);
        }
        return null;
    }
    
    public boolean c() {
        return !this.p;
    }
    
    public int d(final int n) {
        final int n2 = n ^ this.n;
        final int n3 = n2 + (n2 >>> 15);
        return n3 ^ n3 >>> 9;
    }
    
    protected void e(final int n) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.e + ") now exceeds maximum, " + n + " -- suspect a DoS attack based on hash collisions");
    }
}
