import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pw extends c
{
    private final long a;
    private TwitterUser e;
    
    public pw(final Context context, final Session session, final long a) {
        super(context, pw.class.getName(), session);
        this.a = a;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "users", "show" }).a("include_media_features", true).a("include_user_entities", true).a("send_error_codes", true);
        if (this.a == 0L) {
            a.a("screen_name", "");
        }
        else {
            a.a("user_id", this.a);
        }
        return a.a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.j()) {
            this.e = (TwitterUser)bg.a();
        }
    }
    
    public TwitterUser b() {
        return this.e;
    }
    
    protected bg e() {
        return bg.a(17);
    }
}
