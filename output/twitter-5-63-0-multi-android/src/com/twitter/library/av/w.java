// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.av;

import com.twitter.library.featureswitch.d;

public class w
{
    public static boolean a() {
        return d.f("dynamic_video_ads_global");
    }
    
    public static boolean a(final int n) {
        if (!a()) {
            return false;
        }
        switch (n) {
            default: {
                return false;
            }
            case 90: {
                return d.f("dynamic_video_ads_prefetch_on_home_timeline");
            }
            case 91: {
                return d.f("dynamic_video_ads_prefetch_on_profile_timeline");
            }
            case 92: {
                return d.f("dynamic_video_ads_prefetch_on_search_timeline");
            }
            case 93: {
                return d.f("dynamic_video_ads_prefetch_on_activity_timeline");
            }
            case 94: {
                return d.f("dynamic_video_ads_prefetch_on_discover_timeline");
            }
        }
    }
}
