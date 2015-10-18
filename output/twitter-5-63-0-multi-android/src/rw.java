import com.twitter.library.api.ad;
import java.io.Serializable;
import com.twitter.library.commerce.model.Profile;
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

public class rw extends c
{
    public rw(final Context context, final Session session) {
        super(context, rw.class.getName(), session);
    }
    
    @Override
    protected e a() {
        final f b = this.M().a(HttpOperation$RequestMethod.a).b(new Object[] { "commerce", "profiles" });
        rl.a(b, this.p);
        return b.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final rx rx) {
        if (httpOperation.j()) {
            aa.c.putSerializable("profile_bundle", (Serializable)rx.a());
        }
        else {
            rl.a(aa, rx);
        }
        aa.a(httpOperation);
    }
    
    protected rx b() {
        return new rx();
    }
}
