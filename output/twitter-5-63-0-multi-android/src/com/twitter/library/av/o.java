// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.provider.Tweet;

public class o implements AVTweetDataProvider
{
    private final String a;
    private final String b;
    
    public o(final Tweet tweet) {
        CardInstanceData w;
        if (tweet != null) {
            w = tweet.W();
        }
        else {
            w = null;
        }
        if (w != null) {
            this.a = w.g();
            this.b = w.h();
            return;
        }
        this.a = null;
        this.b = null;
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    @Override
    public String b() {
        return this.b;
    }
}
