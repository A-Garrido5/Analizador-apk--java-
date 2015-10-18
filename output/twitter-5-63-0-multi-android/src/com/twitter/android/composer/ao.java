// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.android.composer;

import com.twitter.internal.android.service.a;
import android.os.Handler;
import android.os.Looper;
import com.twitter.library.client.as;
import com.twitter.library.client.Session;
import android.content.Context;
import java.lang.ref.WeakReference;
import com.twitter.library.service.ac;

class ao extends ac
{
    private boolean a;
    private final WeakReference b;
    private final Context c;
    private final Session d;
    private final as e;
    
    ao(final ComposerActivity composerActivity, final Session d, final as e) {
        this.a = false;
        this.b = new WeakReference((T)composerActivity);
        this.c = composerActivity.getApplicationContext();
        this.d = d;
        this.e = e;
    }
    
    public void a() {
        this.a = true;
    }
    
    public void a(final bh bh) {
        final Long n = (Long)bh.l().b();
        if (n == null) {
            return;
        }
        new Handler(Looper.getMainLooper()).post((Runnable)new ap(this, n));
    }
}
