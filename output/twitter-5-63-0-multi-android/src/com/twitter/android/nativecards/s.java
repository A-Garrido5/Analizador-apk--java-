// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.library.util.bq;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;

public class s implements vr
{
    @Override
    public vp a(final Activity activity, final DisplayMode displayMode, final vc vc, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        if (DisplayMode.b == displayMode) {
            return new r(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2);
        }
        return new am(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2);
    }
    
    @Override
    public boolean a(final DisplayMode displayMode, final vc vc) {
        final String a = wb.a("player_url", vc);
        return displayMode == DisplayMode.b || bq.f(a);
    }
}
