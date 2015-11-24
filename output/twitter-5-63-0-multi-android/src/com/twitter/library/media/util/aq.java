// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.media.util;

import android.annotation.TargetApi;
import com.twitter.library.featureswitch.d;
import android.os.Build$VERSION;
import android.content.Context;

public class aq
{
    public static void a(final Context context) {
        if (b(context)) {
            d(context);
        }
    }
    
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 16 && d.f("video_compose_enabled") && d.f("video_compose_import_enabled") && ((Build$VERSION.SDK_INT >= 18 && d.f("video_compose_import_method_java_enabled")) || d.f("video_compose_import_method_twittermedia_enabled"));
    }
    
    public static boolean b() {
        return Build$VERSION.SDK_INT < 18 || !d.f("video_compose_import_method_java_enabled");
    }
    
    public static boolean b(final Context context) {
        return Build$VERSION.SDK_INT >= 16 && d.f("video_compose_send_pixel_format_probe");
    }
    
    public static boolean c(final Context context) {
        return context.getSharedPreferences("VideoUtils", 0).getBoolean("pd2", false);
    }
    
    @TargetApi(16)
    protected static void d(final Context context) {
        new ar(context).start();
    }
}
