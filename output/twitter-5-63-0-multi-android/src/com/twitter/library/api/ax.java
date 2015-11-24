// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api;

import com.twitter.model.common.a;

public class ax extends a
{
    final w a;
    final ag b;
    final w c;
    final w d;
    final w e;
    
    public ax() {
        this.a = new w();
        this.b = new ag();
        this.c = new w();
        this.d = new w();
        this.e = new w();
    }
    
    public ax(final TweetEntities tweetEntities) {
        this.a = new w(tweetEntities.urls);
        this.b = new ag(tweetEntities.media);
        this.c = new w(tweetEntities.mentions);
        this.d = new w(tweetEntities.hashtags);
        this.e = new w(tweetEntities.cashtags);
    }
    
    public ax a(final EntityList list) {
        this.c.a(list);
        return this;
    }
    
    public ax a(final HashtagEntity hashtagEntity) {
        this.d.a(hashtagEntity);
        return this;
    }
    
    public ax a(final MediaEntity mediaEntity) {
        this.b.a(mediaEntity);
        return this;
    }
    
    public ax a(final MediaEntityList list) {
        this.b.a(list);
        return this;
    }
    
    public ax a(final MentionEntity mentionEntity) {
        this.c.a(mentionEntity);
        return this;
    }
    
    public ax a(final UrlEntity urlEntity) {
        this.a.a(urlEntity);
        return this;
    }
    
    public ax b(final HashtagEntity hashtagEntity) {
        this.e.a(hashtagEntity);
        return this;
    }
    
    public ax b(final UrlEntity urlEntity) {
        this.a.b(urlEntity);
        return this;
    }
    
    public ax c() {
        this.a.c();
        this.b.c();
        this.c.c();
        this.d.c();
        this.e.c();
        return this;
    }
    
    protected TweetEntities d() {
        return new TweetEntities(this);
    }
}
