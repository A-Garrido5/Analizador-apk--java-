import org.spongycastle.asn1.h;
import org.spongycastle.asn1.bf;
import org.spongycastle.asn1.e;
import org.spongycastle.asn1.q;
import org.spongycastle.asn1.d;
import java.util.Enumeration;
import org.spongycastle.asn1.r;
import org.spongycastle.asn1.ao;
import org.spongycastle.asn1.k;

// 
// Decompiled by Procyon v0.5.30
// 

public class zo extends k
{
    private zm a;
    private ao b;
    
    public zo(final r r) {
        if (r.e() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + r.e());
        }
        final Enumeration d = r.d();
        this.a = zm.a(d.nextElement());
        this.b = ao.a(d.nextElement());
    }
    
    public zo(final zm a, final d d) {
        this.b = new ao(d);
        this.a = a;
    }
    
    public static zo a(final Object o) {
        if (o instanceof zo) {
            return (zo)o;
        }
        if (o != null) {
            return new zo(r.a(o));
        }
        return null;
    }
    
    @Override
    public q a() {
        final e e = new e();
        e.a(this.a);
        e.a(this.b);
        return new bf(e);
    }
    
    public zm c() {
        return this.a;
    }
    
    public q d() {
        return new h(this.b.c()).d();
    }
}
