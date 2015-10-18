// 
// Decompiled by Procyon v0.5.30
// 

package com.google.android.gms.common.api;

import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import java.lang.ref.WeakReference;
import android.content.BroadcastReceiver;

class zzg$zzb extends BroadcastReceiver
{
    private WeakReference zzXK;
    
    zzg$zzb(final zzg zzg) {
        this.zzXK = new WeakReference((T)zzg);
    }
    
    public void onReceive(final Context context, final Intent intent) {
        final Uri data = intent.getData();
        String schemeSpecificPart = null;
        if (data != null) {
            schemeSpecificPart = data.getSchemeSpecificPart();
        }
        if (schemeSpecificPart != null && schemeSpecificPart.equals("com.google.android.gms")) {
            final zzg zzg = (zzg)this.zzXK.get();
            if (zzg != null) {
                com.google.android.gms.common.api.zzg.zzc(zzg);
            }
        }
    }
}
