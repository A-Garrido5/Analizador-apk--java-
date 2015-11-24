// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.widget.tweet.content;

import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.provider.Tweet;
import com.twitter.library.media.widget.v;

class j implements v
{
    final /* synthetic */ i a;
    
    j(final i a) {
        this.a = a;
    }
    
    @Override
    public Tweet a() {
        return this.a.a;
    }
    
    @Override
    public TwitterScribeAssociation b() {
        return this.a.b;
    }
}
