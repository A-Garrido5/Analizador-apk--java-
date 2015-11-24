// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.api.TwitterUser;

public class d
{
    public static boolean a(final TwitterUser twitterUser) {
        return com.twitter.library.featureswitch.d.f("ads_companion_enabled") && twitterUser != null && twitterUser.isPromotableUser;
    }
    
    public static boolean a(final TwitterUser twitterUser, final boolean b) {
        return b && a(twitterUser);
    }
}
