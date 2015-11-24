import java.security.SecureRandom;
import java.math.BigInteger;
import org.spongycastle.crypto.f;

// 
// Decompiled by Procyon v0.5.30
// 

public class zz extends f
{
    private BigInteger a;
    private int b;
    
    public zz(final BigInteger a, final SecureRandom secureRandom, final int n, final int b) {
        super(secureRandom, n);
        if (n < 12) {
            throw new IllegalArgumentException("key strength too small");
        }
        if (!a.testBit(0)) {
            throw new IllegalArgumentException("public exponent cannot be even");
        }
        this.a = a;
        this.b = b;
    }
    
    public BigInteger c() {
        return this.a;
    }
    
    public int d() {
        return this.b;
    }
}
