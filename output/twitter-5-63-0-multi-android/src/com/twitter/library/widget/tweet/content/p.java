// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import com.twitter.library.media.widget.r;
import com.twitter.library.util.d;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import android.app.Activity;

public class p
{
    protected static int a(final Integer n) {
        if (n != null) {
            return n;
        }
        return 0;
    }
    
    protected f a(final Activity activity, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final d d) {
        return null;
    }
    
    public f a(final Activity activity, final DisplayMode displayMode, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final d d) {
        if (displayMode == DisplayMode.a) {
            return this.b(activity, tweet, twitterScribeAssociation, twitterScribeAssociation2, d);
        }
        return this.a(activity, tweet, twitterScribeAssociation, twitterScribeAssociation2, d);
    }
    
    protected f b(final Activity activity, final Tweet tweet, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2, final d d) {
        return new o(activity, tweet, a(d.b(0)), a(d.b(1)), (k)d.get(4), (r)d.get(3), twitterScribeAssociation, twitterScribeAssociation2);
    }
}
