// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.widget;

import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;

public interface r
{
    void a(final TweetMediaView p0, final MediaEntity p1, final boolean p2);
    
    void a(final TweetMediaView p0, final TweetClassicCard p1, final boolean p2);
    
    void a(final TweetMediaView p0, final EditableMedia p1, final boolean p2);
}
