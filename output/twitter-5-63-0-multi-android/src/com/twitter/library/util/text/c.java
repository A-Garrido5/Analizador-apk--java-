// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util.text;

import com.twitter.library.api.TweetEntities;
import com.twitter.util.collection.g;
import java.util.List;
import com.twitter.library.api.Entity;
import java.util.Collections;
import java.util.Iterator;
import com.twitter.util.collection.i;
import com.twitter.library.featureswitch.d;
import com.twitter.library.provider.Tweet;
import android.content.Context;
import java.util.Locale;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;

public class c
{
    private static final Set a;
    private static final Set b;
    
    static {
        a = new HashSet(Arrays.asList("ar", "bg", "ca", "cs", "da", "de", "el", "en", "en-gb", "es", "et", "fa", "fi", "fr", "he", "hi", "ht", "hu", "id", "in", "it", "iw", "ja", "ko", "lt", "lv", "nl", "no", "pl", "pt", "ro", "ru", "sk", "sl", "sv", "th", "tr", "uk", "ur", "vi", "zh", "zh-cn", "zh-tw"));
        b = new HashSet(Arrays.asList("da", "de", "en", "es", "et", "fi", "fr", "ht", "hu", "id", "in", "is", "tr", "vi", "en-gb", "it", "lt", "lv", "nl", "no", "pl", "pt", "sk", "sl", "sv", "tl"));
    }
    
    public static String a(final String s, final String s2) {
        if (s == null || s2 == null) {
            return "";
        }
        return c(s).getDisplayLanguage(new Locale(s2));
    }
    
    public static boolean a(final Context context, final Tweet tweet) {
        return d.f("translate_tweet_enabled") && b(context, tweet);
    }
    
    private static boolean a(final Tweet tweet) {
        return !b(tweet.ac) || b(tweet) > 20;
    }
    
    public static boolean a(final String s) {
        return c.a.contains(s.toLowerCase());
    }
    
    private static int b(final Tweet tweet) {
        final int length = tweet.y.length();
        final Iterator<i> iterator = (Iterator<i>)c(tweet).iterator();
        int n = length;
        while (iterator.hasNext()) {
            final i i = iterator.next();
            n -= (int)i.b - (int)i.a;
        }
        return n;
    }
    
    static boolean b(final Context context, final Tweet tweet) {
        final Locale locale = context.getResources().getConfiguration().locale;
        if (locale != null) {
            final String b = com.twitter.util.i.b(locale);
            if (!tweet.P && b != null && tweet.ac != null && a(b) && a(tweet.ac) && !b.equals(tweet.ac) && a(tweet)) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean b(final String s) {
        return c.b.contains(s);
    }
    
    private static Locale c(final String s) {
        final String[] split = s.split("-");
        if (split.length > 1) {
            return new Locale(split[0], split[1]);
        }
        return new Locale(s);
    }
    
    private static Set c(final Tweet tweet) {
        final List d = d(tweet);
        if (d.isEmpty()) {
            return Collections.emptySet();
        }
        final HashSet<i> set = new HashSet<i>();
        for (final Entity entity : d) {
            set.add(new i(entity.start, entity.end));
        }
        return set;
    }
    
    private static List d(final Tweet tweet) {
        final TweetEntities g = tweet.G;
        return com.twitter.util.collection.g.a().a(g.urls).a(g.media).a(g.mentions).a(g.hashtags).a(g.cashtags).d();
    }
}
