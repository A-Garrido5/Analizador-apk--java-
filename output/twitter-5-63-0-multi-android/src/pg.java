import java.util.Iterator;
import com.twitter.library.provider.b;
import java.util.ArrayList;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.util.q;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pg extends c
{
    private final long[] a;
    private final long e;
    
    public pg(final Context context, final Session session, final long[] a) {
        super(context, pg.class.getName(), session);
        this.a = a;
        this.e = session.g();
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "friendships", "destroy_all" }).a("user_id", com.twitter.util.q.a(this.a)).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.k()) {
            final com.twitter.library.provider.bg a = com.twitter.library.provider.bg.a(this.p, this.e);
            final b w = this.W();
            for (final long longValue : (ArrayList)bg.a()) {
                a.b(longValue, 1, w);
                a.a(0, this.e, longValue, w);
                w.a();
            }
        }
    }
    
    protected bg b() {
        return bg.a(9);
    }
}
