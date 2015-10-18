import com.twitter.library.service.d;
import java.util.Iterator;
import com.twitter.library.provider.b;
import com.twitter.library.api.TwitterUser;
import java.util.ArrayList;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.e;
import java.util.Arrays;
import com.twitter.library.client.Session;
import android.content.Context;
import java.util.HashMap;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pp extends c
{
    private final boolean a;
    private final long[] e;
    private HashMap f;
    
    public pp(final Context context, final Session session, final long[] array) {
        this(context, session, array, false);
    }
    
    public pp(final Context context, final Session session, long[] copyOfRange, final boolean a) {
        super(context, pp.class.getName(), session);
        this.a = a;
        if (copyOfRange != null && copyOfRange.length > 100) {
            copyOfRange = Arrays.copyOfRange(copyOfRange, 0, 100);
        }
        this.e = copyOfRange;
    }
    
    @Override
    protected e a() {
        return this.M().a(new Object[] { "friendships", "lookup" }).a("user_id", this.e).a();
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (!httpOperation.k()) {
            return;
        }
        final ArrayList list = (ArrayList)bg.a();
        final HashMap<Long, Integer> f = new HashMap<Long, Integer>();
        for (final TwitterUser twitterUser : list) {
            f.put(twitterUser.userId, twitterUser.friendship);
        }
        this.f = f;
        if (this.a) {
            final b w = this.W();
            this.V().a(f, w);
            w.a();
            return;
        }
        this.V().a(f, null);
    }
    
    protected bg b() {
        return bg.a(48);
    }
    
    public HashMap e() {
        return this.f;
    }
}
