import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.api.be;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class na extends c
{
    private final long a;
    private final long e;
    private final long f;
    private final int g;
    private final Context h;
    private final Session i;
    private TwitterUser j;
    
    public na(final Context h, final Session i, final long a, final long e, final long f, final int g) {
        super(h, na.class.getName(), i);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b);
        final pw pw = new pw(this.h, this.i, this.e);
        pw.S();
        this.j = pw.b();
        if (this.j != null) {
            switch (this.g) {
                default: {
                    throw new IllegalStateException("Unknown user type: " + this.g);
                }
                case 4: {
                    a.a("lists", "members", "create");
                    a.a("list_id", String.valueOf(this.f));
                    a.a("user_id", String.valueOf(this.e));
                    break;
                }
                case 5: {
                    a.a("lists", "subscribers", "create");
                    a.a("list_id", String.valueOf(this.f));
                    break;
                }
            }
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final be be = (be)bg.a();
            final b w = this.W();
            this.V().a(this.a, this.j, this.g, be, w);
            w.a();
        }
    }
    
    protected bg b() {
        return bg.a(true, 1);
    }
}
