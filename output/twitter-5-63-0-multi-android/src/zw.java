import org.spongycastle.crypto.f;
import org.spongycastle.crypto.c;
import java.util.Random;
import org.spongycastle.crypto.b;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.5.30
// 

public class zw
{
    private static final BigInteger a;
    private zz b;
    
    static {
        a = BigInteger.valueOf(1L);
    }
    
    public b a() {
        final int b = this.b.b();
        final int n = (b + 1) / 2;
        final int n2 = b - n;
        final int n3 = b / 3;
        final BigInteger c = this.b.c();
        BigInteger max;
        do {
            max = new BigInteger(n, 1, this.b.a());
        } while (max.mod(c).equals(zw.a) || !max.isProbablePrime(this.b.d()) || !c.gcd(max.subtract(zw.a)).equals(zw.a));
        BigInteger bigInteger;
        BigInteger multiply;
        while (true) {
            bigInteger = new BigInteger(n2, 1, this.b.a());
            if (bigInteger.subtract(max).abs().bitLength() >= n3 && !bigInteger.mod(c).equals(zw.a) && bigInteger.isProbablePrime(this.b.d()) && c.gcd(bigInteger.subtract(zw.a)).equals(zw.a)) {
                multiply = max.multiply(bigInteger);
                if (multiply.bitLength() == this.b.b()) {
                    break;
                }
                max = max.max(bigInteger);
            }
        }
        BigInteger bigInteger2;
        if (max.compareTo(bigInteger) < 0) {
            bigInteger2 = bigInteger;
            bigInteger = max;
        }
        else {
            bigInteger2 = max;
        }
        final BigInteger subtract = bigInteger2.subtract(zw.a);
        final BigInteger subtract2 = bigInteger.subtract(zw.a);
        final BigInteger modInverse = c.modInverse(subtract.multiply(subtract2));
        return new b(new aaa(false, multiply, c), new aab(multiply, c, modInverse, bigInteger2, bigInteger, modInverse.remainder(subtract), modInverse.remainder(subtract2), bigInteger.modInverse(bigInteger2)));
    }
    
    public void a(final f f) {
        this.b = (zz)f;
    }
}
