import java.util.Iterator;
import com.twitter.util.collection.b;

// 
// Decompiled by Procyon v0.5.30
// 

public class ys extends b
{
    public ys() {
        this(100);
    }
    
    public ys(final int n) {
        super(n);
    }
    
    public ys(final int n, final Number n2, final Number n3) {
        this(n);
        for (int i = 0; i < n; ++i) {
            this.a(n2, n3);
        }
    }
    
    public ys(final Number n, final Number n2) {
        this(100, n, n2);
    }
    
    public void a(final Number n, final Number n2) {
        this.add(new yt(n, n2));
    }
    
    public double c() {
        double n = 0.0;
        final Iterator iterator = this.iterator();
        double n2 = n;
        while (iterator.hasNext()) {
            n2 += iterator.next().a.doubleValue();
        }
        if (n2 != n) {
            for (final yt yt : this) {
                n += yt.a.doubleValue() / n2 * yt.b.doubleValue();
            }
        }
        return n;
    }
}
