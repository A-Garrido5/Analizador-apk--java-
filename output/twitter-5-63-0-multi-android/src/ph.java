import java.util.List;
import java.util.ArrayList;
import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.network.ae;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class ph extends c
{
    private int[] a;
    private qa e;
    
    public ph(final Context context, final Session session) {
        super(context, ph.class.getName(), session);
        this.a = ae.a;
        this.e = null;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.a).a(new Object[] { "users", "email_phone_info" }).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.e = (qa)bg.a();
            return;
        }
        this.a = ae.a((List)bg.a());
    }
    
    public int[] b() {
        return this.a;
    }
    
    public qa e() {
        return this.e;
    }
    
    protected bg f() {
        return bg.a(90);
    }
}
