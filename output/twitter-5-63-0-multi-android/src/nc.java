import com.twitter.library.provider.b;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class nc extends c
{
    private final long a;
    private final long e;
    
    public nc(final Context context, final Session session, final long a, final long e) {
        super(context, nc.class.getName(), session);
        this.a = a;
        this.e = e;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "lists", "destroy" }).a("list_id", this.a).a();
    }
    
    @Override
    protected void a(final HttpOperation httpOperation, final aa aa, final d d) {
        if (httpOperation.j()) {
            final b w = this.W();
            this.V().d(this.e, this.a, w);
            w.a();
        }
    }
    
    @Override
    protected d h() {
        return null;
    }
}
