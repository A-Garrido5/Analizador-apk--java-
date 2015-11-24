import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pu extends c
{
    private final long a;
    private CardInstanceData e;
    
    public pu(final Context context, final Session session, final long a) {
        super(context, pu.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.a).a(new Object[] { "profile_spotlight", "show" }).a("user_id", this.a).a("client", "android").a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.e = (CardInstanceData)bg.a();
        }
    }
    
    protected bg b() {
        return bg.a(99);
    }
    
    public CardInstanceData e() {
        return this.e;
    }
}
