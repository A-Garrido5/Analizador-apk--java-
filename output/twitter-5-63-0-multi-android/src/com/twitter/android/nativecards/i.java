// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;

public class i implements vr
{
    private final ConsumerPollCard$Configuration a;
    
    public i(final ConsumerPollCard$Configuration a) {
        this.a = a;
    }
    
    @Override
    public vp a(final Activity activity, final DisplayMode displayMode, final vc vc, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        return new ConsumerPollCard(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, this.a);
    }
    
    @Override
    public boolean a(final DisplayMode displayMode, final vc vc) {
        return true;
    }
}
