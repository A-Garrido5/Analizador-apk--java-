// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.library.provider.Tweet;
import com.twitter.android.client.c;

public class o
{
    private final c a;
    
    public o(final c a) {
        this.a = a;
    }
    
    public n a(final Tweet tweet) {
        CardInstanceData w;
        if (tweet != null) {
            w = tweet.W();
        }
        else {
            w = null;
        }
        String name;
        if (w != null && w.name != null) {
            name = w.name;
        }
        else {
            name = "";
        }
        if (name.toLowerCase().contains("audio")) {
            return new m(this.a);
        }
        return new p(this.a);
    }
}
