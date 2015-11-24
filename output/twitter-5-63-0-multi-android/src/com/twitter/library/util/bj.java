// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.util;

import android.util.DisplayMetrics;
import android.provider.Settings$Secure;
import com.twitter.util.b;
import android.view.ViewConfiguration;
import android.content.Context;

public abstract class bj
{
    public static float a;
    public static float b;
    public static float c;
    public static float d;
    public static boolean e;
    private static String f;
    
    static {
        bj.a = 1.0f;
        bj.b = 1.0f;
    }
    
    public static int a(final float n) {
        return (int)(n * bj.a);
    }
    
    public static String a() {
        return bj.f;
    }
    
    public static void a(final Context context) {
        final DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        bj.a = displayMetrics.density;
        bj.b = displayMetrics.scaledDensity;
        bj.c = ViewConfiguration.get(context).getScaledTouchSlop();
        bj.d = bj.c * bj.c;
        bj.e = com.twitter.util.b.a(context);
        bj.f = Settings$Secure.getString(context.getContentResolver(), "android_id");
    }
}
