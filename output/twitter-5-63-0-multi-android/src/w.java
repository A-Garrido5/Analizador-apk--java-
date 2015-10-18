import java.util.Arrays;
import com.fasterxml.jackson.core.util.InternCache;
import com.fasterxml.jackson.core.JsonFactory$Feature;
import java.util.BitSet;

// 
// Decompiled by Procyon v0.5.30
// 

public final class w
{
    static final w a;
    protected w b;
    protected final int c;
    protected boolean d;
    protected String[] e;
    protected x[] f;
    protected int g;
    protected int h;
    protected int i;
    protected int j;
    protected boolean k;
    protected BitSet l;
    private final int m;
    
    static {
        a = new w();
    }
    
    private w() {
        this.d = true;
        this.c = -1;
        this.k = true;
        this.m = 0;
        this.j = 0;
        this.e(64);
    }
    
    private w(final w b, final int c, final String[] e, final x[] f, final int g, final int m, final int j) {
        this.b = b;
        this.c = c;
        this.d = JsonFactory$Feature.b.a(c);
        this.e = e;
        this.f = f;
        this.g = g;
        this.m = m;
        final int length = e.length;
        this.h = f(length);
        this.i = length - 1;
        this.j = j;
        this.k = false;
    }
    
    private String a(final char[] array, final int n, final int n2, final int n3, int c) {
        if (!this.k) {
            this.f();
            this.k = true;
        }
        else if (this.g >= this.h) {
            this.g();
            c = this.c(this.a(array, n, n2));
        }
        String a = new String(array, n, n2);
        if (JsonFactory$Feature.a.a(this.c)) {
            a = InternCache.a.a(a);
        }
        ++this.g;
        if (this.e[c] == null) {
            return this.e[c] = a;
        }
        final int n4 = c >> 1;
        final x x = new x(a, this.f[n4]);
        final int c2 = x.c;
        if (c2 > 100) {
            this.a(n4, x);
            return a;
        }
        this.f[n4] = x;
        this.j = Math.max(c2, this.j);
        return a;
    }
    
    private String a(final char[] array, final int n, final int n2, x b) {
        while (b != null) {
            final String a = b.a(array, n, n2);
            if (a != null) {
                return a;
            }
            b = b.b;
        }
        return null;
    }
    
    public static w a() {
        final long currentTimeMillis = System.currentTimeMillis();
        return a(0x1 | (int)currentTimeMillis + (int)(currentTimeMillis >>> 32));
    }
    
    protected static w a(final int n) {
        return w.a.g(n);
    }
    
    private void a(final int n, final x x) {
        if (this.l == null) {
            (this.l = new BitSet()).set(n);
        }
        else if (this.l.get(n)) {
            if (JsonFactory$Feature.c.a(this.c)) {
                this.d(100);
            }
            this.d = false;
        }
        else {
            this.l.set(n);
        }
        this.e[n + n] = x.a;
        this.f[n] = null;
        this.g -= x.c;
        this.j = -1;
    }
    
    private void a(final w w) {
        if (w.c() > 12000) {
            synchronized (this) {
                this.e(256);
                this.k = false;
                return;
            }
        }
        if (w.c() > this.c()) {
            synchronized (this) {
                this.e = w.e;
                this.f = w.f;
                this.g = w.g;
                this.h = w.h;
                this.i = w.i;
                this.j = w.j;
                this.k = false;
            }
        }
    }
    
    private void e(final int n) {
        this.e = new String[n];
        this.f = new x[n >> 1];
        this.i = n - 1;
        this.g = 0;
        this.j = 0;
        this.h = f(n);
    }
    
    private static int f(final int n) {
        return n - (n >> 2);
    }
    
    private void f() {
        final String[] e = this.e;
        this.e = Arrays.copyOf(e, e.length);
        final x[] f = this.f;
        this.f = Arrays.copyOf(f, f.length);
    }
    
    private w g(final int n) {
        return new w(null, -1, this.e, this.f, this.g, n, this.j);
    }
    
    private void g() {
        final int length = this.e.length;
        final int n = length + length;
        if (n > 65536) {
            this.g = 0;
            this.d = false;
            this.e = new String[64];
            this.f = new x[32];
            this.i = 63;
            this.k = true;
        }
        else {
            final String[] e = this.e;
            final x[] f = this.f;
            this.e = new String[n];
            this.f = new x[n >> 1];
            this.i = n - 1;
            this.h = f(n);
            int i = 0;
            int max = 0;
            int n2 = 0;
            while (i < length) {
                final String s = e[i];
                if (s != null) {
                    ++n2;
                    final int c = this.c(this.a(s));
                    if (this.e[c] == null) {
                        this.e[c] = s;
                    }
                    else {
                        final int n3 = c >> 1;
                        final x x = new x(s, this.f[n3]);
                        this.f[n3] = x;
                        max = Math.max(max, x.c);
                    }
                }
                ++i;
            }
            final int n4 = length >> 1;
            int j = 0;
            int n5 = n2;
            int k = max;
            while (j < n4) {
                final x x2 = f[j];
                int max2 = k;
                for (x b = x2; b != null; b = b.b) {
                    ++n5;
                    final String a = b.a;
                    final int c2 = this.c(this.a(a));
                    if (this.e[c2] == null) {
                        this.e[c2] = a;
                    }
                    else {
                        final int n6 = c2 >> 1;
                        final x x3 = new x(a, this.f[n6]);
                        this.f[n6] = x3;
                        max2 = Math.max(max2, x3.c);
                    }
                }
                ++j;
                k = max2;
            }
            this.j = k;
            this.l = null;
            if (n5 != this.g) {
                throw new Error("Internal error on SymbolTable.rehash(): had " + this.g + " entries; now have " + n5 + ".");
            }
        }
    }
    
    public int a(final String s) {
        final int length = s.length();
        int m = this.m;
        int n;
        for (int i = 0; i < length; ++i, m = n) {
            n = m * 33 + s.charAt(i);
        }
        if (m == 0) {
            m = 1;
        }
        return m;
    }
    
    public int a(final char[] array, int i, final int n) {
        int m = this.m;
        while (i < i + n) {
            m = m * 33 + array[i];
            ++i;
        }
        if (m == 0) {
            m = 1;
        }
        return m;
    }
    
    public String a(final char[] array, final int n, final int n2, final int n3) {
        String s;
        if (n2 < 1) {
            s = "";
        }
        else {
            if (!this.d) {
                return new String(array, n, n2);
            }
            final int c = this.c(n3);
            final String s2 = this.e[c];
            if (s2 != null) {
                if (s2.length() == n2) {
                    int n4 = 0;
                    while (s2.charAt(n4) == array[n + n4]) {
                        if (++n4 == n2) {
                            return s2;
                        }
                    }
                }
                final x x = this.f[c >> 1];
                if (x != null) {
                    s = x.a(array, n, n2);
                    if (s != null) {
                        return s;
                    }
                    s = this.a(array, n, n2, x.b);
                    if (s != null) {
                        return s;
                    }
                }
            }
            return this.a(array, n, n2, n3, c);
        }
        return s;
    }
    
    public w b(final int n) {
        synchronized (this) {
            final String[] e = this.e;
            final x[] f = this.f;
            final int g = this.g;
            final int m = this.m;
            final int j = this.j;
            // monitorexit(this)
            return new w(this, n, e, f, g, m, j);
        }
    }
    
    public void b() {
        if (this.d() && this.b != null && this.d) {
            this.b.a(this);
            this.k = false;
        }
    }
    
    public int c() {
        return this.g;
    }
    
    public int c(final int n) {
        return n + (n >>> 15) & this.i;
    }
    
    protected void d(final int n) {
        throw new IllegalStateException("Longest collision chain in symbol table (of size " + this.g + ") now exceeds maximum, " + n + " -- suspect a DoS attack based on hash collisions");
    }
    
    public boolean d() {
        return this.k;
    }
    
    public int e() {
        return this.m;
    }
}
