import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ov extends ou
{
    private String g;
    
    public ov(final Context context, final Session session) {
        super(context, ov.class.getName(), session, false, "status");
        this.j("Not triggered by a user action.");
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.a).a("graph", "app", "optout", "status").a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.g = (String)bg.a();
        }
    }
    
    protected bg e() {
        return bg.a(94);
    }
    
    public String f() {
        return this.g;
    }
}
