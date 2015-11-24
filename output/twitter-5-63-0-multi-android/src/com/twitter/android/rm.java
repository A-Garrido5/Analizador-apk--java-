// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.scribe.ScribeItem;
import com.twitter.library.scribe.ScribeAssociation;
import com.twitter.library.scribe.TwitterScribeLog;
import com.twitter.library.scribe.TwitterScribeItem;
import com.twitter.library.provider.Tweet;
import com.twitter.library.scribe.TwitterScribeAssociation;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import com.twitter.library.scribe.ScribeLog$SearchDetails;

final class rm extends ul
{
    protected final ScribeLog$SearchDetails a;
    protected final ArrayList b;
    
    public rm(final Fragment fragment, final TwitterScribeAssociation twitterScribeAssociation, final ScribeLog$SearchDetails a, final ArrayList b) {
        super(fragment, twitterScribeAssociation);
        this.a = a;
        this.b = b;
    }
    
    @Override
    protected void a(final String s, final String s2, final Tweet tweet, final TwitterScribeItem twitterScribeItem) {
        this.c.a(((TwitterScribeLog)((TwitterScribeLog)((TwitterScribeLog)new TwitterScribeLog(this.d.b().g()).a(this.g, tweet, this.f, this.a(tweet)).b(new String[] { TwitterScribeLog.a(this.f, Tweet.b(tweet), s, s2) })).a(this.f)).a(twitterScribeItem)).a(this.b).a(this.a));
    }
}
