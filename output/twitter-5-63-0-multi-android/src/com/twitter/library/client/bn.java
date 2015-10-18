// 
// Decompiled by Procyon v0.5.30
// 

package com.twitter.library.client;

import android.app.Activity;
import com.twitter.library.service.y;
import android.os.Looper;
import android.content.Context;
import android.os.Handler;

public class bn implements af
{
    private final Handler a;
    private final Context b;
    private final az c;
    private final as d;
    
    public bn(final Context b) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = b;
        this.c = az.a(this.b);
        this.d = as.a(this.b);
    }
    
    private void a() {
        final oc a = oi.a(this.b, this.c.b(), false);
        if (a != null) {
            this.d.a(a);
        }
    }
    
    @Override
    public void a(final Activity activity) {
    }
    
    @Override
    public void b(final Activity activity) {
        this.a.postDelayed((Runnable)new bo(this), 15000L);
    }
}
