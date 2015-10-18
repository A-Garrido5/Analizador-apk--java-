// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.Context;
import java.io.File;
import android.os.Build$VERSION;

public class c extends ck
{
    private String a;
    private String b;
    private String c;
    private bo d;
    private aj e;
    private long f;
    private bu g;
    private n h;
    
    public static c a() {
        return (c)cl.a().a(c.class);
    }
    
    private String b() {
        return bd.a(this.w(), "com.crashlytics.ApiEndpoint");
    }
    
    public final void a(final bg bg) {
        if (this.h != null) {
            this.h.a(bg.a());
        }
    }
    
    public final void a(final bh bh) {
        if (this.h != null) {
            this.h.b(bh.a());
        }
    }
    
    @Override
    protected final void e() {
        while (true) {
            try {
                this.g = new bu(cl.a().b());
                this.e = new aj(cl.a().a(c.class));
                final Context w = this.w();
                final PackageManager packageManager = w.getPackageManager();
                this.d = new bo(w);
                this.a = w.getPackageName();
                final PackageInfo packageInfo = packageManager.getPackageInfo(this.a, 0);
                this.b = Integer.toString(packageInfo.versionCode);
                String versionName;
                if (packageInfo.versionName == null) {
                    versionName = "0.0";
                }
                else {
                    versionName = packageInfo.versionName;
                }
                this.c = versionName;
                if (Build$VERSION.SDK_INT >= 9) {
                    this.f = packageInfo.firstInstallTime;
                }
                else {
                    this.f = new File(w.getPackageManager().getApplicationInfo(w.getPackageName(), 0).sourceDir).lastModified();
                }
                new Thread(new d(this), "Crashlytics Initializer").start();
            }
            catch (Exception ex) {
                cl.a().b().a("Crashlytics", "Error setting up app properties", ex);
                continue;
            }
            break;
        }
    }
}
