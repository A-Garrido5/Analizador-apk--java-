import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class of extends og
{
    public of(final Context context, final Session session) {
        super(context, of.class.getName(), session);
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "mutes/users/destroy" });
        this.a(a);
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final TwitterUser twitterUser = (TwitterUser)bg.a();
            final com.twitter.library.provider.bg v = this.V();
            final long userId = twitterUser.userId;
            final b w = this.W();
            v.a(26, this.P().c, userId, w);
            v.b(userId, 8192, w);
            w.a();
            aa.c.putString("muted_username", twitterUser.username);
        }
    }
    
    @Override
    public String b() {
        return null;
    }
}
