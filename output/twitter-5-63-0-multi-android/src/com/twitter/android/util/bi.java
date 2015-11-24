// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.featureswitch.d;
import com.twitter.library.api.TwitterUser;

public class bi
{
    public static boolean a(final TwitterUser twitterUser) {
        boolean b = false;
        if (twitterUser != null) {
            if (!twitterUser.verified || !d.a(twitterUser.userId, "vit_notable_event_setting_for_verified_user_enabled", false)) {
                final boolean verified = twitterUser.verified;
                b = false;
                if (verified) {
                    return b;
                }
                final boolean a = d.a(twitterUser.userId, "vit_notable_event_setting_enabled", false);
                b = false;
                if (!a) {
                    return b;
                }
            }
            b = true;
        }
        return b;
    }
    
    public static boolean b(final TwitterUser twitterUser) {
        if (twitterUser == null) {
            return false;
        }
        String s;
        if (twitterUser.verified) {
            s = "vit_push_setting_followed_verified_for_verified_users_enabled";
        }
        else {
            s = "vit_push_setting_followed_verified_for_non_verified_users_enabled";
        }
        return d.f(s);
    }
}
