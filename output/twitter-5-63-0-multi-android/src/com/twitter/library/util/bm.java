// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import com.twitter.util.l;
import java.util.Iterator;
import com.twitter.library.api.TwitterTopic$TrendsPlus;
import com.twitter.library.api.TwitterTopic;
import java.util.HashMap;
import java.util.List;

public class bm
{
    public static void a(final List list, final List list2) {
        final HashMap<String, TwitterTopic> hashMap = new HashMap<String, TwitterTopic>(list.size());
        for (final TwitterTopic twitterTopic : list) {
            hashMap.put(twitterTopic.b(), twitterTopic);
        }
        for (final TwitterTopic twitterTopic2 : list2) {
            final TwitterTopic twitterTopic3 = hashMap.get(twitterTopic2.b());
            ((TwitterTopic$TrendsPlus)twitterTopic2.a(3)).changedFields = b(twitterTopic3, twitterTopic2);
            twitterTopic2.a(!a(twitterTopic3, twitterTopic2));
        }
    }
    
    private static boolean a(final int n, final int n2) {
        return n2 == (n & n2);
    }
    
    public static boolean a(final TwitterTopic twitterTopic, final TwitterTopic twitterTopic2) {
        final int b = b(twitterTopic, twitterTopic2);
        final boolean a = a(b, 8);
        final boolean a2 = a(b, 4);
        final boolean a3 = a(b, 2);
        final boolean a4 = a(b, 1);
        final boolean a5 = a(b, 16);
        return a || a5 || (a2 && (a3 || a4)) || (twitterTopic2.g() == null && a3 && a4);
    }
    
    private static int b(final TwitterTopic twitterTopic, final TwitterTopic twitterTopic2) {
        final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus = (TwitterTopic$TrendsPlus)twitterTopic2.a(TwitterTopic$TrendsPlus.class);
        if (twitterTopic == null) {
            return 8;
        }
        final TwitterTopic$TrendsPlus twitterTopic$TrendsPlus2 = (TwitterTopic$TrendsPlus)twitterTopic.a(TwitterTopic$TrendsPlus.class);
        final boolean a = l.a(twitterTopic.g(), twitterTopic2.g());
        int n = 0;
        if (!a) {
            n = 4;
        }
        if (!l.a(twitterTopic.e(), twitterTopic2.e())) {
            n |= 0x8;
        }
        if (twitterTopic$TrendsPlus2 != null) {
            return n | twitterTopic$TrendsPlus2.a(twitterTopic$TrendsPlus);
        }
        if (twitterTopic$TrendsPlus != null) {
            return n | twitterTopic$TrendsPlus.a(twitterTopic$TrendsPlus2);
        }
        return n;
    }
    
    public static boolean b(final List list, final List list2) {
        final int size = list.size();
        final int size2 = list2.size();
        if ((size2 == 0 && size > 0) || size2 > size) {
            return true;
        }
        for (int i = 0; i < size2; ++i) {
            if (a(list.get(i), list2.get(i))) {
                return true;
            }
        }
        return false;
    }
}
