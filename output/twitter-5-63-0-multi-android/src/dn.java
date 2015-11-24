import com.twitter.library.api.search.TwitterTypeAheadGroup;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public abstract class dn implements db
{
    protected final Context a;
    protected final int b;
    private final int c;
    private final boolean d;
    private final dj e;
    
    public dn(final Context context, final int c, final int b, final boolean d, final dj e) {
        this.a = context.getApplicationContext();
        this.c = c;
        this.b = b;
        this.d = d;
        this.e = e;
    }
    
    private void a(final Object o, final dc dc, final boolean b) {
        final ln a = this.a(o, !b);
        if (!b || a.a() > 0) {
            dc.a(o, a);
        }
        else {
            a.b();
        }
        int b2;
        if (this.d) {
            b2 = this.b;
        }
        else {
            b2 = this.b - a.a();
        }
        if (b && b2 > 0) {
            this.e.a(this.b(o), this.c, b2, new do(this, o, dc));
        }
    }
    
    protected abstract ln a(final Object p0, final boolean p1);
    
    @Override
    public void a() {
        if (this.e != null) {
            this.e.a();
        }
    }
    
    protected abstract void a(final Object p0, final TwitterTypeAheadGroup p1);
    
    @Override
    public void a(final Object o, final dc dc) {
        this.a(o, dc, this.e != null && this.a(o));
    }
    
    protected abstract boolean a(final Object p0);
    
    protected String b(final Object o) {
        return o.toString();
    }
}
