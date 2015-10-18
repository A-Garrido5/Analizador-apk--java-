// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import com.twitter.android.jw;
import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import java.lang.ref.WeakReference;
import com.twitter.android.ad;
import com.twitter.android.ac;

class q implements ac
{
    private final ad a;
    private WeakReference b;
    
    public q() {
        this.a = new ad();
    }
    
    public Activity a() {
        synchronized (this) {
            Activity activity;
            if (this.b != null) {
                activity = (Activity)this.b.get();
            }
            else {
                activity = null;
            }
            return activity;
        }
    }
    
    @Override
    public void a(final Activity activity) {
        this.a.a(activity);
    }
    
    @Override
    public void a(final Activity activity, final Intent intent) {
        this.a.a(activity, intent);
    }
    
    @Override
    public void a(final Activity activity, final Bundle bundle) {
        this.a.a(activity, bundle);
    }
    
    public void a(final ac ac) {
        this.a.a(ac);
    }
    
    @Override
    public void b(final Activity activity) {
        synchronized (this) {
            this.b = new WeakReference((T)activity);
            // monitorexit(this)
            this.a.b(activity);
        }
    }
    
    @Override
    public void b(final Activity activity, final Bundle bundle) {
        this.a.b(activity, bundle);
    }
    
    public void b(final ac ac) {
        this.a.b(ac);
    }
    
    @Override
    public void c(final Activity activity) {
        this.a.c(activity);
    }
    
    @Override
    public void d(final Activity activity) {
        this.a.d(activity);
    }
    
    @Override
    public void e(final Activity activity) {
        this.a.e(activity);
        ((jw)activity).b(this);
    }
}
