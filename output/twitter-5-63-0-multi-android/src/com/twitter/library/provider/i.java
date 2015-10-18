// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import com.twitter.library.api.TweetEntities;

public class i
{
    public final String a;
    public final TweetEntities b;
    
    public i(final String a, TweetEntities a2) {
        this.a = a;
        if (a2 == null) {
            a2 = TweetEntities.a;
        }
        this.b = a2;
    }
}
