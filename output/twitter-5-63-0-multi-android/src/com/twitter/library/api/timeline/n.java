// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.timeline;

import com.twitter.library.service.aa;
import com.twitter.library.provider.b;
import java.util.Map;
import com.twitter.library.provider.Tweet;
import com.twitter.library.service.ab;
import android.content.Context;

public class n extends q
{
    private final int a;
    private final long e;
    
    public n(final Context context, final ab ab, final Tweet tweet) {
        super(context, n.class.getName(), ab, tweet.D, tweet.ao);
        this.a = tweet.aa;
        this.e = tweet.Z;
    }
    
    int a(final int n, final long[] array, final b b) {
        return this.V().a(n, array, b);
    }
    
    b b() {
        return this.W();
    }
    
    @Override
    protected boolean c(final aa aa) {
        final b b = this.b();
        this.a(this.a, new long[] { this.e }, b);
        b.a();
        return true;
    }
}
