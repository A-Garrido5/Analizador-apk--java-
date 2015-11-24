// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.featureswitch.d;
import com.twitter.library.api.TwitterUser;
import com.twitter.library.client.Session;
import com.twitter.library.client.k;
import com.twitter.library.client.az;
import android.content.Context;

public class bh
{
    public static int a(final Context context) {
        final Session b = az.a(context).b();
        final boolean a = a(b.f());
        int int1 = 0;
        if (a) {
            int1 = new k(context, b.e()).getInt("vit_notification_filter_type", 0);
        }
        return int1;
    }
    
    public static void a(final Context context, final int n) {
        new k(context, az.a(context).b().e()).a().a("vit_notification_filter_type", n).apply();
    }
    
    public static boolean a(final TwitterUser twitterUser) {
        return d.f("vit_notification_filters_enabled") && ((twitterUser != null && twitterUser.verified) || d.f("vit_notification_filters_role_enabled"));
    }
}
