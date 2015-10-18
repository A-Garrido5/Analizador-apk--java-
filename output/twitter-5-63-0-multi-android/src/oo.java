import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.api.bp;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

class oo extends c
{
    private long a;
    private bp e;
    
    protected oo(final Context context, final ab ab, final long a) {
        super(context, oo.class.getName(), ab);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "statuses", "show" }).a("id", this.a).a("include_my_retweet", "true").a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.e = (bp)bg.a();
        }
    }
    
    protected bg b() {
        return bg.a(2);
    }
}
