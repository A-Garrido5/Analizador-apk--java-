// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget;

import com.twitter.library.media.model.EditableMedia;
import com.twitter.library.api.TweetClassicCard;
import com.twitter.library.api.MediaEntity;
import com.twitter.library.widget.tweet.content.k;

class az implements k
{
    final /* synthetic */ TweetView a;
    
    az(final TweetView a) {
        this.a = a;
    }
    
    @Override
    public void a(final MediaEntity mediaEntity) {
        this.a.a(mediaEntity);
    }
    
    @Override
    public void a(final TweetClassicCard tweetClassicCard) {
        this.a.i();
    }
    
    @Override
    public void a(final EditableMedia editableMedia) {
        this.a.a(editableMedia);
    }
}
