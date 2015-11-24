// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.highlights;

import android.view.View;
import com.twitter.library.provider.Tweet;

public class as extends aw
{
    public as(final String s, final long n, final mx mx, final boolean b, final String s2, final String s3, final Tweet tweet) {
        super(s, n, mx, b, s2, s3, tweet, true);
    }
    
    @Override
    public int a() {
        return 1;
    }
    
    @Override
    public ag a(final View view) {
        return new at(this.a(), view);
    }
    
    @Override
    public String b() {
        return "TYPE_TWEET_WITH_MEDIA";
    }
}
