import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.api.z;
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
import com.twitter.library.api.TwitterUser;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.api.ar;

// 
// Decompiled by Procyon v0.5.30
// 

public class od extends ar
{
    public final long a;
    public final PromotedContent e;
    public boolean f;
    public TwitterUser g;
    public TwitterUser h;
    public String i;
    
    public od(final Context context, final Session session, final long a, final PromotedContent e, final int n) {
        super(context, od.class.getName(), session);
        this.a = a;
        this.e = e;
        this.g(n);
        if (n == 1) {
            this.a(new u());
        }
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a("user_id", this.a);
        if (this.e != null) {
            if (this.e.impressionId != null) {
                a.a("impression_id", this.e.impressionId);
            }
            if (this.e.b()) {
                a.a("earned", true);
            }
        }
        switch (this.O()) {
            default: {
                throw new IllegalArgumentException("Unknown action: " + this.O());
            }
            case 1: {
                return a.a(new Object[] { "blocks", "create" }).a();
            }
            case 2: {
                return a.a(new Object[] { "users", "report_spam" }).a("perform_block", this.f).a();
            }
            case 3: {
                return a.a(new Object[] { "blocks", "destroy" }).a();
            }
        }
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final com.twitter.library.provider.bg v = this.V();
        final b w = this.W();
        switch (this.O()) {
            case 1:
            case 2: {
                if (!httpOperation.j()) {
                    break;
                }
                final TwitterUser g = (TwitterUser)bg.a();
                this.g = g;
                if (this.O() != 2 || this.f) {
                    final long c = this.P().c;
                    g.friendship = z.a(v.e(g.userId), 4);
                    v.b(c, g.userId, w);
                    final ArrayList<TwitterUser> list = new ArrayList<TwitterUser>();
                    list.add(g);
                    v.a(list, c, 2, -1L, null, null, true, w);
                    w.a();
                    return;
                }
                break;
            }
            case 3: {
                if (httpOperation.j()) {
                    this.h = (TwitterUser)bg.a();
                    final long a = this.a;
                    v.a(2, this.P().c, a, w);
                    v.b(a, 4, w);
                    w.a();
                    return;
                }
                break;
            }
        }
    }
    
    @Override
    public String b() {
        switch (this.O()) {
            default: {
                return null;
            }
            case 1: {
                return "app:twitter_service:block_user:create";
            }
        }
    }
    
    protected bg e() {
        switch (this.O()) {
            default: {
                return null;
            }
            case 1:
            case 2:
            case 3: {
                return bg.a(17);
            }
        }
    }
}
