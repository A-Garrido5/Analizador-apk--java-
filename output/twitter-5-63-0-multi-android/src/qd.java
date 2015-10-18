import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.List;
import com.twitter.library.client.App;
import java.util.Collection;
import java.util.Collections;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import android.text.TextUtils;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.ArrayList;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class qd extends i
{
    public TwitterUser a;
    public ArrayList e;
    private final long f;
    private final String h;
    
    public qd(final Context context, final Session session, final long n, final String s) {
        this(context, new ab(session), n, s);
    }
    
    public qd(final Context context, final ab ab, final long f, final String h) {
        super(context, qd.class.getName(), ab);
        this.f = f;
        this.h = h;
        if (this.f == 0L && TextUtils.isEmpty((CharSequence)this.h)) {
            throw new IllegalArgumentException("userId must be non-zero or screenName must be non-null. userId=" + this.f + ", screenName=" + this.h);
        }
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final TwitterUser a = (TwitterUser)bg.a();
            if (a != null) {
                a.lastUpdated = System.currentTimeMillis();
                final List<TwitterUser> singletonList = Collections.singletonList(a);
                final b w = this.W();
                this.V().a(singletonList, -1L, -1, -1L, null, null, true, w);
                w.a();
                if (this.P().c != a.userId) {
                    final pl pl = new pl(this.p, this.P());
                    pl.a = a.userId;
                    if (pl.S().a()) {
                        a.friendship = pl.e;
                    }
                }
                if (!a.hasEmptyExtendedProfile && pi.b()) {
                    final pk pk = new pk(this.p, this.P());
                    pk.a = this.f;
                    if (pk.S().a() || App.a()) {
                        a.extendedProfile = pk.e;
                    }
                }
                this.a = a;
            }
            return;
        }
        this.e = (ArrayList)bg.a();
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(new Object[] { "users", "show" }).a("include_media_features", true).a("include_user_entities", true).a("send_error_codes", true);
        if (this.f == 0L) {
            a.a("screen_name", this.h);
            return a;
        }
        a.a("user_id", this.f);
        return a;
    }
    
    protected bg e() {
        return bg.a(17);
    }
}
