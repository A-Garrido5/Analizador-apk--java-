import com.twitter.util.g;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;
import com.twitter.util.n;

// 
// Decompiled by Procyon v0.5.30
// 

public class nw implements n
{
    protected final boolean a;
    protected final String b;
    protected final Map c;
    protected final int d;
    protected int e;
    private int f;
    
    public nw(final int e, final String b, final int d, final boolean a) {
        this.f = 0;
        this.c = new HashMap();
        this.e = e;
        this.b = b;
        this.d = d;
        this.a = a;
    }
    
    public void a() {
        final Iterator<String> iterator = this.c.keySet().iterator();
        while (iterator.hasNext()) {
            ny.a().b(this, iterator.next());
        }
        this.e = 1;
        this.c.clear();
    }
    
    public void a(final int n) {
        if (n <= 0) {
            return;
        }
        this.e = Math.max(n, this.c.size());
    }
    
    public void a(final String s) {
        this.c.put(s, 0);
        this.e = Math.max(this.e, this.c.size());
        ny.a().a(this, s);
    }
    
    public void a(final nz nz) {
        while (true) {
            int n = 0;
            while (true) {
                Label_0281: {
                    while (true) {
                        final int intValue;
                        Label_0274: {
                            Label_0243: {
                                synchronized (this) {
                                    if (nz.d && this.a) {
                                        ny.a().a(nz.a(this.b, this.d));
                                        this.a();
                                    }
                                    else {
                                        final Integer n2 = this.c.get(nz.a);
                                        if (n2 == null) {
                                            break Label_0281;
                                        }
                                        intValue = n2;
                                        if (nz.c >= intValue || nz.c >= 8000.0) {
                                            break Label_0274;
                                        }
                                        final int n3 = intValue + 50;
                                        int c;
                                        if (nz.e) {
                                            c = 10000;
                                        }
                                        else {
                                            c = nz.c;
                                        }
                                        this.c.put(nz.a, g.a(c, n3, 10000));
                                        final Iterator<Integer> iterator = this.c.values().iterator();
                                        while (iterator.hasNext()) {
                                            n += iterator.next();
                                        }
                                        this.f = n / this.e;
                                        if (this.f >= 10000) {
                                            break Label_0243;
                                        }
                                        ny.a().a(this.b, this.d, this.f);
                                    }
                                    return;
                                }
                            }
                            this.f = 10000;
                            ny.a().a(nz.b(this.b, this.d));
                            return;
                        }
                        final int n3 = intValue;
                        continue;
                    }
                }
                int intValue = 0;
                continue;
            }
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getSimpleName()).append("[");
        sb.append("id=").append(this.hashCode()).append("; ");
        sb.append("size=").append(this.e).append("; ");
        sb.append("progress=").append(this.f).append("; ");
        sb.append("]");
        return sb.toString();
    }
}
