// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.search;

import com.twitter.library.provider.b;
import com.twitter.library.provider.bg;
import com.twitter.library.service.ab;
import android.content.Context;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.service.p;

public class a extends p
{
    private final TwitterUser a;
    private final long[] e;
    
    public a(final Context context, final ab ab, final TwitterUser twitterUser) {
        this(context, ab, twitterUser, null);
    }
    
    private a(final Context context, final ab ab, final TwitterUser a, final long[] e) {
        super(context, a.class.getName(), ab);
        this.a = a;
        this.e = e;
    }
    
    public a(final Context context, final ab ab, final long[] array) {
        this(context, ab, null, array);
    }
    
    @Override
    protected void a() {
        final bg t = this.t();
        final b u = this.u();
        if (this.a != null) {
            t.a(this.h().c, this.a, u);
        }
        else if (this.e != null) {
            t.a(this.h().c, this.e, u);
        }
        u.a();
    }
}
