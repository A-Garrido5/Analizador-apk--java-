import java.util.Collection;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.service.y;

// 
// Decompiled by Procyon v0.5.30
// 

public class oy extends y
{
    public final int a;
    private long e;
    private int f;
    private int g;
    private ArrayList h;
    private int i;
    private String j;
    
    public oy(final Context context, final Session session, final int n) {
        this(context, new ab(session), n);
    }
    
    public oy(final Context context, final ab ab, final int a) {
        super(context, oy.class.getName(), ab);
        this.f = 0;
        this.h = new ArrayList();
        this.a = a;
        this.e = ab.c;
    }
    
    public ArrayList a() {
        return this.h;
    }
    
    public oy a(final String j, final long e) {
        this.j = j;
        this.e = e;
        return this;
    }
    
    @Override
    protected void a_(final aa aa) {
        final int g = this.g;
        int a;
        if (g > 0) {
            a = ae.a(g, 20);
        }
        else {
            a = 1;
        }
        String s = this.V().a(1, this.a, this.e, this.f);
        for (int i = 0; i < a; ++i) {
            final pj pj = (pj)new pj(this.p, this.P(), this.e, this.a, s).a(this.j).a(this);
            final aa s2 = pj.S();
            aa.a(s2);
            if (!s2.a()) {
                break;
            }
            this.h.addAll(pj.a);
            this.i += pj.f;
            s = pj.e;
            if ((this.g > 0 && this.h.size() >= this.g) || "0".equals(s)) {
                break;
            }
        }
    }
    
    public int b() {
        return this.i;
    }
    
    public oy c(final int g) {
        this.g = g;
        return this;
    }
    
    public oy d(final int f) {
        this.f = f;
        return this;
    }
}
