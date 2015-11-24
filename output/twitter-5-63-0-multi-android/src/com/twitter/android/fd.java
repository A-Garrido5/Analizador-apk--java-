// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.api.DiscoverStoryMetadata;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.widget.TweetView;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.Fragment;

final class fd extends xa
{
    public fd(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final String s, final String s2, final String s3) {
        super(fragment, twitterScribeAssociation, null, s, s2, s3, "tweet:::platform_player_card:click");
    }
    
    @Override
    protected TwitterScribeItem a(final TweetView tweetView) {
        final Object tag = tweetView.getTag();
        if (tag instanceof DiscoverStoryMetadata) {
            return TwitterScribeItem.a((DiscoverStoryMetadata)tag);
        }
        return null;
    }
}
