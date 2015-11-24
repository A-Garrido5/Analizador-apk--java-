// 
// Decompiled by Procyon v0.5.30
// 

package com.crashlytics.android.internal;

import java.util.Iterator;
import android.util.Log;
import android.os.Build$VERSION;
import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import android.app.Application;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import android.os.Bundle;
import android.app.Activity;
import android.app.Application$ActivityLifecycleCallbacks;

final class cn implements Application$ActivityLifecycleCallbacks
{
    private /* synthetic */ cm a;
    
    cn(final cm a) {
        this.a = a;
    }
    
    public final void onActivityCreated(final Activity activity, final Bundle bundle) {
        this.a.a.a(activity);
    }
    
    public final void onActivityDestroyed(final Activity activity) {
    }
    
    public final void onActivityPaused(final Activity activity) {
    }
    
    public final void onActivityResumed(final Activity activity) {
        this.a.a.a(activity);
    }
    
    public final void onActivitySaveInstanceState(final Activity activity, final Bundle bundle) {
    }
    
    public final void onActivityStarted(final Activity activity) {
        this.a.a.a(activity);
    }
    
    public final void onActivityStopped(final Activity activity) {
    }
}
