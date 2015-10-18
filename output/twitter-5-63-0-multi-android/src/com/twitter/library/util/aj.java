// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import com.twitter.util.i;
import java.util.List;
import com.twitter.library.api.MentionEntity;
import java.util.ArrayList;
import com.twitter.library.api.TweetEntities;
import java.math.RoundingMode;
import java.text.NumberFormat;
import com.twitter.util.g;
import java.util.Locale;
import android.content.res.Resources;
import java.util.Iterator;
import com.twitter.library.api.Entity;
import android.os.Build$VERSION;

public class aj
{
    public static final boolean a;
    
    static {
        a = (Build$VERSION.SDK_INT < 15);
    }
    
    private static int a(final Iterable iterable) {
        final Iterator<Entity> iterator = iterable.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Entity entity = iterator.next();
            n += entity.end - entity.start;
        }
        return n;
    }
    
    public static String a(final Resources resources, final float n) {
        final Locale default1 = Locale.getDefault();
        if (default1.equals(Locale.US)) {
            final float n2 = (float)(3.28 * n);
            float a;
            String s;
            if (n2 > 528.0f) {
                a = n2 / 5280.0f;
                s = resources.getString(lg.mile_abbr);
            }
            else {
                a = g.a(n2, 10);
                s = resources.getString(lg.foot_abbr);
            }
            if (a < 10.0f) {
                return String.format(default1, "%.1f", a) + " " + s;
            }
            return b(resources, (int)a) + " " + s;
        }
        else {
            float a2;
            String s2;
            if (n >= 1000.0f) {
                a2 = n / 1000.0f;
                s2 = resources.getString(lg.kilometer);
            }
            else {
                a2 = g.a(n, 10);
                s2 = resources.getString(lg.meter);
            }
            if (a2 < 1.0f) {
                return String.format(default1, "%.1f", a2) + " " + s2;
            }
            return b(resources, (int)a2) + " " + s2;
        }
    }
    
    public static String a(final Resources resources, final int n) {
        if (n > 25) {
            return resources.getString(lg.related_stat_max_count, new Object[] { 25 });
        }
        return String.valueOf(n);
    }
    
    public static String a(final Resources resources, final int n, final boolean b) {
        final NumberFormat instance = NumberFormat.getInstance();
        instance.setRoundingMode(RoundingMode.DOWN);
        instance.setMaximumFractionDigits(0);
    Label_0178:
        while (true) {
            if (b && n >= 10000) {
                final int[] array = { resources.getInteger(lb.abbr_number_divider_millions), resources.getInteger(lb.abbr_number_divider_thousands) };
                final String[] array2 = { resources.getString(lg.abbr_number_unit_millions), resources.getString(lg.abbr_number_unit_thousands) };
                for (int i = 0; i < array.length; ++i) {
                    final int n2 = array[i];
                    final String s = array2[i];
                    final double n3 = n / n2;
                    if (n3 >= 1.0) {
                        if (n3 < Math.pow(10.0, 3 - s.length())) {
                            instance.setMaximumFractionDigits(1);
                        }
                        instance.setGroupingUsed(false);
                        final String s2 = instance.format(n3) + s;
                        break Label_0178;
                    }
                }
            }
            Label_0200: {
                break Label_0200;
                final String s2;
                if (s2 == null) {
                    s2 = instance.format(n);
                }
                return s2;
            }
            String s2 = null;
            continue Label_0178;
        }
    }
    
    public static StringBuilder a(final StringBuilder sb, final TweetEntities tweetEntities, final xb xb) {
        final ArrayList<Integer> list = new ArrayList<Integer>();
        sb.insert(0, '\u200f');
        list.add(0);
        if (tweetEntities != null) {
            final Iterator<Entity> iterator = xy.a(tweetEntities.mentions, tweetEntities.urls, Entity.a).iterator();
            int n = 1;
            while (iterator.hasNext()) {
                final Entity entity = iterator.next();
                int n2;
                if (entity instanceof MentionEntity) {
                    n2 = n + entity.start;
                }
                else {
                    n2 = n + entity.end;
                }
                list.add(n2);
                sb.insert(n2, '\u200e');
                ++n;
            }
            a(tweetEntities.mentions, list);
            a(tweetEntities.urls, list);
            a(tweetEntities.media, list);
            a(tweetEntities.hashtags, list);
            a(tweetEntities.cashtags, list);
        }
        if (xb != null) {
            a(xb.a, list);
        }
        return sb;
    }
    
    public static void a(final Iterable iterable, final List list) {
        for (final Entity entity : iterable) {
            int start;
            Iterator<Integer> iterator2;
            int n;
            for (start = entity.start, iterator2 = list.iterator(), n = 0; iterator2.hasNext() && iterator2.next() - n <= start; ++n) {}
            entity.a(n);
        }
    }
    
    public static boolean a(final CharSequence charSequence, final TweetEntities tweetEntities) {
        if (!aj.a) {
            final int length = charSequence.length();
            if (length != 0 && i.a(charSequence)) {
                int n;
                if (tweetEntities != null) {
                    n = 0 + a(tweetEntities.mentions) + a(tweetEntities.urls) + a(tweetEntities.media) + a(tweetEntities.hashtags) + a(tweetEntities.cashtags);
                }
                else {
                    n = 0;
                }
                int n2 = length - n;
                int n3;
                int n4;
                int n5;
                for (n3 = (int)Math.ceil(0.3f * n2), n4 = 0, n5 = 0; n4 < length && n5 < n3; ++n4) {
                    final char char1 = charSequence.charAt(n4);
                    if (i.a(char1)) {
                        ++n5;
                    }
                    else if (Character.getType(char1) == 16) {
                        --n2;
                        n3 = (int)Math.ceil(0.3f * n2);
                    }
                }
                if (n5 >= n3) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String b(final Resources resources, final int n) {
        return a(resources, n, resources.getBoolean(kw.abbreviate_number));
    }
    
    public static void b(final StringBuilder sb, final TweetEntities tweetEntities, final xb xb) {
        if (tweetEntities != null || xb != null) {
            final ArrayList<Integer> list = new ArrayList<Integer>();
            for (int n = -1 + sb.length(), i = 0; i < n; ++i) {
                if (Character.isHighSurrogate(sb.charAt(i)) && Character.isLowSurrogate(sb.charAt(i + 1))) {
                    list.add(i);
                }
            }
            if (tweetEntities != null) {
                a(tweetEntities.mentions, list);
                a(tweetEntities.urls, list);
                a(tweetEntities.media, list);
                a(tweetEntities.hashtags, list);
                a(tweetEntities.cashtags, list);
            }
            if (xb != null) {
                a(xb.a, list);
            }
        }
    }
}
