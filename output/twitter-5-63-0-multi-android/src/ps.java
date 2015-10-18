import java.util.List;
import com.twitter.library.provider.b;
import java.util.Collection;
import java.util.ArrayList;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.util.q;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

class ps extends c
{
    private final long[] a;
    
    protected ps(final Context context, final String s, final ab ab, final long[] a) {
        super(context, s, ab);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "friendships", "create_all" }).a("send_error_codes", true).a("user_id", com.twitter.util.q.a(this.a)).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.k()) {
            final ArrayList list = (ArrayList)bg.a();
            final com.twitter.library.provider.bg v = this.V();
            final b w = this.W();
            v.a((Collection)list, 1, w);
            w.a();
            final List a = v.a(this.a);
            long c;
            if (this.P() != null) {
                c = this.P().c;
            }
            else {
                c = 0L;
            }
            v.a(a, c, 0, -1L, null, null, true, w);
        }
    }
    
    protected bg b() {
        return bg.a(9);
    }
}
