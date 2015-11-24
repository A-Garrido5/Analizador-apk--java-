import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.api.bg;
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

public class pa extends c
{
    private long a;
    
    public pa(final Context context, final Session session) {
        super(context, pa.class.getName(), session);
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "friendships", "cancel" }).a("user_id", String.valueOf(this.a)).a();
    }
    
    public pa a(final long a) {
        this.a = a;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final b w = this.W();
            this.V().b(this.a, 16384, w);
            w.a();
        }
    }
    
    protected bg b() {
        return bg.a(17);
    }
}
