import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class nf extends c
{
    private final long a;
    private final long e;
    private final int f;
    
    public nf(final Context context, final Session session, final long a, final long e, final int f) {
        super(context, nf.class.getName(), session);
        this.a = a;
        this.e = e;
        this.f = f;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a("user_id", this.a).a("list_id", this.e);
        switch (this.f) {
            default: {
                throw new IllegalStateException("Unknown user type: " + this.f);
            }
            case 4: {
                a.a("lists", "members", "show");
                break;
            }
            case 5: {
                a.a("lists", "subscribers", "show");
                break;
            }
        }
        return a.a();
    }
    
    protected bg b() {
        return null;
    }
}
