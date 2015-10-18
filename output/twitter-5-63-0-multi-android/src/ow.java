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

public class ow extends ou
{
    private String g;
    private String h;
    
    public ow(final Context context, final Session session, final String g) {
        super(context, ot.class.getName(), session, true, "update");
        this.g = g;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("graph", "app", "optout", "update").a("status", this.g).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        super.a(httpOperation, aa, bg);
        if (httpOperation.j()) {
            this.h = (String)bg.a();
        }
    }
    
    protected bg e() {
        return bg.a(94);
    }
    
    public String f() {
        return this.h;
    }
}
