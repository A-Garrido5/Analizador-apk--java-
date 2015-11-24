// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.featureswitch.d;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import android.content.Context;

public class bj
{
    public static bk a(final Context context, final Session session) {
        return new bk(context, session);
    }
    
    public static boolean a(final TwitterUser twitterUser) {
        String s;
        if (twitterUser != null && twitterUser.verified) {
            s = "vit_unlimited_notifications_verified_users_enabled";
        }
        else {
            s = "vit_unlimited_notifications_non_verified_users_enabled";
        }
        return d.f(s);
    }
    
    public static boolean a(final TwitterUser twitterUser, final long n) {
        return twitterUser != null && n > 0L && twitterUser.verified && twitterUser.userId == n && d.f("vit_unlimited_profile_tweets_timeline_enabled");
    }
}
