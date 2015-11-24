import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.io.e;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonParser$Feature;
import com.fasterxml.jackson.core.util.d;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.io.b;
import java.math.BigDecimal;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class i extends j
{
    static final BigInteger s;
    static final BigInteger t;
    static final BigInteger u;
    static final BigInteger v;
    static final BigDecimal w;
    static final BigDecimal x;
    static final BigDecimal y;
    static final BigDecimal z;
    protected int A;
    protected int B;
    protected long C;
    protected double D;
    protected BigInteger E;
    protected BigDecimal F;
    protected boolean G;
    protected int H;
    protected int I;
    protected int J;
    protected final b b;
    protected boolean c;
    protected int d;
    protected int e;
    protected long f;
    protected int g;
    protected int h;
    protected long i;
    protected int j;
    protected int k;
    protected n l;
    protected JsonToken m;
    protected final d n;
    protected char[] o;
    protected boolean p;
    protected com.fasterxml.jackson.core.util.b q;
    protected byte[] r;
    
    static {
        s = BigInteger.valueOf(-2147483648L);
        t = BigInteger.valueOf(2147483647L);
        u = BigInteger.valueOf(Long.MIN_VALUE);
        v = BigInteger.valueOf(Long.MAX_VALUE);
        w = new BigDecimal(i.u);
        x = new BigDecimal(i.v);
        y = new BigDecimal(i.s);
        z = new BigDecimal(i.t);
    }
    
    protected i(final b b, final int a) {
        this.d = 0;
        this.e = 0;
        this.f = 0L;
        this.g = 1;
        this.h = 0;
        this.i = 0L;
        this.j = 1;
        this.k = 0;
        this.o = null;
        this.p = false;
        this.q = null;
        this.A = 0;
        this.a = a;
        this.b = b;
        this.n = b.d();
        final boolean a2 = JsonParser$Feature.j.a(a);
        l a3 = null;
        if (a2) {
            a3 = l.a(this);
        }
        this.l = n.a(a3);
    }
    
    private void a(final int n, final char[] array, final int n2, final int n3) {
        final String f = this.n.f();
        try {
            if (com.fasterxml.jackson.core.io.e.a(array, n2, n3, this.G)) {
                this.C = Long.parseLong(f);
                this.A = 2;
                return;
            }
            this.E = new BigInteger(f);
            this.A = 4;
        }
        catch (NumberFormatException ex) {
            this.a("Malformed numeric value '" + f + "'", ex);
        }
    }
    
    private void f(final int n) {
        Label_0024: {
            if (n != 16) {
                break Label_0024;
            }
            try {
                this.F = this.n.h();
                this.A = 16;
                return;
                this.D = this.n.i();
                this.A = 8;
            }
            catch (NumberFormatException ex) {
                this.a("Malformed numeric value '" + this.n.f() + "'", ex);
            }
        }
    }
    
    protected void A() {
        if ((0x1 & this.A) != 0x0) {
            this.C = this.B;
        }
        else if ((0x4 & this.A) != 0x0) {
            if (i.u.compareTo(this.E) > 0 || i.v.compareTo(this.E) < 0) {
                this.D();
            }
            this.C = this.E.longValue();
        }
        else if ((0x8 & this.A) != 0x0) {
            if (this.D < -9.223372036854776E18 || this.D > 9.223372036854776E18) {
                this.D();
            }
            this.C = (long)this.D;
        }
        else if ((0x10 & this.A) != 0x0) {
            if (i.w.compareTo(this.F) > 0 || i.x.compareTo(this.F) < 0) {
                this.D();
            }
            this.C = this.F.longValue();
        }
        else {
            this.H();
        }
        this.A |= 0x2;
    }
    
    protected void B() {
        if ((0x10 & this.A) != 0x0) {
            this.D = this.F.doubleValue();
        }
        else if ((0x4 & this.A) != 0x0) {
            this.D = this.E.doubleValue();
        }
        else if ((0x2 & this.A) != 0x0) {
            this.D = this.C;
        }
        else if ((0x1 & this.A) != 0x0) {
            this.D = this.B;
        }
        else {
            this.H();
        }
        this.A |= 0x8;
    }
    
    protected void C() {
        this.f("Numeric value (" + this.g() + ") out of range of int (" + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE + ")");
    }
    
    protected void D() {
        this.f("Numeric value (" + this.g() + ") out of range of long (" + Long.MIN_VALUE + " - " + Long.MAX_VALUE + ")");
    }
    
    protected char E() {
        throw new UnsupportedOperationException();
    }
    
    protected final JsonToken a(final String s, final double d) {
        this.n.a(s);
        this.D = d;
        this.A = 8;
        return JsonToken.j;
    }
    
    protected final JsonToken a(final boolean g, final int h) {
        this.G = g;
        this.H = h;
        this.I = 0;
        this.J = 0;
        this.A = 0;
        return JsonToken.i;
    }
    
    protected final JsonToken a(final boolean b, final int n, final int n2, final int n3) {
        if (n2 < 1 && n3 < 1) {
            return this.a(b, n);
        }
        return this.b(b, n, n2, n3);
    }
    
    protected void a(final int n, final char c) {
        this.f("Unexpected close marker '" + (char)n + "': expected '" + c + "' (for " + this.l.d() + " starting at " + ("" + this.l.a(this.b.a())) + ")");
    }
    
    protected void a(final int n, final String s) {
        String s2 = "Unexpected character (" + j.e(n) + ") in numeric value";
        if (s != null) {
            s2 = s2 + ": " + s;
        }
        this.f(s2);
    }
    
    protected final JsonToken b(final boolean g, final int h, final int i, final int j) {
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.A = 0;
        return JsonToken.j;
    }
    
    protected void b(final int n) {
        if (this.K == JsonToken.i) {
            final char[] e = this.n.e();
            int d = this.n.d();
            final int h = this.H;
            if (this.G) {
                ++d;
            }
            if (h <= 9) {
                int a = com.fasterxml.jackson.core.io.e.a(e, d, h);
                if (this.G) {
                    a = -a;
                }
                this.B = a;
                this.A = 1;
                return;
            }
            if (h <= 18) {
                long b = com.fasterxml.jackson.core.io.e.b(e, d, h);
                if (this.G) {
                    b = -b;
                }
                if (h == 10) {
                    if (this.G) {
                        if (b >= -2147483648L) {
                            this.B = (int)b;
                            this.A = 1;
                            return;
                        }
                    }
                    else if (b <= 2147483647L) {
                        this.B = (int)b;
                        this.A = 1;
                        return;
                    }
                }
                this.C = b;
                this.A = 2;
                return;
            }
            this.a(n, e, d, h);
        }
        else {
            if (this.K == JsonToken.j) {
                this.f(n);
                return;
            }
            this.f("Current token (" + this.K + ") not numeric, can not use numeric value accessors");
        }
    }
    
    protected void c(final String s) {
        this.f("Invalid numeric value: " + s);
    }
    
    @Override
    public void close() {
        if (this.c) {
            return;
        }
        this.c = true;
        try {
            this.v();
        }
        finally {
            this.w();
        }
    }
    
    @Override
    public String e() {
        if (this.K == JsonToken.b || this.K == JsonToken.d) {
            return this.l.h().g();
        }
        return this.l.g();
    }
    
    @Override
    public JsonLocation f() {
        return new JsonLocation(this.b.a(), -1L, this.f + this.d, this.g, 1 + (this.d - this.h));
    }
    
    @Override
    public int h() {
        if ((0x1 & this.A) == 0x0) {
            if (this.A == 0) {
                this.b(1);
            }
            if ((0x1 & this.A) == 0x0) {
                this.z();
            }
        }
        return this.B;
    }
    
    @Override
    public long i() {
        if ((0x2 & this.A) == 0x0) {
            if (this.A == 0) {
                this.b(2);
            }
            if ((0x2 & this.A) == 0x0) {
                this.A();
            }
        }
        return this.C;
    }
    
    @Override
    public float j() {
        return (float)this.k();
    }
    
    @Override
    public double k() {
        if ((0x8 & this.A) == 0x0) {
            if (this.A == 0) {
                this.b(8);
            }
            if ((0x8 & this.A) == 0x0) {
                this.B();
            }
        }
        return this.D;
    }
    
    @Override
    public Object m() {
        return null;
    }
    
    protected final void s() {
        if (!this.t()) {
            this.F();
        }
    }
    
    protected abstract boolean t();
    
    protected abstract void u();
    
    protected abstract void v();
    
    protected void w() {
        this.n.a();
        final char[] o = this.o;
        if (o != null) {
            this.o = null;
            this.b.c(o);
        }
    }
    
    @Override
    protected void x() {
        if (!this.l.b()) {
            this.e(": expected close marker for " + this.l.d() + " (from " + this.l.a(this.b.a()) + ")");
        }
    }
    
    protected final int y() {
        this.x();
        return -1;
    }
    
    protected void z() {
        if ((0x2 & this.A) != 0x0) {
            final int b = (int)this.C;
            if (b != this.C) {
                this.f("Numeric value (" + this.g() + ") out of range of int");
            }
            this.B = b;
        }
        else if ((0x4 & this.A) != 0x0) {
            if (i.s.compareTo(this.E) > 0 || i.t.compareTo(this.E) < 0) {
                this.C();
            }
            this.B = this.E.intValue();
        }
        else if ((0x8 & this.A) != 0x0) {
            if (this.D < -2.147483648E9 || this.D > 2.147483647E9) {
                this.C();
            }
            this.B = (int)this.D;
        }
        else if ((0x10 & this.A) != 0x0) {
            if (i.y.compareTo(this.F) > 0 || i.z.compareTo(this.F) < 0) {
                this.C();
            }
            this.B = this.F.intValue();
        }
        else {
            this.H();
        }
        this.A |= 0x1;
    }
}
