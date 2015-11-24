// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.view;

import android.content.res.ColorStateList;
import com.twitter.util.q;
import android.content.res.Resources;
import com.twitter.library.api.PromotedContent;
import com.twitter.library.widget.TweetView;
import com.twitter.library.provider.Tweet;

public class aa
{
    public static int a(final Tweet tweet, final TweetView tweetView, final int n, final int n2) {
        if (tweet.u() && ui.a()) {
            return n;
        }
        if (tweetView.a()) {
            return n2;
        }
        return 0;
    }
    
    public static String a(final Tweet tweet) {
        final PromotedContent j = tweet.j;
        if (j != null) {
            return j.advertiserName;
        }
        return tweet.L;
    }
    
    public static String a(final Tweet tweet, final Resources resources, final boolean b) {
        if (!tweet.o() && !tweet.g && (tweet.ad() || (!b && q.a(a(tweet), tweet.a())))) {
            return resources.getString(lg.promoted_without_advertiser);
        }
        return resources.getString(lg.promoted_by, new Object[] { a(tweet) });
    }
    
    public static void a(final Tweet tweet, final TweetView tweetView, final TweetHeaderView tweetHeaderView) {
        if (tweet.u() && ui.a()) {
            final int color = tweetHeaderView.getResources().getColor(kx.medium_blue);
            tweetHeaderView.setTimestampColor(ColorStateList.valueOf(color));
            tweetHeaderView.setTimestampBadgeColor(color);
            tweetHeaderView.setUseTimestampColorForUsername(false);
            return;
        }
        tweetHeaderView.b();
        tweetHeaderView.a();
        tweetHeaderView.setUseTimestampColorForUsername(tweetView.h());
    }
}
