// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.android.qg;
import android.support.v4.app.Fragment;
import com.twitter.android.qd;
import android.support.v4.app.FragmentActivity;
import com.twitter.library.api.timeline.f;
import com.twitter.library.service.z;
import com.twitter.library.service.y;
import com.twitter.library.api.timeline.l;
import com.twitter.library.client.as;
import com.twitter.android.composer.au;
import com.twitter.library.client.Session;
import com.twitter.library.util.bq;
import android.content.Context;
import com.twitter.library.provider.Tweet;

public class aa
{
    private void a(final Tweet tweet, final boolean e) {
        tweet.e = e;
        if (e) {
            ++tweet.t;
            return;
        }
        tweet.t = Math.max(-1 + tweet.t, 0);
    }
    
    public String a(final Context context, final Tweet tweet) {
        bq.a(context, tweet, true);
        return "share";
    }
    
    public String a(final Context context, final Tweet tweet, final Session session) {
        au.a(context).a(tweet).a(session.e()).b(context);
        return "reply";
    }
    
    public String a(final Context context, final Tweet tweet, final as as, final Session session) {
        final boolean b = !tweet.e;
        this.a(tweet, b);
        if (!b) {
            as.a(new l(context, session, tweet.D).a(tweet.j), (z)null);
            return "unfavorite";
        }
        as.a(new f(context, session, tweet.D, tweet.E).a(tweet.j), (z)null);
        return "favorite";
    }
    
    public void a(final Context context, final Tweet tweet, final ad ad) {
        if (context instanceof FragmentActivity) {
            qd.a(0, tweet, false, null, ad, (FragmentActivity)context);
        }
    }
}
