import com.twitter.library.service.d;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pn extends c
{
    private final long a;
    private final int e;
    
    public pn(final Context context, final Session session, final long a, final int e) {
        super(context, pn.class.getName(), session);
        if (e != 1 && e != 2) {
            throw new IllegalArgumentException("Unknown action.");
        }
        this.a = a;
        this.e = e;
    }
    
    @Override
    protected e a() {
        final bg v = this.V();
        final b w = this.W();
        v.a(18, this.P().c, this.a, w);
        w.a();
        final f a = this.M().a(HttpOperation$RequestMethod.b);
        final Object[] array = { "friendships", null };
        String s;
        if (this.e == 1) {
            s = "accept";
        }
        else {
            s = "deny";
        }
        array[1] = s;
        return a.a(array).a("user_id", String.valueOf(this.a)).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final com.twitter.library.api.bg bg) {
        if (this.e == 1 && aa.a()) {
            final TwitterUser twitterUser = (TwitterUser)bg.a();
            if (twitterUser != null) {
                final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>(1);
                list.add(twitterUser);
                final bg v = this.V();
                final b w = this.W();
                v.a(list, this.P().c, 1, -1L, null, null, true, w);
                w.a();
            }
        }
    }
    
    protected com.twitter.library.api.bg b() {
        return com.twitter.library.api.bg.a(17);
    }
}
