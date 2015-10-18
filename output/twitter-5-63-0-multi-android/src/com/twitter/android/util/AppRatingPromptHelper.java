// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.util;

import com.twitter.library.scribe.ScribeLog;
import com.twitter.android.client.c;
import com.twitter.library.scribe.TwitterScribeLog;
import android.content.SharedPreferences$Editor;
import android.content.SharedPreferences;
import java.util.Calendar;
import android.content.Context;

public class AppRatingPromptHelper
{
    public static int a(final Context context, final j j) {
        final SharedPreferences c = c(context);
        if (c.getBoolean("donotshow", false)) {
            return -1;
        }
        final long long1 = c.getLong("lastuse", 0L);
        final int int1 = c.getInt("consecutivedays", 0);
        final SharedPreferences$Editor edit = c.edit();
        final Calendar instance = Calendar.getInstance();
        final Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(long1);
        int n;
        if (j.a(instance2)) {
            n = int1 + 1;
            edit.putInt("consecutivedays", n);
        }
        else if (!j.a(instance2, instance)) {
            edit.putInt("consecutivedays", 0);
            n = 0;
        }
        else {
            n = int1;
        }
        edit.putLong("lastuse", instance.getTimeInMillis());
        edit.apply();
        return n;
    }
    
    static TwitterScribeLog a(final AppRatingPromptHelper$AppRatingEvent appRatingPromptHelper$AppRatingEvent, final long n) {
        final TwitterScribeLog twitterScribeLog = new TwitterScribeLog(n);
        String s = null;
        String s2 = null;
        switch (i.a[appRatingPromptHelper$AppRatingEvent.ordinal()]) {
            default: {
                s = null;
                s2 = null;
                break;
            }
            case 1: {
                s = "impression";
                s2 = null;
                break;
            }
            case 2: {
                s2 = "rate_us_yes";
                s = "click";
                break;
            }
            case 3: {
                s2 = "rate_us_no";
                s = "click";
                break;
            }
            case 4: {
                s2 = "rate_us_later";
                s = "click";
                break;
            }
            case 5: {
                s2 = "feedback";
                s = "click";
                break;
            }
            case 6: {
                s2 = "rating";
                s = "1star";
                break;
            }
            case 7: {
                s2 = "rating";
                s = "2star";
                break;
            }
            case 8: {
                s2 = "rating";
                s = "3star";
                break;
            }
            case 9: {
                s2 = "rating";
                s = "4star";
                break;
            }
            case 10: {
                s2 = "rating";
                s = "5star";
                break;
            }
        }
        twitterScribeLog.b("rate_us_prompt", null, null, s2, s);
        return twitterScribeLog;
    }
    
    public static void a(final Context context) {
        final SharedPreferences$Editor edit = c(context).edit();
        edit.putBoolean("donotshow", true);
        edit.apply();
    }
    
    public static void a(final AppRatingPromptHelper$AppRatingEvent appRatingPromptHelper$AppRatingEvent, final c c, final long n) {
        c.a(a(appRatingPromptHelper$AppRatingEvent, n));
    }
    
    public static void b(final Context context) {
        final SharedPreferences$Editor edit = c(context).edit();
        edit.remove("consecutivedays");
        edit.remove("lastuse");
        edit.apply();
    }
    
    private static SharedPreferences c(final Context context) {
        return context.getSharedPreferences("appratingusage", 0);
    }
}
