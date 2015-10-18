import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ac;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class mn extends i
{
    protected ac a;
    private final String e;
    
    public mn(final Context context, final Session session, final String e) {
        super(context, mn.class.getName(), session);
        this.e = e;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            this.a = (ac)bg.a();
        }
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.a).a(new Object[] { "device", "install_referrer" }).a("os_version", this.e);
    }
    
    public ac e() {
        return this.a;
    }
    
    protected bg f() {
        return bg.a(92);
    }
}
