import com.twitter.library.api.ad;
import com.twitter.library.service.d;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class rc extends c
{
    public rc(final Context context, final Session session) {
        super(context, rc.class.getName(), session);
    }
    
    @Override
    protected e a() {
        final f b = this.M().a(HttpOperation$RequestMethod.d).b(new Object[] { "commerce", "profiles" });
        rl.a(b, this.p);
        return b.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final rb rb) {
        if (httpOperation.j()) {
            aa.c.putBoolean("deleteprofile_success_boolean", true);
        }
        else {
            aa.c.putBoolean("deleteprofile_success_boolean", false);
            rl.a(aa, rb);
        }
        aa.a(httpOperation);
    }
    
    protected rb b() {
        return new rb();
    }
}
