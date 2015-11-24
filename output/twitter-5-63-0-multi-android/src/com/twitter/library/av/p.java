// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.card.instance.CardInstanceData;
import com.twitter.util.k;
import com.twitter.library.provider.Tweet;

public class p
{
    private static p a;
    
    static {
        p.a = new p();
    }
    
    public static p a() {
        return p.a;
    }
    
    public static AVTweetDataProvider$AVTweetType b(final Tweet tweet) {
        AVTweetDataProvider$AVTweetType avTweetDataProvider$AVTweetType = AVTweetDataProvider$AVTweetType.a;
        if (tweet != null) {
            final CardInstanceData w = tweet.W();
            if (w != null) {
                final String a = k.a(w.name);
                if (a.toLowerCase().contains("audio")) {
                    avTweetDataProvider$AVTweetType = AVTweetDataProvider$AVTweetType.d;
                }
                else {
                    if (a.toLowerCase().contains("appplayer")) {
                        return AVTweetDataProvider$AVTweetType.b;
                    }
                    return AVTweetDataProvider$AVTweetType.a;
                }
            }
            else if (tweet.I()) {
                return AVTweetDataProvider$AVTweetType.c;
            }
        }
        return avTweetDataProvider$AVTweetType;
    }
    
    public AVTweetDataProvider a(final Tweet tweet) {
        return this.a(tweet, b(tweet));
    }
    
    AVTweetDataProvider a(final Tweet tweet, final AVTweetDataProvider$AVTweetType avTweetDataProvider$AVTweetType) {
        switch (q.a[avTweetDataProvider$AVTweetType.ordinal()]) {
            default: {
                return new o(tweet);
            }
            case 1: {
                return new r(tweet);
            }
        }
    }
}
