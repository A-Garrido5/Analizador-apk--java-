// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.content.res.Resources;

public class bi
{
    public static String a(final Resources resources, final int n, final String s, final String s2, final int n2, final int n3, final int n4, final long n5) {
        switch (n) {
            default: {
                return null;
            }
            case 32: {
                return resources.getQuantityString(le.magic_recs_retweet_notif, n4, new Object[] { s, n4 });
            }
            case 30: {
                return resources.getQuantityString(le.magic_recs_favorite_notif, n4, new Object[] { s, n4 });
            }
            case 1: {
                return resources.getString(lg.social_both_follow, new Object[] { s });
            }
            case 2: {
                return resources.getString(lg.social_both_followed_by, new Object[] { s });
            }
            case 3: {
                if (s2 == null) {
                    return resources.getString(lg.social_follow_and_follow, new Object[] { s });
                }
                if (n4 > 0) {
                    return resources.getQuantityString(le.social_follow_and_follow_and_others, n4, new Object[] { s, s2, n4 });
                }
                return resources.getString(lg.social_follow_and_follow_with_two_users, new Object[] { s, s2 });
            }
            case 4: {
                return resources.getString(lg.social_follower_of_follower, new Object[] { s });
            }
            case 5: {
                return resources.getString(lg.tweets_retweeted, new Object[] { s });
            }
            case 6: {
                return resources.getString(lg.social_follower_and_retweets, new Object[] { s });
            }
            case 7: {
                return resources.getString(lg.social_follow_and_reply, new Object[] { s });
            }
            case 8: {
                return resources.getString(lg.social_follower_and_reply, new Object[] { s });
            }
            case 9: {
                return resources.getString(lg.social_follow_and_fav, new Object[] { s });
            }
            case 10: {
                return resources.getString(lg.social_follower_and_fav, new Object[] { s });
            }
            case 11: {
                return resources.getString(lg.social_reply_to_follow, new Object[] { s });
            }
            case 12: {
                return resources.getString(lg.social_reply_to_follower, new Object[] { s });
            }
            case 13: {
                return resources.getString(lg.tweets_retweeted, new Object[] { s });
            }
            case 14: {
                return resources.getQuantityString(le.social_fav_and_retweets_count, n3, new Object[] { aj.b(resources, n2), aj.b(resources, n3) });
            }
            case 15: {
                if (n3 == 1) {
                    return resources.getString(lg.social_retweet_and_fav_count);
                }
                return resources.getQuantityString(le.social_retweet_and_favs_count, n2, new Object[] { aj.b(resources, n3), aj.b(resources, n2) });
            }
            case 16: {
                if (s2 != null) {
                    return resources.getString(lg.social_fav_with_two_user, new Object[] { s, s2 });
                }
                return resources.getString(lg.social_fav_with_user, new Object[] { s });
            }
            case 33: {
                return resources.getQuantityString(le.social_fav_count_with_user, n2, new Object[] { s, n2 });
            }
            case 17: {
                return resources.getQuantityString(le.social_fav_count, n2, new Object[] { aj.b(resources, n2) });
            }
            case 18: {
                return resources.getString(lg.social_retweet_with_user, new Object[] { s });
            }
            case 19: {
                return resources.getQuantityString(le.social_retweet_count, n3, new Object[] { aj.b(resources, n3) });
            }
            case 20: {
                return resources.getString(lg.social_top_news);
            }
            case 22: {
                return resources.getString(lg.top_tweet);
            }
            case 21: {
                return resources.getString(lg.social_trending_topic, new Object[] { s });
            }
            case 23: {
                final String c = bk.c(resources, n5);
                if (c != null) {
                    return resources.getString(lg.highlight_tweet, new Object[] { c });
                }
                return resources.getString(lg.highlight_tweet_today);
            }
            case 24: {
                if (n4 == 0) {
                    if (s2 == null) {
                        return resources.getString(lg.social_conversation_tweet, new Object[] { s });
                    }
                    return resources.getString(lg.social_conversation_tweet_two, new Object[] { s, s2 });
                }
                else {
                    if (s2 == null) {
                        return resources.getQuantityString(le.in_reply_to_name_and_count, n4, new Object[] { s, n4, " " });
                    }
                    return resources.getQuantityString(le.social_proof_in_reply_multiple_names_and_count, n4, new Object[] { s, s2, n4 });
                }
                break;
            }
            case 25: {
                return resources.getString(lg.social_context_mutual_follow);
            }
            case 26: {
                return resources.getString(lg.social_following);
            }
            case 27: {
                return resources.getString(lg.highlight_context_nearby);
            }
            case 28: {
                return resources.getString(lg.highlight_context_popular);
            }
            case 29: {
                return resources.getString(lg.social_who_to_follow);
            }
            case 38: {
                return resources.getString(lg.social_promoted_trend, new Object[] { s });
            }
            case 34:
            case 35:
            case 36:
            case 37: {
                return s;
            }
        }
    }
    
    public static String b(final Resources resources, final int n, final String s, final String s2, final int n2, final int n3, final int n4, final long n5) {
        switch (n) {
            default: {
                return a(resources, n, s, s2, n2, n3, n4, n5);
            }
            case 3: {
                return resources.getString(lg.social_follow_and_follow_accessibility_description, new Object[] { s });
            }
            case 5: {
                return resources.getString(lg.tweets_retweeted_accessibility_description, new Object[] { s });
            }
            case 6: {
                return resources.getString(lg.social_follower_and_retweets_accessibility_description, new Object[] { s });
            }
            case 7: {
                return resources.getString(lg.social_follow_and_reply_accessibility_description, new Object[] { s });
            }
            case 8: {
                return resources.getString(lg.social_follower_and_reply_accessibility_description, new Object[] { s });
            }
            case 9: {
                return resources.getString(lg.social_follow_and_fav_accessibility_description, new Object[] { s });
            }
            case 10: {
                return resources.getString(lg.social_follower_and_fav_accessibility_description, new Object[] { s });
            }
            case 13: {
                return resources.getString(lg.tweets_retweeted_accessibility_description, new Object[] { s });
            }
            case 16: {
                if (s2 != null) {
                    return resources.getString(lg.social_fav_with_two_user_accessibility_description, new Object[] { s, s2 });
                }
                return resources.getString(lg.social_fav_with_user_accessibility_description, new Object[] { s });
            }
            case 33: {
                return resources.getQuantityString(le.social_fav_count_with_user_accessibility_description, n2, new Object[] { s, n2 });
            }
            case 18: {
                return resources.getString(lg.social_retweet_with_user_accessibility_description, new Object[] { s });
            }
        }
    }
}
