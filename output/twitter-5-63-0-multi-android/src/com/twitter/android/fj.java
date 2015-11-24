// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android;

import android.net.Uri;
import android.app.Activity;
import android.content.Intent;
import java.lang.ref.WeakReference;

public class fj
{
    private WeakReference a;
    
    fj(final DispatchActivity dispatchActivity) {
        this.a = new WeakReference((T)dispatchActivity);
    }
    
    public boolean a() {
        if (this.a.get() == null) {
            return false;
        }
        final DispatchActivity dispatchActivity = (DispatchActivity)this.a.get();
        final Intent intent = (Intent)dispatchActivity.getIntent().getParcelableExtra("android.intent.extra.INTENT");
        if (intent != null) {
            dispatchActivity.getIntent().removeExtra("android.intent.extra.INTENT");
            intent.addFlags(268468224);
            dispatchActivity.startActivity(intent);
            dispatchActivity.finish();
            return true;
        }
        return false;
    }
    
    public void b() {
        if (this.a.get() != null) {
            MainActivity.a((Activity)this.a.get(), null);
        }
    }
}
