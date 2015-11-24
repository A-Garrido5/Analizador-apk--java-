import com.twitter.library.provider.b;
import java.util.Collection;
import com.twitter.library.service.d;
import android.util.Pair;
import com.twitter.library.api.bg;
import com.twitter.library.service.aa;
import com.twitter.internal.network.HttpOperation;
import com.twitter.library.service.f;
import com.twitter.library.service.e;
import java.util.Iterator;
import com.twitter.library.api.TwitterUser;
import java.util.HashMap;
import java.util.ArrayList;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.service.c;

// 
// Decompiled by Procyon v0.5.30
// 

public class pq extends c
{
    public final pr a;
    
    public pq(final Context context, final ab ab) {
        this(context, ab, new pr());
    }
    
    public pq(final Context context, final ab ab, final pr a) {
        super(context, pq.class.getName(), ab);
        this.a = a;
    }
    
    private ArrayList b(final ArrayList list) {
        if (this.a.a == null || this.a.a.length <= 0 || !this.a.h) {
            return list;
        }
        final int size = list.size();
        final HashMap hashMap = new HashMap<Long, TwitterUser>(size);
        final ArrayList list2 = new ArrayList<TwitterUser>(size);
        for (final TwitterUser twitterUser : list) {
            hashMap.put(twitterUser.userId, twitterUser);
        }
        final long[] a = this.a.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            final TwitterUser twitterUser2 = hashMap.get(a[i]);
            if (twitterUser2 != null) {
                list2.add(twitterUser2);
            }
        }
        return list2;
    }
    
    @Override
    protected e a() {
        final f a = this.M().a(new Object[] { "users", "lookup" });
        if (this.a.i) {
            a.a("map", true);
        }
        if (this.a.a != null && this.a.a.length > 0) {
            a.a("user_id", this.a.a);
        }
        if (this.a.b != null && this.a.b.length > 0) {
            a.a("email", this.a.b);
        }
        if (this.a.c != null && this.a.c.length > 0) {
            a.a("phone", this.a.c);
        }
        return a.a();
    }
    
    public pq a(final long[] a, final boolean h) {
        this.a.h = h;
        this.a.a = a;
        return this;
    }
    
    protected void a(final HttpOperation httpOperation, final aa aa, final bg bg) {
        if (!httpOperation.j()) {
            return;
        }
        if (this.a.i) {
            this.a((ArrayList)((Pair)bg.a()).first);
            return;
        }
        this.a(this.b((ArrayList)bg.a()));
    }
    
    protected void a(final ArrayList k) {
        final long c = this.P().c;
        this.a.k = k;
        this.a.j = this.V().a(k, c, this.a.d, this.a.e, this.a.f, this.a.g, true, null);
    }
    
    protected bg b() {
        int n;
        if (this.a.i) {
            n = 35;
        }
        else {
            n = 22;
        }
        return bg.a(n);
    }
}
