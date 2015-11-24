// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import android.view.View;
import android.os.Bundle;
import android.content.res.Configuration;
import android.content.Context;
import com.twitter.library.media.widget.r;
import android.app.Activity;
import com.twitter.library.media.widget.AdaptiveTweetMediaView;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.media.widget.TweetMediaView;
import com.twitter.library.media.widget.s;

class m implements s
{
    final /* synthetic */ l a;
    
    m(final l a) {
        this.a = a;
    }
    
    @Override
    public void a(final TweetMediaView tweetMediaView, final MediaEntity mediaEntity) {
        this.a.d.a(mediaEntity);
    }
    
    @Override
    public void a(final TweetMediaView tweetMediaView, final TweetClassicCard tweetClassicCard) {
        this.a.d.a(tweetClassicCard);
    }
    
    @Override
    public void a(final TweetMediaView tweetMediaView, final EditableMedia editableMedia) {
        this.a.d.a(editableMedia);
    }
}
