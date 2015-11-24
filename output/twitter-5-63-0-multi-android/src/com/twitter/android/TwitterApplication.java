// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import com.twitter.library.client.Session;
import android.os.Handler;
import com.twitter.library.metrics.h;
import com.twitter.library.client.az;
import android.os.SystemClock;
import android.content.res.Configuration;
import android.app.ActivityManager$RunningAppProcessInfo;
import com.twitter.util.q;
import com.twitter.util.c;
import android.os.Process;
import android.content.Context;
import com.twitter.library.client.App;

public class TwitterApplication extends App
{
    private boolean a;
    
    public TwitterApplication() {
        App.b("com.twitter.android");
        r();
    }
    
    private static boolean a(final Context context) {
        final ActivityManager$RunningAppProcessInfo a = com.twitter.util.c.a(context, Process.myPid());
        return a != null && !q.a(a.processName) && a.processName.endsWith("MediaService");
    }
    
    private static void r() {
        if (!"com.twitter.android".equals(App.i())) {
            throw new IllegalArgumentException("Default authority is incorrect");
        }
    }
    
    public void onConfigurationChanged(final Configuration configuration) {
        super.onConfigurationChanged(configuration);
        gd.a(this.getApplicationContext()).a(configuration, this.a);
    }
    
    @Override
    public void onCreate() {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        super.onCreate();
        final Context applicationContext = this.getApplicationContext();
        this.a = a(applicationContext);
        gd.a(applicationContext).a(this.a);
        r();
        final Session b = az.a(applicationContext).b();
        if (!this.a && b.d()) {
            (h.a = new ih("app:init", ih.n, SystemClock.elapsedRealtime() - elapsedRealtime)).b(b.g());
            h.a.b("AppMetrics");
            ir.b().a(h.a);
        }
        new Handler().postDelayed((Runnable)new xh(this), 10000L);
    }
    
    public void onLowMemory() {
        super.onLowMemory();
        com.twitter.library.media.manager.q.a((Context)this).onLowMemory();
    }
}
