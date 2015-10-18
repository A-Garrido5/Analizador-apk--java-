import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import java.util.List;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.network.ae;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.account.i;

// 
// Decompiled by Procyon v0.5.30
// 

public class ok extends i
{
    private final String a;
    private final String e;
    private boolean f;
    private int[] h;
    
    public ok(final Context context, final Session session, final String s, final String s2) {
        this(context, new ab(session), s, s2);
    }
    
    public ok(final Context context, final ab ab, final String a, final String e) {
        super(context, ok.class.getName(), ab, true);
        this.h = ae.a;
        this.a = a;
        this.e = e;
    }
    
    protected final void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            this.f = (boolean)bg.a();
            return;
        }
        this.h = ae.a((List)bg.a());
    }
    
    @Override
    protected f b() {
        return this.M().a(HttpOperation$RequestMethod.b).a(new Object[] { "signup", "sms_verify_complete" }).a("phone_number", this.a).a("pin", this.e);
    }
    
    public int[] e() {
        return this.h;
    }
    
    public boolean f() {
        return this.f;
    }
    
    protected bg g() {
        return bg.a(87);
    }
}
