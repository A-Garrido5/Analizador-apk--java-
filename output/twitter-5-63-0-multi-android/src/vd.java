import java.util.Iterator;
import com.twitter.util.e;
import android.support.v4.util.LruCache;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.5.30
// 

abstract class vd
{
    protected HashMap a;
    protected LruCache b;
    private boolean c;
    
    public vd() {
        this(e.e());
    }
    
    vd(final boolean c) {
        this.c = c;
        this.a = new HashMap();
        this.b = new LruCache(10);
    }
    
    private ve a(final long n) {
        ve ve = this.a.get(n);
        if (ve == null) {
            ve = new ve(this);
            ve.b = this.b.remove(n);
            this.a.put(n, ve);
        }
        return ve;
    }
    
    public void a(final long n, final Object o) {
        if (o == null) {
            if (this.c) {
                throw new IllegalArgumentException("Null listener");
            }
        }
        else {
            final ve a = this.a(n);
            if (a.a.contains(o)) {
                if (this.c) {
                    throw new IllegalArgumentException("Duplicate listener");
                }
            }
            else {
                a.a.add(o);
                if (a.b != null) {
                    this.a(o, n, a.b);
                }
            }
        }
    }
    
    protected abstract void a(final Object p0, final long p1, final Object p2);
    
    public void b(final long n, final Object o) {
        if (o == null) {
            if (this.c) {
                throw new IllegalArgumentException("Null listener");
            }
        }
        else {
            final ve ve = this.a.get(n);
            if (ve != null) {
                if (ve.a != null) {
                    ve.a.remove(o);
                }
                if (ve.a.size() == 0) {
                    if (ve.b != null) {
                        this.b.put(n, ve.b);
                    }
                    this.a.remove(n);
                }
            }
        }
    }
    
    public void c(final long n, final Object b) {
        if (b == null) {
            if (this.c) {
                throw new IllegalArgumentException("Null data");
            }
        }
        else {
            final ve ve = this.a.get(n);
            if (ve != null) {
                ve.b = b;
                final Iterator iterator = ve.a.iterator();
                while (iterator.hasNext()) {
                    this.a(iterator.next(), n, b);
                }
            }
            else {
                this.b.put(n, b);
            }
        }
    }
}
