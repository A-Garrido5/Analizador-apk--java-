import com.twitter.library.provider.b;
import com.twitter.library.api.bp;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class op extends c
{
    private final long a;
    private final long e;
    
    public op(final Context context, final Session session, final long a) {
        super(context, op.class.getName(), session);
        this.a = a;
        this.e = session.g();
    }
    
    public op(final Context context, final ab ab, final long a) {
        super(context, op.class.getName(), ab);
        this.a = a;
        this.e = ab.c;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("statuses", "destroy", this.a).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        final com.twitter.library.provider.bg a = com.twitter.library.provider.bg.a(this.p, this.e);
        final b w = this.W();
        if (httpOperation.j()) {
            a.a(this.e, (bp)bg.a(), w);
            w.a();
        }
        else if (aa.c() == 404) {
            final bp b = a.b(this.a);
            if (b != null) {
                a.a(this.e, b, w);
                w.a();
                aa.a(true);
                return;
            }
            if (a.a(this.a, this.e)) {
                aa.a(true);
            }
        }
    }
    
    protected bg b() {
        return bg.a(2);
    }
    
    public long e() {
        return this.a;
    }
}
