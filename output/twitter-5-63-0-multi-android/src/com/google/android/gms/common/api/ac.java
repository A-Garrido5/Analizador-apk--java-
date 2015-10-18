// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.content.BroadcastReceiver;

class ac extends BroadcastReceiver
{
    private WeakReference a;
    
    ac(final x x) {
        this.a = new WeakReference((T)x);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart = null;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        if (schemeSpecificPart != null && schemeSpecificPart.equals("com.google.android.gms")) {
            final x x = (x)this.a.get();
            if (x != null && !x.d() && !x.e() && x.f()) {
                x.b();
            }
        }
    }
}
