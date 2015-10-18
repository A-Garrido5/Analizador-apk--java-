import java.util.HashMap;
import com.twitter.util.collection.e;
import java.util.Map;

// 
// Decompiled by Procyon v0.5.30
// 

class ym implements yk
{
    private final Map a;
    private final e b;
    
    ym() {
        this.a = new HashMap();
        this.b = new e();
    }
    
    @Override
    public int a(final String s) {
        final Integer n = this.a.get(s);
        if (n != null) {
            return n;
        }
        return -1;
    }
    
    @Override
    public void a(final String s, final int n) {
        this.a.put(s, n);
        this.b.a(n, s);
    }
}
