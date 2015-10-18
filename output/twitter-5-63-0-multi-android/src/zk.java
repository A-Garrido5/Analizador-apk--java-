import org.spongycastle.asn1.bf;
import org.spongycastle.asn1.d;
import org.spongycastle.asn1.i;
import org.spongycastle.asn1.e;
import org.spongycastle.asn1.q;
import java.util.Enumeration;
import org.spongycastle.asn1.ax;
import org.spongycastle.asn1.r;
import java.math.BigInteger;
import org.spongycastle.asn1.k;

// 
// Decompiled by Procyon v0.5.30
// 

public class zk extends k
{
    private BigInteger a;
    private BigInteger b;
    
    public zk(final BigInteger a, final BigInteger b) {
        this.a = a;
        this.b = b;
    }
    
    private zk(final r r) {
        if (r.e() != 2) {
            throw new IllegalArgumentException("Bad sequence size: " + r.e());
        }
        final Enumeration d = r.d();
        this.a = ax.a(d.nextElement()).d();
        this.b = ax.a(d.nextElement()).d();
    }
    
    public static zk a(final Object o) {
        if (o instanceof zk) {
            return (zk)o;
        }
        if (o != null) {
            return new zk(r.a(o));
        }
        return null;
    }
    
    @Override
    public q a() {
        final e e = new e();
        e.a(new i(this.a));
        e.a(new i(this.b));
        return new bf(e);
    }
    
    public BigInteger c() {
        return this.a;
    }
    
    public BigInteger d() {
        return this.b;
    }
}
