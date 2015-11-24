import android.util.Pair;
import android.os.Bundle;
import android.support.v4.util.LruCache;
import com.twitter.library.client.az;

// 
// Decompiled by Procyon v0.5.30
// 

public class vb
{
    private static vb a;
    private final az b;
    private final LruCache c;
    
    vb(final az az) {
        this(az, 10);
    }
    
    vb(final az b, final int n) {
        this.b = b;
        this.c = new LruCache(n);
    }
    
    private long a() {
        return this.b.b().g();
    }
    
    public static vb a(final az az) {
        if (vb.a == null) {
            vb.a = new vb(az);
        }
        return vb.a;
    }
    
    public Bundle a(final long n) {
        synchronized (this) {
            return (Bundle)this.c.remove(Pair.create((Object)this.a(), (Object)n));
        }
    }
    
    public void a(final long n, final Bundle bundle) {
        synchronized (this) {
            this.c.put(Pair.create((Object)this.a(), (Object)n), bundle);
        }
    }
}
