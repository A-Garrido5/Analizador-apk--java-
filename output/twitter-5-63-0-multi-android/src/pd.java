import com.twitter.library.api.timeline.w;
import com.twitter.library.api.search.a;
import java.util.Arrays;
import com.twitter.library.network.ae;
import com.twitter.library.service.aa;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.ab;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.y;

// 
// Decompiled by Procyon v0.5.30
// 

public class pd extends y
{
    private final long[] a;
    private final TwitterUser e;
    private final boolean f;
    private final ab g;
    
    public pd(final Context context, final Session session, final long[] a, final boolean f) {
        super(context, pd.class.getName(), new ab(session));
        this.a = a;
        this.e = session.f();
        this.f = f;
        this.g = this.P();
    }
    
    public long[] a() {
        return this.a;
    }
    
    @Override
    protected void a_(final aa aa) {
        final int a = ae.a(this.a.length, 100);
        int i = 0;
        int n = 0;
        int n2 = 0;
        while (i < a) {
            final int n3 = i * 100;
            int n4;
            int n5;
            if (((ps)new ps(this.p, this.c, this.g, Arrays.copyOfRange(this.a, n3, Math.min(n3 + 100, this.a.length))).a(this)).S().a()) {
                this.b(new com.twitter.library.api.search.a(this.p, this.g, this.a));
                n4 = 1;
                n5 = n2;
            }
            else {
                n4 = n;
                n5 = 1;
            }
            ++i;
            n2 = n5;
            n = n4;
        }
        if (n2 != 0 && n != 0) {
            aa.a(418);
        }
        if (n != 0 && this.f) {
            this.b(new w(this.p, this.g, this.e).j("Request being made to fill timeline with new followed users tweets. User did not trigger this request."));
        }
    }
}
