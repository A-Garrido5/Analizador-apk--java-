import com.twitter.library.provider.b;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.service.p;

// 
// Decompiled by Procyon v0.5.30
// 

public class nt extends p
{
    private final int a;
    private final long e;
    private PromotedEvent f;
    private String g;
    
    public nt(final Context context, final Session session, final int a, final long e) {
        super(context, nt.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    public nt a(final PromotedEvent f) {
        this.f = f;
        return this;
    }
    
    public nt a(final String g) {
        this.g = g;
        return this;
    }
    
    @Override
    protected void a() {
        final int a = this.a;
        final long e = this.e;
        final b u = this.u();
        this.t().a(a, new long[] { e }, u);
        u.a();
        if (this.g != null) {
            new nu(this.i, this.h(), this.f).b(this.g).S();
        }
    }
}
