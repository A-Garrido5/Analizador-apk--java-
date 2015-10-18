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

public abstract class b implements z
{
    @Override
    public void a(final long n, final long n2, final String s, final PromotedContent promotedContent, final TweetView tweetView, final boolean b) {
    }
    
    @Override
    public void a(final Tweet tweet, final long n, final TweetView tweetView) {
    }
    
    @Override
    public void a(final Tweet tweet, final MediaEntity mediaEntity, final TweetView tweetView) {
    }
    
    @Override
    public void a(final Tweet tweet, final TweetClassicCard tweetClassicCard, final TweetView tweetView) {
    }
    
    @Override
    public void a(final Tweet tweet, final UrlEntity urlEntity) {
    }
    
    @Override
    public void a(final Tweet tweet, final EditableMedia editableMedia, final TweetView tweetView) {
    }
    
    @Override
    public void a(final Tweet tweet, final TweetView tweetView) {
    }
    
    @Override
    public void a(final Tweet tweet, final TweetView tweetView, final int n) {
    }
    
    @Override
    public void a(final TweetActionType tweetActionType, final TweetView tweetView) {
    }
    
    @Override
    public void b(final Tweet tweet, final UrlEntity urlEntity) {
    }
    
    @Override
    public void b(final Tweet tweet, final TweetView tweetView) {
    }
    
    @Override
    public void b(final TweetActionType tweetActionType, final TweetView tweetView) {
    }
    
    @Override
    public boolean b(final Tweet tweet) {
        return false;
    }
    
    @Override
    public void c(final Tweet tweet, final TweetView tweetView) {
    }
}
