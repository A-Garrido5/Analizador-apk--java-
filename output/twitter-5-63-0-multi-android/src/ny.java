import com.twitter.util.m;
import com.twitter.library.util.br;
import com.twitter.util.n;
import java.util.HashMap;
import java.util.Map;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.5.30
// 

public class ny
{
    private static ny a;
    private final SparseArray b;
    private final Map c;
    
    static {
        ny.a = new ny();
    }
    
    private ny() {
        this.b = new SparseArray();
        this.c = new HashMap();
    }
    
    public static ny a() {
        synchronized (ny.class) {
            return ny.a;
        }
    }
    
    public void a(final n n, final int n2) {
        synchronized (this) {
            br br = (br)this.b.get(n2);
            if (br == null) {
                br = new br();
                this.b.put(n2, (Object)br);
            }
            br.a(n);
        }
    }
    
    public void a(final n n, final String s) {
        synchronized (this) {
            br br = this.c.get(s);
            if (br == null) {
                br = new br();
                this.c.put(s, br);
            }
            br.a(n);
        }
    }
    
    public void a(final String s, final int n, final int n2) {
        synchronized (this) {
            this.a(nz.a(s, n, n2));
        }
    }
    
    public void a(final nz nz) {
        synchronized (this) {
            final m m = this.c.get(nz.a);
            if (m != null) {
                m.a(nz);
            }
            final m i = (m)this.b.get(nz.b);
            if (i != null) {
                i.a(nz);
            }
        }
    }
    
    public void b(final n n, final int n2) {
        synchronized (this) {
            final m m = (m)this.b.get(n2);
            if (m != null) {
                m.b(n);
            }
        }
    }
    
    public void b(final n n, final String s) {
        synchronized (this) {
            final m m = this.c.get(s);
            if (m != null) {
                m.b(n);
            }
        }
    }
}
