import com.twitter.library.service.d;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import com.twitter.library.service.ab;
import com.twitter.library.client.Session;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class lz extends c
{
    public static final String a;
    
    static {
        a = lz.class.getName();
    }
    
    public lz(final Context context, final Session session) {
        this(context, new ab(session));
    }
    
    public lz(final Context context, final ab ab) {
        super(context, lz.a, ab);
    }
    
    @Override
    protected e a() {
        return this.M().a("activity", "about_me", "unread").a("cursor", true).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (httpOperation.k()) {
            final long longValue = (long)bg.a();
            if (longValue > System.currentTimeMillis()) {
                aa.c.putLong("act_read_pos", 0L);
                return;
            }
            aa.c.putLong("act_read_pos", longValue);
        }
    }
    
    protected bg b() {
        return bg.a(50);
    }
}
