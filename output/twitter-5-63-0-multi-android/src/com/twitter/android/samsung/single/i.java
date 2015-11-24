// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.samsung.single;

import android.accounts.Account;
import android.accounts.AccountManager;
import com.twitter.android.samsung.model.g;
import android.content.SharedPreferences$Editor;
import com.twitter.android.samsung.data.WidgetDataUpdateService$RequestType;
import android.content.Context;

@Deprecated
public class i
{
    public static long a(final Context context, final WidgetDataUpdateService$RequestType widgetDataUpdateService$RequestType) {
        return context.getSharedPreferences("twitterWidgetRateLimit", 0).getLong(widgetDataUpdateService$RequestType.name(), 0L);
    }
    
    public static String a(final Context context, final int n) {
        return context.getSharedPreferences("twitterWidgetAccountsPrefName", 0).getString(String.valueOf(n), (String)null);
    }
    
    public static void a(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("userSettings", 0).edit();
        edit.putBoolean("oneTimeDataWarningChecked", true);
        edit.apply();
    }
    
    public static void a(final Context context, final WidgetDataUpdateService$RequestType widgetDataUpdateService$RequestType, final long n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetRateLimit", 0).edit();
        edit.putLong(widgetDataUpdateService$RequestType.name(), n);
        edit.apply();
    }
    
    public static void a(final Context context, final String s) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetTokenPref", 0).edit();
        edit.putString("twitterWidgetGuestToken", s);
        edit.apply();
    }
    
    public static void a(final Context context, final String s, final int n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetAccountsPrefName", 0).edit();
        edit.putString(String.valueOf(n), s);
        edit.apply();
    }
    
    public static Long b(final Context context, final int n) {
        final Account a = g.a(context, a(context, n));
        if (a != null) {
            return g.a(AccountManager.get(context), a).a();
        }
        return (long)n;
    }
    
    public static void b(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("userSettings", 0).edit();
        edit.putBoolean("oneTimeDataWarningChecked", false);
        edit.apply();
    }
    
    public static void b(final Context context, final String s) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetTokenPref", 0).edit();
        edit.putString("twitterWidgetAppAuthToken", s);
        edit.apply();
    }
    
    public static void b(final Context context, final String s, final int n) {
        final long long1 = Long.parseLong(s);
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetRefreshIntervalPref", 0).edit();
        edit.putLong(String.valueOf(n), long1);
        edit.apply();
    }
    
    public static boolean b(final Context context, final WidgetDataUpdateService$RequestType widgetDataUpdateService$RequestType) {
        return a(context, widgetDataUpdateService$RequestType) >= System.currentTimeMillis();
    }
    
    public static long c(final Context context, final int n) {
        return context.getSharedPreferences("twitterWidgetRefreshIntervalPref", 0).getLong(String.valueOf(n), -1L);
    }
    
    public static boolean c(final Context context) {
        return context.getSharedPreferences("userSettings", 0).getBoolean("oneTimeDataWarningChecked", false);
    }
    
    public static String d(final Context context) {
        return context.getSharedPreferences("twitterWidgetTokenPref", 0).getString("twitterWidgetGuestToken", (String)null);
    }
    
    public static boolean d(final Context context, final int n) {
        return context.getSharedPreferences("twitterWidgetUserSettingsComplete", 0).getBoolean(String.valueOf(n), false);
    }
    
    public static String e(final Context context) {
        return context.getSharedPreferences("twitterWidgetTokenPref", 0).getString("twitterWidgetAppAuthToken", (String)null);
    }
    
    public static void e(final Context context, final int n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetUserSettingsComplete", 0).edit();
        edit.putBoolean(String.valueOf(n), true);
        edit.apply();
    }
    
    public static void f(final Context context) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetTokenPref", 0).edit();
        edit.remove("twitterWidgetGuestToken");
        edit.apply();
    }
    
    public static boolean f(final Context context, final int n) {
        return !g(context, n);
    }
    
    public static boolean g(final Context context, final int n) {
        return a(context, n) != null;
    }
    
    public static void h(final Context context, final int n) {
        final SharedPreferences$Editor edit = context.getSharedPreferences("twitterWidgetAccountsPrefName", 0).edit();
        edit.remove(String.valueOf(n));
        edit.apply();
        final SharedPreferences$Editor edit2 = context.getSharedPreferences("twitterWidgetRefreshIntervalPref", 0).edit();
        edit2.remove(String.valueOf(n));
        edit2.apply();
    }
}
