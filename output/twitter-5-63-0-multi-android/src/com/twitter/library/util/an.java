// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.content.SharedPreferences;
import com.twitter.library.client.App;
import android.content.pm.PackageManager$NameNotFoundException;
import android.os.Build;
import android.content.Context;

public class an
{
    public static String a(final Context context, final String s) {
        String s2;
        if (d()) {
            s2 = context.getString(lg.amazon_app_store_url_format);
        }
        else {
            s2 = context.getString(lg.google_play_details_url_format);
        }
        return String.format(s2, s);
    }
    
    public static boolean a() {
        return Build.MANUFACTURER.toLowerCase().contains("samsung");
    }
    
    public static boolean a(final Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        }
        catch (PackageManager$NameNotFoundException ex) {
            return false;
        }
    }
    
    public static String b(final Context context, final String s) {
        return context.getString(lg.google_play_web_details_url_format, new Object[] { s });
    }
    
    public static boolean b() {
        return Build.MANUFACTURER.toLowerCase().contains("kyocera");
    }
    
    public static boolean b(final Context context) {
        if (!App.g()) {
            final boolean boolean1 = context.getSharedPreferences("oem", 0).getBoolean("oem_preload", false);
            final boolean b = false;
            if (!boolean1) {
                return b;
            }
        }
        return true;
    }
    
    public static void c(final Context context) {
        final SharedPreferences sharedPreferences = context.getSharedPreferences("oem", 0);
        if (!sharedPreferences.getBoolean("oem_preload", false)) {
            sharedPreferences.edit().putBoolean("oem_preload", true).apply();
        }
    }
    
    public static boolean c() {
        return Build.BRAND.toLowerCase().contains("blackberry");
    }
    
    public static boolean d() {
        final String manufacturer = Build.MANUFACTURER;
        final String model = Build.MODEL;
        return manufacturer.equals("Amazon") && (model.equals("Kindle Fire") || model.startsWith("KF"));
    }
}
