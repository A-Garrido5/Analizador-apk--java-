import org.spongycastle.crypto.c;
import java.security.SecureRandom;
import java.math.BigInteger;
import org.spongycastle.crypto.a;

// 
// Decompiled by Procyon v0.5.30
// 

public class zu implements a
{
    private static BigInteger a;
    private zv b;
    private aaa c;
    private SecureRandom d;
    
    static {
        zu.a = BigInteger.valueOf(1L);
    }
    
    public zu() {
        this.b = new zv();
    }
    
    @Override
    public int a() {
        return this.b.a();
    }
    
    @Override
    public void a(final boolean b, final c c) {
        this.b.a(b, c);
        if (c instanceof zy) {
            final zy zy = (zy)c;
            this.c = (aaa)zy.b();
            this.d = zy.a();
            return;
        }
        this.c = (aaa)c;
        this.d = new SecureRandom();
    }
    
    @Override
    public byte[] a(final byte[] array, final int n, final int n2) {
        if (this.c == null) {
            throw new IllegalStateException("RSA engine not initialised");
        }
        final BigInteger a = this.b.a(array, n, n2);
        BigInteger bigInteger;
        if (this.c instanceof aab) {
            final aab aab = (aab)this.c;
            final BigInteger d = aab.d();
            if (d != null) {
                final BigInteger b = aab.b();
                final BigInteger a2 = aah.a(zu.a, b.subtract(zu.a), this.d);
                bigInteger = this.b.b(a2.modPow(d, b).multiply(a).mod(b)).multiply(a2.modInverse(b)).mod(b);
            }
            else {
                bigInteger = this.b.b(a);
            }
        }
        else {
            bigInteger = this.b.b(a);
        }
        return this.b.a(bigInteger);
    }
    
    @Override
    public int b() {
        return this.b.b();
    }
}
