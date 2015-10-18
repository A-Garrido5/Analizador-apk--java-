import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import java.util.Arrays;
import com.twitter.library.api.z;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.client.Session;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class oe extends og
{
    private long a;
    
    public oe(final Context context, final Session session) {
        super(context, oe.class.getName(), session);
        this.a(new u());
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "mutes/users/create" });
        this.a(a);
        if (this.a != 0L) {
            a.a("expiry", String.valueOf(this.a));
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final TwitterUser twitterUser = (TwitterUser)bg.a();
            final long c = this.P().c;
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            v.a(twitterUser.userId, 8192, w);
            twitterUser.friendship = z.a(twitterUser.friendship, 8192);
            v.a(Arrays.asList(twitterUser), c, 26, -1L, null, null, true, w);
            if (!z.b(twitterUser.friendship)) {
                v.c(c, twitterUser.userId, w);
            }
            w.a();
            aa.c.putString("muted_username", twitterUser.username);
        }
    }
    
    @Override
    public String b() {
        return "app:twitter_service:mute_user:create";
    }
}
