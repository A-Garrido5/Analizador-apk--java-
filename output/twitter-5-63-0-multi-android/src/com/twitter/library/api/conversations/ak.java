// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.api.conversations;

import com.twitter.library.api.UserSettings;
import android.content.SharedPreferences$Editor;
import android.content.res.Resources;
import com.twitter.library.api.TwitterUser;
import java.util.List;
import android.database.Cursor;
import com.twitter.library.provider.c;
import com.twitter.library.provider.ae;
import com.twitter.library.provider.al;
import android.content.Context;
import java.util.Iterator;
import com.twitter.library.api.ax;
import com.twitter.library.api.TweetEntities;
import com.twitter.util.q;
import com.twitter.library.api.UrlEntity;
import android.text.TextUtils;
import com.twitter.library.provider.i;
import com.twitter.library.featureswitch.d;
import java.util.regex.Pattern;

public class ak
{
    private static final Pattern a;
    
    static {
        a = Pattern.compile("\\n+");
    }
    
    public static int a() {
        return d.a("dm_max_group_size", 20);
    }
    
    public static i a(final i i, final BaseDMAttachment baseDMAttachment) {
        if (!TextUtils.isEmpty((CharSequence)i.a) && baseDMAttachment != null && baseDMAttachment.start != -1 && baseDMAttachment.end != -1) {
            for (final UrlEntity urlEntity : i.b.urls) {
                if (urlEntity.start == baseDMAttachment.start && urlEntity.end == baseDMAttachment.end) {
                    return new i(q.a(i.a, urlEntity.start, urlEntity.end), (TweetEntities)new ax(i.b).b(urlEntity).f());
                }
            }
        }
        return i;
    }
    
    public static String a(final long n, final long n2) {
        return Math.min(n, n2) + "-" + Math.max(n, n2);
    }
    
    public static String a(final Context context, final String s, final long n) {
        final Cursor query = context.getContentResolver().query(ae.a(al.a, n), aa.a, "conversation_id=?", new String[] { s }, (String)null);
        if (query == null) {
            return null;
        }
        final c c = new c(query, n, context, s, false);
        try {
            String f;
            if (c.moveToNext()) {
                f = c.f();
            }
            else {
                f = null;
            }
            return f;
        }
        finally {
            c.close();
        }
    }
    
    public static String a(final Context context, final List list, final boolean b) {
        if (list == null) {
            return "";
        }
        final int size = list.size();
        switch (size) {
            default: {
                return context.getResources().getString(lg.dm_conversation_title_many, new Object[] { a(list.get(0)), size - 2 });
            }
            case 0: {
                return "";
            }
            case 1: {
                return context.getString(lg.media_tag_you);
            }
            case 2: {
                if (b) {
                    return context.getResources().getString(lg.dm_conversation_title_two, new Object[] { a(list.get(0)) });
                }
                return a(list.get(0));
            }
            case 3: {
                return context.getResources().getString(lg.dm_conversation_title_three, new Object[] { a(list.get(0)), a(list.get(1)) });
            }
        }
    }
    
    public static String a(final Resources resources, final long n, final String s, final String s2, final boolean b, final boolean b2, final boolean b3, final int n2, final DMTweet dmTweet, final boolean b4) {
        switch (n2) {
            default: {
                String s3;
                if (dmTweet != null) {
                    if (!b4) {
                        return a(resources, s, n, s2, b, b2, dmTweet);
                    }
                    s3 = b(resources, s2);
                }
                else if (s2 != null && TextUtils.getTrimmedLength((CharSequence)s2) > 0) {
                    s3 = ak.a.matcher(s2).replaceAll(" ");
                    if (b2 && !b && !TextUtils.isEmpty((CharSequence)s)) {
                        return resources.getString(lg.dm_user_conversation_preview, new Object[] { s, s3 });
                    }
                }
                else {
                    if (!b3) {
                        return "";
                    }
                    if (b) {
                        return resources.getString(lg.dm_you_sent_a_photo);
                    }
                    if (b2 && !TextUtils.isEmpty((CharSequence)s)) {
                        return resources.getString(lg.dm_user_sent_a_photo, new Object[] { s });
                    }
                    return resources.getString(lg.dm_sent_a_photo);
                }
                return s3;
            }
            case 8: {
                return b(resources, s, s2, b);
            }
            case 10: {
                return a(resources, s, s2, b);
            }
            case 17: {
                return a(resources, s, b4);
            }
        }
    }
    
    public static String a(final Resources resources, final String s) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        return resources.getString(lg.dm_participant_left_conversation, new Object[] { s });
    }
    
    public static String a(final Resources resources, final String s, final long n, final String s2, final boolean b, final boolean b2, final DMTweet dmTweet) {
        final String userHandle = dmTweet.quotedTweetData.userHandle;
        boolean b3;
        if (n == dmTweet.quotedTweetData.userId) {
            b3 = true;
        }
        else {
            b3 = false;
        }
        if (s2 != null && TextUtils.getTrimmedLength((CharSequence)s2) > 0) {
            if (b) {
                if (b3) {
                    return resources.getString(lg.dm_you_shared_your_own_tweet_with_message, new Object[] { s2 });
                }
                return resources.getString(lg.dm_you_shared_someones_tweet_with_message, new Object[] { userHandle, s2 });
            }
            else {
                if (b2) {
                    return resources.getString(lg.dm_shared_someones_tweet_in_a_group_with_message, new Object[] { s, userHandle, s2 });
                }
                return resources.getString(lg.dm_shared_someones_tweet_with_message, new Object[] { userHandle, s2 });
            }
        }
        else if (b) {
            if (b3) {
                return resources.getString(lg.dm_you_shared_your_own_tweet);
            }
            return resources.getString(lg.dm_you_shared_someones_tweet, new Object[] { userHandle });
        }
        else {
            if (b2) {
                return resources.getString(lg.dm_shared_someones_tweet_in_a_group, new Object[] { s, userHandle });
            }
            return resources.getString(lg.dm_shared_someones_tweet, new Object[] { userHandle });
        }
    }
    
    public static String a(final Resources resources, final String s, final String s2, final boolean b) {
        if (TextUtils.isEmpty((CharSequence)s)) {
            return resources.getString(lg.dm_participant_added_by_deleted_user, new Object[] { s2 });
        }
        if (b) {
            return resources.getString(lg.dm_participant_added_by_you, new Object[] { s2 });
        }
        return resources.getString(lg.dm_participant_added_by_user, new Object[] { s, s2 });
    }
    
    public static String a(final Resources resources, final String s, final boolean b) {
        if (b) {
            return resources.getString(lg.dm_added_you_to_a_group);
        }
        if (TextUtils.isEmpty((CharSequence)s)) {
            return "";
        }
        return resources.getString(lg.dm_added_you, new Object[] { s });
    }
    
    private static String a(final TwitterUser twitterUser) {
        if (twitterUser == null || twitterUser.name == null) {
            return "";
        }
        return twitterUser.name.trim();
    }
    
    private static void a(final Context context, final String s, final boolean b) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("dm_prefs", 0).edit();
        edit.putBoolean(s, b);
        edit.apply();
    }
    
    public static void a(final DMMessageEntry dmMessageEntry) {
        final UrlEntity d = dmMessageEntry.attachment.d();
        if (d != null) {
            d.start = dmMessageEntry.text.length() + " ".length();
            d.end = d.start + d.url.length();
            ax ax;
            if (dmMessageEntry.entities != null) {
                ax = new ax(dmMessageEntry.entities);
            }
            else {
                ax = new ax();
            }
            dmMessageEntry.entities = (TweetEntities)ax.a(d).f();
            dmMessageEntry.text = dmMessageEntry.text + " " + d.url;
            dmMessageEntry.attachment = null;
        }
    }
    
    public static boolean a(final Context context) {
        return context.getSharedPreferences("dm_prefs", 0).getBoolean("conversation_cache_cleared_for_groups", false);
    }
    
    public static boolean a(final UserSettings userSettings) {
        return userSettings != null && "all".equals(userSettings.r);
    }
    
    public static boolean a(final String s, final long n, final long n2) {
        return a(n, n2).equals(s);
    }
    
    public static int b() {
        int a = 140;
        if (d()) {
            a = d.a("dm_char_limit", a);
        }
        return a;
    }
    
    public static i b(final i i, final BaseDMAttachment baseDMAttachment) {
        if (!TextUtils.isEmpty((CharSequence)i.a) && baseDMAttachment != null) {
            for (final UrlEntity urlEntity : i.b.urls) {
                if (urlEntity.url.equals(baseDMAttachment.url) && i.a.endsWith(urlEntity.url)) {
                    return new i(q.a(i.a, urlEntity.start, urlEntity.end), (TweetEntities)new ax(i.b).b(urlEntity).f());
                }
            }
        }
        return i;
    }
    
    private static String b(final Resources resources, final String s) {
        if (s != null && TextUtils.getTrimmedLength((CharSequence)s) > 0) {
            return resources.getString(lg.dm_shared_tweet_with_you_with_message, new Object[] { s });
        }
        return resources.getString(lg.dm_shared_tweet_with_you);
    }
    
    public static String b(final Resources resources, final String s, final String s2, final boolean b) {
        if (TextUtils.isEmpty((CharSequence)s2)) {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return resources.getString(lg.dm_group_name_removed);
            }
            if (b) {
                return resources.getString(lg.dm_you_removed_group_name);
            }
            return resources.getString(lg.dm_user_removed_group_name, new Object[] { s });
        }
        else {
            if (TextUtils.isEmpty((CharSequence)s)) {
                return resources.getString(lg.dm_group_name_changed, new Object[] { s2 });
            }
            if (b) {
                return resources.getString(lg.dm_you_changed_group_name, new Object[] { s2 });
            }
            return resources.getString(lg.dm_user_changed_group_name, new Object[] { s, s2 });
        }
    }
    
    public static void b(final Context context) {
        a(context, "conversation_cache_cleared_for_groups", true);
    }
    
    public static boolean c() {
        return d.f("dm_rounded_ui_enabled");
    }
    
    public static boolean d() {
        return d.f("dm_long_messages_enabled");
    }
    
    public static boolean e() {
        return d.f("dm_share_tweet_pivot_ui_enabled");
    }
    
    public static boolean f() {
        return d.f("dm_flag_to_end_conversation_enabled");
    }
}
