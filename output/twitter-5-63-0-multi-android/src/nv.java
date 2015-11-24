import com.twitter.library.api.al;
import com.twitter.library.api.PromotedEvent;
import com.twitter.library.service.ab;
import com.twitter.library.provider.bg;
import com.twitter.library.service.aa;
import android.content.Context;
import com.twitter.library.network.OAuthToken;
import com.twitter.library.service.y;

// 
// Decompiled by Procyon v0.5.30
// 

public class nv extends y
{
    private final long a;
    private final OAuthToken e;
    private final String f;
    
    public nv(final Context context, final long a, final String f, final OAuthToken e) {
        super(context, nv.class.getName());
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected void a_(final aa aa) {
        for (final al al : bg.a(this.p, this.a).b()) {
            new nu(this.p, new ab(this.a, this.f, this.e, true), PromotedEvent.a(al.c)).b(al.b).a(al.d).a(al.e).a(al.f).b(true).c(al.h).d(al.i).e(al.j).f(al.k).g(al.l).h(al.m).i(al.n).a(this).S();
        }
    }
}
