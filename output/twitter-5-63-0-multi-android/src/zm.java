import org.spongycastle.asn1.bf;
import org.spongycastle.asn1.ay;
import org.spongycastle.asn1.e;
import org.spongycastle.asn1.q;
import org.spongycastle.asn1.s;
import org.spongycastle.asn1.ba;
import org.spongycastle.asn1.r;
import org.spongycastle.asn1.d;
import org.spongycastle.asn1.l;
import org.spongycastle.asn1.k;

// 
// Decompiled by Procyon v0.5.30
// 

public class zm extends k
{
    private l a;
    private d b;
    private boolean c;
    
    public zm(final String s) {
        this.c = false;
        this.a = new l(s);
    }
    
    public zm(final l a) {
        this.c = false;
        this.a = a;
    }
    
    public zm(final l a, final d b) {
        this.c = false;
        this.c = true;
        this.a = a;
        this.b = b;
    }
    
    public zm(final r r) {
        this.c = false;
        if (r.e() < 1 || r.e() > 2) {
            throw new IllegalArgumentException("Bad sequence size: " + r.e());
        }
        this.a = ba.a(r.a(0));
        if (r.e() == 2) {
            this.c = true;
            this.b = r.a(1);
            return;
        }
        this.b = null;
    }
    
    public static zm a(final Object o) {
        if (o == null || o instanceof zm) {
            return (zm)o;
        }
        if (o instanceof l) {
            return new zm((l)o);
        }
        if (o instanceof String) {
            return new zm((String)o);
        }
        if (o instanceof r || o instanceof s) {
            return new zm(r.a(o));
        }
        throw new IllegalArgumentException("unknown object in factory: " + o.getClass().getName());
    }
    
    @Override
    public q a() {
        final e e = new e();
        e.a(this.a);
        if (this.c) {
            if (this.b != null) {
                e.a(this.b);
            }
            else {
                e.a(ay.a);
            }
        }
        return new bf(e);
    }
    
    public l c() {
        return new l(this.a.c());
    }
}
