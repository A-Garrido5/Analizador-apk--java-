// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.featureswitch.d;
import com.twitter.android.NotificationActivity;
import com.twitter.android.MentionsTimelineActivity;
import com.twitter.android.RootNotificationActivity;
import com.twitter.android.RootMentionsTimelineActivity;
import com.twitter.android.VitNotificationsActivity;
import android.content.Intent;
import com.twitter.library.api.TwitterUser;
import android.content.Context;

public class aj
{
    public static Intent a(final Context context, final TwitterUser twitterUser, final boolean b, final boolean b2) {
        return new Intent(context, a(twitterUser, b, b2));
    }
    
    private static Class a(final TwitterUser twitterUser, final boolean b, final boolean b2) {
        if (a(twitterUser)) {
            return VitNotificationsActivity.class;
        }
        if (b) {
            if (b2) {
                return RootMentionsTimelineActivity.class;
            }
            return RootNotificationActivity.class;
        }
        else {
            if (b2) {
                return MentionsTimelineActivity.class;
            }
            return NotificationActivity.class;
        }
    }
    
    public static boolean a(final TwitterUser twitterUser) {
        String s;
        if (twitterUser != null && twitterUser.verified) {
            s = "vit_notifications_redesign_enabled";
        }
        else {
            s = "vit_notifications_redesign_for_non_verified_users_enabled";
        }
        return d.f(s);
    }
}
