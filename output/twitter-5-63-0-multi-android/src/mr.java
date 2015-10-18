import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class mr extends mm
{
    private boolean e;
    
    public mr(final Context context, final Session session, final String s) {
        super(context, mr.class.getName(), session, s);
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "device", "sms_verify_begin" });
        this.a(a);
        return a.a();
    }
    
    @Override
    protected final void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.k()) {
            this.e = (boolean)bg.a();
        }
    }
    
    protected bg f() {
        return bg.a(86);
    }
    
    public boolean g() {
        return this.e;
    }
}
