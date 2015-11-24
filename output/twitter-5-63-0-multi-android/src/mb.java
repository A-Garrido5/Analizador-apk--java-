import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.internal.network.HttpOperation$RequestMethod;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class mb extends c
{
    private final long a;
    
    public mb(final Context context, final Session session, final long a) {
        super(context, mb.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        return this.M().a(HttpOperation$RequestMethod.b).a("activity", "about_me", "unread").a("cursor", String.valueOf(this.a)).a("1.1").a();
    }
    
    protected bg b() {
        return null;
    }
}
