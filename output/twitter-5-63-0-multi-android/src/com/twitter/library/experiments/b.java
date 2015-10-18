// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.experiments;

import com.twitter.library.media.manager.UserImageRequest;
import com.twitter.util.t;
import android.app.Activity;
import com.twitter.library.media.util.q;
import com.twitter.library.provider.Tweet;
import com.twitter.library.widget.TweetView;
import com.twitter.internal.android.util.Size;
import com.twitter.library.featureswitch.d;
import com.twitter.util.c;
import android.content.Context;

public class b
{
    public static int a(final Context context) {
        if (c.g(context)) {
            return 0;
        }
        final String a = d.a("adaptive_media_android_v2_3104");
        switch (a) {
            default: {
                return 0;
            }
            case "full_cinema":
            case "full_landscape":
            case "full_square": {
                return 1;
            }
        }
    }
    
    public static Size a(final boolean b) {
        if (b) {
            return Size.a;
        }
        return TweetView.b;
    }
    
    public static boolean a() {
        return a("adaptive_media_android_v2_3104");
    }
    
    public static boolean a(final Tweet tweet) {
        return a() && (!tweet.T() || tweet.H() || tweet.F() || tweet.L());
    }
    
    public static boolean a(final Tweet tweet, final boolean b) {
        return q.b(tweet, a(b));
    }
    
    private static boolean a(final String s) {
        return d.e(s) && !"control_2".equals(d.a(s));
    }
    
    public static boolean b() {
        return d.c("adaptive_media_android_v2_3104");
    }
    
    public static boolean b(final Context context) {
        return !c.g(context) && d.a("adaptive_media_android_v2_3104", "full_cinema", "full_landscape", "full_square");
    }
    
    public static boolean b(final Tweet tweet) {
        return a() && (!tweet.T() || tweet.L());
    }
    
    public static int c() {
        if (a()) {
            return -1;
        }
        return -3;
    }
    
    public static int c(final Context context) {
        return (int)Math.rint(0.7f * t.a((Activity)context));
    }
    
    public static int d() {
        return UserImageRequest.a(c());
    }
    
    public static float e() {
        final String a = d.a("adaptive_media_android_v2_3104");
        switch (a) {
            default: {
                return 1.0f;
            }
            case "full_cinema": {
                return 1.7777778f;
            }
            case "full_landscape":
            case "wide_single":
            case "wide_double": {
                return 1.3333334f;
            }
        }
    }
    
    public static boolean f() {
        return a("adaptive_media_android_v2_3104") && !d.a("adaptive_media_android_v2_3104", new String[] { "wide_single" });
    }
    
    public static boolean g() {
        return d.f("media_forward_low_resolution_enabled") && (!b() || i());
    }
    
    public static Size h() {
        return a(g());
    }
    
    public static boolean i() {
        return d.f("adaptive_media_forward_low_resolution_enabled");
    }
}
