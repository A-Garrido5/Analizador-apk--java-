// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.av;

import com.twitter.library.provider.Tweet;
import com.twitter.library.featureswitch.d;

public class t
{
    public static boolean a() {
        return d.f("media_autoplay_android_global");
    }
    
    public static boolean a(final int n) {
        if (!a()) {
            return false;
        }
        switch (n) {
            default: {
                return false;
            }
            case 900: {
                return d.f("media_autoplay_android_home_timeline");
            }
            case 901: {
                return d.f("media_autoplay_android_profile_timeline");
            }
            case 902: {
                return d.f("media_autoplay_android_search_timeline");
            }
        }
    }
    
    public static boolean a(final Tweet tweet) {
        return a() && (tweet.H() || tweet.F() || tweet.L());
    }
}
