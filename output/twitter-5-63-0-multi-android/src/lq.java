import com.twitter.util.l;
import java.util.List;

// 
// Decompiled by Procyon v0.5.30
// 

public class lq implements ln
{
    private final List b;
    
    public lq(final List b) {
        this.b = b;
    }
    
    @Override
    public int a() {
        if (this.b != null) {
            return this.b.size();
        }
        return 0;
    }
    
    @Override
    public Object b(final int n) {
        if (n >= this.a() || this.b == null) {
            return null;
        }
        return this.b.get(n);
    }
    
    @Override
    public void b() {
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o instanceof lq && l.a(((lq)o).b, this.b));
    }
    
    @Override
    public int hashCode() {
        if (this.b == null) {
            return 0;
        }
        return this.b.hashCode();
    }
}
