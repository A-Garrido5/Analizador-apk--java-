import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pl extends c
{
    public long a;
    public volatile int e;
    
    public pl(final Context context, final Session session) {
        super(context, pl.class.getName(), session);
    }
    
    protected pl(final Context context, final ab ab) {
        super(context, pl.class.getName(), ab);
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "friendships", "show" }).a("source_id", this.P().c).a("target_id", this.a).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        final com.twitter.library.provider.bg v = this.V();
        if (httpOperation.k()) {
            v.b(this.a, (int)bg.a());
        }
        this.e = v.e(this.a);
    }
    
    protected bg b() {
        return bg.a(30);
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
