// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeItem;

public class y extends ax
{
    @Override
    public TwitterScribeItem a(final a a) {
        final TwitterScribeItem a2 = super.a(a);
        this.a(a2, a.b);
        return a2;
    }
    
    @Override
    public String a() {
        return "video_player";
    }
    
    void a(final TwitterScribeItem twitterScribeItem, final Tweet tweet) {
        if (tweet != null) {
            final long f = tweet.f;
            twitterScribeItem.ad = f;
            twitterScribeItem.H = f;
        }
    }
}
