import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;

// 
// Decompiled by Procyon v0.5.30
// 

public class ot extends ou
{
    private final String g;
    private final String h;
    
    public ot(final Context context, final Session session, final String g, final String h) {
        super(context, ot.class.getName(), session, true, "register");
        this.g = g;
        this.h = h;
        this.j("Not triggered by a user action.");
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("graph", "app", "register").a("ids", this.g).a("tstamps", this.h).a();
    }
    
    protected bg e() {
        return bg.a(93);
    }
}
