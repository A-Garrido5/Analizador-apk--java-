// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.youtube.player.internal;

import android.content.res.Resources;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.pm.PackageManager;
import android.content.Intent;
import android.os.Build$VERSION;
import android.content.Context;
import android.net.Uri;

public final class bg
{
    private static final Uri a;
    
    static {
        a = Uri.parse("http://play.google.com/store/apps/details");
    }
    
    public static int a(final Context context, final Context context2) {
        int identifier = 0;
        if (context2 != null) {
            identifier = context2.getResources().getIdentifier("clientTheme", "style", a(context));
        }
        if (identifier == 0) {
            if (Build$VERSION.SDK_INT >= 14) {
                identifier = 16974120;
            }
            else {
                if (Build$VERSION.SDK_INT >= 11) {
                    return 16973931;
                }
                return 16973829;
            }
        }
        return identifier;
    }
    
    public static String a(final Context context) {
        final Intent intent = new Intent("com.google.android.youtube.api.service.START");
        final PackageManager packageManager = context.getPackageManager();
        final ResolveInfo resolveService = packageManager.resolveService(intent, 0);
        if (resolveService != null && resolveService.serviceInfo != null && resolveService.serviceInfo.packageName != null) {
            return resolveService.serviceInfo.packageName;
        }
        if (packageManager.hasSystemFeature("com.google.android.tv")) {
            return "com.google.android.youtube.googletv";
        }
        return "com.google.android.youtube";
    }
    
    public static boolean a(final Context context, String s) {
        try {
            final Resources resourcesForApplication = context.getPackageManager().getResourcesForApplication(s);
            if (s.equals("com.google.android.youtube.googletvdev")) {
                s = "com.google.android.youtube.googletv";
            }
            final int identifier = resourcesForApplication.getIdentifier("youtube_api_version_code", "integer", s);
            return identifier == 0 || 1000 > resourcesForApplication.getInteger(identifier);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return true;
        }
    }
    
    public static Context b(final Context context) {
        try {
            return context.createPackageContext(a(context), 3);
        }
        catch (PackageManager$NameNotFoundException ex) {
            return null;
        }
    }
    
    public static int c(final Context context) {
        return a(context, b(context));
    }
    
    public static String d(final Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new IllegalStateException("Cannot retrieve calling Context's PackageInfo", (Throwable)ex);
        }
    }
}
