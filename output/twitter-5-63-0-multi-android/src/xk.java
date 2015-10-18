import java.security.Key;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

// 
// Decompiled by Procyon v0.5.30
// 

public class xk
{
    private final String a;
    
    public xk() {
        this("HmacSHA1");
    }
    
    public xk(final String a) {
        if (a == null) {
            throw new NullPointerException("Hashing algorithm cannot be null.");
        }
        this.a = a;
    }
    
    public byte[] a(final byte[] array, final byte[] array2) {
        final SecretKeySpec secretKeySpec = new SecretKeySpec(array, this.a);
        final Mac instance = Mac.getInstance(this.a);
        instance.init(secretKeySpec);
        return instance.doFinal(array2);
    }
}
