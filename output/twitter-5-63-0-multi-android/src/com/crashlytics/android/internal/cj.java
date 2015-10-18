// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.util.Log;
import android.app.Service;
import android.app.Application;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;

public class cj implements ci
{
    public static int a(final int n) {
        if (n < 200 || n > 299) {
            if (n >= 300 && n <= 399) {
                return 1;
            }
            if (n < 400 || n > 499) {
                if (n >= 500) {
                    return 1;
                }
                return 1;
            }
        }
        return 0;
    }
    
    public static String a(final Context context, final boolean b) {
        String s = null;
        while (true) {
        Label_0143:
            while (true) {
                try {
                    final Context applicationContext = context.getApplicationContext();
                    final Bundle metaData = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
                    if (metaData != null) {
                        s = metaData.getString("com.crashlytics.ApiKey");
                        if (bd.e(s)) {
                            final int a = bd.a(context, "com.crashlytics.ApiKey", "string");
                            if (a != 0) {
                                s = context.getResources().getString(a);
                            }
                        }
                        if (!bd.e(s)) {
                            break;
                        }
                        if (b || bd.f(context)) {
                            throw new IllegalArgumentException("Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>");
                        }
                        break Label_0143;
                    }
                }
                catch (Exception ex) {
                    co.a.b().a("Crashlytics", "Caught non-fatal exception while retrieving apiKey: " + ex);
                }
                s = null;
                continue;
            }
            co.a.b().a("Crashlytics", "Crashlytics could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"com.crashlytics.ApiKey\" android:value=\"YOUR_API_KEY\"/>", null);
            break;
        }
        return s;
    }
    
    private static boolean b(final int n) {
        return co.a.h() <= n;
    }
    
    @Override
    public final void a(final int n, final String s, final String s2) {
        this.a(n, s, s2, false);
    }
    
    public final void a(final int n, final String s, final String s2, final boolean b) {
        if (b || b(n)) {
            Log.println(n, s, s2);
        }
    }
    
    @Override
    public final void a(final String s, final String s2) {
        if (b(3)) {
            Log.d(s, s2, (Throwable)null);
        }
    }
    
    @Override
    public final void a(final String s, final String s2, final Throwable t) {
        if (b(6)) {
            Log.e(s, s2, t);
        }
    }
    
    @Override
    public final void b(final String s, final String s2) {
        if (b(4)) {
            Log.i(s, s2, (Throwable)null);
        }
    }
    
    @Override
    public final void c(final String s, final String s2) {
        if (b(5)) {
            Log.w(s, s2, (Throwable)null);
        }
    }
    
    @Override
    public final void d(final String s, final String s2) {
        this.a(s, s2, null);
    }
}
