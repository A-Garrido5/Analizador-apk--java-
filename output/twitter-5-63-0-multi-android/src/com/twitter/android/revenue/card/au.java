// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.revenue.card;

import com.twitter.library.featureswitch.d;
import com.twitter.library.provider.Tweet;

public class au implements k
{
    @Override
    public aj b(final l l, final Tweet tweet) {
        if (d.a("card_registry_native_summary_to_website_android_2882", "interim_website_only", "interim_summary_and_website", "final_summary_and_website")) {
            return new i(l);
        }
        return new ar(l);
    }
}
