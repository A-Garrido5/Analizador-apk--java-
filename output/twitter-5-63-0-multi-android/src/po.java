import com.twitter.library.service.d;
import java.util.ArrayList;
import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.util.collection.CollectionUtils;
import com.twitter.library.api.bc;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class po extends c
{
    private long[] a;
    private final int e;
    
    public po(final Context context, final Session session, final int e) {
        super(context, po.class.getName(), session);
        this.e = e;
    }
    
    @Override
    protected e a() {
        final String a = this.V().a(1, 18, 0L, this.e);
        final f a2 = this.M().a(new Object[] { "friendships", "incoming" });
        if (a != null) {
            a2.a("cursor", a);
        }
        return a2.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final com.twitter.library.provider.bg v = this.V();
            final bc bc = (bc)bg.a();
            final ArrayList b = bc.b();
            if (b != null && b.size() > 0) {
                final oz oz = new oz(this.p, this.P());
                final long[] c = CollectionUtils.c(b);
                oz.a.a(c).a(true).a(18).a(-1L).a(bc.a());
                oz.S();
                v.a((Collection)b, 32, null);
                this.a = c;
            }
        }
    }
    
    protected bg b() {
        return bg.a(15);
    }
    
    public long[] e() {
        return this.a;
    }
}
