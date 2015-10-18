import org.spongycastle.asn1.bf;
import org.spongycastle.asn1.bb;
import org.spongycastle.asn1.d;
import org.spongycastle.asn1.e;
import org.spongycastle.asn1.q;
import org.spongycastle.asn1.k;

// 
// Decompiled by Procyon v0.5.30
// 

public class zn extends k
{
    private byte[] a;
    private zm b;
    
    public zn(final zm b, final byte[] a) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public q a() {
        final e e = new e();
        e.a(this.b);
        e.a(new bb(this.a));
        return new bf(e);
    }
}
