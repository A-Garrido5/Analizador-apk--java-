// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;

public class ak implements vr
{
    private final k a;
    
    public ak(final k a) {
        this.a = a;
    }
    
    @Override
    public vp a(final Activity activity, final DisplayMode displayMode, final vc vc, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        return new l(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, this.a);
    }
    
    @Override
    public boolean a(final DisplayMode displayMode, final vc vc) {
        return true;
    }
}
