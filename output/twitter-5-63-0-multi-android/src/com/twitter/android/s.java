// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.widget.TweetView;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import com.twitter.library.api.TwitterUser;

public interface s
{
    void a(final long p0, final int p1, final long p2);
    
    void a(final long p0, final String p1);
    
    void a(final long p0, final String p1, final String p2, final long p3);
    
    void a(final TwitterUser p0);
    
    void a(final Tweet p0, final String p1);
    
    void a(final Tweet p0, final String p1, final long p2, final int p3, final int p4, final String p5, final TwitterScribeItem p6, final long p7);
    
    void a(final TweetView p0, final String p1);
    
    void b(final TwitterUser p0);
}
