// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.nativecards;

import com.twitter.android.card.g;
import com.twitter.android.card.t;
import com.twitter.android.revenue.card.k;
import com.twitter.android.revenue.card.l;
import com.twitter.android.revenue.c;
import com.twitter.android.card.h;
import android.content.Context;
import com.twitter.android.card.v;
import com.twitter.android.card.aj;
import com.twitter.library.scribe.TwitterScribeAssociation;
import com.twitter.library.widget.tweet.content.DisplayMode;
import android.app.Activity;

public class ai implements vr
{
    @Override
    public vp a(final Activity activity, final DisplayMode displayMode, final vc vc, final TwitterScribeAssociation twitterScribeAssociation, final TwitterScribeAssociation twitterScribeAssociation2) {
        t t;
        g g;
        if (displayMode == DisplayMode.d) {
            t = new aj();
            g = new com.twitter.android.card.ai();
        }
        else {
            t = new v((Context)activity);
            g = new h(activity);
        }
        if (c.a(displayMode, vc, "summary_photo_image")) {
            return new ah(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g);
        }
        return new l(activity, displayMode, twitterScribeAssociation, twitterScribeAssociation2, t, g, new com.twitter.android.nativecards.aj());
    }
    
    @Override
    public boolean a(final DisplayMode displayMode, final vc vc) {
        return c.b(displayMode, vc, "summary_photo_image");
    }
}
