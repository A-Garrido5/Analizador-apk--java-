import org.spongycastle.asn1.bf;
import org.spongycastle.asn1.d;
import org.spongycastle.asn1.e;
import org.spongycastle.asn1.q;
import java.util.Enumeration;
import org.spongycastle.asn1.i;
import org.spongycastle.asn1.r;
import java.math.BigInteger;
import org.spongycastle.asn1.k;

// 
// Decompiled by Procyon v0.5.30
// 

public class zj extends k
{
    private BigInteger a;
    private BigInteger b;
    private BigInteger c;
    private BigInteger d;
    private BigInteger e;
    private BigInteger f;
    private BigInteger g;
    private BigInteger h;
    private BigInteger i;
    private r j;
    
    public zj(final BigInteger b, final BigInteger c, final BigInteger d, final BigInteger e, final BigInteger f, final BigInteger g, final BigInteger h, final BigInteger i) {
        this.j = null;
        this.a = BigInteger.valueOf(0L);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    private zj(final r r) {
        this.j = null;
        final Enumeration d = r.d();
        final BigInteger c = d.nextElement().c();
        if (c.intValue() != 0 && c.intValue() != 1) {
            throw new IllegalArgumentException("wrong version for RSA private key");
        }
        this.a = c;
        this.b = d.nextElement().c();
        this.c = d.nextElement().c();
        this.d = d.nextElement().c();
        this.e = d.nextElement().c();
        this.f = d.nextElement().c();
        this.g = d.nextElement().c();
        this.h = d.nextElement().c();
        this.i = d.nextElement().c();
        if (d.hasMoreElements()) {
            this.j = (r)d.nextElement();
        }
    }
    
    public static zj a(final Object o) {
        if (o instanceof zj) {
            return (zj)o;
        }
        if (o != null) {
            return new zj(r.a(o));
        }
        return null;
    }
    
    @Override
    public q a() {
        final e e = new e();
        e.a(new i(this.a));
        e.a(new i(this.b));
        e.a(new i(this.c));
        e.a(new i(this.d));
        e.a(new i(this.e));
        e.a(new i(this.f));
        e.a(new i(this.g));
        e.a(new i(this.h));
        e.a(new i(this.i));
        if (this.j != null) {
            e.a(this.j);
        }
        return new bf(e);
    }
    
    public BigInteger c() {
        return this.b;
    }
    
    public BigInteger d() {
        return this.c;
    }
    
    public BigInteger e() {
        return this.d;
    }
    
    public BigInteger f() {
        return this.e;
    }
    
    public BigInteger g() {
        return this.f;
    }
    
    public BigInteger h() {
        return this.g;
    }
    
    public BigInteger i() {
        return this.h;
    }
    
    public BigInteger j() {
        return this.i;
    }
}
