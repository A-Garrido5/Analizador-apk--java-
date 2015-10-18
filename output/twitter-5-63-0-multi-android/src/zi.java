import org.spongycastle.asn1.bf;
import org.spongycastle.asn1.bk;
import org.spongycastle.asn1.e;
import org.spongycastle.asn1.q;
import org.spongycastle.asn1.bb;
import org.spongycastle.asn1.d;
import java.util.Enumeration;
import org.spongycastle.asn1.w;
import org.spongycastle.asn1.i;
import org.spongycastle.asn1.r;
import org.spongycastle.asn1.t;
import org.spongycastle.asn1.m;
import org.spongycastle.asn1.k;

// 
// Decompiled by Procyon v0.5.30
// 

public class zi extends k
{
    private m a;
    private zm b;
    private t c;
    
    public zi(final r r) {
        final Enumeration d = r.d();
        if (d.nextElement().c().intValue() != 0) {
            throw new IllegalArgumentException("wrong version for private key info");
        }
        this.b = zm.a(d.nextElement());
        this.a = m.a((Object)d.nextElement());
        if (d.hasMoreElements()) {
            this.c = t.a((w)d.nextElement(), false);
        }
    }
    
    public zi(final zm zm, final d d) {
        this(zm, d, null);
    }
    
    public zi(final zm b, final d d, final t c) {
        this.a = new bb(d.a().a("DER"));
        this.b = b;
        this.c = c;
    }
    
    public static zi a(final Object o) {
        if (o instanceof zi) {
            return (zi)o;
        }
        if (o != null) {
            return new zi(r.a(o));
        }
        return null;
    }
    
    @Override
    public q a() {
        final e e = new e();
        e.a(new i(0));
        e.a(this.b);
        e.a(this.a);
        if (this.c != null) {
            e.a(new bk(false, 0, this.c));
        }
        return new bf(e);
    }
    
    public zm c() {
        return this.b;
    }
    
    public d d() {
        return q.a(this.a.d());
    }
}
