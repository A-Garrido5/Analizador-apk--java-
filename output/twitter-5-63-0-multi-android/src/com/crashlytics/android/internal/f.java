// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

final class f implements Application$ActivityLifecycleCallbacks
{
    private /* synthetic */ e a;
    
    f(final e a) {
        this.a = a;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.a.a(activity);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
        this.a.b(activity);
    }
    
    public final void onActivityPaused(final Activity activity) {
        this.a.c(activity);
    }
    
    public final void onActivityResumed(final Activity activity) {
        this.a.d(activity);
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
        this.a.e(activity);
    }
    
    public final void onActivityStarted(final Activity activity) {
        this.a.f(activity);
    }
    
    public final void onActivityStopped(final Activity activity) {
        this.a.g(activity);
    }
}
