// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.concurrent.ScheduledExecutorService;
import android.app.Application$ActivityLifecycleCallbacks;
import android.app.Application;
import android.annotation.TargetApi;

@TargetApi(14)
final class e extends n
{
    private final Application b;
    private final Application$ActivityLifecycleCallbacks c;
    
    public e(final Application application, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final j j, final bu bu) {
        this(application, s, s2, s3, s4, s5, s6, s7, j, bi.b("Crashlytics Trace Manager"), bu);
    }
    
    private e(final Application b, final String s, final String s2, final String s3, final String s4, final String s5, final String s6, final String s7, final j j, final ScheduledExecutorService scheduledExecutorService, final bu bu) {
        super(s, s2, s3, s4, s5, s6, s7, j, scheduledExecutorService, bu);
        this.c = (Application$ActivityLifecycleCallbacks)new f(this);
        this.b = b;
        bd.c("Registering activity lifecycle callbacks for session analytics.");
        b.registerActivityLifecycleCallbacks(this.c);
    }
    
    @Override
    final void a() {
        bd.c("Unregistering activity lifecycle callbacks for session analytics");
        this.b.unregisterActivityLifecycleCallbacks(this.c);
        super.a();
    }
}
