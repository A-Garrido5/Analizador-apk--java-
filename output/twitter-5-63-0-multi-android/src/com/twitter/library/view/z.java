// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.UrlEntity;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.TweetView;
import com.twitter.library.api.PromotedContent;

public interface z
{
    void a(final long p0, final long p1, final String p2, final PromotedContent p3, final TweetView p4, final boolean p5);
    
    void a(final Tweet p0, final long p1, final TweetView p2);
    
    void a(final Tweet p0, final MediaEntity p1, final TweetView p2);
    
    void a(final Tweet p0, final TweetClassicCard p1, final TweetView p2);
    
    void a(final Tweet p0, final UrlEntity p1);
    
    void a(final Tweet p0, final EditableMedia p1, final TweetView p2);
    
    void a(final Tweet p0, final TweetView p1);
    
    void a(final Tweet p0, final TweetView p1, final int p2);
    
    void a(final TweetActionType p0, final TweetView p1);
    
    void b(final Tweet p0, final UrlEntity p1);
    
    void b(final Tweet p0, final TweetView p1);
    
    void b(final TweetActionType p0, final TweetView p1);
    
    boolean b(final Tweet p0);
    
    void c(final Tweet p0, final TweetView p1);
}
