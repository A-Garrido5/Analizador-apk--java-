import com.twitter.library.provider.b;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.p;

// 
// Decompiled by Procyon v0.5.30
// 

public class mu extends p
{
    private final String a;
    
    public mu(final Context context, final Session session, final String a) {
        super(context, mu.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected void a() {
        final b u = this.u();
        this.t().a(new String[] { this.a }, u);
        u.a();
    }
}
