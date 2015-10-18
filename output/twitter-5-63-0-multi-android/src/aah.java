import java.util.Random;
import java.security.SecureRandom;
import java.math.BigInteger;

// 
// Decompiled by Procyon v0.5.30
// 

public final class aah
{
    private static final BigInteger a;
    
    static {
        a = BigInteger.valueOf(0L);
    }
    
    public static BigInteger a(BigInteger add, final BigInteger bigInteger, final SecureRandom secureRandom) {
        final int compareTo = add.compareTo(bigInteger);
        if (compareTo >= 0) {
            if (compareTo > 0) {
                throw new IllegalArgumentException("'min' may not be greater than 'max'");
            }
        }
        else {
            if (add.bitLength() <= bigInteger.bitLength() / 2) {
                for (int i = 0; i < 1000; ++i) {
                    final BigInteger bigInteger2 = new BigInteger(bigInteger.bitLength(), secureRandom);
                    if (bigInteger2.compareTo(add) >= 0 && bigInteger2.compareTo(bigInteger) <= 0) {
                        return bigInteger2;
                    }
                }
                return new BigInteger(-1 + bigInteger.subtract(add).bitLength(), secureRandom).add(add);
            }
            add = a(aah.a, bigInteger.subtract(add), secureRandom).add(add);
        }
        return add;
    }
}
