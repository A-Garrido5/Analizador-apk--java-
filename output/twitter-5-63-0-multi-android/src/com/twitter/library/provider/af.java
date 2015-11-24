// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.provider;

import java.util.HashMap;
import android.net.Uri;
import android.provider.BaseColumns;

public final class af implements BaseColumns
{
    public static final Uri a;
    public static final HashMap b;
    
    static {
        a = Uri.parse(ae.d + "activities");
        (b = new HashMap(18)).put(0, "undefined");
        af.b.put(1, "favorite");
        af.b.put(2, "mention");
        af.b.put(3, "favorite");
        af.b.put(4, "retweet");
        af.b.put(5, "follow");
        af.b.put(6, "list_member_added");
        af.b.put(7, "list_created");
        af.b.put(8, "break");
        af.b.put(9, "retweeted_retweet");
        af.b.put(10, "favorited_retweet");
        af.b.put(11, "retweeted_mention");
        af.b.put(12, "favorited_mention");
        af.b.put(13, "joined_twitter");
        af.b.put(14, "quote");
        af.b.put(15, "media_tag");
        af.b.put(16, "favorite_media_tag");
        af.b.put(17, "retweeted_media_tag");
        af.b.put(18, "magic_rec_favorite");
        af.b.put(19, "magic_rec_follow");
        af.b.put(20, "magic_rec_retweet");
    }
    
    public static boolean a(final int n) {
        return n == 0 || n == 2 || n == 3 || n == 4;
    }
}
