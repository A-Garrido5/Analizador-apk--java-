import com.twitter.library.service.d;
import com.twitter.library.api.x;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ExtendedProfile;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pk extends c
{
    public long a;
    public volatile ExtendedProfile e;
    
    public pk(final Context context, final Session session) {
        super(context, pk.class.getName(), session);
    }
    
    protected pk(final Context context, final ab ab) {
        super(context, pk.class.getName(), ab);
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "users", "extended_profile" }).a("id", this.a).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final com.twitter.library.provider.bg v = this.V();
        if (httpOperation.k()) {
            final x x = (x)bg.a();
            x.b(System.currentTimeMillis());
            this.e = (ExtendedProfile)x.f();
            v.a(this.a, this.e);
        }
    }
    
    protected bg b() {
        return bg.a(103);
    }
    
    @Override
    protected boolean c(final aa aa) {
        if (this.P().c == 0L || this.a == 0L) {
            aa.a(false);
            return false;
        }
        return true;
    }
}
