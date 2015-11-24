// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.model.json.core;

import java.util.Map;

public class c extends wz
{
    public static final c a;
    
    static {
        a = new c();
    }
    
    public c() {
        super(com.twitter.model.json.core.b.a, new Map.Entry[] { a("both_follow", 1), a("both_followed_by", 2), a("follow_and_follow", 3), a("follower_of_follower", 4), a("follow_and_retweets", 5), a("follower_and_retweets", 6), a("follow_and_reply", 7), a("follower_and_reply", 8), a("follow_and_fav", 9), a("follower_and_fav", 10), a("reply_to_follow", 11), a("reply_to_follower", 12), a("popular", 28), a("nearby", 27), a("has_trend", 21) });
    }
    
    private static Map.Entry a(final String s, final int n) {
        return wz.a(s, new b(n));
    }
}
