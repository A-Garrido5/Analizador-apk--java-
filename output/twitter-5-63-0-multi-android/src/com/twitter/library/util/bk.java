// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import java.io.ObjectInputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import android.os.SystemClock;
import java.util.Calendar;
import android.content.res.Resources;
import java.util.Formatter;
import java.util.Date;
import java.text.ParseException;
import java.util.concurrent.TimeUnit;
import com.twitter.util.SynchronizedDateFormat;
import java.util.Locale;
import java.text.SimpleDateFormat;

public class bk
{
    public static final SimpleDateFormat a;
    private static long b;
    private static long c;
    
    static {
        a = new SynchronizedDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.ENGLISH);
    }
    
    public static long a() {
        if (bk.b != 0L) {
            return bk.b;
        }
        return System.currentTimeMillis();
    }
    
    public static long a(final long n, final TimeUnit timeUnit) {
        return a() - b() + timeUnit.toMillis(n);
    }
    
    public static long a(final SimpleDateFormat simpleDateFormat, final String s) {
        long time = 0L;
        if (s == null) {
            return time;
        }
        try {
            final Date parse = simpleDateFormat.parse(s);
            if (parse != null) {
                time = parse.getTime();
            }
            return time;
        }
        catch (ParseException ex) {
            return time;
        }
    }
    
    public static String a(final long n) {
        final StringBuilder sb = new StringBuilder();
        final Formatter formatter = new Formatter(sb, Locale.getDefault());
        final int n2 = (int)(n / 1000L);
        final int n3 = n2 % 60;
        final int n4 = n2 / 60 % 60;
        final int n5 = n2 / 3600;
        sb.setLength(0);
        if (n5 > 0) {
            return formatter.format("%d:%02d:%02d", n5, n4, n3).toString();
        }
        return formatter.format("%d:%02d", n4, n3).toString();
    }
    
    public static String a(final Resources resources, final long n) {
        final long n2 = a() - n;
        if (n2 >= 0L) {
            if (n2 < 60000L) {
                final int n3 = (int)(n2 / 1000L);
                return resources.getQuantityString(le.time_secs, n3, new Object[] { n3 });
            }
            if (n2 < 3600000L) {
                final int n4 = (int)(n2 / 60000L);
                return resources.getQuantityString(le.time_mins, n4, new Object[] { n4 });
            }
            if (n2 < 86400000L) {
                final int n5 = (int)(n2 / 3600000L);
                return resources.getQuantityString(le.time_hours, n5, new Object[] { n5 });
            }
            if (n2 < 604800000L) {
                final int n6 = (int)(n2 / 86400000L);
                return resources.getQuantityString(le.time_days, n6, new Object[] { n6 });
            }
            final Calendar instance = Calendar.getInstance();
            final Calendar instance2 = Calendar.getInstance();
            final Date time = new Date(n);
            instance2.setTime(time);
            SimpleDateFormat simpleDateFormat;
            if (instance.get(1) == instance2.get(1)) {
                simpleDateFormat = new SimpleDateFormat(resources.getString(lg.date_format_short), Locale.ENGLISH);
            }
            else {
                simpleDateFormat = new SimpleDateFormat(resources.getString(lg.date_format_long), Locale.ENGLISH);
            }
            return simpleDateFormat.format(time);
        }
        else {
            if (n2 >= -60000L) {
                return resources.getString(lg.now);
            }
            return new SimpleDateFormat(resources.getString(lg.date_format_long), Locale.ENGLISH).format(new Date(n));
        }
    }
    
    public static long b() {
        if (bk.c != 0L) {
            return bk.c;
        }
        return SystemClock.elapsedRealtime();
    }
    
    public static String b(final Resources resources, final long n) {
        final long n2 = a() - n;
        if (n2 < 0L) {
            return null;
        }
        if (n2 < 60000L) {
            return resources.getString(lg.recent_tweets_header_title);
        }
        if (n2 < 3600000L) {
            final int n3 = (int)(n2 / 60000L);
            return resources.getQuantityString(le.time_mins_ago, n3, new Object[] { n3 });
        }
        if (n2 < 86400000L) {
            final int n4 = (int)(n2 / 3600000L);
            return resources.getQuantityString(le.time_hours_ago, n4, new Object[] { n4 });
        }
        final int n5 = (int)(n2 / 86400000L);
        return resources.getQuantityString(le.time_days_ago, n5, new Object[] { n5 });
    }
    
    public static boolean b(final long n) {
        final long n2 = a() - n;
        return n2 >= 0L && n2 < 604800000L;
    }
    
    public static String c(final Resources resources, final long n) {
        final long n2 = a() - n;
        if (n2 < 86400000L) {
            return null;
        }
        if (n2 < 604800000L) {
            final int n3 = (int)(n2 / 86400000L);
            return resources.getQuantityString(le.days, n3, new Object[] { n3 });
        }
        if (n2 < 2628000000L) {
            final int n4 = (int)(n2 / 604800000L);
            return resources.getQuantityString(le.weeks, n4, new Object[] { n4 });
        }
        if (n2 < 31536000000L) {
            final int n5 = (int)(n2 / 2628000000L);
            return resources.getQuantityString(le.months, n5, new Object[] { n5 });
        }
        final int n6 = (int)(n2 / 31536000000L);
        return resources.getQuantityString(le.years, n6, new Object[] { n6 });
    }
    
    public static boolean c(final long n) {
        final long n2 = a() - n;
        return n2 >= 0L && n2 < 86400000L;
    }
    
    public static long d(final long n) {
        return (a() - n) / 3600000L;
    }
    
    public static String d(final Resources resources, final long n) {
        return new SimpleDateFormat(resources.getString(lg.full_date_format_no_year), Locale.ENGLISH).format(new Date(n));
    }
    
    public static String e(final Resources resources, final long n) {
        return new SimpleDateFormat(resources.getString(lg.full_date_format), Locale.ENGLISH).format(new Date(n));
    }
}
