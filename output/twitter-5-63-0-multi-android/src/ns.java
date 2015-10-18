import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import java.util.List;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class ns extends c
{
    private String a;
    private String e;
    private int f;
    
    public ns(final Context context, final Session session) {
        super(context, ns.class.getName(), session);
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "news", "top" });
        a.a("country_code", this.a);
        a.a("lang", this.e);
        a.a("max_results", this.f);
        return a.a();
    }
    
    public ns a(final String a) {
        this.a = a;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final List list = (List)bg.a();
            final b w = this.W();
            this.V().a(this.P().c, list, this.a, this.e, true, w);
            w.a();
        }
    }
    
    protected bg b() {
        return bg.a(100);
    }
    
    public ns b(final String e) {
        this.e = e;
        return this;
    }
    
    public ns c(final int f) {
        this.f = f;
        return this;
    }
}
