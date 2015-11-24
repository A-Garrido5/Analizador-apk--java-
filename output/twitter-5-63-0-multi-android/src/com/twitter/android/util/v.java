// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.internal.android.widget.ToolBar;
import com.twitter.android.client.c;
import com.twitter.library.featureswitch.d;
import com.twitter.library.client.az;
import com.twitter.android.client.TwitterFragmentActivity;
import java.text.DecimalFormat;
import java.io.Serializable;
import com.twitter.android.UsersActivity;
import com.twitter.android.TabbedVitFollowersActivity;
import android.content.Intent;
import android.net.Uri;
import com.twitter.library.api.TwitterUser;
import android.content.Context;

public class v
{
    public static Intent a(final Context context, final long n, final TwitterUser twitterUser, final Uri uri) {
        long userId;
        if (twitterUser != null) {
            userId = twitterUser.userId;
        }
        else {
            userId = -1L;
        }
        final boolean a = a(twitterUser != null && twitterUser.verified, userId == n);
        Serializable s;
        if (a) {
            s = TabbedVitFollowersActivity.class;
        }
        else {
            s = UsersActivity.class;
        }
        final Intent putExtra = new Intent(context, (Class)s).setAction("com.twitter.android.intent.action.FOLLOW").putExtra("owner_id", userId).putExtra("type", 1);
        String name;
        if (twitterUser != null) {
            name = twitterUser.name;
        }
        else {
            name = null;
        }
        final Intent putExtra2 = putExtra.putExtra("owner_name", name).putExtra("fetch_always", true);
        int followersCount;
        if (twitterUser != null) {
            followersCount = twitterUser.followersCount;
        }
        else {
            followersCount = 0;
        }
        final Intent putExtra3 = putExtra2.putExtra("followers_count", followersCount);
        int fastfollowersCount = 0;
        if (twitterUser != null) {
            fastfollowersCount = twitterUser.fastfollowersCount;
        }
        final Intent putExtra4 = putExtra3.putExtra("fast_followers_count", fastfollowersCount);
        if (a && uri != null) {
            putExtra4.putExtra("extra_start_tab", uri.toString());
        }
        return putExtra4;
    }
    
    public static String a(final int n) {
        return new DecimalFormat("#,###").format(n);
    }
    
    public static void a(final TwitterFragmentActivity twitterFragmentActivity, final long n) {
        final long g = az.a((Context)twitterFragmentActivity).b().g();
        boolean b;
        if (n != -1L && n == g) {
            b = true;
        }
        else {
            b = false;
        }
        final StringBuilder sb = new StringBuilder(twitterFragmentActivity.getTitle());
        if (b && d.f("followers_count_for_title_enabled")) {
            final int a = d.a("followers_count_for_title_minimum", 10000);
            final int intExtra = twitterFragmentActivity.getIntent().getIntExtra("followers_count", -1);
            if (intExtra >= a) {
                final String a2 = a(intExtra);
                twitterFragmentActivity.b(a2);
                sb.append(' ').append(a2);
                c.a((Context)twitterFragmentActivity).a(g, "followers:::vit_verified_followers_subtitle:impression");
            }
        }
        final ToolBar m = twitterFragmentActivity.M();
        if (m != null) {
            m.setContentDescription((CharSequence)sb.toString());
        }
    }
    
    private static boolean a(final boolean b, final boolean b2) {
        return ((b && d.f("vit_verified_followers_view_enabled")) || (!b && d.f("vit_verified_followers_for_non_verified_users_enabled"))) && b2;
    }
}
