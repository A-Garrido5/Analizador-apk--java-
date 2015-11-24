import com.twitter.internal.android.service.x;
import com.twitter.library.service.d;
import android.database.Cursor;
import java.util.List;
import com.twitter.library.provider.b;
import android.net.Uri;
import com.twitter.library.provider.n;
import java.util.Collection;
import java.util.Collections;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.f;
import com.twitter.library.service.g;
import com.twitter.library.service.u;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class py extends ar
{
    public final TwitterUser a;
    private int e;
    private int f;
    
    public py(final Context context, final Session session, final TwitterUser twitterUser) {
        this(context, new ab(session), twitterUser);
    }
    
    public py(final Context context, final ab ab, final TwitterUser a) {
        super(context, py.class.getName(), ab);
        this.a = a;
        this.a(new u());
    }
    
    private void a(final f f, final String s, final int n) {
        if (this.c(n)) {
            f.a(s, this.d(n));
        }
    }
    
    private boolean c(final int n) {
        return (n & this.e) != 0x0;
    }
    
    private boolean d(final int n) {
        return (n & this.f) != 0x0;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "friendships", "update" });
        a.a("user_id", this.a.userId);
        this.a(a, "device", 1);
        this.a(a, "lifeline", 2);
        this.a(a, "retweets", 4);
        return a.a();
    }
    
    public py a(final int n, final boolean b) {
        this.e |= n;
        if (b) {
            this.f |= n;
            return this;
        }
        this.f &= ~n;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            final long userId = this.a.userId;
            if (this.c(1)) {
                final ab p3 = this.P();
                final long c = p3.c;
                if (this.d(1)) {
                    final List<TwitterUser> singletonList = Collections.singletonList(this.a);
                    v.a(userId, 16, w);
                    v.a(singletonList, c, 16, -1L, null, w);
                    final Cursor query = this.p.getContentResolver().query(Uri.withAppendedPath(com.twitter.library.provider.n.a, p3.e), new String[] { "notif_tweet" }, (String)null, (String[])null, (String)null);
                    int int1 = 0;
                    if (query != null) {
                        final boolean moveToFirst = query.moveToFirst();
                        int1 = 0;
                        if (moveToFirst) {
                            final boolean null = query.isNull(0);
                            int1 = 0;
                            if (!null) {
                                int1 = query.getInt(0);
                            }
                        }
                        query.close();
                    }
                    if (int1 == 0) {
                        aa.a(1001);
                    }
                }
                else {
                    v.b(userId, 16, w);
                    v.a(16, c, userId, w);
                    v.a(1, this.a.username);
                }
            }
            if (this.c(2)) {
                if (this.d(2)) {
                    v.a(userId, 256, w);
                }
                else {
                    v.b(userId, 256, w);
                }
            }
            if (this.c(4)) {
                if (this.d(4)) {
                    v.a(userId, 512, w);
                }
                else {
                    v.b(userId, 512, w);
                }
            }
            w.a();
        }
    }
    
    @Override
    public String b() {
        return "app:twitter_service:follow:update";
    }
    
    @Override
    protected boolean c(final aa aa) {
        return this.a != null && this.e != 0;
    }
    
    @Override
    protected boolean d(final x x) {
        if (super.d(x)) {
            return true;
        }
        final aa aa = (aa)x.b();
        return aa.c() == 403 || aa.c() == 1001;
    }
    
    protected bg e() {
        return bg.a(30);
    }
}
