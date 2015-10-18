// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import com.twitter.library.featureswitch.d;
import com.twitter.library.api.TwitterUser;

public class bl
{
    public static boolean a(final TwitterUser twitterUser) {
        final boolean f = d.f("tweet_analytics_enabled");
        int n;
        if (d.f("tweet_analytics_allow_promotable_user") && twitterUser != null && twitterUser.isPromotableUser) {
            n = 1;
        }
        else {
            n = 0;
        }
        if (!f) {
            final boolean b = false;
            if (n == 0) {
                return b;
            }
        }
        return true;
    }
}
