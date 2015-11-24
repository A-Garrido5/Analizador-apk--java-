// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.util.q;
import com.twitter.library.provider.Tweet;

public class r implements AVTweetDataProvider
{
    private final String a;
    
    public r(final Tweet tweet) {
        MediaEntity c;
        if (tweet != null) {
            c = q.c(tweet.R());
        }
        else {
            c = null;
        }
        String value;
        if (c != null) {
            value = String.valueOf(c.id);
        }
        else {
            value = "";
        }
        this.a = value;
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    @Override
    public String b() {
        return this.a;
    }
}
