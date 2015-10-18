// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.media.util.l;
import com.twitter.library.media.manager.k;
import com.twitter.internal.android.util.Size;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.Tweet;

public class nx
{
    public final long a;
    public final Tweet b;
    public final float c;
    public final boolean d;
    public final MediaEntity e;
    public TweetClassicCard f;
    
    nx(final long a, final Tweet b, final Size size, final MediaEntity e, final boolean d) {
        this.a = a;
        this.b = b;
        this.c = size.e();
        this.d = d;
        this.e = e;
    }
    
    nx(final long n, final Tweet tweet, final Size size, final TweetClassicCard f) {
        this(n, tweet, size, tweet.Q(), true);
        this.f = f;
    }
    
    public k a() {
        if (this.f != null) {
            return l.a(this.f);
        }
        return l.a(this.e);
    }
}
