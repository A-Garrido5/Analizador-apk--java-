import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.util.bh;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.ak;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class mo extends i
{
    private ak a;
    private String e;
    private String f;
    
    public mo(final Context context, final String s, final Session session, final String e) {
        super(context, s, session);
        this.e = e;
        this.f = bh.a(context);
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            this.a = (ak)bg.a();
            return;
        }
        this.a = new ak();
    }
    
    @Override
    protected f b() {
        final f a = this.M().a(HttpOperation$RequestMethod.a).a(new Object[] { "users", "phone_number_available" }).a("raw_phone_number", this.e);
        if (this.f != null) {
            a.a("country_code", this.f.toUpperCase());
        }
        return a;
    }
    
    protected bg e() {
        return bg.a(88);
    }
    
    public ak f() {
        return this.a;
    }
}
