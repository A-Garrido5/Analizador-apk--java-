import com.twitter.library.service.d;
import com.twitter.library.provider.b;
import com.twitter.library.api.be;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class nh extends c
{
    private final long a;
    private final long e;
    private final long f;
    private final int g;
    private int h;
    
    public nh(final Context context, final Session session, final long a, final long e, final long f, final int g) {
        super(context, nh.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(HttpOperation$RequestMethod.b);
        switch (this.g) {
            default: {
                throw new IllegalStateException("Unknown user type: " + this.g);
            }
            case 4: {
                a.a("lists", "members", "destroy").a("list_id", String.valueOf(this.f)).a("user_id", String.valueOf(this.e));
                break;
            }
            case 5: {
                a.a("lists", "subscribers", "destroy").a("list_id", String.valueOf(this.f));
                break;
            }
        }
        switch (this.g) {
            default: {
                this.h = 0;
                break;
            }
            case 4: {
                this.h = 1;
                break;
            }
            case 5: {
                this.h = 2;
                break;
            }
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            final be be = (be)bg.a();
            final b w = this.W();
            this.V().a(this.g, this.a, this.e, be, w);
            w.a();
        }
    }
    
    protected bg b() {
        return bg.a(true, this.h);
    }
}
