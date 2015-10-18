// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue;

import com.twitter.library.widget.tweet.content.DisplayMode;
import com.twitter.library.telephony.TelephonyUtil;
import com.twitter.android.client.am;
import android.text.TextUtils;
import android.content.Context;
import com.twitter.library.featureswitch.d;
import com.twitter.library.network.forecaster.NetworkQuality;
import com.twitter.library.network.forecaster.b;

public class c
{
    public static boolean a() {
        final NetworkQuality b = com.twitter.library.network.forecaster.b.a().b();
        boolean b2;
        if (NetworkQuality.c == b || NetworkQuality.d == b) {
            b2 = true;
        }
        else {
            b2 = false;
        }
        return b2 && d.a("prefetch_ad_images_3314", new String[] { "prefetch" });
    }
    
    public static boolean a(final Context context, final String s, final String s2) {
        return !TextUtils.isEmpty((CharSequence)s2) && am.a(context, s);
    }
    
    public static boolean a(final Context context, final String s, final String s2, final boolean b, final boolean b2) {
        if (!b || !b2 || !TelephonyUtil.d()) {
            return false;
        }
        boolean b3;
        if (TelephonyUtil.c()) {
            b3 = d.a("ad_formats_prefetch_html_markup_android_3070", "enabled_wifi_only", "enabled_wifi_cellular");
        }
        else {
            b3 = d.a("ad_formats_prefetch_html_markup_android_3070", new String[] { "enabled_wifi_cellular" });
        }
        return a(context, s, s2) && b3;
    }
    
    public static boolean a(final DisplayMode displayMode, final vc vc, final String s) {
        return !a(vc, s) || (displayMode == DisplayMode.b && !d.a("card_registry_native_summary_to_website_android_2882", "interim_summary_and_website", "final_summary_and_website"));
    }
    
    public static boolean a(final vc vc, final String s) {
        return vj.a(s, vc) != null;
    }
    
    public static boolean b() {
        return d.a("ad_formats_tweet_view_dwell_enabled", false);
    }
    
    public static boolean b(final DisplayMode displayMode, final vc vc, final String s) {
        return DisplayMode.a != displayMode || a(vc, s);
    }
    
    public static float c() {
        return d.a("ad_formats_tweet_view_visibility_threshold", 0.5f);
    }
    
    public static int d() {
        return d.a("ad_formats_tweet_view_dwell_threshold", 3);
    }
}
