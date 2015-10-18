// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import java.util.Iterator;
import com.twitter.library.service.f;
import com.twitter.library.service.d;
import com.twitter.internal.network.HttpOperation;
import android.database.ContentObserver;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.b;
import com.twitter.library.api.bt;
import com.twitter.library.api.bs;
import com.twitter.library.api.bg;
import java.util.List;
import java.util.Collections;
import com.twitter.library.service.ab;
import android.content.Context;
import java.util.Map;
import com.twitter.library.api.TwitterUser;
import java.util.ArrayList;

public abstract class RichTimeline extends ak
{
    protected final String a;
    protected RichTimeline$RequestType e;
    protected ArrayList f;
    private final TwitterUser h;
    private final long i;
    private long j;
    private Map k;
    
    public RichTimeline(final Context context, final String s, final ab ab, final long n) {
        this(context, s, ab, null, n);
    }
    
    public RichTimeline(final Context context, final String s, final ab ab, final TwitterUser twitterUser) {
        this(context, s, ab, twitterUser, -1L);
    }
    
    private RichTimeline(final Context context, final String s, final ab ab, final TwitterUser h, final long i) {
        super(context, s, ab);
        this.e = RichTimeline$RequestType.a;
        this.k = Collections.emptyMap();
        if (h == null && i == -1L) {
            throw new IllegalArgumentException(String.format("Either timelineOwner or timelineOwnerId must be valid. timelineOwner: %s timelineOwnerId: %d", h, i));
        }
        this.a = ab.e;
        this.h = h;
        this.i = i;
    }
    
    protected aa A() {
        return new ac().a(false).b(false).c(false).a();
    }
    
    protected void B() {
    }
    
    public boolean C() {
        return this.e == RichTimeline$RequestType.a || this.e == RichTimeline$RequestType.b;
    }
    
    public List D() {
        return this.f;
    }
    
    protected bg E() {
        return bg.a(44, this.h);
    }
    
    protected long F() {
        if (this.h != null) {
            return this.h.userId;
        }
        return this.i;
    }
    
    protected String G() {
        return "unspecified";
    }
    
    public RichTimeline a(final long j) {
        this.j = j;
        return this;
    }
    
    public RichTimeline a(final RichTimeline$RequestType e) {
        this.e = e;
        return this;
    }
    
    protected ag a(final bs bs) {
        final com.twitter.library.provider.bg v = this.V();
        final ArrayList a = bs.a;
        final long f = this.F();
        final int z = this.z();
        final boolean b = this.e == RichTimeline$RequestType.d && v.a(z, this.j, f);
        final boolean b2 = this.e == RichTimeline$RequestType.c && a.isEmpty();
        final boolean b3 = this.e == RichTimeline$RequestType.b && "bottom".equals(bs.d);
        final boolean b4 = !this.Q() && this.e == RichTimeline$RequestType.b;
        bs.a(new bt(this.e, this.k.get("up_cursor"), this.k.get("down_cursor")));
        final int a2 = v.a(bs, null, f, z, this.G(), b2, b3, -1L, -1L, b4, null, true, null, null, null, this.Q(), this.A());
        return new ag(b, a2, b2, a2 > 0 && this.e == RichTimeline$RequestType.b);
    }
    
    protected void a(final int n, final boolean b, final boolean b2) {
        if (n > 0 || b || b2) {
            this.B();
            this.p.getContentResolver().notifyChange(ae.a(this.z()), (ContentObserver)null);
        }
        this.d(n);
    }
    
    protected void a(final HttpOperation httpOperation, final com.twitter.library.service.aa aa, final bg bg) {
        if (httpOperation.k()) {
            final bs bs = (bs)bg.a();
            this.f = bs.a;
            final ag a = this.a(bs);
            this.a(a.b, a.a, a.c);
            aa.c.putInt("scribe_item_count", a.b);
        }
    }
    
    protected void a(final f f) {
        this.k = this.e.a(this.V(), ae.c(this.z()), this.F(), this.j);
        for (final Map.Entry<String, V> entry : this.k.entrySet()) {
            f.a(entry.getKey(), (String)entry.getValue());
        }
    }
    
    @Override
    protected f g() {
        final f m = this.M();
        this.a(m);
        return m;
    }
    
    protected abstract int z();
}
